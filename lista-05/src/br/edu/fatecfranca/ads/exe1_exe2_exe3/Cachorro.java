package br.edu.fatecfranca.ads.exe1_exe2_exe3;

/**
 * Cachorro
 */
public class Cachorro extends Mamifero {
    
    protected boolean lateMuito;

    public Cachorro() {
        super();
    }

    public Cachorro(boolean lateMuito, String nome) {
        super(nome);
        this.lateMuito = lateMuito;
    }

    public boolean isLateMuito() {
        return lateMuito;
    }

    public void setLateMuito(boolean lateMuito) {
        this.lateMuito = lateMuito;
    }
    
    public void setLateMuito() {
        this.lateMuito = true;
    }

    public void setLatePouco() {
        this.lateMuito = false;
    }

    @Override
    public String fala() {
        return (this.lateMuito = true) ? "AU! AU!" : "au, au...";
    }

    @Override
    public String mostraInfo() {
        String bool = (this.lateMuito = true) ? "Sim" : "Não";
        return super.mostraInfo() + 
                "\nCachorro{" + " late Muito? " + bool + " " + '}';
    }
    
}
