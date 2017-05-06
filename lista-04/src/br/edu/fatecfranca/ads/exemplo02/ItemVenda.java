/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ads.exemplo02;

/**
 * Item da venda com os seguinte dados:
 * int codigo;
 * float valor;
 * int qtde;
 * @author getulio
 */
public class ItemVenda {
    
    private int codigo;
    private float valor;
    private int qtde;
    
    public ItemVenda () {
        this.codigo = 0;
        this.valor = 0;
        this.qtde = 0;
    }

    public ItemVenda(int codigo, float valor, int qtde) {
        this.codigo = codigo;
        this.valor = valor;
        this.qtde = qtde;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    /**
     * mostra
     * @return 
     */
    public String mostra() {
        return "ItemVenda{" + "codigo=" + codigo + ", valor=" + valor + ", qtde=" + qtde + '}';
    }
    
    
}
