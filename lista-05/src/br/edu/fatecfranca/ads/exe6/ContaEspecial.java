package br.edu.fatecfranca.ads.exe6;

/**
 * Conta Especial
 */
public class ContaEspecial extends Conta {

    public ContaEspecial() {
        super();
    }

    public ContaEspecial(String nomeCliente, float salarioCliente, String numeroConta, float saldo, float limite) {
        super(nomeCliente, salarioCliente, numeroConta, saldo, limite);
    }

    @Override
    public void setLimite(float limite) {
        if (this.limite <= (this.salarioCliente * 3)) {
            this.limite = limite;
        } else {
            this.limite = this.salarioCliente * 3;
        }
    }

}
