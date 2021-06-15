package br.com.apsoo.dto;


public class Cliente  extends Pessoa{
    private int _id;
    private int _pontos;

    public Cliente(String _cpf, String _nome, String _endereco, 
            String _telefone, String _email, int _pontos) {
        super(_cpf, _nome, _endereco, _telefone, _email);
        this._id = -1;
        this._pontos = _pontos;
    }

    public Cliente(int _id, String _cpf, String _nome, String _endereco, 
            String _telefone, String _email, int _pontos) {
        super(_cpf, _nome, _endereco, _telefone, _email);
        this._id = _id;
        this._pontos = _pontos;
    }

    public int getId() {return _id;}
    public void setId(int _id) {this._id = _id;}

    public String getCpf() {return _cpf;}
    public void setCpf(String _cpf) {this._cpf = _cpf;}

    public String getNome() {return _nome;}
    public void setNome(String _nome) {this._nome = _nome;}

    public String getEndereco() {return _endereco;}
    public void setEndereco(String _endereco) {this._endereco = _endereco;}

    public String getTelefone() {return _telefone;}
    public void setTelefone(String _telefone) {this._telefone = _telefone;}

    public String getEmail() {return _email;}
    public void setEmail(String _email) {this._email = _email;}

    public int getPontos() {return _pontos;}
    public void setPontos(int _pontos) {this._pontos = _pontos;}
}
