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
        aluno1.numeroAluno = Integer.parseInt(JOptionPane.showInputDialog("Qual o NÚMERO do aluno?"));
        aluno1.nomeAluno = JOptionPane.showInputDialog("Qual o NOME do aluno?");
        aluno1.idadeAluno = Integer.parseInt(JOptionPane.showInputDialog("Qual a IDADE do aluno?"));
        aluno1.notaP1 = Integer.parseInt(JOptionPane.showInputDialog("Qual a Nota da P1?"));
        aluno1.notaP2 = Integer.parseInt(JOptionPane.showInputDialog("Qual a Nota da P2?"));
        JOptionPane.showMessageDialog(null, aluno1.dadosAluno());
        JOptionPane.showMessageDialog(null, aluno1.passou());

        // Aluno 2
        int numeroAluno = Integer.parseInt(JOptionPane.showInputDialog("Qual o NÚMERO do aluno?"));
        String nomeAluno = JOptionPane.showInputDialog("Qual o NOME do aluno?");
        int idadeAluno = Integer.parseInt(JOptionPane.showInputDialog("Qual a IDADE do aluno?"));
        int notaP1 = Integer.parseInt(JOptionPane.showInputDialog("Qual a Nota da P1?"));
        int notaP2 = Integer.parseInt(JOptionPane.showInputDialog("Qual a Nota da P2?"));
        Aluno aluno2 = new Aluno(numeroAluno, nomeAluno, idadeAluno, notaP1, notaP2);
        JOptionPane.showMessageDialog(null, aluno1.dadosAluno());
        JOptionPane.showMessageDialog(null, aluno1.notaFinal());
        JOptionPane.showMessageDialog(null, aluno1.passou());

    }

}