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
public class Juridica extends ContaCorrente {
    
    /**
     * 
     */
    private String cnpj, token;

    /**
     * 
     */
    public Juridica() {
        super();
        this.cnpj = "";
        this.token = "";
    }

    /**
     * 
     * @param cnpj
     * @param token
     * @param banco
     * @param numero
     * @param saldo 
     */
    public Juridica(String cnpj, String token, String banco, String numero, float saldo) {
        super(banco, numero, saldo);
        this.cnpj = cnpj;
        this.token = token;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Juridica{" + "cnpj=" + cnpj + ", token=" + token + super.toString() + '}';
    }    
    
}
