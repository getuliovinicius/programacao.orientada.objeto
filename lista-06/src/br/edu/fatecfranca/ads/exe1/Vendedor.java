package br.edu.fatecfranca.ads.exe1;

/**
 * Vendedor
 */
public class Vendedor extends Funcionario {
    
    private float comissao;

    public Vendedor(float comissao) {
        super();
        this.comissao = comissao;
    }

    public Vendedor(float comissao, String nome, String matricula, float salarioBase) {
        super(nome, matricula, salarioBase);
        this.comissao = comissao;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    
    @Override
    public float calculaSalario() {
        return this.salarioBase * this.comissao;
    }

}
