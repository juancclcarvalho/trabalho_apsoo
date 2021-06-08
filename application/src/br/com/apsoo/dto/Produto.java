package br.com.apsoo.dto;

public class Produto {
    private double preco;
    private String descricao;

    public Produto(double preco, String descricao) {
        setPreco(preco);
        setDescricao(descricao);
    }    
    
    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setPreco(double preco) {
        if(preco >= 0) {
            this.preco = preco;
        }
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
