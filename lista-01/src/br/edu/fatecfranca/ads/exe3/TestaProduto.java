package br.edu.fatecfranca.ads.exe3;

import javax.swing.JOptionPane;

/**
 *
 * @author getulio
 */
public class TestaProduto {

    public static void main(String[] args) {
        
        // produto 1
        Produto produto1 = new Produto();
        produto1.idProduto = Integer.parseInt(JOptionPane.showInputDialog("Qual a ID do produto?"));
        produto1.descricaoProduto = JOptionPane.showInputDialog("Qual a DESCRIÇÃO do produto?");
        produto1.quantidadeProduto = Integer.parseInt(JOptionPane.showInputDialog("Qual a QUANTIDADE do produto?"));
        produto1.precoProduto = Float.parseFloat(JOptionPane.showInputDialog("Qual o PREÇO do produto?"));
        JOptionPane.showMessageDialog(null, produto1.mostra());
        // recebe produtos comprados
        produto1.comprar(Integer.parseInt(JOptionPane.showInputDialog("Quantos produtos foram comprados?")));
        JOptionPane.showMessageDialog(null, produto1.mostra());
        // vende produtos
        produto1.vender(Integer.parseInt(JOptionPane.showInputDialog("Quantos produtos foram vendidos?")));
        JOptionPane.showMessageDialog(null, produto1.mostra());
        // aumenta o preco do produto
        produto1.subir(Float.parseFloat(JOptionPane.showInputDialog("Qual o valor a ser aumentado do preço?")));
        JOptionPane.showMessageDialog(null, produto1.mostra());
        // diminui o preco do produto
        produto1.descer(Float.parseFloat(JOptionPane.showInputDialog("Qual o valor a ser diminuido do preço?")));
        JOptionPane.showMessageDialog(null, produto1.mostra());
        
        // produto 2
        int idProduto = Integer.parseInt(JOptionPane.showInputDialog("Qual a ID do produto?"));
        String descricaoProduto = JOptionPane.showInputDialog("Qual a DESCRIÇÃO do produto?");
        int quantidadeProduto = Integer.parseInt(JOptionPane.showInputDialog("Qual a QUANTIDADE do produto?"));
        float precoProduto = Float.parseFloat(JOptionPane.showInputDialog("Qual o PREÇO do produto?"));
        Produto produto2 = new Produto(idProduto, descricaoProduto, quantidadeProduto, precoProduto);
        // recebe produtos comprados
        produto2.comprar(Integer.parseInt(JOptionPane.showInputDialog("Quantos produtos foram comprados?")));
        JOptionPane.showMessageDialog(null, produto2.mostra());
        // vende produtos
        produto2.vender(Integer.parseInt(JOptionPane.showInputDialog("Quantos produtos foram vendidos?")));
        JOptionPane.showMessageDialog(null, produto2.mostra());
        // aumenta o preco do produto
        produto2.subir(Float.parseFloat(JOptionPane.showInputDialog("Qual o valor a ser aumentado do preço?")));
        JOptionPane.showMessageDialog(null, produto2.mostra());
        // diminui o preco do produto
        produto2.descer(Float.parseFloat(JOptionPane.showInputDialog("Qual o valor a ser diminuido do preço?")));
        JOptionPane.showMessageDialog(null, produto2.mostra());
    
    }
    
}
