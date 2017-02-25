package br.edu.fatecfranca.ads.exe2;

/**
 *
 * @author getulio
 */
public class Cliente {

    // variaveis de instancia
    public int numeroConta, numeroAgencia;
    public String nomeCliente;
    public float saque, deposito, saldoConta;
    
    // metodo construtor >>>
    public Cliente (int conta, int agencia, String nome, float saldo) {
        this.numeroConta = conta;
        this.numeroAgencia = agencia;
        this.nomeCliente = nome;
        this.saldoConta = saldo;
    }
    public Cliente () {
        this.numeroConta = 0;
        this.numeroAgencia = 0;
        this.nomeCliente = "";
        this.saldoConta = 0;
    }
    // <<< metodo construtor

    // metodos Publicos >>>
    public void realisaDeposito () {
        this.saldoConta += deposito;
    }
    public void realisaSaque () {
        this.saldoConta -= saque;
    }
    public String retornaDados () {
        return "Número da conta: " + this.numeroConta + "Agência: " + this.numeroConta + " | Cliente: " + this.nomeCliente + " | Saldo: " + this.saldoConta;        
    }
    // <<< metodos publicos
}
