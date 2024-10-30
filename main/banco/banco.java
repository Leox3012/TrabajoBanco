package Cuenta_banco;

import java.util.ArrayList;

public class Banco {

    String nombreBanco;
    ArrayList<CuentaBanco> cuentas;
    
    public Banco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
        this.cuentas = new ArrayList<>();
    }

    public CuentaBanco buscarCuenta(String numero) {
        for (CuentaBanco cuenta : this.cuentas) {
            if (numero.equals(cuenta.getNumero())) {
                return cuenta;
            }
        }
        return null;
    }

    public boolean adicionarCuenta(String numero, double saldoInicial, String tipo, Cliente titular) {
        if (this.buscarCuenta(numero) != null) {
            return false;
        } else {
            CuentaBanco cuenta = new CuentaBanco(tipo, numero, saldoInicial, titular);
            cuentas.add(cuenta);
            return true;
        }
    }

    public double consultarTotalDinero() {
        double total = 0;
        for (CuentaBanco cuenta : this.cuentas) {
            total += cuenta.getSaldo();
        }
        return total;
    }

    public String consultarClienteMayorSaldo() {
        double mayorSaldo = 0;
        CuentaBanco cuentaMayorSaldo = null;
        for (CuentaBanco cuenta : this.cuentas) {
            if (cuenta.getSaldo() > mayorSaldo) {
                mayorSaldo = cuenta.getSaldo();
                cuentaMayorSaldo = cuenta;
            }
        }
        if (cuentaMayorSaldo == null) {
            return "No se encuentra Cuenta";
        }
        return cuentaMayorSaldo.getTitular().getNombre();
    }
}
