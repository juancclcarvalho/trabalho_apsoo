package br.com.apsoo.dto;

public class Vendedor extends Funcionario {
    private int numeroVendas;
    private int codVendedor;
    
    public Vendedor(String nome, String cpf, int telefone) {
        super(nome, cpf, telefone);
        setNumeroVendas(numeroVendas);
        setCodVendedor(codVendedor);
    }

    public int getNumeroVendas() {
        return numeroVendas;
    }

    public int getCodVendedor() {
        return codVendedor;
    }

    public void setNumeroVendas(int numeroVendas) {
        if(numeroVendas >= 0) {
            this.numeroVendas = numeroVendas;
        }
    }

    public void setCodVendedor(int codVendedor) {
        this.codVendedor = codVendedor;
    }
}
