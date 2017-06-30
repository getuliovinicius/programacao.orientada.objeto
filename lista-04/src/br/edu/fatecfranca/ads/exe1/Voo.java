package br.edu.fatecfranca.ads.exe1;

/**
 * Voo
 */
public class Voo {
    
    private String destino;
    private String numero;

    public Voo() {
        this.destino = "";
        this.numero = "";
    }

    public Voo(String destino, String numero) {
        this.destino = destino;
        this.numero = numero;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String mostra() {
        return "\nVoo: " + this.destino + "\nNumero: " + this.numero;
    }
    
}
