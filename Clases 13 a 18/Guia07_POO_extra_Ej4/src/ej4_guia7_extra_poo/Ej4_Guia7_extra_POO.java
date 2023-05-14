/*
4-Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea 
un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo 
de la cuenta. Asegúrate de que el saldo nunca sea negativo después de realizar una 
transacción de retiro.
 */
package ej4_guia7_extra_poo;

import ej4_guia7_extra_poo.Cuenta.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Ej4_Guia7_extra_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una instancia de Cuenta con saldo inicial de $1000 y titular "Juan"
        Cuenta miCuenta = new Cuenta("Maxi", 100000.0);
        Scanner input= new Scanner(System.in);
        boolean retirando = true;//sigue el ciclo hasta false
        
      
        while (retirando) {
            System.out.println("Saldo actual de la cuenta: $" + miCuenta.getSaldo());
            System.out.println("¿Cuánto dinero desea retirar? (0 para salir)");
            double cantidad = input.nextDouble();

            if (cantidad == 0) {
                retirando = false;
            } else {
                miCuenta.retirar_dinero(cantidad);
            }

            if (miCuenta.getSaldo() == 0) {
                System.out.println("Saldo insuficiente para realizar más retiros.");
                retirando = false;
            }
        }

        System.out.println("Finalizando programa.");
    }
}
