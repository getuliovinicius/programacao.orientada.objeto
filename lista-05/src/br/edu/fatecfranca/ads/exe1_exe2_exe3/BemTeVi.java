package br.edu.fatecfranca.ads.exe1_exe2_exe3;

/**
 *
 * @author getulio
 */
public class BemTeVi extends Passaro {

    /**
     * 
     */
    public BemTeVi() {
        super();
    }

    /**
     * 
     * @param nome 
     */
    public BemTeVi(String nome) {
        super(nome);
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String fala() {
        return "BenTeVi{" + " bem-te-vi. " + '}';
    }

}
