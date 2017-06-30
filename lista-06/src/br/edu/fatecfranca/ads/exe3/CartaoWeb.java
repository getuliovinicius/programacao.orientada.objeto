package br.edu.fatecfranca.ads.exe3;

/**
 * CartaoWeb
 */
public abstract class CartaoWeb {
    
    private String destinatario;

    public CartaoWeb() {
        this.destinatario = "";
    }

    public CartaoWeb(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public String toString() {
        return destinatario;
    }
    
    public abstract void showMessage();
    
}
