package br.edu.fatecfranca.ads.exe4;

/**
 *
 * @author getulio
 */
public class Computador {
    
    // variaveis de classe
    public String processador;
    
    // variaveis de instancia
    public static int ram;
    
    // metodos construtores >>>
    public Computador () {
        this.processador = "";
    }
    
    public Computador (String processador) {
        this.processador = processador;
    }
    // <<< metodos construtores
    
    // metodos publicos >>>
    public void alterarProcessador (String processador) { // metodo de instancia
        this.processador = processador;
    }
    
    public static void alterarRam (int ram) { // metodo de classe
        Computador.ram = ram;
    }

    public static void upgradeRam () { // metodo de classe auxiliar
        Computador.ram += 256;
    }
    
    public String imprime () {
        return "Processador: " + this.processador + "\nQtde memória: " + Computador.ram;
    }
    // <<< metodos publicos
    
    //
    
    
}
