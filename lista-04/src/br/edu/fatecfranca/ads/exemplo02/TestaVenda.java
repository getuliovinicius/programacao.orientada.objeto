package br.edu.fatecfranca.ads.exemplo02;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 * TestaVenda
 */
public class TestaVenda {

    public static void main(String[] args) {
        
        /** Venda */
        Venda venda = new Venda();
        venda.setData(new Date());
        venda.setNumero(100);
        venda.setValor(1000);
        
        /** Itens da venda */
        ItemVenda item1 = new ItemVenda(1, 50, 1);
        ItemVenda item2 = new ItemVenda(2, 50, 1);
        ItemVenda item3 = new ItemVenda(3, 30, 30);
        
        /** Associa a venda */
        venda.adicionaItem(item1);
        venda.adicionaItem(item2);
        venda.adicionaItem(item3);
        JOptionPane.showMessageDialog(null, venda.mostra());

        /** Remove item da venda */
        venda.removeItem(item2);
        JOptionPane.showMessageDialog(null, venda.mostra());

        /** Busca item da venda */
        JOptionPane.showMessageDialog(null, venda.buscaItemVenda(3).mostra());
        
        /** Atualiza item da venda */
        item3.setQtde(45);
        venda.atualizaItemVenda(item3);
        JOptionPane.showMessageDialog(null, venda.mostra());
        
    }
    
}
