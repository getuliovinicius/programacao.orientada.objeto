package br.edu.fatecfranca.ads.exe1_exe2_exe3;

/**
 * Passaro
 */
public class Passaro extends Animal {

    public Passaro() {
        super();
    }

    public Passaro(String nome) {
        super(nome);
    }
    
    @Override
    public String fala() {
        return "Passaro{" + " piu, piu. " + '}';
    }
    
}