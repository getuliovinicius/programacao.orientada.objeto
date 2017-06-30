package br.edu.fatecfranca.ads.exemplo1;

public class Pedra extends Coisa {

    @Override
    public String quemSouEu() {
        return "Pedra";
    }
    
    @Override
    public String compara (Coisa coisa) {
        
        String aux = coisa.quemSouEu();
        
        switch (aux) {
            case "Papel": return "Pedra perde Papel";
            case "Pedra": return "Pedra empata Pedra";
            case "Tesoura": return "Pedra ganha Tesoura";
            default: return "Impossível comparar";
        }
        
    }
    
}
