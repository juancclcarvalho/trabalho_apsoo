
package br.com.apsoo.dto;


public class ItemOrcamento {
    private Produto _item;
    private int _qtde_item;
    private double _total_item;

    public ItemOrcamento(Produto _item, int _qtde_item, double _total_item) {
        this._item = _item;
        this._qtde_item = _qtde_item;
        this._total_item = _total_item;
    }

    public Produto getItem() {return _item;}
    public void setItem(Produto _item) {this._item = _item;}

    public int getQtde_item() {return _qtde_item;}
    public void setQtde_item(int _qtde_item) {this._qtde_item = _qtde_item;}

    public double getTotal_item() {return _total_item;}
    public void setTotal_item(double _total_item) {this._total_item = _total_item;}
    
}
