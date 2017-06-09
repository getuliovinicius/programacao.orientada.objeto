package br.edu.fatecfranca.ads.exe2;

/**
 * Classe para gerenciar o funcionamento da Rodoviária
 * @author getulio
 */
public class Rodoviaria {

    private int qtdeOnibus;
    private String nome;
    private String cidade;

    /**
     * Constrói um objeto "Rodoviaria" vazio.
     */
    public Rodoviaria() {
    }

    /**
     * Constrói um objeto "Rodoviaria" com os atributos preechidos através da passagem dos parâmetros:
     * @param qtdeOnibus - tipo int
     * @param nome - tipo String
     * @param cidade - tipo String
     */
    public Rodoviaria(int qtdeOnibus, String nome, String cidade) {
        this.qtdeOnibus = qtdeOnibus;
        this.nome = nome;
        this.cidade = cidade;
    }

    public int getQtdeOnibus() {
        return qtdeOnibus;
    }

    public void setQtdeOnibus(int qtdeOnibus) {
        this.qtdeOnibus = qtdeOnibus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    /**public void criaOnibus() {
        
    }
    
    public String emiteOnibus() {
    
    }
    
    public Rodoviaria obterRodoviaria() {
        
    }
    
    public Onibus obterOnibus() {
        
    }
    
    public void criaPassageiroOnibus() {
        
    }
    
    public void associaOnibus(Onibus onibus) {
        
    }
    
    public boolean associaPassageiroOnibus(Onibus on, Passageiro pas) {
        
    }
    
    public boolean desvinculaOnibus(Onibus onibus) {
        
    }
    
    public boolean desvinculaPassageiroOnibus(Passageiro passageiro, Onibus onibus) {
        
    }
    
    public boolean obterOnibus(Onibus onibus) {
        
    }
    
    public boolean obterPassageiroOnibus(Onibus onibus, Passageiro passageiro) {
        
    }
    
    public boolean obterOnibus(int numero) {
        
    }
    
    private int obterPosicaoOnibus(Onibus onibus) {
        
    }
    
    private int obterPosicaoOnibus(int numero) {
        
    }
    
    public boolean atualizaOnibus(Onibus atual, Onibus novo) {
        
    }
    
    public boolean atualizaPassageiroOnibus(Onibus onibus, Passageiro passageiro) {
        
    }
    
    public String mostra() {
        return "...";
    }*/
    
}
