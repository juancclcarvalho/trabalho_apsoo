package br.com.apsoo.dto;


public class Funcao {
    private int _id;
    private String _nome;

    public Funcao(int _id, String _nome) {
        this._id = _id;
        this._nome = _nome;
    }

    public Funcao(String _nome) {
        this._id = -1;
        this._nome = _nome;
    }

    public int getId() {return _id;}

    public void setId(int _id) {this._id = _id;}

    public String getNome() {return _nome;}

    public void setNome(String _nome) {this._nome = _nome;}
}
