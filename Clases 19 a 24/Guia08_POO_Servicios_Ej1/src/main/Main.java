/*
1-Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes 
atributos: numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar 
constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
a-Método para crear cuenta pidiéndole los datos al usuario.
b-Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
c-Método retirar(double): recibe una cantidad de dinero a retirar y se le restara 
al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará
el máximo posible hasta dejar la cuenta en 0.
d-Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar 
que el usuario no saque más del 20%.
e-Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
f-Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 */
package main;

import entidad.CuentaBancaria;
import servicio.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Main {

    public static void main(String[] args) {
        CuentaBancariaServicio cuentaBServ = new CuentaBancariaServicio();
        CuentaBancaria cuenta1 = cuentaBServ.crearCuenta();
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        char respuesta = 'a';
        int opcion;
        do {
            System.out.println("1-Ingresar deposito");
            System.out.println("2-Retiro");
            System.out.println("3-Extracción rápida");
            System.out.println("4-Consultar saldo");
            System.out.println("5-Consultar datos");
            System.out.println("6-salir");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    cuentaBServ.ingresar(cuenta1);
                    break;
                case 2:
                    cuentaBServ.retirar(cuenta1);
                    break;
                case 3:
                    cuentaBServ.extraccionRapida(cuenta1);
                    break;
                case 4:
                    cuentaBServ.consultarSaldo(cuenta1);
                    break;
                case 5:
                    cuentaBServ.consultarDatos(cuenta1);
                    break;
                case 6:
                    System.out.println("S para salir");
                    respuesta = input.next().charAt(0);
                    break;
                default:
                    System.out.println("Comando desconocido...");
            }

        } while (!(respuesta == 's'));

    }

}
