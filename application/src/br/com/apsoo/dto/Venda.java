package br.com.apsoo.dto;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Date;
import java.util.Locale;

public class Venda {
    private Vendedor vendedor;
    private Cliente cliente;
    private double desconto;
    private int formaPagamento;
    private double valorVenda;
    private double total;
    private Date data;
    private VendaProduto produtos;

    public Venda(Vendedor vendedor, Cliente cliente, double desconto, int formaPagamento, double valorVenda, double total, Date data, VendaProduto produtos) {
        setVendedor(vendedor);
        setCliente(cliente);
        setDesconto(desconto);
        setFormaPagamento(formaPagamento);
        setValorVenda(valorVenda);
        setTotal(total);
        setData(data);
        setProdutos(produtos);
    }
    
    public Venda(){
        
    }
   
    public Vendedor getVendedor() {
        return vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getDesconto() {
        return desconto;
    }

    public int getFormaPagamento() {
        return formaPagamento;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public double getTotal() {
        return total;
    }
    
    public Date getData() {
        return data;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void setFormaPagamento(int formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public VendaProduto getProdutos() {
        return produtos;
    }

    public void setProdutos(VendaProduto produtos) {
        this.produtos = produtos;
    }
    
    public String calculaDesconto(String valorVenda) {
        double valor = Double.parseDouble(valorVenda);
        double valorReal = 0;
        String valorString;
        if(valor > 500) {
            valorReal = valor*0.05;
        } 
        if (valor > 200) {
            valorReal = valor*0.02;
        }
        valorString = Double.toString(valorReal);
        return valorString;
    }
    
    public String calculaTotal(String valorVenda, String desconto) {
        double valor = Double.parseDouble(valorVenda);
        double descontoDouble = Double.parseDouble(desconto);
        double totalDouble = valor - descontoDouble;
        String totalString = Double.toString(totalDouble);
        return totalString;
    }
    
    public String calculaValorVenda(String valorVenda, String preco, int i) {
        double valorTotal;
        String valorTotalString;
        double valor = Double.parseDouble(valorVenda);
        double precoConvertido = Double.parseDouble(preco);
        if (i == 1) {
            valorTotal = valor + precoConvertido;
        } else {
            valorTotal = valor - precoConvertido;
        }
        valorTotalString = Double.toString(valorTotal);
        return valorTotalString;
    }
    
    
    
}
