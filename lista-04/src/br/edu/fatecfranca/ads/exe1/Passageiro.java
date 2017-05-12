/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ads.exe1;

/**
 *
 * @author getulio
 */
public class Passageiro {
    
    /**
     * 
     */
    private String nome;
    private Reserva reserva;

    /**
     * Método construtor da classe - Cria um objeto vazio
     */    
    public Passageiro() {
        this.nome = "";
        this.reserva = new Reserva();
    }

    /**
     * Método construtor da classe
     * @param nome
     * @param reserva 
     */
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

    /**
     * 
     * @return 
     */
    public String mostra() {
        return "Passageiro{" + "nome=" + nome + ", reserva=" + reserva.mostra() + "}";
    }
    
    

}
