/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_01;

/**
 *
 * @author getulio
 */
public class Carro {
    // Declaracao de variaveis
    public float velAtual;
    public boolean statusMotor;
	
    // Declaracao de metodos
    public void ligar () {
	velAtual = 0;
	statusMotor = true;
    }
    public void desligar () {
	statusMotor = false;
    }
    public void acelerar (float x) {
    	velAtual = velAtual + x;	
    }
    public void frear (float x) {
    	velAtual = velAtual - x;
    }	
}