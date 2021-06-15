
package br.com.apsoo.dto;

import java.util.List;


public class OrcamentoProduto {
    private int _id;
    private Orcamento _orcamento;
    private List<ItemOrcamento> _itens_orcamento;

    public OrcamentoProduto(Orcamento _orcamento, List<ItemOrcamento> _itens_orcamento) {
        this._id = -1;
        this._orcamento = _orcamento;
        this._itens_orcamento = _itens_orcamento;
    }
    
    public OrcamentoProduto(int _id, Orcamento _orcamento, List<ItemOrcamento> _itens_orcamento) {
        this._id = _id;
        this._orcamento = _orcamento;
        this._itens_orcamento = _itens_orcamento;
    }
    
    public int getId() {return _id;}

    public void setId(int _id) {this._id = _id;}

    public Orcamento getOrcamento() {return _orcamento;}

    public void setOrcamento(Orcamento _orcamento) {this._orcamento = _orcamento;}

    public List<ItemOrcamento> getItens_orcamento() {return _itens_orcamento;}

    public void setItens_orcamento(List<ItemOrcamento> _itens_orcamento) {this._itens_orcamento = _itens_orcamento;}
}
