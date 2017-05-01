package br.edu.fatecfranca.ads.exemplo;

/**
 *
 * @author getulio
 */
public class Aluno {
    
    private int codigo;
    private String nome, rg;
    private Curso curso;

    /**
     * Métodos construtores
     */
    public Aluno() {
        this.codigo = 0;
        this.nome = "";
        this.rg = "";
        this.curso = new Curso();
    }

    public Aluno(int codigo, String nome, String rg, Curso curso) {
        this.codigo = codigo;
        this.nome = nome;
        this.rg = rg;
        this.curso = curso;
    }
    
    public Aluno(int codigo, String nome, String rg, int codigoC, String nomeC, String area) {
        this.codigo = codigo;
        this.nome = nome;
        this.rg = rg;
        //composicao
        this.curso = new Curso(codigoC, nomeC, area);
    }
   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public String mostra() {
        return "Aluno{" + "codigo=" + codigo + ", nome=" + nome + ", rg=" + rg + ", curso=" + curso.mostra() + '}';
    }
       
}