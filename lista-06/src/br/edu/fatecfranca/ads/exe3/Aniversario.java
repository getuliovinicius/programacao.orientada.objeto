package br.edu.fatecfranca.ads.exe3;

import javax.swing.JOptionPane;

/**
 * Aniversario
 */
public class Aniversario extends CartaoWeb {

    public Aniversario() {
        super();
    }

    public Aniversario(String destinatario) {
        super(destinatario);
    }
    
    @Override
    public void showMessage() {
        JOptionPane.showMessageDialog(null, "Feliz Aniversário\n" + super.toString());
    }
    
}
