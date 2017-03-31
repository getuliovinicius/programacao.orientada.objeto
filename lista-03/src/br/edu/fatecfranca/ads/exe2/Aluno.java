package br.edu.fatecfranca.ads.exe2;

/**
 *
 * @author getulio
 */
public class Aluno {

    /** variáveis de instância */

    private String numeroAluno, nome;
    private int idade;
    private float p1, p2;

    /** variáveis de instância */
    
    /** métodos construtores */
    
    public Aluno() {
        this.numeroAluno = "111111";
        this.nome = "";
        this.idade = 1;
        this.p1 = 0;
        this.p2 = 0;
    }

    public Aluno(String numeroAluno, String nome, int idade, float p1, float p2) {
        
        verificaNumeroAluno(numeroAluno);
        verificaNome(nome);
        verificaIdade(idade);
        verificaP1(p1);
        verificaP2(p2);
        
    }

    /** métodos construtores */

    /** métodos privados */

    private void verificaNumeroAluno(String numeroAluno) {
        if (numeroAluno.length() == 6) {
            this.numeroAluno = numeroAluno;
        } else {
            throw new IllegalArgumentException("Número de conta inválido.");  
        }
    }

    private void verificaNome(String nome) {
        
        if (nome.length() <= 30) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O tamanho do nome excede o limite de 30 caracteres.");
        }
        
    }
    
    private void verificaIdade(int idade) {
        
        if (idade >= 0) {
            this.idade = idade;
        } else {
            throw new IllegalArgumentException("O aluno idade maior que zero.");
        }

    }
    
    private void verificaP1(float p1) {
        
        if (p1 >= 0) {
            this.p1 = p1;
        } else {
            throw new IllegalArgumentException("A nota da prova P1 não pode ser negativa.");
        }
        
    }

    private void verificaP2(float p2) {
        
        if (p2 >= 0) {
            this.p2 = p2;
        } else {
            throw new IllegalArgumentException("A nota da prova P2 não pode ser negativa.");
        }
        
    }

    /** métodos privados */

    /** métodos públicos */

    public String getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(String numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }
    
    /** métodos públicos */

}
