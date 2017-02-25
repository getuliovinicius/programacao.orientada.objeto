package br.edu.fatecfranca.ads.exe3;

/**
 *
 * @author getulio
 */
public class Produto {
    
    // variaveis de instancia
    public int idProduto;
    public String descricaoProduto;
    public int quantidadeProduto;
    public float precoProduto;
    
    // metodos construtores >>>
    public Produto () {
        this.idProduto = 0;
        this.descricaoProduto = "";
        this.quantidadeProduto = 0;
        this.precoProduto = 0;
    }
    public Produto (int idProduto, String descricaoProduto, int quantidadeProduto, float precoProduto) {
        this.idProduto = idProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.precoProduto = precoProduto;
    }
    // <<< metodos construtores
    
    // metodos publicos >>>
    public void comprar (int x) {
        this.quantidadeProduto += x;
    }
    public void vender (int x) {
        this.quantidadeProduto -= x;
    }
    public void subir (float x) {
        this.precoProduto += x;        
    }
    public void descer (float x) {
        this.precoProduto -= x;
    }
    public String mostra () {
        return "idProduto: " + this.idProduto + " | Descrição: " + this.descricaoProduto + " | Quantidade: " + this.quantidadeProduto + " | Preço: " + this.precoProduto;
    }
    // <<< metodos publicos
    
}
