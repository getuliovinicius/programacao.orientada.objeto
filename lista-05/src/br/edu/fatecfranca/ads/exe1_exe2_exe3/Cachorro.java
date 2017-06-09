package br.edu.fatecfranca.ads.exe1_exe2_exe3;

/**
 *
 * @author getulio
 */
public class Cachorro extends Mamifero {
    
    /**
     * 
     */
    protected boolean lateMuito;

    /**
     * 
     */
    public Cachorro() {
        super();
    }

    /**
     * 
     * @param lateMuito
     * @param nome 
     */
    public Cachorro(boolean lateMuito, String nome) {
        super(nome);
        this.lateMuito = lateMuito;
    }

    /**
     * 
     * @return 
     */
    public boolean isLateMuito() {
        return lateMuito;
    }

    /**
     * 
     * @param lateMuito 
     */
    public void setLateMuito(boolean lateMuito) {
        this.lateMuito = lateMuito;
    }
    
    /**
     * 
     */
    public void setLateMuito() {
        this.lateMuito = true;
    }

    /**
     * 
     */
    public void setLatePouco() {
        this.lateMuito = false;
    }

    /**
     * 
     * @return 
     */
    @Override
    public String fala() {
        return (this.lateMuito = true) ? "AU! AU!" : "au, au...";
    }

    /**
     * 
     * @return 
     */
    @Override
    public String mostraInfo() {
        String bool = (this.lateMuito = true) ? "Sim" : "Não";
        return super.mostraInfo() + 
                "\nCachorro{" + " late Muito? " + bool + " " + '}';
    }
    
}
