package br.edu.fatecfranca.ads.exe3;

import javax.swing.JOptionPane;

/**
 *
 * @author getulio
 */
public class MeuString {
    
    public static String str1;
    
    public String imprimir () {
        return "Tamanho: " + str1.length() + "\nCaracter na posição 2: " + str1.charAt(1);
    }
    
    public static void main(String[] args) {
        
        MeuString.str1 = "meu primeiro string";
        
        MeuString instancia = new MeuString();
        JOptionPane.showMessageDialog(null, instancia.imprimir());
        
        String str2 = MeuString.str1.length() + " é o começo da minha segunda string";
        JOptionPane.showMessageDialog(null, str2);
        
    }
    
}
