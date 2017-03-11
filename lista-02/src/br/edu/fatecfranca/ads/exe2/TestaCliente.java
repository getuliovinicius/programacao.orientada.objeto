package br.edu.fatecfranca.ads.exe2;

import javax.swing.JOptionPane;

/**
 *
 * @author getulio
 */
public class TestaCliente {

    public static void main(String[] args) {
        
        // objeto fulano
        Cliente fulano = new Cliente();
        fulano.numeroConta = JOptionPane.showInputDialog("Qual o NUMERO DA CONTA?");
        fulano.numeroAgencia = JOptionPane.showInputDialog("Qual o NUMERO DA AGÊNCIA?");
        fulano.nome = "Fulano";
        
        JOptionPane.showMessageDialog(null, fulano.imprimir());

        // realisa deposito 
        fulano.realizaDeposito(Float.parseFloat(JOptionPane.showInputDialog("Qual o VALOR a ser depositado?")));
        JOptionPane.showMessageDialog(null, fulano.imprimir());
        
        // realisa saque 
        fulano.realizaSaque(Float.parseFloat(JOptionPane.showInputDialog("Qual o VALOR a ser sacado?")));
        JOptionPane.showMessageDialog(null, fulano.imprimir());
        
        // objeto beltrano
        String numeroConta = JOptionPane.showInputDialog("Qual o NUMERO DA CONTA?");
        String numeroAgencia = JOptionPane.showInputDialog("Qual o NUMERO DA AGÊNCIA?");
        String nome = "Beltrano";
        Cliente beltrano = new Cliente(numeroConta, numeroAgencia, nome);
        
        JOptionPane.showMessageDialog(null, beltrano.imprimir());

        // realisa deposito 
        beltrano.realizaDeposito(Float.parseFloat(JOptionPane.showInputDialog("Qual o VALOR a ser depositado?")));
        JOptionPane.showMessageDialog(null, beltrano.imprimir());
        
        // realisa saque 
        beltrano.realizaSaque(Float.parseFloat(JOptionPane.showInputDialog("Qual o VALOR a ser sacado?")));
        JOptionPane.showMessageDialog(null, beltrano.imprimir());
        
        // testa a criacao de um novo cliente
        Cliente novoCliente = Cliente.retornaNovoCliente(fulano, beltrano);
        JOptionPane.showMessageDialog(null, novoCliente.imprimir());
        
        // testa o tamanho do numero da conta
        JOptionPane.showMessageDialog(null, Cliente.verificaTamanho(beltrano.numeroAgencia));
        
    }
    
}