package br.edu.fatecfranca.ads.exe1;

/**
 * Reserva
 */
public class Reserva {
    
    private int codigo;
    private Voo voo;

    public Reserva() {
        this.codigo = 0;
        this.voo = new Voo();
    }
    
    public Reserva(int codigo, Voo voo) {
        this.codigo = codigo;
        this.voo = voo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public String mostra() {
        return "\nReserva: " + this.codigo + voo.mostra();
    }
    
}
