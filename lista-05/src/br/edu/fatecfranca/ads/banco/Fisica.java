package br.edu.fatecfranca.ads.banco;

/**
 * Fisica
 */
public class Fisica extends ContaCorrente {
    
    private String cpf, dependentes;

    public Fisica() {
        super();
        this.cpf = "";
        this.dependentes = "";
    }

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
