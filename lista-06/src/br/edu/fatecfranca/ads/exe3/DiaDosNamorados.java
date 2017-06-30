package br.edu.fatecfranca.ads.exe3;

import javax.swing.JOptionPane;

/**
 * DiaDosNamorados
 */
public class DiaDosNamorados extends CartaoWeb {

    public DiaDosNamorados() {
        super();
    }

    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        JOptionPane.showMessageDialog(null, "Feliz dia dos Namorados\n" + super.toString());
    }
    
}
