package br.com.apsoo.dto;

import java.util.List;

public class VendaProduto {
    private int _id;
    private Venda _venda;
    private List<ItemVenda> _itens_venda;

    public VendaProduto(Venda _venda, List<ItemVenda> _itens_venda) {
        this._id = -1;
        this._venda = _venda;
        this._itens_venda = _itens_venda;
    }

    public VendaProduto(int _id, Venda _venda, List<ItemVenda> _itens_venda) {
        this._id = _id;
        this._venda = _venda;
        this._itens_venda = _itens_venda;
    }

    public int getId() {return _id;}

    public void setId(int _id) {this._id = _id;}

    public Venda getVenda() {return _venda;}

    public void setVenda(Venda _venda) {this._venda = _venda;}

    public List<ItemVenda> getItens_venda() {return _itens_venda;}

    public void setItens_venda(List<ItemVenda> _itens_venda) {this._itens_venda = _itens_venda;}
}
