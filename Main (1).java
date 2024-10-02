/** 
@author Leo V 
@version 1.0 
@since 2024
@param argumentos de la linea de comandos 
 */

package Cuenta_banco;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Banco banco = new Banco("Bienvenidos a su banco de confianza");
        Cliente cliente = new Cliente("1192807111", "Leonardo Valencia");
        boolean Adicionar = banco.adicionarCuenta("301-2", 1000000, "Ahorros", cliente);
        if(Adicionar){
            System.out.println("¡Felicitaciones has logrado adicionar una nueva cuenta!");
        }else{
            System.out.println("Lo sentimos, intenta nuevamente o habla con uno de nuestros asesores");
        }

        cliente = new Cliente("1117082911", "Valencia Leonardo");
        pudoAdcionar = banco.adicionarCuenta("201-3", 2000000, "Corriente", cliente);
        if(pudoAdcionar){
            System.out.println("¡Felicitaciones, has logrado adicionar una nueva cuenta!.");
        }else{
            System.out.println("Lo sentimos, intenta nuevamente o habla con uno de nuestros asesores");
        }

        System.out.println("Dinero Total:" + banco.consultarTotalDinero() + " Cliente: " +cliente.getNombre());
        
    }
}
