package br.edu.fatecfranca.ads.exemplo02;

import java.util.ArrayList;
import java.util.Date;

/**
 * Venda
 */
public class Venda {
    
    private int numero;
    private Date data;
    private float valor;
    /** Vetor dinâmico */
    private ArrayList<ItemVenda> itens;

    public Venda() {
    }

    public Venda(int numero, Date data, float valor, ArrayList<ItemVenda> itens) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.itens = itens;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public ArrayList<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }

    public String mostra() {
        String aux = "Venda{" + "numero=" + numero + ", data=" + data + ", valor=" + valor + ", itens:";
        for (ItemVenda iv: this.itens) {
            aux = aux + "\n" + iv.mostra();
        }
        aux = aux + "}";
        return aux;
    }
    
    public void adicionaItem(ItemVenda itemVenda) {
        this.itens.add(itemVenda); // adiciona no fim
    }
    
    public boolean atualizaItemVenda(ItemVenda itemNovo) {
        int posicao = 0;
        for (ItemVenda iv: this.itens) {
            if (iv.getCodigo() == itemNovo.getCodigo()) {
                this.itens.set(posicao, itemNovo);
                return true;
            }
            posicao++;
        }
        return false;
    }
    
    public ItemVenda buscaItemVenda(int codigo) {
        for (ItemVenda iv: this.itens) {
            if (iv.getCodigo() == codigo) {
                return iv;
            }
        }
        return null;
    } 
    
    public boolean existeItemVenda(ItemVenda itemVenda) {
        return this.itens.contains(itemVenda);
    }

    public int posicaoItemVenda(ItemVenda itemVenda) {
        return this.itens.indexOf(itemVenda); // retorna -1 se não encontrar
    }

    public boolean removeItem(ItemVenda itemVenda) {
        return this.itens.remove(itemVenda);
    }

}