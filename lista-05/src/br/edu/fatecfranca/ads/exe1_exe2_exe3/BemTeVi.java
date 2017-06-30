package br.edu.fatecfranca.ads.exe1_exe2_exe3;

/**
 * BemTeVi
 */
public class BemTeVi extends Passaro {

    public BemTeVi() {
        super();
    }

    public BemTeVi(String nome) {
        super(nome);
    }
    
    @Override
    public String fala() {
        return "BenTeVi{" + " bem-te-vi. " + '}';
    }

}
