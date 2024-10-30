package Cuenta_banco;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        Banco banco = new Banco("Bienvenidos a su banco de confianza");
        Cliente cliente = new Cliente("1192807111", "Leonardo Valencia");
        
        boolean adicionar = banco.adicionarCuenta("301-2", 1000000, "Ahorros", cliente);
        if (adicionar) {
            JOptionPane.showMessageDialog(null, "¡Felicitaciones has logrado adicionar una nueva cuenta!");
        } else {
            JOptionPane.showMessageDialog(null, "Lo sentimos, intenta nuevamente o habla con uno de nuestros asesores");
        }

        cliente = new Cliente("1117082911", "Valencia Leonardo");
        boolean pudoAdicionar = banco.adicionarCuenta("201-3", 2000000, "Corriente", cliente);
        if (pudoAdicionar) {
            JOptionPane.showMessageDialog(null, "¡Felicitaciones, has logrado adicionar una nueva cuenta!");
        } else {
            JOptionPane.showMessageDialog(null, "Lo sentimos, intenta nuevamente o habla con uno de nuestros asesores");
        }

        JOptionPane.showMessageDialog(null, "Dinero Total: " + banco.consultarTotalDinero() + " Cliente: " + cliente.getNombre());
    }
}
