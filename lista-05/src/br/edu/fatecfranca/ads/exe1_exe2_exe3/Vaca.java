package br.edu.fatecfranca.ads.exe1_exe2_exe3;

/**
 * Vaca
 */
public class Vaca extends Mamifero {

    public Vaca() {
    }

    public Vaca(String nome) {
        super(nome);
    }

    @Override
    public String fala() {
        return "Vaca{" + " Muuu... " + '}';
    }
        
}
