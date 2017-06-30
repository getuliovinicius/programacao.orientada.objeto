package br.edu.fatecfranca.ads.exe1_exe2_exe3;

/**
 * Papagaio
 */
public class Papagaio extends Passaro {
    
    private String vocabulario;

    public Papagaio() {
        super();
        this.vocabulario = "";
    }

    public Papagaio(String vocabulario, String nome) {
        super(nome);
        this.vocabulario = vocabulario;
    }

    public String getVocabulario() {
        return vocabulario;
    }

    public void setVocabulario(String vocabulario) {
        this.vocabulario = vocabulario;
    }  

    @Override
    public String fala() {
        return "Papagaio{ " + this.vocabulario + " " + '}';
    }

    @Override
    public String mostraInfo() {
        return super.mostraInfo() + 
                "\nPapagaio{" + " vocabulario = " + this.vocabulario + " " + '}';
    }
       
}
