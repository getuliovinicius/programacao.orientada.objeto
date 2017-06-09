/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ads.banco;

/**
 *
 * @author getulio
 */
public class Fisica extends ContaCorrente {
    
    /**
     * 
     */
    private String cpf, dependentes;

    /**
     * 
     */
    public Fisica() {
        super();
        this.cpf = "";
        this.dependentes = "";
    }

    /**
     * 
     * @param cpf
     * @param dependentes
     * @param banco
     * @param numero
     * @param saldo 
     */
    public Fisica(String cpf, String dependentes, String banco, String numero, float saldo) {
        super(banco, numero, saldo);
        this.cpf = cpf;
        this.dependentes = dependentes;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDependentes() {
        return dependentes;
    }

    public void setDependentes(String dependentes) {
        this.dependentes = dependentes;
    }

    @Override
    public String toString() {
        return "Fisica{" + "cpf=" + cpf + ", dependentes=" + dependentes + super.toString() + '}';
    }
    
    
    
}
