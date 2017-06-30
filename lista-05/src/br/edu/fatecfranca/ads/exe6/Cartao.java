package br.edu.fatecfranca.ads.exe6;

/**
 * Cartao
 */
public class Cartao {
    
    private Conta conta;
    private String senha;

    public Cartao() {
        this.senha = "";
    }

    public Cartao(Conta conta, String senha) {
        this.conta = conta;
        this.senha = senha;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = "123214";
    }

    public boolean retirada(String senha, float valor){
        if ((this.senha == senha) && (this.conta.limite >= valor)) {
            this.conta.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    
}
