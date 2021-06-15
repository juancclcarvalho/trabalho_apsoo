
package br.com.apsoo.dto;


public abstract class Pessoa {

    protected String _cpf;
    protected String _nome;
    protected String _endereco;
    protected String _telefone;
    protected String _email;

    public Pessoa(String _cpf, String _nome, String _endereco, String _telefone, String _email) {
        this._cpf = _cpf;
        this._nome = _nome;
        this._endereco = _endereco;
        this._telefone = _telefone;
        this._email = _email;
    }
}
