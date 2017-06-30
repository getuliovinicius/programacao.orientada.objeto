package br.edu.fatecfranca.ads.exe1;

/**
 * TestaPessoa
 */
public class TestaPessoa {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        System.out.println(pessoa.come());
        System.out.println(pessoa.respira());
        System.out.println(pessoa.vota());
        System.out.println(pessoa.getRg());
        System.out.println(pessoa.pagaIR());
        System.out.println(pessoa.getCpf());
        System.out.println(pessoa.trabalha());
        System.out.println(pessoa.ensina());
        
        Cidadao cidadao = new Pessoa();
        System.out.println(cidadao.vota());
        System.out.println(cidadao.getRg());

        Contribuinte contribuinte = new Pessoa();
        System.out.println(contribuinte.pagaIR());
        System.out.println(contribuinte.getCpf());
        
        Empregado empregado = new Pessoa();
        System.out.println(empregado.trabalha());

        Professor professor = new Pessoa();
        System.out.println(professor.ensina());
    }
    
}
