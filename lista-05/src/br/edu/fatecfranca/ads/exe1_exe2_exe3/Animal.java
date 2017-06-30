package br.edu.fatecfranca.ads.exe1_exe2_exe3;

/**
 * Animal
 */
public class Animal {

    protected String nome;

    public Animal() {
        this.nome = "";
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String fala() {
        return "Eu não falo";
    }

    public String mostraInfo() {
        return "Animal{" + " nome = " + this.nome + " " + '}';
    }
    
}