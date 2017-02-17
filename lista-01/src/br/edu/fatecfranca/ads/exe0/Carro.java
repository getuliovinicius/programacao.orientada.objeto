package br.edu.fatecfranca.ads.exe0;

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