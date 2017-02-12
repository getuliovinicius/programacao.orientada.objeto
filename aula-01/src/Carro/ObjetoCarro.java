/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carro;

/**
 *
 * @author getulio
 */
public class ObjetoCarro {
    public static void main (String args[]) {
	Carro obj1 = new Carro();
            obj1.ligar();
            obj1.acelerar(40);
	Carro obj2 = new Carro();
            obj2.ligar();
            obj2.acelerar(20);
            obj2.frear(20);
    }
}