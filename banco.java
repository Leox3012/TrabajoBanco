/** 
@author Leo V 
@version 1.0 
@since 2024
@param argumentos de la linea de comandos 
 */

package Cuenta_banco;

import java.util.ArrayList;

public class banco {

    String nombrebanco;
    ArrayList<CuentaBanco> cuentas;
    

    public Banco(String nombrebanco){
        this.cuentas = new ArrayList<>();
    }

    public Cuentabanco buscarCuenta(String numero){

        for(Cuentabanco cuenta : this.cuentas){
            if(numero.equals(cuenta.getNumero())){
                return cuenta;
            }
        }
        return null;
    }

    public boolean adicionarCuenta(String numero, double saldoInicial, String tipo, Cliente titular) {
        if(this.buscarCuenta(numero) = null){
            return false;
        }else {
            Cuentabanco cuenta = new Cuentabanco(tipo, numero, saldoInicial, titular);
            cuentas.add(cuenta);
            return true;
        }
    }

    public double consultarTotalDinero(){

        double total = 0;

        for (Cuentabanco cuenta : this.cuentas){
            total += cuenta.getSaldo();
        }
        return total;
    }

    public String consultarClienteMayorSaldo(){
        double mayorSaldo = 0;
        Cuentabanco cuentaMayorSaldo = null;
        for (Cuentabanco cuenta : this.cuentas){
            if(cuenta.getSaldo() > mayorSaldo){
                mayorSaldo = cuenta.getSaldo();
                cuentaMayorSaldo = cuenta;
            }
        }
        if(cuentaMayorSaldo == null){
            return "No se encuentra Cuenta";
        }
        return cuentaMayorSaldo.getTitular().getNombre();
    }

}
