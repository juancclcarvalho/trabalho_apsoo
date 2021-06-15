package br.com.apsoo.dto;


public class Funcionario extends Pessoa {
    private int _id;
    private String _cod_acesso;
    private Funcao _funcao;
    private int _total_vendas;

    public Funcionario(String _cpf, String _nome, String _endereco, String _telefone, String _email, String _cod_acesso, Funcao _funcao, int _total_vendas) {
        super(_cpf, _nome, _endereco, _telefone, _email);
        this._id = -1;
        this._cod_acesso = _cod_acesso;
        this._funcao = _funcao;
        this._total_vendas = _total_vendas;
    }

    public Funcionario(int _id, String _cpf, String _nome, String _endereco, String _telefone, String _email, String _cod_acesso, Funcao _funcao, int _total_vendas) {
        super(_cpf, _nome, _endereco, _telefone, _email);
        this._id = _id;
        this._cod_acesso = _cod_acesso;
        this._funcao = _funcao;
        this._total_vendas = _total_vendas;
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

    public String getCod_acesso() {return _cod_acesso;}
    public void setCod_acesso(String _cod_acesso) {this._cod_acesso = _cod_acesso;}

    public Funcao getFuncao() {return _funcao;}
    public void setFuncao(Funcao _funcao) {this._funcao = _funcao;}

    public int getTotal_vendas() {return _total_vendas;}
    public void setTotal_vendas(int _total_vendas) {this._total_vendas = _total_vendas;}

}
