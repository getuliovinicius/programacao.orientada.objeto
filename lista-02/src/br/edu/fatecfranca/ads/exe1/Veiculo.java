package br.edu.fatecfranca.ads.exe1;

/**
 *
 * @author getulio
 */
public class Veiculo {

    // variaveis de instancia >>>
    public String tipo, cor;
    public int nroRodas, ano;
    // <<< variaveis de instancia
    
    // variaveis de classe >>> 
    public static String nomeDono;
    // <<< variaveis de classe 
    
    // metodos construtores >>>
    public Veiculo () {
        this.tipo = "";
        this.nroRodas = 0;
        this.cor = "";
        this.ano = 0;
    }
    public Veiculo (String tipo, int nroRodas, String cor, int ano) {
        this.tipo = tipo;
        this.nroRodas = nroRodas;
        this.cor = cor;
        this.ano = ano;
    }
    // <<< metodos construtores
    
    // metodos publicos >>>
    public void alteraTipo (String tipo) { // metodo de instancia
        this.tipo = tipo;
    }
    public String mostra () { // metodo de instancia
        return "Tipo: " + this.tipo + "\nCor: " + this.cor + "\nNúmero de rodas: " + this.nroRodas + "\nAno: " + this.ano + "\nNome do dono: " + 
                Veiculo.nomeDono;
    }
    public static void alteraNome (String nome) { // metodo de classe
        Veiculo.nomeDono = nome;
    }
    public static String retornaNome () { // metodo de classe
        return "Nome do dono: " + Veiculo.nomeDono;
    }
    public static String nroRodas (int x) { // metodo de classe auxiliar
        if ((x % 2 ) == 0) {
            return "Numero de rodas é '" + x + "' Par";
        } else {
            return "Numero de rodas é '" + x + "' Impar";
        }
    }
    public static Veiculo retornaNovoVeiculo (Veiculo v1, Veiculo v2) {
        Veiculo novoVeiculo = new Veiculo();
        novoVeiculo.tipo = v1.tipo;
        novoVeiculo.cor = v2.cor;
        novoVeiculo.nroRodas = v1.nroRodas +v2.nroRodas;
        if (v1.ano > v2.ano) {
            novoVeiculo.ano = v1.ano;
        } else {
            novoVeiculo.ano = v2.ano;            
        }
        return novoVeiculo;
    }
    // <<< metodos publicos
    
}
