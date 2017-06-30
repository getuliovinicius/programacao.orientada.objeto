package br.edu.fatecfranca.ads.exe1_exe2_exe3;

import javax.swing.JOptionPane;

/**
 * TestaZoologico
 */
public class TestaZoologico {
    
    public static void mostraInfoEFala(Animal animal) {
        JOptionPane.showMessageDialog(null, animal.mostraInfo() + "\n" + animal.fala());
    }

    public static void main(String[] args) {
        
        Animal animal = new Animal("animal");
        mostraInfoEFala(animal);
        Passaro passaro = new Passaro("passaro");
        mostraInfoEFala(passaro);
        BemTeVi bemtevi = new BemTeVi("bem te vi");
        mostraInfoEFala(bemtevi);
        Papagaio papagaio = new Papagaio("dá o pé loro", "papagaio");
        mostraInfoEFala(papagaio);
        Mamifero mamifero = new Mamifero("mamifero");
        mostraInfoEFala(mamifero);
        Cachorro cachorro = new Cachorro(true, "cachorro");
        mostraInfoEFala(cachorro);
        Latido latido = new Latido(2, false, "cachorrinho");
        mostraInfoEFala(latido);
        Vaca vaca = new Vaca("vaca");
        mostraInfoEFala(vaca);
        
    }
    
}