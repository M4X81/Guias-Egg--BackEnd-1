/*
 Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede 
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena 
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un 
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones 
utilizando bloques try/catch para las distintas excepciones
 */
package main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int numero1;
        int numero2 ;
        String n1="a";
        String n2="b";
        try {
            System.out.println("Ingrese algo que no sea un número para que pueda ver la excepción");
            int algo = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Lo rompiste..." + e.getMessage());
        }

        System.out.println(" ");
        try {
            System.out.println("Dadas la cadena n1= 'a' y n2='b'");
            System.out.println("Convertimos las cadenas a enteros...");
            numero1 = Integer.parseInt(n1);
            numero2 = Integer.parseInt(n2);
        } catch (NumberFormatException e) {
            System.out.println("Se produjo un error. Los datos ingresados no son números enteros..." + e.getMessage());
        }
        System.out.println(" ");
        try {
            System.out.println("Tratamos de dividir 8/0...");
            System.out.println("El resultado de la divisón es: " + 8 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Error aritmetico. no se puede dividir por cero... " + e.getMessage());
        }

    }
}
