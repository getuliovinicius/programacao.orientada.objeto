package br.edu.fatecfranca.ads.exe1_exe2_exe3;

/**
 *
 * @author getulio
 */
public class Vaca extends Mamifero {

    /**
     * 
     */
    public Vaca() {
    }

    /**
     * 
     * @param nome 
     */
    public Vaca(String nome) {
        super(nome);
    }

    /**
     * 
     * @return 
     */
    @Override
    public String fala() {
        return "Vaca{" + " Muuu... " + '}';
    }
        
}
