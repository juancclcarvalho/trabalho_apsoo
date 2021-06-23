package br.com.apsoo.dto;


public class Produto {
    private int _id;
    private String _codigo;
    private String _modelo;
    private String _cor;
    private double _preco;
    private String _descricao;
    private int _estoque;
    private Marca _marca;

    public Produto(String _codigo, String _modelo, String _cor, double _preco, String _descricao, int _estoque, Marca _marca) {
        this._id = -1;
        this._codigo = _codigo;
        this._modelo = _modelo;
        this._cor = _cor;
        this._preco = _preco;
        this._descricao = _descricao;
        this._estoque = _estoque;
        this._marca = _marca;
    }
    
    public Produto(int _id, String _codigo, String _modelo, String _cor, double _preco, String _descricao, int _estoque, Marca _marca) {
        this._id = _id;
        this._codigo = _codigo;
        this._modelo = _modelo;
        this._cor = _cor;
        this._preco = _preco;
        this._descricao = _descricao;
        this._estoque = _estoque;
        this._marca = _marca;
    }

    public Produto() {
    }

    public int getId() {return _id;}
    public void setId(int _id) {this._id = _id;}
    
    public String getCodigo() {return _codigo;}
    public void setCodigo(String _codigo) {this._codigo = _codigo;}

    public String getModelo() {return _modelo;}
    public void setModelo(String _modelo) {this._modelo = _modelo;}

    public String getCor() {return _cor;}
    public void setCor(String _cor) {this._cor = _cor;}

    public double getPreco() {return _preco;}
    public void setPreco(double _preco) {this._preco = _preco;}

    public String getDescricao() {return _descricao;}
    public void setDescricao(String _descricao) {this._descricao = _descricao;}

    public int getEstoque() {return _estoque;}
    public void setEstoque(int _estoque) {this._estoque = _estoque;}

    public Marca getMarca() {return _marca;}
    public void setMarca(Marca _marca) {this._marca = _marca;}
}
