package br.edu.fatecfranca.ads.exe1;

/**
 * Passageiro
 */
public class Passageiro {
    
    private String nome;
    private Reserva reserva;

    public Passageiro() {
        this.nome = "";
        this.reserva = new Reserva();
    }

    public Passageiro(String nome, Reserva reserva) {
        this.nome = nome;
        this.reserva = reserva;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public String mostra() {
        return "Passageiro: " + this.nome + reserva.mostra();
    }

}