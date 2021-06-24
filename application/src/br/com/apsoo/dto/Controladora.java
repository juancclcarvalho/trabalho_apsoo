
package br.com.apsoo.dto;

import br.com.apsoo.dao.Database;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

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
    
    private final Database bd;
    private String operacao;
    private Venda venda;
    private Orcamento orcamento;
    private Funcionario funcionario;
    
    
    public Controladora() {this.bd = new Database();}

    public Database getBD() {return bd;}

    public String getOperacao() {return operacao;}

    public void setOperacao(String operacao) {this.operacao = operacao;}
    
    public Venda getVenda() {return venda;}

    public void setVenda(Venda venda) {this.venda = venda;}    

    public Orcamento getOrcamento() {return orcamento;}

    public void setOrcamento(Orcamento orcamento) {this.orcamento = orcamento;}
    
    public Funcionario getFuncionario() {return funcionario;}

    public void setFuncionario(Funcionario funcionario) {this.funcionario = funcionario;}
    

    
    public void finalizarVenda(String data_hora){
        
        venda.setData_hora(data_hora);
        
        int pontos = venda.getCli().getPontos();
        int vendas = venda.getFun().getTotal_vendas();
        venda.getCli().setPontos(pontos + 20);
        venda.getFun().setTotal_vendas(vendas + 1);
        String pontos_atualizado = String.valueOf(venda.getCli().getPontos());
        String vendas_atualizado = String.valueOf(venda.getFun().getTotal_vendas());

        
        bd.atualizaTabela("tb_cliente", "cli_pontos_fidelidade", pontos_atualizado, "where cli_cpf = '%s'".formatted(venda.getCli().getCpf()));
        bd.atualizaTabela("tb_funcionario", "func_total_vendas", vendas_atualizado, "where func_cpf = '%s' and func_cod_acesso = '%s'".formatted(venda.getFun().getCpf(), venda.getFun().getCod_acesso()));

        System.out.println(venda.toString());
        
        bd.insereTabela(
                "tb_venda", 
                "ven_cod, ven_data_hora, ven_qtde_prod, ven_subtotal, ven_desconto, ven_total, ven_forma_pgto, cli_id, func_id, fu_id", 
                venda.toString());
        
        String venda_id = "0";
        try {
            venda_id = buscaIdVenda(venda.getCodigo());
        } catch (Exception e) {
            System.out.println("ERRO AO PERSISTIR VENDA");
        }
        
        venda.setId(Integer.valueOf(venda_id));
        
        Iterator<ItemVenda> it = venda.getItens_venda().iterator();
        
        while(it.hasNext()){
            ItemVenda iv = it.next();
            bd.insereTabela("tb_venda_produto", "vp_qtd_item, vp_total_item, prod_id, marca_id, ven_id", iv.toString() + ", " + venda.getId());
            
            int estoque_atualizado_int =(iv.getItem().getEstoque() - iv.getQtde_item());
            String estoque_atualizado = String.valueOf(estoque_atualizado_int);
            
            bd.atualizaTabela("tb_produto", "prod_estoque", estoque_atualizado, "where prod_codigo = '%s'".formatted(iv.getItem().getCodigo()));
        }
        
        //atualizar a quantiddade do produto
        
        
    }
    
    public void finalizarOrcamento(String data_hora){
        /*
        venda.setData_hora(data_hora);
        
        int pontos = venda.getCli().getPontos();
        int vendas = venda.getFun().getTotal_vendas();
        venda.getCli().setPontos(pontos + 20);
        venda.getFun().setTotal_vendas(vendas + 1);
        String pontos_atualizado = String.valueOf(venda.getCli().getPontos());
        String vendas_atualizado = String.valueOf(venda.getFun().getTotal_vendas());

        
        bd.atualizaTabela("tb_cliente", "cli_pontos_fidelidade", pontos_atualizado, "where cli_cpf = '%s'".formatted(venda.getCli().getCpf()));
        bd.atualizaTabela("tb_funcionario", "func_total_vendas", vendas_atualizado, "where func_cpf = '%s' and func_cod_acesso = '%s'".formatted(venda.getFun().getCpf(), venda.getFun().getCod_acesso()));

        System.out.println(venda.toString());
        
        bd.insereTabela(
                "tb_venda", 
                "ven_cod, ven_data_hora, ven_qtde_prod, ven_subtotal, ven_desconto, ven_total, ven_forma_pgto, cli_id, func_id, fu_id", 
                venda.toString());
        
        System.out.println("br.com.apsoo.dto.Controladora.finalizarVenda()");
        
        //escrever os itens na vendaProduto
        //atualizar a quantiddade do produto
        */
        
    }
    
    public String buscaIdVenda(String codigo_venda)  throws SQLException{
        
        try {
            String[] res = bd.buscaTabela("ven_id", "tb_venda", "", "where ven_cod = '%s'".formatted(venda.getCodigo())).get(0).toString().split(",");
        
            if(res.length > 0){
                return res[0];
            }
        
        } catch (Exception e) {
            throw e;
        }
        return null;
    }


    public double calculaValorParcela(int parcelas){
        return venda.getTotal()/parcelas;
    }
    
    public double calculaTroco(double valorPago) throws Exception{
        if(valorPago >= venda.getTotal()){
            return valorPago - venda.getTotal();
        }
        else throw new Exception();
    }
    
    public void setFormaPagamento(String forma){
        this.getVenda().setForma_pgto(forma);
    }

    
    public void cancelarVenda(){
        this.setVenda(null);
        this.setFuncionario(null);
        this.setOperacao(null);
    }
    
    public void cancelarOrcamento(){
        this.setOrcamento(null);
        this.setFuncionario(null);
        this.setOperacao(null);
    }
    
    //associa um item selecionado à venda
    public void associa_item_venda(ItemVenda iv){
        venda.getItens_venda().add(iv);
        venda.setQtde_produtos(venda.getQtde_produtos()+1);
        calcula_valores_venda();
        
        System.out.println(venda.getItens_venda().size());
    }
    
    /*
    //associa um item selecionado ao orcametno
    public void associa_item_orcamento(ItemVenda io){
        orcamento.getItens_orcamento().add(io);
        orcamento.setQtde_produtos(orcamento.getQtde_produtos()+1);
        calcula_valores_orcamento();
        
        System.out.println(orcamento.getItens_orcamento().size());
    }
    */
    
    //remove um item da venda
    public void remove_item_venda(String cod_produto, int quantidade){
        ItemVenda iv_remover = new ItemVenda(new Produto(), quantidade, 0.0);
        iv_remover.getItem().setCodigo(cod_produto);
        
        venda.getItens_venda().remove(iv_remover);
        venda.setQtde_produtos(venda.getQtde_produtos()-1);
        calcula_valores_venda();
        
        System.out.println(venda.getItens_venda().size());
    }
    
    
    //remove um item do orcamento
    public void remove_item_orcamento(String cod_produto, int quantidade){
        ItemVenda iv_remover = new ItemVenda(new Produto(), quantidade, 0.0);
        iv_remover.getItem().setCodigo(cod_produto);
        
        orcamento.getItens_orcamento().remove(iv_remover);
        orcamento.setQtde_produtos(orcamento.getQtde_produtos()-1);
        calcula_valores_orcamento();
        
        System.out.println(orcamento.getItens_orcamento().size());
    }
    
    
    public void calcula_valores_venda(){
        double subtotal = 0;
        for(int i = 0; i < venda.getQtde_produtos(); i++){
            subtotal = subtotal + venda.getItens_venda().get(i).getTotal_item();
        }
        
        double desconto = 0.0;
        if(subtotal > 200.0){
            desconto = 0.02*subtotal;
        }else if(subtotal > 500.0){
            desconto = 0.05*subtotal;
        }
        else desconto = 0.0;
        
        venda.setSubtotal(subtotal);
        venda.setDesconto(desconto);
        venda.setTotal(subtotal-desconto);
    }
    
    public void calcula_valores_orcamento(){
        double subtotal = 0;
        for(int i = 0; i < orcamento.getQtde_produtos(); i++){
            subtotal = subtotal + orcamento.getItens_orcamento().get(i).getTotal_item();
        }
        
        orcamento.setSubtotal(subtotal);
    }
    
    // busca todos os produtos na tb_produto e retorna uma lista com os resultados
    public List busca_catalogo() throws SQLException{
        try {
            List res = this.getBD().buscaTabela(
                "p.prod_codigo, p.prod_descricao, m.marca_nome, p.prod_preco, p.prod_estoque", 
                "tb_produto p", 
                "inner join tb_marca m on p.marca_id = m.marca_id", 
                "where p.prod_estoque > 0");

            return  res;
        } catch (SQLException e) {
            throw e;
        }
    }
    
    // configura o cliente na venda
    public void seta_cliente(Cliente cli){
        venda.setCli(cli);
    }
    
    // configura o cliente no orcamento
    public void seta_clienteOrc(Cliente cli){
        orcamento.setCli(cli);
    }
      
    // inicia a venda, configurando o funcionario previamente liberado para
    // realizar a venda, o código da venda e a lista de itens, vazia
    public Venda iniciarVenda(){
        operacao = "VENDA";
        
        venda = new Venda();
        
        Random rand = new Random();
        Integer codigoVenda = rand.nextInt(9999999);
        venda.setCodigo(codigoVenda.toString());
        venda.setQtde_produtos(0);
        venda.setFun(this.getFuncionario());
        funcionario = null;
        
        List<ItemVenda> itens = new ArrayList<>();
        venda.setItens_venda(itens);
        
        return venda;
    }
    
    // inicia o orcamento, configurando o funcionario previamente liberado para
    // realizar o orcamento, o código do orcamento e a lista de itens, vazia
    public Orcamento iniciarOrcamento(){
        operacao = "ORCAMENTO";
        
        orcamento = new Orcamento();
        
        Random rand = new Random();
        Integer codigoOrcamento = rand.nextInt(9999999);
        orcamento.setCodigo(codigoOrcamento.toString());
        orcamento.setQtde_produtos(0);
        orcamento.setFun(this.getFuncionario());
        funcionario = null;
        
        List<ItemVenda> itens = new ArrayList<>();
        orcamento.setItens_orcamento(itens);
        
        return orcamento;
    }
    
    //valida um funcionário com as informações presentes em banco
    public boolean validarFuncionario(String cod_acesso){
        try {
            Funcionario func = buscaFuncionario(cod_acesso);
            this.funcionario = func;
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Funcionario buscaFuncionario(String cod_acesso) throws SQLException{
        try{
            String[] res = this.bd.buscaTabela("*", "tb_funcionario", 
                "inner join tb_funcao on tb_funcao.fu_id = tb_funcionario.fu_id", 
                "where tb_funcionario.func_cod_acesso='%s'".formatted(cod_acesso)).get(0).toString().split(",");
        
            Funcao fu = new Funcao(Integer.valueOf(res[9]), res[10]);

            Funcionario fun = new Funcionario(res[1], res[2], res[3], res[4], res[5]);

            fun.setId(Integer.valueOf(res[0]));
            fun.setTotal_vendas(Integer.valueOf(res[8]));
            fun.setCod_acesso(res[7]);
            fun.setFuncao(fu);

            return fun;
        }
        catch(SQLException e){
            throw e;
        }
    }
    
    public Cliente buscaCliente(String cli_cpf) throws SQLException{
        try {
            String[] res = this.bd.buscaTabela("*", "tb_cliente cli", 
                "", 
                "where cli.cli_cpf='%s'".formatted(cli_cpf)).get(0).toString().split(",");
        
            Cliente cli = new Cliente(res[1], res[5], res[2], res[3], res[4]);

            cli.setId(Integer.valueOf(res[0]));
            cli.setPontos(Integer.valueOf(res[6].strip()));

            return cli;
        } catch (SQLException e) {
            throw e;
        }
    }    
    
    public Marca buscaMarca(String marca_nome) throws SQLException{
        String[] res = this.bd.buscaTabela("*", "tb_marca m", 
                "", 
                "where m.marca_nome = '%s'".formatted(marca_nome)).get(0).toString().split(",");
    
        Marca m = new Marca();
        m.setId(Integer.valueOf(res[0]));
        m.setNome(res[1]);
        m.setSigla(res[2]);
                
        return m;
    }
   
    public Produto buscaProduto(String cod_produto) throws SQLException{
        try{
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
        catch (SQLException e){
            throw e;
        }
    }
    

}


