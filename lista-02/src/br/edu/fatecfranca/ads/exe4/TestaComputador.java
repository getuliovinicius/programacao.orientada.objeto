package br.edu.fatecfranca.ads.exe4;

import javax.swing.JOptionPane;

/**
 *
 * @author getulio
 */
public class TestaComputador {

    public static void main(String[] args) {
        
        // cria o objeto pc
        Computador pc1 = new Computador();
        pc1.processador = JOptionPane.showInputDialog("Qual o PROCESSADOR do computator?");
        JOptionPane.showMessageDialog(null, pc1.imprime());
        
        // altera a quantidade de memoria ram
        Computador.ram = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de MEMÓRIA do computator?"));
        JOptionPane.showMessageDialog(null, pc1.imprime());
        
        // faz upgrade de memória
        Computador.upgradeRam();
        JOptionPane.showMessageDialog(null, pc1.imprime());
    
    }
    
}
