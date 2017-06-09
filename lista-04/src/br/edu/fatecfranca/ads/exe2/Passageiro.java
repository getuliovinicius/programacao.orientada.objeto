package br.edu.fatecfranca.ads.exe2;

/**
 * Classe para gerenciar os Passageiros
 * @author getulio
 */
public class Passageiro {
    
    private String nome;
    private int poltrona;

    /**
     * Constrói um objeto "Passageiro" vazio.
     */
    public Passageiro() {
    }

    /**
     * Constrói um objeto "Passageiro" com os atributos preechidos através da passagem dos parâmetros:
     * @param nome - tipo String
     * @param poltrona - tipo int
     */
    public Passageiro(String nome, int poltrona) {
        this.nome = nome;
        this.poltrona = poltrona;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }
    
    /**
     * Emite um novo Passageiro 
     * @param passageiro tipo Passageiro
     * @return String mostra() dados do passageiro
     */
    public String emitePassageiro(Passageiro passageiro) {
        
        passageiro.setNome("Getulio Vinicius");
        passageiro.setPoltrona(20);
        
        return passageiro.mostra();
    
    }

    /**
     * Exibe o nome e a poltrona do Passageiro
     * @return String dados do passageiro
     */
    public String mostra() {
        return "PASSAGEIRO" + "\nNome: " + nome + "\nPoltrona: " + poltrona;
    }            

}
