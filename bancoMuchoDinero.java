/** 
@author Leo V 
@version 1.0 
@since 2024
@param argumentos de la linea de comandos 
 */

package Cuenta_banco;

import java.util.ArrayList;

public class bancoMuchoDinero {

        String numero;
        double saldo;
        String tipo;
        Cliente titular;
        
//CONSTRUCTOR
        public bancoMuchoDinero(String numero, double saldo, String tipo, Cliente titular){
            this.numero = numero;
            this.saldo = saldo;
            this.tipo = tipo;
            this.titular = titular;
        }

        public bancoMuchoDinero(String numero, String tipo, Cliente titular){
            this.numero = numero;
            this.tipo = tipo;
            this.titular = titular;
        }


//GETT & SETT

        public double consultarSaldo(){
            return this.saldo;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public Cliente getTitular() {
            return titular;
        }

        public void setTitular(Cliente titular) {
            this.titular = titular;
        }

        void consignar(double cantidadConsignar){
            this.saldo += cantidadConsignar;
        }

// INCLUSION DE METODOS 
        public boolean retirar(double cantidadRetirar){

            if (this.consultarSaldo() > cantidadRetirar) {
                this.saldo = cantidadRetirar;
                return true;
            } 
            else {
                return false;
            }
        }

        
    
}
