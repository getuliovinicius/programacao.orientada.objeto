package br.edu.fatecfranca.ads.exemplo;

import javax.swing.JOptionPane;

/**
 *  TestaAluno
 */
public class TestaAluno {

    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setArea("Exatas");
        curso.setCodigo(100);
        curso.setNome("ADS");
        
        Aluno aluno = new Aluno();
        aluno.setCodigo(2);
        aluno.setCurso(curso);
        aluno.setNome("Juliana");
        aluno.setRg("23456");
        
        JOptionPane.showMessageDialog(null, aluno.mostra());

    }
    
}