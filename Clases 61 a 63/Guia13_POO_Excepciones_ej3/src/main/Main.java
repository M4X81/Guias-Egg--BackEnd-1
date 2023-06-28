/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos 
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer, 
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar 
una división con los dos numeros y mostrar el resultado.
 */
package main;

import entity.DivisionNumero;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Main {

    public static void main(String[] args) {
        DivisionNumero div = new DivisionNumero();
        int numero1=0;
        int numero2=0;
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos numeros enteros");
        div.setNum1(input.next());
        div.setNum2(input.next());

        try {
            System.out.println("Convertimos las cadenas a enteros...");
            numero1 = Integer.parseInt(div.getNum1());
            numero2 = Integer.parseInt(div.getNum2());
        } catch (NumberFormatException e) {
            System.out.println("Se produjo un error. Los datos ingresados no son números enteros..." + e.getMessage());
            
        } try {
            System.out.println("El resultado de la divisón es: " + numero1 / numero2);
        } catch (ArithmeticException e) {
            System.out.println("Error aritmetico. no se puede dividir por cero... " + e.getMessage());
        }       
    }
}
