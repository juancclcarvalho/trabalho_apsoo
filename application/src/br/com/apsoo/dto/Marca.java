package br.com.apsoo.dto;

public class Marca {
    private int _id;
    private String _nome;
    private String _sigla;

    public Marca(String _nome, String _sigla) {
        this._id = -1;
        this._nome = _nome;
        this._sigla = _sigla;
    }

    public Marca(int _id, String _nome, String _sigla) {
        this._id = _id;
        this._nome = _nome;
        this._sigla = _sigla;
    }

    public int getId() {return _id;}

    public void setId(int _id) {this._id = _id;}

    public String getNome() {return _nome;}

    public void setNome(String _nome) {this._nome = _nome;}

    public String getSigla() {return _sigla;}

    public void setSigla(String _sigla) {this._sigla = _sigla;}

    
   
}
