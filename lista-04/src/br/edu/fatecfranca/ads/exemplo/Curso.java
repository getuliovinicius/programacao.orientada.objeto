package br.edu.fatecfranca.ads.exemplo;

/**
 *
 * @author getulio
 */
public class Curso {
    
    private int codigo;
    private String nome, area;
    
    /**
     * Construtor
     */
    public Curso(){
        this.codigo = 0;
        this.nome = "";
        this.area = "";    
    }

    /**
     * Construtor
     * @param codigoC
     * @param nomeC
     * @param area 
     */
    Curso(int codigoC, String nomeC, String area) {
        this.codigo = codigoC;
        this.nome = nomeC;
        this.area = area;    
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    /**
     * mostra
     * @return 
     */
    public String mostra() {
        return "Curso{" + "codigo=" + codigo + ", nome=" + nome + ", area=" + area + '}';
    }
    
}
