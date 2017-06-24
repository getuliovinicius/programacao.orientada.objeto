package br.edu.fatecfranca.ads.exe2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Classe para gerenciar os Ônibus.
 * @author getulio
 */
public class Onibus {

    private int qdtePassgeiros;
    private String numero;
    /** Vetor dinâmico */
    private ArrayList<Passageiro> passageiros;

    /**
     * Constrói um objeto "Onibus" vazio.
     */
    public Onibus() {
    }

    /**
     * Constrói um objeto "Onibus" com os atributos preechidos através da passagem dos parâmetros:
     * @param qdtePassgeiros - tipo int
     * @param numero - tipo String
     * @param passageiros - tipo ArrayList<Passageiro>
     */
    public Onibus(int qdtePassgeiros, String numero, ArrayList<Passageiro> passageiros) {
        this.qdtePassgeiros = qdtePassgeiros;
        this.numero = numero;
        this.passageiros = passageiros;
    }

    public int getQdtePassgeiros() {
        return qdtePassgeiros;
    }

    public void setQdtePassgeiros(int qdtePassgeiros) {
        this.qdtePassgeiros = qdtePassgeiros;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(ArrayList<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }
    
    public void criaPassageiro() {
        Passageiro passageiro = new Passageiro();
        passageiro.emitePassageiro(passageiro);
    }
    
    public String emitePassageiros() {
        return "...";
    }

    /*public Onibus obterOnibus() {
        return Onibus;
    }    
    
    public void associaPassageiro(Passageiro passageiro){
        
    }
    
    public boolean desvincularPassageiro(Passageiro passageiro){
        
    }
    
    public boolean obterPassageiro(Passageiro passageiro){
        
    }
    
    public boolean obterPassageiro(String cpf){
        
    }
    
    private int obterPosicaoPassageiro(Passageiro passageiro){
        
    }
    
    private int obterPosicaoPassageiro(String cpf){
        
    }
    
    public boolean atualizaPassageiro(Passageiro passageiro){
        
    }
    
    public String mostra() {
        return "...";
    }*/
    
}
