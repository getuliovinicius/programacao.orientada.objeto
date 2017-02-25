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
    public float notaP1, notaP2;
   
    // metodos construtores >>>
    public Aluno (int numeroAluno, String nomeAluno, int idadeAluno, int notaP1, int notaP2) {
        this.numeroAluno = numeroAluno;
        this.nomeAluno = nomeAluno;
        this.idadeAluno = idadeAluno;
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
    }
    public Aluno () {
        this.numeroAluno = 0;
        this.nomeAluno = "";
        this.idadeAluno = 0;
        this.notaP1 = 0;
        this.notaP2 = 0;
    }
    // <<< metodos construtores

    // Retorna a nota final do aluno
    public float notaFinal () {
        return (this.notaP1 + this.notaP2) / 2;
    }
    
    // Checa se o aluno passou
    public String passou() {
        float media = notaFinal();
        
        if (media >= 6) {
            return "Passou";
        } else {
            return "Não Passou";
        }
    }    

    // Retorna os dados do aluno
    public String dadosAluno () {
        return "Número do aluno: " + this.numeroAluno + " | Nome: " + this.nomeAluno + " | Idade: " + this.idadeAluno;
    }
    
}
