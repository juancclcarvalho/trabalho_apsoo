
package br.com.apsoo.dto;

import br.com.apsoo.dao.Database;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
    Ideia de implementação da controladora: um router das opções da interface.
    Cada rota deste router da inicio a uma operação no sistema e troca uma tela
    na interface.
    Cada operação iniciada terá que ser finalizada.
    O router está dentro de um loop infinito, que só quem termina é a interface fechar.

    Router -> Chama Venda() -> chama IniciarVenda() -> chama FinalizarVenda()
    Venda - da a opcao entre venda e orcamento
    Iniciar venda - troca para a tela de venda em branco
    --- USUARIO ESCOLHE OS PRODUTOS --- OU PREENCHEMOS HARDCODED ---
    Finalizar venda - Troca para tela/menu de pagamento
    Pagamento Confirmado - Escreve tudo em branco e volta para tela inicial / switch do router

    Router -> Chama Venda() -> chama IniciarOrcamento() -> chama FinalizarOrcamento()
    
    Alguns dos botoes da interface devem ser os responsáveis por escolher as operações.


    Pode se criar um enum com as operações do router.
    
*/
public class Controladora {
    
    private Database bd;
    private String operacao;
    protected Funcionario funcionario;
    protected DefaultTableModel model;
    private Venda venda;
    private VendaProduto vendaProduto;
    private Cliente cliente;
    private ItemVenda itemVenda;
    
    public Controladora() {
        this.bd = new Database();
    }

    public Database getBD() {
        return bd;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public VendaProduto getVendaProduto() {
        return vendaProduto;
    }

    public void setVendaProduto(VendaProduto vendaProduto) {
        this.vendaProduto = vendaProduto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemVenda getItemVenda() {
        return itemVenda;
    }

    public void setItemVenda(ItemVenda itemVenda) {
        this.itemVenda = itemVenda;
    }
    
    
    
//    public static void main(String[] args) {
//        Controladora c = new Controladora();
//        
//        Cliente cli = c.buscaCliente("812.543.871-91");
//        Funcionario func = c.buscaFuncionario("87123");
//        Marca m = c.buscaMarca("Edifier");
//        Produto p = c.buscaProduto("B07TDT6DFB");
//        
//        
//        c.getClass();
//    }
    
    public void finalizarVenda(){
        
        System.out.println("br.com.apsoo.dto.Controladora.finalizarVenda()");
        ///atualizar valores dos campos
        //escrever nas tabelas de venda e de vendaproduto
        // atualizar pontos cliente
        // atualizar as vendas do vendedor
        // atualizar estoque do produto
        
        
    }
    
    public void setFormaPagamento(String forma){
        this.getVendaProduto().getVenda().setForma_pgto(forma);
    }
    
    public void finalizarSelecao(JLabel total_pagamento){
        total_pagamento.setText("R$ %s".formatted(new DecimalFormat("0.00").format(this.getVendaProduto().getVenda().getTotal())));
        
    }
    
    public void adcionaProduto(JTable tabela, JTable tabela_destino, JSpinner spinner, JLabel qtde, JLabel subtotal, JLabel total, JLabel desconto){
        
        String cod_produto = tabela.getModel().getValueAt(tabela.getSelectedRow(), 0).toString();
        int qtde_item = (Integer) spinner.getValue();
        
        Produto p = buscaProduto(cod_produto);
        this.getItemVenda().setItem(p);
        this.getItemVenda().setQtde_item(qtde_item);
        this.getItemVenda().setTotal_item(qtde_item * p.getPreco());
        
        this.getVendaProduto().getItens_venda().add(this.getItemVenda());
        
        model = (DefaultTableModel) tabela_destino.getModel();
        model.addRow(new Object[]{  p.getCodigo(), p.getDescricao(), p.getMarca().getNome(), 
                                    p.getPreco(), itemVenda.getQtde_item(), itemVenda.getTotal_item()});
       
        atualizaCalculosVenda(tabela_destino, qtde, subtotal, total, desconto);
               
    }
    
    public void atualizaCalculosVenda(JTable tabela_destino, JLabel qtde, JLabel subtotal, JLabel total, JLabel desconto){
        this.getVendaProduto().getVenda().setQtde_produtos(this.getVendaProduto().getVenda().getQtde_produtos() + 1);
        
        qtde.setText(Integer.valueOf(this.getVendaProduto().getVenda().getQtde_produtos()).toString());
        
        double subtotal_valor = 0;
        for(int i = 0; i < tabela_destino.getRowCount(); i++){
           double total_item = (double) tabela_destino.getValueAt(i, 5);
            subtotal_valor = total_item+subtotal_valor;
        }
        this.getVendaProduto().getVenda().setSubtotal(subtotal_valor);
        subtotal.setText("R$ %s".formatted(new DecimalFormat("0.00").format(this.getVendaProduto().getVenda().getSubtotal())));
        
        double desconto_pct;
        if(subtotal_valor > 200.0){
            desconto_pct = 0.02;
        }else if(subtotal_valor > 500.0){
            desconto_pct = 0.05;
        }
        else desconto_pct = 0.0;
        
        
        this.getVendaProduto().getVenda().setDesconto(desconto_pct*subtotal_valor);
        this.getVendaProduto().getVenda().setTotal(subtotal_valor - (desconto_pct*subtotal_valor));
        
        desconto.setText("R$ %s".formatted(new DecimalFormat("0.00").format(this.getVendaProduto().getVenda().getDesconto())));
        total.setText("R$ %s".formatted(new DecimalFormat("0.00").format(this.getVendaProduto().getVenda().getTotal())));
        
    }
    
    public void criarNovoItemVenda(){
        this.itemVenda = new ItemVenda();
    }
    
    public void popularTabelaProdutos(JTable tabela){
        List res = this.getBD().buscaTabela(
                "p.prod_codigo, p.prod_descricao, m.marca_nome, p.prod_preco, p.prod_estoque", 
                "tb_produto p", 
                "inner join tb_marca m on p.marca_id = m.marca_id", 
                "where p.prod_estoque > 0");
        
        model = (DefaultTableModel) tabela.getModel();
        model.setNumRows(0);
        
        Iterator<String> it = res.iterator();
        while(it.hasNext()){
            String s = (String) it.next();
            String[] ss = s.split(",");
            model.addRow(new Object[]{ss[0].strip(), ss[1].strip(), ss[2].strip(), Double.valueOf(ss[3].strip()), Integer.valueOf(ss[4].strip())});
        }
    }
    
    public void cancelarVenda(){
        this.setCliente(null);
        this.setVenda(null);
        this.setVendaProduto(null);
        this.setFuncionario(null);
        this.setOperacao(null);
        this.setItemVenda(null);
    }
    
    public String iniciarVenda(){
        this.venda = new Venda();
        this.venda.setFun(this.getFuncionario());
        
        Random rand = new Random();
        Integer codigoVenda = Integer.valueOf(rand.nextInt(9999999));
        this.venda.setCodigo(codigoVenda.toString());
        this.venda.setQtde_produtos(0);
        
        List<ItemVenda> itens = new ArrayList<>();
        this.vendaProduto = new VendaProduto(0, venda, itens);
        
        return codigoVenda.toString();
    }
    
    
    public void configuraTabelaProdutos(JTable tabela){
        this.model = (DefaultTableModel) tabela.getModel();
        this.model.setNumRows(0);
    }
    
    public boolean validarFuncionario(String cod_acesso){
        try {
            funcionario = buscaFuncionario(cod_acesso);
            return true;
        } catch (Exception e) {
            // nao encontrou funcionario
            return false;
        }
    }
    
    
    
    public Funcionario buscaFuncionario(String cod_acesso){
        String[] res = this.bd.buscaTabela("*", "tb_funcionario", 
                "inner join tb_funcao on tb_funcao.fu_id = tb_funcionario.fu_id", 
                "where tb_funcionario.func_cod_acesso='%s'".formatted(cod_acesso)).get(0).toString().split(",");
        
        Funcao fu = new Funcao(Integer.valueOf(res[9]), res[10]);
    
        Funcionario fun = new Funcionario(res[1], res[2],
                                   res[3], res[4],
                                   res[5]);
                
        fun.setId(Integer.valueOf(res[0]));
        fun.setTotal_vendas(Integer.valueOf(res[8]));
        fun.setCod_acesso(res[7]);
        fun.setFuncao(fu);
        
        return fun;
    }
    
    public Cliente buscaCliente(String cli_cpf){
        String[] res = this.bd.buscaTabela("*", "tb_cliente cli", 
                "", 
                "where cli.cli_cpf='%s'".formatted(cli_cpf)).get(0).toString().split(",");
        
        Cliente cli = new Cliente(res[1], res[5], res[2], res[3], res[4]);
                
        cli.setId(Integer.valueOf(res[0]));
        cli.setPontos(Integer.valueOf(res[6].strip()));
        
        return cli;
    }    
    
    public Marca buscaMarca(String marca_nome){
        String[] res = this.bd.buscaTabela("*", "tb_marca m", 
                "", 
                "where m.marca_nome = '%s'".formatted(marca_nome)).get(0).toString().split(",");
    
        Marca m = new Marca();
        m.setId(Integer.valueOf(res[0]));
        m.setNome(res[1]);
        m.setSigla(res[2]);
                
        return m;
    }
    
    
    public Produto buscaProduto(String cod_produto){
        String[] res = this.bd.buscaTabela("*", "tb_produto p", 
                "inner join tb_marca m on m.marca_id = p.marca_id", 
                "where p.prod_codigo = '%s'".formatted(cod_produto)).get(0).toString().split(",");
        
        Marca m = new Marca();
        m.setId(Integer.valueOf(res[8]));
        m.setNome(res[9]);
        m.setSigla(res[10]);
        
        Produto p = new Produto();
        p.setId(Integer.valueOf(res[0]));
        p.setCodigo(res[1]);
        p.setModelo(res[2]);
        p.setCor(res[3]);
        p.setPreco(Double.valueOf(res[4]));
        p.setDescricao(res[5]);
        p.setEstoque(Integer.valueOf(res[6]));
        p.setMarca(m);
        
        return p;
    }
    
    
    public String getTimerDataHora(JLabel data, JLabel hora){
        return data.getText().toString() + "_" + hora.getText().toString();
    }
    
    public void setTimerDataHora(JLabel data, JLabel hora){
        java.util.Timer timer = new java.util.Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                hora.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
                data.setText(new SimpleDateFormat("dd/MM/yy").format(new Date()));
            }
        }, 0, 1000);
    }
    
}


