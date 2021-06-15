package br.com.apsoo.dto;

public class Venda {
    private int _id;
    private String _codigo;
    private String data_hora;
    private int _qtde_produtos;
    private double _subtotal;
    private double _desconto;
    private double _total;
    private Cliente _cli;
    private Funcionario _fun;

    public Venda(String _codigo, String data_hora, int _qtde_produtos, double _subtotal, double _desconto, double _total, Cliente _cli, Funcionario _fun) {
        this._id = -1;
        this._codigo = _codigo;
        this.data_hora = data_hora;
        this._qtde_produtos = _qtde_produtos;
        this._subtotal = _subtotal;
        this._desconto = _desconto;
        this._total = _total;
        this._cli = _cli;
        this._fun = _fun;
    }
    
    public Venda(int _id, String _codigo, String data_hora, int _qtde_produtos, double _subtotal, double _desconto, double _total, Cliente _cli, Funcionario _fun) {
        this._id = _id;
        this._codigo = _codigo;
        this.data_hora = data_hora;
        this._qtde_produtos = _qtde_produtos;
        this._subtotal = _subtotal;
        this._desconto = _desconto;
        this._total = _total;
        this._cli = _cli;
        this._fun = _fun;
    }

    public int getId() {return _id;}
    public void setId(int _id) {this._id = _id;}

    public String getCodigo() {return _codigo;}
    public void setCodigo(String _codigo) {this._codigo = _codigo;}

    public String getData_hora() {return data_hora;}
    public void setData_hora(String data_hora) {this.data_hora = data_hora;}

    public int getQtde_produtos() {return _qtde_produtos;}
    public void setQtde_produtos(int _qtde_produtos) {this._qtde_produtos = _qtde_produtos;}

    public double getSubtotal() {return _subtotal;}
    public void setSubtotal(double _subtotal) {this._subtotal = _subtotal;}

    public double getDesconto() {return _desconto;}
    public void setDesconto(double _desconto) {this._desconto = _desconto;}

    public double getTotal() {return _total;}
    public void setTotal(double _total) {this._total = _total;}

    public Cliente getCli() {return _cli;}
    public void setCli(Cliente _cli) {this._cli = _cli;}

    public Funcionario getFun() {return _fun;}
    public void setFun(Funcionario _fun) {this._fun = _fun;}
}
