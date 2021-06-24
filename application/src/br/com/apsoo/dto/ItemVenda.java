
package br.com.apsoo.dto;

/// abstração de um produto da venda com uma certa quantidade e um valor
/// uma venda possui varios itens e cada item é um produto e uma quantidade
public class ItemVenda {
    private Produto _item;
    private int _qtde_item;
    private double _total_item;

    public ItemVenda(Produto _item, int _qtde_item, double _total_item) {
        this._item = _item;
        this._qtde_item = _qtde_item;
        this._total_item = _total_item;
    }
    
    public ItemVenda(){
    }

    public Produto getItem() {return _item;}
    public void setItem(Produto _item) {this._item = _item;}

    public int getQtde_item() {return _qtde_item;}
    public void setQtde_item(int _qtde_item) {this._qtde_item = _qtde_item;}

    public double getTotal_item() {return _total_item;}
    public void setTotal_item(double _total_item) {this._total_item = _total_item;}

    @Override
    public boolean equals(Object obj) {
        
        ItemVenda iv = (ItemVenda) obj;
        
        if(iv.getItem().getCodigo().equals(this.getItem().getCodigo()) && iv.getQtde_item() == this.getQtde_item() ){
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return getQtde_item() + ", " + getTotal_item() + ", " + getItem().getId() + ", " + getItem().getMarca().getId();
    }
    
    
    
}
