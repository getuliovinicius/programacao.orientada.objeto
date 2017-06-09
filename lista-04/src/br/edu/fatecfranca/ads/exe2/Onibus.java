package br.edu.fatecfranca.ads.exe2;

/**
 * Classe para gerenciar os Ônibus.
 * @author getulio
 */
public class Onibus {

    private int qdtePassgeiros;
    private String numero;

    /**
     * Constrói um objeto "Onibus" vazio.
     */
    public Onibus() {
    }

    /**
     * Constrói um objeto "Onibus" com os atributos preechidos através da passagem dos parâmetros:
     * @param qdtePassgeiros - tipo int
     * @param numero - tipo String
     */
    public Onibus(int qdtePassgeiros, String numero) {
        this.qdtePassgeiros = qdtePassgeiros;
        this.numero = numero;
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
    
    /*public void criaPassageiro() {
        
    }
    
    public Onibus obterOnibus() {
        return Onibus;
    }
    
    public String emitePassageiros() {
        return "...";   
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
