package br.com.apsoo.dto;

public class VendaProduto {
    private Produto produto;
    private int quantidade;
    private double preco;
    private Venda venda;

    public VendaProduto(Produto produto, int quantidade, double preco, Venda venda) {
        setProduto(produto);
        setQuantidade(quantidade);
        setPreco(preco);
        setVenda(venda);
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }

    public void setPreco(double preco) {
        if(preco >= 0) {
            this.preco = preco;
        }
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

}
