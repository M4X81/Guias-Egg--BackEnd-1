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
    //constructor
    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    //getter y setter
    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

     public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    

    public void retirar_dinero(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
        }
    }

}
