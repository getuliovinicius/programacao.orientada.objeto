package br.edu.fatecfranca.ads.exe4;

/**
 * Tv
 */
public class Tv extends Produto {
    
    private int canal;

    public Tv() {
        super();
        this.canal = 0;
    }

    public Tv(int canal, int serial, int volume) {
        super(serial, volume);
        this.canal = canal;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTV" + "\nCanal=" + this.canal;
    }
    
}
