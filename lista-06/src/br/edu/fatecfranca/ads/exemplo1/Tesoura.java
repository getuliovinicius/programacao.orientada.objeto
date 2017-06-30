package br.edu.fatecfranca.ads.exemplo1;

public class Tesoura extends Coisa {
    
    @Override
    public String quemSouEu() {
        return "Tesoura";
    }

    @Override
    public String compara (Coisa coisa) {
        
        String aux = coisa.quemSouEu();
        
        switch (aux) {
            case "Papel": return "Tesoura ganha Papel";
            case "Pedra": return "Tesoura perde Pedra";
            case "Tesoura": return "Tesoura empata Tesoura";
            default: return "Impossível comparar";
        }
        
    }
    
}
