package br.edu.fatecfranca.ads.exe5;

/**
 * Papel
 */
public class Papel extends Coisa {
    
    @Override
    public String quemSouEu() {
        return "Papel";
    }
    
    @Override
    public String compara (Coisa coisa) {
        
        String aux = coisa.quemSouEu();
        
        switch (aux) {
            case "Papel": return "Papel empata Papel";
            case "Pedra": return "Papel ganha Pedra";
            case "Tesoura": return "Papel perde Tesoura";
            default: return "Impossível comparar";
        }
        
    }
    
}
