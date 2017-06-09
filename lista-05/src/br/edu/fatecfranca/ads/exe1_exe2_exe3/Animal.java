package br.edu.fatecfranca.ads.exe1_exe2_exe3;

/**
 *
 * @author getulio
 */
public class Animal {

    /**
     * 
     */
    protected String nome;

    /**
     * 
     */
    public Animal() {
        this.nome = "";
    }

    /**
     * 
     * @param nome 
     */
    public Animal(String nome) {
        this.nome = nome;
    }

    /**
     * 
     * @return 
     */
    public String getNome() {
        return nome;
    }

    /**
     * 
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método que imprime o que o Animal fala
     * @return retorona uma String com "eu não falo"
     */
    public String fala() {
        return "Eu não falo";
    }

    /**
     * 
     * @return 
     */
    public String mostraInfo() {
        return "Animal{" + " nome = " + this.nome + " " + '}';
    }
    
}