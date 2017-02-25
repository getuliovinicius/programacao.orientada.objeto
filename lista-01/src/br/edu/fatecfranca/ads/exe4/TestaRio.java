package br.edu.fatecfranca.ads.exe4;

import javax.swing.JOptionPane;

/**
 *
 * @author getulio
 */
public class TestaRio {

    public static void main(String[] args) {
        
        // rio 1
        Rio rio1 = new Rio();
        rio1.nomeRio = JOptionPane.showInputDialog("Qual o NOME do rio?");
        rio1.nivelRio = Float.parseFloat(JOptionPane.showInputDialog("Qual o NÍVEL do rio?"));
        int a = JOptionPane.showConfirmDialog(null, "titulo", "mensagem", JOptionPane.YES_NO_OPTION);
        
        if (a == 0) {
            rio1.poluido = false;
        } else {
            rio1.poluido = true;
        }
        
        JOptionPane.showMessageDialog(null, rio1.mostra());
        // chove
        rio1.chover(Float.parseFloat(JOptionPane.showInputDialog("Quanto aumentou o nível do rio após a chuva?")));
        JOptionPane.showMessageDialog(null, rio1.mostra());
        // ensolarou
        rio1.ensolarar(Float.parseFloat(JOptionPane.showInputDialog("Quanto diminuiu o nível do rio após a última cheia?")));
        JOptionPane.showMessageDialog(null, rio1.mostra());
        // limpar
        rio1.limpar();
        JOptionPane.showMessageDialog(null, rio1.mostra());
        // sujar
        rio1.sujar();
        JOptionPane.showMessageDialog(null, rio1.mostra());
        
        // rio 2
        String nomeRio = JOptionPane.showInputDialog("Qual o NOME do rio?");
        float nivelRio = Float.parseFloat(JOptionPane.showInputDialog("Qual o NÍVEL do rio?"));
        a = JOptionPane.showConfirmDialog(null, "titulo", "mensagem", JOptionPane.YES_NO_OPTION);
        boolean poluido;
        
        if (a == 0) {
            poluido = false;
        } else {
            poluido = true;
        }
        
        Rio rio2 = new Rio(nomeRio, nivelRio, poluido);
        // chove
        rio2.chover(Float.parseFloat(JOptionPane.showInputDialog("Quanto aumentou o nível do rio após a chuva?")));
        JOptionPane.showMessageDialog(null, rio2.mostra());
        // ensolarou
        rio2.ensolarar(Float.parseFloat(JOptionPane.showInputDialog("Quanto diminuiu o nível do rio após a última cheia?")));
        JOptionPane.showMessageDialog(null, rio2.mostra());
        // limpar
        rio2.limpar();
        JOptionPane.showMessageDialog(null, rio2.mostra());
        // sujar
        rio2.sujar();
        JOptionPane.showMessageDialog(null, rio2.mostra());

    }
    
}
