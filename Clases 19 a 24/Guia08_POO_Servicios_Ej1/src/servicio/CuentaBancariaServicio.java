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
package servicio;

import entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class CuentaBancariaServicio {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    //a-Método para crear cuenta pidiéndole los datos al usuario.
    public CuentaBancaria crearCuenta() {
        CuentaBancaria cuenta = new CuentaBancaria();
        System.out.println("Ingrese numero de cuenta: ");
        cuenta.setNumeroCuenta(input.nextInt());
        System.out.println("Ingrese numero de DNI: ");
        cuenta.setDniCliente(input.nextLong());
        System.out.println("Ingrese saldo actual: ");
        cuenta.setSaldoActual(input.nextDouble());
        return cuenta;
    }

    //b-Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
    public void ingresar(CuentaBancaria cuenta) {
        System.out.println("Ingrese su depósito");
       // double saldoActual = input.nextDouble() + cuenta.getSaldoActual();
        /*esta declaracion de la variable comentada de abajo es lo mismo pero 
        haciendolo directo en el setter:*/
        cuenta.setSaldoActual(input.nextDouble()+ cuenta.getSaldoActual());
    }

    /*c-Método retirar(double): recibe una cantidad de dinero a retirar y se le restara 
al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará
el máximo posible hasta dejar la cuenta en 0.*/
    public void retirar(CuentaBancaria cuenta) {
        System.out.println("Ingrese cantidad a retirar.");
        double retiro = input.nextDouble();
        if (retiro > cuenta.getSaldoActual()) {
            System.out.println("El saldo es insuficiente. Se ha retirado $" + cuenta.getSaldoActual());
            System.out.println("");
            cuenta.setSaldoActual(0);   
        }else if (retiro < 100){
            System.out.println("El monto a retirar debe ser mayor a $100");
            System.out.println("");
        } else {
            System.out.println("Se ha retirado: $" + retiro);
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
        }

    }
    //d-Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar 
    //que el usuario no saque más del 20%.(la validacion en este caso es innecesaria)

    public void extraccionRapida(CuentaBancaria cuenta) {
        System.out.println("Se extraeran $" + cuenta.getSaldoActual() * 0.2);
        cuenta.setSaldoActual(cuenta.getSaldoActual() * 0.8);
    }

    //e-Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("El saldo disponible en su cuenta es : $" + cuenta.getSaldoActual());
    }

    //f-Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Su numero de cuenta es :" + cuenta.getNumeroCuenta());
        System.out.println("El DNI registrado en esta cuenta es: " + cuenta.getDniCliente());
    }
    
    
}