package Cuenta_banco;

public class BancoMuchoDinero {

    String numero;
    double saldo;
    String tipo;
    Cliente titular;
    
    public BancoMuchoDinero(String numero, double saldo, String tipo, Cliente titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.tipo = tipo;
        this.titular = titular;
    }

    public BancoMuchoDinero(String numero, String tipo, Cliente titular) {
        this.numero = numero;
        this.tipo = tipo;
        this.titular = titular;
    }

    public double consultarSaldo() {
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

    public void consignar(double cantidadConsignar) {
        this.saldo += cantidadConsignar;
    }

    public boolean retirar(double cantidadRetirar) {
        if (this.consultarSaldo() > cantidadRetirar) {
            this.saldo -= cantidadRetirar;
            return true;
        } else {
            return false;
        }
    }
}
