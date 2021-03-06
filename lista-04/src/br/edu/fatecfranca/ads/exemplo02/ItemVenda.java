package br.edu.fatecfranca.ads.exemplo02;

/**
 * ItemVenda
 */
public class ItemVenda {
    
    private int codigo;
    private float valor;
    private int qtde;
    
    public ItemVenda () {
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

    public String mostra() {
        return "ItemVenda{" + "codigo=" + codigo + ", valor=" + valor + ", qtde=" + qtde + '}';
    }
       
}
