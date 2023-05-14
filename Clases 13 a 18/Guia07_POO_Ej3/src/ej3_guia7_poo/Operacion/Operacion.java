/*
3- Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. 
A continuación, se deben crear los siguientes métodos:
a-Método constructor con todos los atributos pasados por parámetro.
b-Método constructor sin los atributos pasados por parámetro.
c-Métodos get y set.
d-Método para crearOperacion(): que le pide al usuario los dos números y los guarda 
en los atributos del objeto.
e-Método sumar(): calcular la suma de los números y devolver el resultado al main.
f-Método restar(): calcular la resta de los números y devolver el resultado al main
g-Método multiplicar(): primero valida que no se haga una multiplicación por cero, 
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. 
Si no, se hace la multiplicación y se devuelve el resultado al main
h-Método dividir(): primero valida que no se haga una división por cero, si fuera 
a pasar una división por cero, el método devuelve 0 y se le informa al usuario el 
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package ej3_guia7_poo.Operacion;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Operacion {

    private double numero1;
    private double numero2;

    //a-Método constructor con todos los atributos pasados por parámetro.
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //b-Método constructor sin los atributos pasados por parámetro.
    public Operacion() {
    }

    //c-Métodos get y set.
    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    //d-Método para crearOperacion(): que le pide al usuario los dos números y los guarda 
    //en los atributos del objeto.
    public void crearOperacion() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        this.numero1 = input.nextDouble();
        System.out.println("Introduce el segundo número: ");
        this.numero2 = input.nextDouble();
    }

    //e,f,g,h.
    public double sumar() {
        return this.numero1 + this.numero2;
    }

    public double restar() {
        return this.numero1 - this.numero2;
    }

    public double multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Usted esta intentando multipilcar un valor = 0 ");
            return 0;
        } else {
            return this.numero1 * this.numero2;
        }
    }

    public double dividir() {
        if (numero2 == 0) {
            System.out.println("Error: Usted esta intentando dividir por un valor = 0 ");
            return 0;
        } else {
            return this.numero1 / this.numero2;
        }
    }
}
    
    

