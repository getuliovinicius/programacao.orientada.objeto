package br.edu.fatecfranca.ads.exe0;

import javax.swing.JOptionPane;

/**
 *
 * @author getulio
 */

public class CarroObjeto {

    public static void main (String args[]) {

        Carro obj1 = new Carro(false, 0);
        System.out.println(obj1.paraString());
        Carro obj2 = new Carro(false, 0);
        Carro obj3 = new Carro(true, 140);
        
        // Carro 1
        obj1.ligar();
        System.out.println(obj1.paraString());
        float aumenta = Float.parseFloat(JOptionPane.showInputDialog("Qto quer aumentar?"));
        obj1.acelerar(aumenta);
        System.out.println(obj1.paraString());

        // Carro 2
        obj2.ligar();
        JOptionPane.showMessageDialog(null, obj2.paraString());
        obj2.acelerar(20);
        obj2.frear(20);
        JOptionPane.showMessageDialog(null, obj2.paraString());
        
        // Carro 3
        JOptionPane.showMessageDialog(null, obj3.paraString());
        

    }

}