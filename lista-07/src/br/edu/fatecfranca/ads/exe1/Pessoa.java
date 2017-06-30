package br.edu.fatecfranca.ads.exe1;

/**
 * Pessoa
 */
public class Pessoa extends Animal
        implements Cidadao, Contribuinte, Professor {    

    @Override
    public String vota() {
        return "Cidadão Votou.";
    }

    @Override
    public String getRg() {
        return "Tirou o RG.";
    }

    @Override
    public String pagaIR() {
        return "Pagou o Imposto de Renda.";
    }

    @Override
    public String getCpf() {
        return "Tirou o CPF";
    }

    @Override
    public String ensina() {
        return "Ensinou alguma coisa a alguém";
    }

    @Override
    public String trabalha() {
        return "Trabalhou";
    }
    
}
