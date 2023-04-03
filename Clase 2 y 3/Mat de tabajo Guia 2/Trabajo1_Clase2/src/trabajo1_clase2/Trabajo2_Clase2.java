/*
 * 2-Escribir un programa que pida tu nombre, lo guarde en una variable y lo 
muestre por pantalla.
 */
package trabajo1_clase2;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Trabajo2_Clase2 {
    
     public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        String nombre;
        
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.println("Hola " + nombre + " ,como estas?");
    }
    
}
