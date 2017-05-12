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
public class Reserva {
    
    /**
     * 
     */
    private int codigo;
    private Voo voo;

    /**
     * Método construtor da classe - Cria um objeto vazio
     */    
    public Reserva() {
        this.codigo = 0;
        this.voo = new Voo();
    }
    
    /**
     * 
     * @param codigo
     * @param voo 
     */
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

    /**
     * 
     * @return 
     */
    public String mostra() {
        return "Reserva{" + "codigo=" + codigo + ", voo=" + voo.mostra() + "}";
    }
    
    
}
