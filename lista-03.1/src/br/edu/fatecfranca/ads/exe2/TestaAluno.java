package br.edu.fatecfranca.ads.exe2;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author getulio
 */
public class TestaAluno {

    public static void main(String[] args) {
        
        try {
            
            String numeroAluno = JOptionPane.showInputDialog("Informe o número do aluno:");
            String nome = JOptionPane.showInputDialog("Informe o nome do aluno:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do aluno:"));
            float p1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da P1:"));
            float p2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da P2:"));

            Aluno fulano = new Aluno(numeroAluno, nome, idade, p1, p2);
            
            JOptionPane.showMessageDialog(null, fulano.dadosAluno());
            JOptionPane.showMessageDialog(null, "A nora final do aluno foi: " + fulano.notaFinal());
            JOptionPane.showMessageDialog(null, fulano.passou());
            
        } catch(IllegalArgumentException e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", ERROR_MESSAGE, null);

        }

    }
    
}
