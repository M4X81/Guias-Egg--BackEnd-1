/*
4-Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea 
un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo 
de la cuenta. Asegúrate de que el saldo nunca sea negativo después de realizar una 
transacción de retiro.

 */
package ej4_guia7_extra_poo.Cuenta;

/**
 *
 * @author Max
 */
public class Cuenta {
    private double saldo;
    private String titular;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void retirar_dinero(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
        }
    }

    public double getSaldo() {
        return saldo;
    }

   
}
