package br.edu.fatecfranca.ads.exe1;

import javax.swing.JOptionPane;

/**
 *
 * @author getulio
 */

public class TestaAluno {

    public static void main (String args[]) {
        
        // Aluno 1
        Aluno aluno1 = new Aluno();
        
        
        JOptionPane.showMessageDialog(null, aluno1.dadosAluno());
        JOptionPane.showMessageDialog(null, aluno1.notaFinal());
        JOptionPane.showMessageDialog(null, aluno1.passou());

    }

}