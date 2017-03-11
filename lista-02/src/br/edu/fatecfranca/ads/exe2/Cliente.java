package br.edu.fatecfranca.ads.exe2;
/**
 *
 * @author getulio
 */
public class Cliente {
    
    // variaveis de instancia >>>
    public String numeroConta, numeroAgencia, nome;
    // <<< variaveis de instancia
    
    // variaveis de classe >>>
    public static float saldo;
    // <<< variaveis de classe
    
    // metodos construtores >>>
    public Cliente () {
        this.numeroConta = "";
        this.numeroAgencia = "";
        this.nome = "";
        Cliente.saldo = 0;
    } 
    public Cliente (String numeroConta, String numeroAgencia, String nome) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        Cliente.saldo = 0;
    }
    // <<< metodos construtores

    // metodos Publicos >>>
    public void realizaDeposito (float x) { // metodo de instancia
        Cliente.saldo += x;
    }
 
    public void realizaSaque (float x) { // metodo de instancia
        Cliente.saldo -= x;
    }

    public String imprimir () { // metodo de instancia
        return "Nro da conta: " + this.numeroConta + "\nNro da agência: " + this.numeroAgencia + "\nNome: " + this.nome + "\nSaldo: " + Cliente.saldo;
    }

    public static void alteraSaldo (float x) { // metodo de classe
	Cliente.saldo = x;
    }

    public static float retornaSaldo () { // metodo de classe
	return Cliente.saldo;
    }

    public void alteraNumeroAgencia (String x) { // metodo de instancia
        this.numeroAgencia = x;
    }

    public String retornaNumeroAgencia () { // metodo de instancia
        return this.numeroAgencia;
    }

    public static Cliente retornaNovoCliente (Cliente c1, Cliente c2) { // metodo de classe auxiliar
        Cliente novoCliente = new Cliente();
        
        Cliente.saldo = c1.saldo + c2.saldo; // Era pra ficar errado mesmo, o sentido do exercício era esse
        
        novoCliente.numeroAgencia = c1.numeroAgencia;
        novoCliente.numeroConta = c2.numeroConta;
        novoCliente.nome = "Fulano";
        return novoCliente;
    }
    
    public static String verificaTamanho (String numeroAgencia) {
        if (numeroAgencia.length() == 6) {
            return "Nro da agência tem tamanho 6";
        } else {
            return "Nro da agência não tem tamanho 6";
        }
    }    
    // <<< metodos publicos
}
