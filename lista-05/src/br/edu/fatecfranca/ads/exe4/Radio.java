package br.edu.fatecfranca.ads.exe4;

/**
 * Radio
 */
public class Radio extends Produto {

    private String banda;
    private float estacao;

    public Radio() {
        super();
        this.banda = "";
        this.estacao = 0;
    }

    public Radio(String banda, float estacao, int serial, int volume) {
        super(serial, volume);
        this.banda = banda;
        this.estacao = estacao;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public float getEstacao() {
        return estacao;
    }

    public void setEstacao(float estacao) {
        this.estacao = estacao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRÁDIO" + "\nBanda: " + this.banda + "\nEstacao: " + this.estacao;
    }
    
}
