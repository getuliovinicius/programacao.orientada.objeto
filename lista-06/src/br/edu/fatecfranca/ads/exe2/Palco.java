package br.edu.fatecfranca.ads.exe2;

/**
 * Palco
 */
public class Palco {
    
    private Ator ator = new AtorFeliz();
    
    public void altera() {
        ator = new AtorTriste();
    }
    
    public void atuar() {
        ator.ato();
    }

}