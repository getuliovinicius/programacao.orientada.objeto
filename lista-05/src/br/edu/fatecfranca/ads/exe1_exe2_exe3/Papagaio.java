package br.edu.fatecfranca.ads.exe1_exe2_exe3;

/**
 *
 * @author getulio
 */
public class Papagaio extends Passaro {
    
    /**
     * 
     */
    private String vocabulario;

    /**
     * 
     */
    public Papagaio() {
        super();
        this.vocabulario = "";
    }

    /**
     * 
     * @param vocabulario
     * @param nome 
     */
    public Papagaio(String vocabulario, String nome) {
        super(nome);
        this.vocabulario = vocabulario;
    }

    /**
     * 
     * @return 
     */
    public String getVocabulario() {
        return vocabulario;
    }

    /**
     * 
     * @param vocabulario 
     */
    public void setVocabulario(String vocabulario) {
        this.vocabulario = vocabulario;
    }  

    /**
     * 
     * @return 
     */
    @Override
    public String fala() {
        return "Papagaio{ " + this.vocabulario + " " + '}';
    }

    /**
     * 
     * @return 
     */
    @Override
    public String mostraInfo() {
        return super.mostraInfo() + 
                "\nPapagaio{" + " vocabulario = " + this.vocabulario + " " + '}';
    }
       
}
