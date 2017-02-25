package br.edu.fatecfranca.ads.exe2;

import javax.swing.JOptionPane;

/**
 *
 * @author getulio
 */
public class TestaCliente {
    
    public static void main (String args[]) {
        
        // c1iente 1
        Cliente cliente1 = new Cliente();
        cliente1.numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da conta?"));
        cliente1.numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da agência?"));
        cliente1.nomeCliente = JOptionPane.showInputDialog("Qual o nome do Cliente?");
        // realisa um deposito
        cliente1.deposito = Float.parseFloat(JOptionPane.showInputDialog("Quanto vai depositar?"));
        cliente1.realisaDeposito();
        JOptionPane.showMessageDialog(null, cliente1.retornaDados());
        // realisa um saque
        cliente1.saque = Float.parseFloat(JOptionPane.showInputDialog("Quanto vai sacar?"));
        cliente1.realisaSaque();
        JOptionPane.showMessageDialog(null, cliente1.retornaDados());

        // c1iente 2
        int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da conta?"));
        int numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da agência?"));
        String nomeCliente = JOptionPane.showInputDialog("Qual o nome do Cliente?");
        Cliente cliente2 = new Cliente(numeroConta, numeroAgencia, nomeCliente, 0);
        // realisa um deposito
        cliente2.deposito = Float.parseFloat(JOptionPane.showInputDialog("Quanto vai depositar?"));
        cliente2.realisaDeposito();
        JOptionPane.showMessageDialog(null, cliente2.retornaDados());
        // realisa um saque
        cliente2.saque = Float.parseFloat(JOptionPane.showInputDialog("Quanto vai sacar?"));
        cliente2.realisaSaque();
        JOptionPane.showMessageDialog(null, cliente2.retornaDados());

    }

}
