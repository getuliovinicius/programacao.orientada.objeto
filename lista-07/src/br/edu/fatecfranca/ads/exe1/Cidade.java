package br.edu.fatecfranca.ads.exe1;

/**
 * Cidade
 */
public class Cidade {

    public void contrata(Professor p) {
        System.out.println(p.ensina());
        System.out.println(p.trabalha());
    }

    public void contrata(Empregado e) {
        System.out.println(e.trabalha());
    }

    public void cobraDe(Contribuinte c) {
        System.out.println(c.pagaIR());
    }

    public void registra(Cidadao c) {
        System.out.println(c.getRg());
    }

    public void alimenta(Animal a ) {
        System.out.println(a.come());
    }
    
}
