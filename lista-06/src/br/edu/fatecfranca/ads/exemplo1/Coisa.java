package br.edu.fatecfranca.ads.exemplo1;

public abstract class Coisa {
    
    public String quemSouEu() {
        return "Coisa";
    }
    
    public abstract String compara(Coisa coisa);
    
}
