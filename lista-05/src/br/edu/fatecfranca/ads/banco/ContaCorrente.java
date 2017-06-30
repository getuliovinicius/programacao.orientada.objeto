package br.edu.fatecfranca.ads.banco;

/**
 * ContaCorrente
 */
public class ContaCorrente {
    
    protected String banco, numero;
    protected float saldo;

    public ContaCorrente() {
        this.banco = "";
        this.numero = "";
        this.saldo = 0;
    }

    public ContaCorrente(String banco, String numero, float saldo) {
        this.banco = banco;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "banco=" + banco + ", numero=" + numero + ", saldo=" + saldo + '}';
    }
    
}
