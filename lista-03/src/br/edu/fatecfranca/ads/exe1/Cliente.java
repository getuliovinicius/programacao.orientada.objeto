package br.edu.fatecfranca.ads.exe1;

/**
 *
 * @author getulio
 */
public class Cliente {

    /** variaveis de instancia */
    
    private String numeroConta, numeroAgencia, nome;
    private float saldo;
    
    /** metodos construtores */

    public Cliente() {
        this.numeroConta = "000000-0";
        this.numeroAgencia = "0000-0";
        this.nome = "";
        this.saldo = 0;
    }

    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        verificaNumeroConta(numeroConta);
        verificaNumeroAgencia(numeroAgencia);
        verificaNome(nome);
        this.saldo = saldo;
    }
    
    /** metodos construtores */
    
    /** metodos privados */

    private void verificaNumeroConta(String numeroConta) {
        
        if ((numeroConta.length() == 8) && (numeroConta.charAt(6) == '-')) {
            this.numeroConta = numeroConta;
        } else {
            throw new IllegalArgumentException("Número de conta inválido.");  
        }
      
    }
    
    private void verificaNumeroAgencia(String numeroAgencia) {
        
        if ((numeroAgencia.length() == 6) && (numeroAgencia.charAt(4) == '-')) {
            this.numeroAgencia = numeroAgencia;
        } else {
            throw new IllegalArgumentException("Número de agência inválido.");
        }
        
    }
    
    private void verificaNome(String nome) {
        
        if (nome.length() <= 30) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O tamanho do nome excede o limite de 30 caracteres.");
        }
        
    }

    /** metodos privados */

    /** metodos publicos */

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        verificaNumeroConta(numeroConta);
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        verificaNumeroAgencia(numeroAgencia);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        verificaNome(nome);
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void realizaDeposito(float deposito) {
        this.saldo += deposito;
    }
    
    public void realizaSaque(float saque) {
        this.saldo -= saque;
    }
    
    public String imprime(){
        return "Número da conta: " + this.numeroConta + 
                "\nNúmero da agência" + this.numeroAgencia +
                "\nNome:" + this.nome +
                "\nSaldo:" + this.saldo;
    }
    
    /** metodos publicos */
   
}
