package br.edu.fatecfranca.ads.exe1_exe2_exe3;

/**
 * Latido
 */
public class Latido extends Cachorro {
    
    private int volumeLatido;

    public Latido() {
        super();
        this.volumeLatido = 0;
    }

    public Latido(int volumeLatido, boolean lateMuito, String nome) {
        super(lateMuito, nome);
        this.volumeLatido = volumeLatido;
    }

    public int getVolumeLatido() {
        return volumeLatido;
    }

    public void setVolumeLatido(int volumeLatido) {
        this.volumeLatido = volumeLatido;
    }
    
    public int aumentaVolume(int maisVolume) {
        return this.volumeLatido + maisVolume; 
    }
    
    public int diminuiVolume(int menosVolume) {
        return this.volumeLatido - menosVolume; 
    }

    @Override
    public String mostraInfo() {
        return super.mostraInfo() +
                "\nLatido{" + "volumeLatido = " + this.volumeLatido + " " + '}';
    }
        
}
