package br.edu.fatecfranca.ads.exemplo1;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author getulio
 */
public class Jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Coisa usuario = new Coisa();
        
        String saida = JOptionPane.showInputDialog(" Digite: \n1. para Papel \n2. para Pedra \n3. para Tesoura");
        
        switch(saida) {
            case "1": usuario = new Papel();
                break;
            case "2": usuario = new Pedra();
                break;
            case "3": usuario = new Tesoura();
                break;
            default: usuario = new Papel();
        }
        
        Random random = new Random();
                
        Coisa pc = new Coisa();
        
        int semente = random.nextInt(3) + 1;

        switch(semente) {
            case 1: pc = new Papel();
                break;
            case 2: pc = new Pedra();
                break;
            case 3: pc = new Tesoura();
                break;
            default: pc = new Papel();
        }
    }
    
}
