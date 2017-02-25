package br.edu.fatecfranca.ads.exe4;

/**
 *
 * @author getulio
 */
public class Rio {
    
    // variaveis de instancia
    public String nomeRio;
    public float nivelRio;
    public boolean poluido;
    
    // metodos construtores >>>
    public Rio () {
        this.nomeRio = "";
        this.nivelRio = 0;
        this.poluido = false;
    }
    public Rio (String nomeRio, float nivelRio, boolean poluido) {
        this.nomeRio = nomeRio;
        this.nivelRio = nivelRio;
        this.poluido = poluido;
    }
    // <<< metodos construtores
    
    // metodos publicos >>>
    public void chover (float x) {
        this.nivelRio += x;
    }
    public void ensolarar (float x) {
        this.nivelRio -= x;
    }
    public void limpar () {
        this.poluido = false;
    }
    public void sujar () {
        this.poluido = true;
    }
    public String mostra () {
        return "Nome: " + this.nomeRio + " | Nível: " + this.nivelRio + " | Situação: " + this.poluido;
    }
    // <<< metodos publicos

}
