package br.edu.fatecfranca.ads.exe1;

import javax.swing.JOptionPane;

/**
 * TestaPassageiro
 */
public class TestaPassageiro {

    public static void main(String[] args) {
        
        /** Voo 1 */
        Voo voo1 = new Voo("Franca-SP", "1234-A");
        
        /** Reserva 1 */
        Reserva reserva1  = new Reserva(999, voo1);
        
        /** Passageiro 1 */
        Passageiro passageiro1 = new Passageiro("Getulio", reserva1);
        
        /** Mostra passageiro 1 */
        JOptionPane.showMessageDialog(null, passageiro1.mostra());
        
        /** Voo 2 */
        Voo voo2 = new Voo();
        voo2.setDestino("Fortaleza");
        voo2.setNumero("1234-D");
        
        /** Reserva 2 */
        Reserva reserva2  = new Reserva();
        reserva2.setCodigo(54323);
        reserva2.setVoo(voo2);
        
        /** Passageiro 2 */
        Passageiro passageiro2 = new Passageiro();
        passageiro2.setNome("Getulio Silva");
        passageiro2.setReserva(reserva2);
        
        /** Mostra passageiro 2 */
        JOptionPane.showMessageDialog(null, passageiro2.mostra());
        
    }
    
}
