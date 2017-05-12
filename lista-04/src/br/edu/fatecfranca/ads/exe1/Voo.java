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
public class Voo {
    
    /**
     * 
     */
    private String destino;
    private String numero;

    /**
     * Método construtor da classe - Cria um objeto vazio
     */    
    public Voo() {
        this.destino = "";
        this.numero = "";
    }
    /**
     * Método construtor da classe
     * @param destino
     * @param numero 
     */    
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

    /**
     * 
     * @return 
     */
    public String mostra() {
        return "Voo{" + "destino=" + destino + ", numero=" + numero + '}';
    }
    
    
}
