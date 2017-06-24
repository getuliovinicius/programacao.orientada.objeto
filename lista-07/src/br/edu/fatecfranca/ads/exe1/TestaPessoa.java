package br.edu.fatecfranca.ads.exe1;

public class TestaPessoa {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        pessoa.come();
        pessoa.respira();
        pessoa.vota();
        pessoa.getRg();
        pessoa.pagaIR();
        pessoa.getCpf();
        pessoa.trabalha();
        pessoa.ensina();
        
        Cidadao cidadao = new Pessoa();
        pessoa.vota();
        pessoa.getRg();

        Contribuinte contribuinte = new Pessoa();
        pessoa.pagaIR();
        pessoa.getCpf();        
        
        Empregado empregado = new Pessoa();
        pessoa.trabalha();

        Professor professor = new Pessoa();
        pessoa.ensina();        

    }
    
}
