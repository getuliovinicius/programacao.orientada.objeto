package br.edu.fatecfranca.ads.banco;

/**
 * Juridica
 */
public class Juridica extends ContaCorrente {
    
    private String cnpj, token;

    public Juridica() {
        super();
        this.cnpj = "";
        this.token = "";
    }

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
