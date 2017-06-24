package br.edu.fatecfranca.ads.exe1;

public abstract class Funcionario {
    protected String nome, matricula;
    protected float salarioBase;

    public Funcionario() {
        this.nome = "";
        this.matricula = "";
        this.salarioBase = 0;
    }
    
    public Funcionario(String nome, String matricula, float salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public abstract float calculaSalario();

    @Override
    public String toString() {
        return "Funcionario " + "\nnome: " + nome + "\nmatricula: " + matricula + "\nsalarioBase: " + salarioBase;
    }
    
}
