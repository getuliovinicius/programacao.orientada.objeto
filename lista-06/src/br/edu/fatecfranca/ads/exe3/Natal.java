package br.edu.fatecfranca.ads.exe3;

import javax.swing.JOptionPane;

/**
 * Natal
 */
public class Natal extends CartaoWeb {

    public Natal() {
        super();
    }

    public Natal(String destinatario) {
        super(destinatario);
    }
    
    @Override
    public void showMessage() {
        JOptionPane.showMessageDialog(null, "Feliz Natal\n" + super.toString());
    }
    
}
