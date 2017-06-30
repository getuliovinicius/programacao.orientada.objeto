package br.edu.fatecfranca.ads.exe4;

import javax.swing.JOptionPane;

/**
 * TestaProduto
 */
public class TestaProduto {
    
    public static void polimorfico(Produto prod) {
        JOptionPane.showMessageDialog(null, prod.toString());
    }

    public static void main(String[] args) {

        Radio radio = new Radio("FM", 101.3f, 123, 456);
        radio.testaUnidade();
        polimorfico(radio);
        Tv tv = new Tv(539, 456, 789);
        tv.testaUnidade();
        polimorfico(tv);

    }
    
}
