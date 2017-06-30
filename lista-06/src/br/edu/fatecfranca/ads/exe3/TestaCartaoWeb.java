package br.edu.fatecfranca.ads.exe3;

import java.util.ArrayList;

/**
 * TestaCartao
 */
public class TestaCartaoWeb {

    public static void main(String[] args) {
        
        ArrayList<CartaoWeb> cartoes = new ArrayList();
        DiaDosNamorados c1 = new DiaDosNamorados("Valéria");
        Natal c2 = new Natal("Mary Jane");
        Aniversario c3 = new Aniversario("Jurema");
        
        cartoes.add(c1);
        cartoes.add(c2);
        cartoes.add(c3);
        
        cartoes.forEach((cartao) -> {
            cartao.showMessage();
        });

    }
    
}
