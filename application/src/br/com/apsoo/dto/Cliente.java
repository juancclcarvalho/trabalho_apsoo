package br.com.apsoo.dto;

public class Cliente extends Pessoa {
    private int pontoFidelidade;
    
    
    public Cliente(String nome, String cpf, int telefone) {
        super(nome, cpf, telefone);
        setPontoFidelidade(pontoFidelidade);
    }

    public int getPontoFidelidade() {
        return pontoFidelidade;
    }

    public void setPontoFidelidade(int pontoFidelidade) {
        if(pontoFidelidade >= 0) {
            this.pontoFidelidade = pontoFidelidade;
        }
    }
}
