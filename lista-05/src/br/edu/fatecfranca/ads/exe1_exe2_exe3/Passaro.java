package br.edu.fatecfranca.ads.exe1_exe2_exe3;

/**
 *
 * @author getulio
 */
public class Passaro extends Animal {

    /**
     * 
     */
    public Passaro() {
        super();
    }

    /**
     * 
     * @param nome 
     */
    public Passaro(String nome) {
        super(nome);
    }
    
    /**
     *
     * @return
     */
    @Override
    public String fala() {
        return "Passaro{" + " piu, piu. " + '}';
    }
    
}