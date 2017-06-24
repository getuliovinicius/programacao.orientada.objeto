package br.edu.fatecfranca.ads.exe1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TestaFuncionario {

    public static void main(String[] args) {
        
        ArrayList<Funcionario> funcionarios = new ArrayList();
        Gerente gerente = new Gerente("Fulano", "G123", 4000);
        Assistente assistente = new Assistente("Beltrano", "A456", 2000);
        Vendedor vendedor = new Vendedor(2, "Ciclano", "V789", 1000);
        
        funcionarios.add(gerente);
        funcionarios.add(assistente);
        funcionarios.add(vendedor);
        
        for (Funcionario funcionario: funcionarios) {
            JOptionPane.showMessageDialog(null, funcionario.toString() + "\nSalário: " + funcionario.calculaSalario());
        }
        
    }
    
}
