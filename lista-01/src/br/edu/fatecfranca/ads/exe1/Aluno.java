package br.edu.fatecfranca.ads.exe1;

/**
 *
 * @author getulio
 */

public class Aluno {

    // variaveis de instancia
    public int numeroAluno;
    public String nomeAluno;
    public int idadeAluno;
    public float notaP1;
    public float notaP2;
    public float media;
   
    // metodo construtor
    public Aluno () {
        numeroAluno = 1;
        nomeAluno = "João";
        idadeAluno = 18;
        notaP1 = 8;
        notaP2 = 2;
    }
    
    // Retorna a nota final do aluno
    public float notaFinal () {
        media = (notaP1 + notaP2) / 2;
        return media;
    }
    
    // Retorna os dados do aluno
    public String dadosAluno () {
        return "Número do aluno: " + numeroAluno + " | Nome: " + nomeAluno + " | Idade: " + idadeAluno;
    }
    
    // Checa se o aluno passou
    public String passou() {
        
        notaFinal();
        
        if (media >= 6) {
            return "Passou";
        } else {
            return "Não Passou";
        }
    }    
}
