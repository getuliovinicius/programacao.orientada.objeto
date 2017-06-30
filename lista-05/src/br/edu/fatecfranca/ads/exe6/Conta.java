package br.edu.fatecfranca.ads.exe6;

/**
 * Conta
 */
public class Conta {
    
    protected String nomeCliente;
    protected float salarioCliente;
    protected String numeroConta;
    protected float saldo;
    protected float limite;

    public Conta() {
        this.nomeCliente = "";
        this.salarioCliente = 0;
        this.numeroConta = "";
        this.saldo = 0;
        this.limite = 0;
    }

    public Conta(String nomeCliente, float salarioCliente, String numeroConta, float saldo, float limite) {
        this.nomeCliente = nomeCliente;
        this.salarioCliente = salarioCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.limite = limite;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getSalarioCliente() {
        return salarioCliente;
    }

    public void setSalarioCliente(float salarioCliente) {
        this.salarioCliente = salarioCliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        if (this.salarioCliente < limite) {
            this.limite = this.salarioCliente;
        } else {
            this.limite = limite;
        }
    }
    
    public void deposito(float valor) {
        this.saldo += valor;
    }
    
    public boolean retira(float valor) {
        if (this.limite >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    
    public float saldo(Conta conta) {
        return this.saldo;
    }
}