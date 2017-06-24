package br.edu.fatecfranca.ads.exe4;

import java.util.Random;

/**
 *
 * @author getulio
 */
public class Produto {
    
    protected int serial, volume;
    protected String teste;

    public Produto () {
        this.serial = 0;
        this.volume = 0;
        this.teste = "Não testado";
    }
    
    public Produto(int serial, int volume) {
        this.serial = serial;
        this.volume = volume;
        this.teste = "Não testado";
    }
    
    public boolean testaUnidade () {
        if (this.teste.equals("Não testado")) {
            Random random = new Random();
            int semente = random.nextInt(10);
            if (semente < 9) {
                this.teste = "Aprovado";
                return true;
            } else {
                this.teste = "Reprovado";
                return false;
            }
        } else {
            return false;
        }
        
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }

    @Override
    public String toString() {
        return "PRODUTO" + "\nsSerial: " + this.serial + "\nVolume: " + this.volume + "\nTeste: " + this.teste;
    }
    
}
