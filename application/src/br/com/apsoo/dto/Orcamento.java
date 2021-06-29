package br.com.apsoo.dto;

import java.util.List;

public class Orcamento {
    private int _id;
    private String _codigo;
    private String data_hora;
    private String data_validade;
    private int _qtde_produtos;
    private double _subtotal;
    private Cliente _cli;
    private Funcionario _fun;
    private List<ItemOrcamento> _itens_orcamento;

    public Orcamento(String _codigo, String data_hora, String data_validade, int _qtde_produtos, double _subtotal, Cliente _cli, Funcionario _fun) {
        this._id = -1;
        this._codigo = _codigo;
        this.data_hora = data_hora;
        this.data_validade = data_validade;
        this._qtde_produtos = _qtde_produtos;
        this._subtotal = _subtotal;
        this._cli = _cli;
        this._fun = _fun;
    }
    
    public Orcamento(int _id, String _codigo, String data_hora, String data_validade, int _qtde_produtos, double _subtotal, Cliente _cli, Funcionario _fun) {
        this._id = _id;
        this._codigo = _codigo;
        this.data_hora = data_hora;
        this.data_validade = data_validade;
        this._qtde_produtos = _qtde_produtos;
        this._subtotal = _subtotal;
        this._cli = _cli;
        this._fun = _fun;
    }

    Orcamento() {
       
    }

    public int getId() {return _id;}
    public void setId(int _id) {this._id = _id;}

    public String getCodigo() {return _codigo;}
    public void setCodigo(String _codigo) {this._codigo = _codigo;}

    public String getData_hora() {return data_hora;}
    public void setData_hora(String data_hora) {this.data_hora = data_hora;}

    public String getData_validade() {return data_validade;}
    public void setData_validade(String data_validade) {this.data_validade = data_validade;}

    public int getQtde_produtos() {return _qtde_produtos;}
    public void setQtde_produtos(int _qtde_produtos) {this._qtde_produtos = _qtde_produtos;}

    public double getSubtotal() {return _subtotal;}
    public void setSubtotal(double _subtotal) {this._subtotal = _subtotal;}

    public Cliente getCli() {return _cli;}
    public void setCli(Cliente _cli) {this._cli = _cli;}

    public Funcionario getFun() {return _fun;}
    public void setFun(Funcionario _fun) {this._fun = _fun;}
    
    public List<ItemOrcamento> getItens_orcamento() {return _itens_orcamento;}
    public void setItens_orcamento(List<ItemOrcamento> _itens_orcamento) {this._itens_orcamento = _itens_orcamento;}
    
    @Override
    public String toString() {
        return getCodigo() + ", " + getQtde_produtos() + ", '" + getData_hora() + "', '" + getData_validade()+ "', "  +
               getSubtotal() + ", " + getCli().getId() + ", " + getFun().getId() + ", " + getFun().getFuncao().getId();
    }
}
