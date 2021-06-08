package br.com.apsoo.dto;

public class Funcionario extends Pessoa {
    private String email;
    private String endereco;
    private int funcao;
    private int codAcesso;
    
    
    public Funcionario(String nome, String cpf, int telefone) {
        super(nome, cpf, telefone);
        setEmail(email);
        setEndereco(endereco);
        setFuncao(funcao);
        setCodAcesso(codAcesso);
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getFuncao() {
        return funcao;
    }

    public int getCodAcesso() {
        return codAcesso;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setFuncao(int funcao) {
        this.funcao = funcao;
    }

    public void setCodAcesso(int codAcesso) {
        this.codAcesso = codAcesso;
    }
    
}

