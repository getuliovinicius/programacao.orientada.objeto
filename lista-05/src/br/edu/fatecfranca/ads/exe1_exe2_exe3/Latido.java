package br.edu.fatecfranca.ads.exe1_exe2_exe3;

/**
 *
 * @author getulio
 */
public class Latido extends Cachorro {
    
    /**
     * 
     */
    private int volumeLatido;

    /**
     * 
     */
    public Latido() {
        super();
        this.volumeLatido = 0;
    }

    /**
     * 
     * @param volumeLatido
     * @param lateMuito
     * @param nome 
     */
    public Latido(int volumeLatido, boolean lateMuito, String nome) {
        super(lateMuito, nome);
        this.volumeLatido = volumeLatido;
    }

    /**
     * 
     * @return 
     */
    public int getVolumeLatido() {
        return volumeLatido;
    }

    /**
     * 
     * @param volumeLatido 
     */
    public void setVolumeLatido(int volumeLatido) {
        this.volumeLatido = volumeLatido;
    }
    
    /**
     * 
     * @param maisVolume
     * @return 
     */
    public int aumentaVolume(int maisVolume) {
        return this.volumeLatido + maisVolume; 
    }
    
    /**
     * 
     * @param menosVolume
     * @return 
     */
    public int diminuiVolume(int menosVolume) {
        return this.volumeLatido - menosVolume; 
    }

    /**
     * 
     * @return 
     */
    @Override
    public String mostraInfo() {
        return super.mostraInfo() +
                "\nLatido{" + "volumeLatido = " + this.volumeLatido + " " + '}';
    }
        
}
