package br.edu.fatecfranca.ads.exe1;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author getulio
 */
public class TestaCliente {

    public static void main(String[] args) {

        try {
        
            Cliente fulano = new Cliente();
            
            fulano.setNumeroConta(JOptionPane.showInputDialog("Informe número da Conta:"));
            fulano.setNumeroAgencia(JOptionPane.showInputDialog("Informe número da Agência:"));
            fulano.setNome(JOptionPane.showInputDialog("Informe o nome do Cliente:"));
            fulano.setSaldo(Float.parseFloat(JOptionPane.showInputDialog("Informe o Saldo da Conta:")));

            String opcao;
            
            do {
                opcao = JOptionPane.showInputDialog("Digite: \n1. Saque \n2. Depósito \n3. Saldo \n4. Sair");
                switch (opcao) {
                    case "1":
                        fulano.realizaSaque(Float.parseFloat(JOptionPane.showInputDialog("Qual o valor que será sacado?")));
                        break;
                    
                    case "2":
                        fulano.realizaDeposito(Float.parseFloat(JOptionPane.showInputDialog("Qual o valor que será depositado?")));
                        break;
                            
                    case "3":
                        JOptionPane.showMessageDialog(null, fulano.getSaldo());
                        break;
                    
                    case "4":
                        JOptionPane.showMessageDialog(null, fulano.imprime());
                        break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                }
                 
            } while (!opcao.equals("4"));
            
        } catch(IllegalArgumentException e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", ERROR_MESSAGE, null);
            
        }
        
        try {
        
            String numeroConta = JOptionPane.showInputDialog("Informe número da Conta:");
            String numeroAgencia = JOptionPane.showInputDialog("Informe número da Agência:");
            String nome = JOptionPane.showInputDialog("Informe o nome do Cliente:");
            float saldo = Float.parseFloat(JOptionPane.showInputDialog("Informe o Saldo da Conta:"));

            Cliente beltrano = new Cliente(numeroConta, numeroAgencia, nome, saldo);

            String opcao;
            
            do {
                opcao = JOptionPane.showInputDialog("Digite: \n1. Saque \n2. Depósito \n3. Saldo \n4. Sair");
                switch (opcao) {
                    case "1":
                        beltrano.realizaSaque(Float.parseFloat(JOptionPane.showInputDialog("Qual o valor que será sacado?")));
                        break;
                    
                    case "2":
                        beltrano.realizaDeposito(Float.parseFloat(JOptionPane.showInputDialog("Qual o valor que será depositado?")));
                        break;
                            
                    case "3":
                        JOptionPane.showMessageDialog(null, beltrano.getSaldo());
                        break;
                    
                    case "4":
                        JOptionPane.showMessageDialog(null, beltrano.imprime());
                        break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                }
                 
            } while (!opcao.equals("4"));
            
        } catch(IllegalArgumentException e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", ERROR_MESSAGE, null);
            
        }
    }
    
}
