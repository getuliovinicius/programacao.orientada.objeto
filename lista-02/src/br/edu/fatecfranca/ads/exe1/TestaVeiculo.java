package br.edu.fatecfranca.ads.exe1;

import javax.swing.JOptionPane;

/**
 *
 * @author getulio
 */
public class TestaVeiculo {

    public static void main(String[] args) {
        
        // objeto Carro
        Veiculo carro = new Veiculo();
        carro.tipo = "Carro";
        carro.nroRodas = 4;
        carro.cor = JOptionPane.showInputDialog("Qual a COR do veículo?");
        carro.ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o ANO do veículo?"));
        // objeto Moto
        String tipo = "Moto";
        int nroRodas = 2;
        String cor = JOptionPane.showInputDialog("Qual a COR do veículo?");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o ANO do veículo?"));
        Veiculo moto = new Veiculo(tipo, nroRodas, cor, ano);
        
        // mostra informacoes
        JOptionPane.showMessageDialog(null, carro.mostra());
        JOptionPane.showMessageDialog(null, moto.mostra());

        // objeto Moto
        moto.tipo = "Moto";
        moto.nroRodas = 2;
        moto.cor = JOptionPane.showInputDialog("Qual a COR do veículo?");
        moto.ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o ANO do veículo?"));
        Veiculo.alteraNome(JOptionPane.showInputDialog("Qual o NOME do dono do veículo?"));

        // mostra informacoes
        JOptionPane.showMessageDialog(null, carro.mostra());
        JOptionPane.showMessageDialog(null, moto.mostra());
        
        // testa o nro de rodas
        JOptionPane.showMessageDialog(null, Veiculo.nroRodas(carro.nroRodas));
        
        // retorna o novo veiculo
        Veiculo novoVeiculo = Veiculo.retornaNovoVeiculo(carro, moto);
        JOptionPane.showMessageDialog(null, novoVeiculo.mostra());
    }
    
}
