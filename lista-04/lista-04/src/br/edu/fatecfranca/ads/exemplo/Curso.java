package br.edu.fatecfranca.ads.exemplo;

/**
 *
 * @author getulio
 */
public class Curso {
    
    /**
     * Variáveis de instância
     */
    private int codigo;
    private String nome, area;
    
    /**
     * Métodos construtores
     */
    public Curso(){
        this.codigo = 0;
        this.nome = "";
        this.area = "";    
    }

    Curso(int codigoC, String nomeC, String area) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Retorna o código do curso
     * @return
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Define o código do curso
     * @param codigo 
     */
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
     * Método de instância para retornar os dados associados
     * @return 
     */
    public String mostra() {
        return "Curso{" + "codigo=" + codigo + ", nome=" + nome + ", area=" + area + '}';
    }
    
}
