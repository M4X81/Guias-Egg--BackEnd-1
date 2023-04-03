/*
 * 3-Escribir un programa que pida una frase y la muestre toda en mayusculas y 
despues toda en minusculas. 
Nota: investigar la funcion toUpperCase() y toLowerCase() en Java.
 */

package trabajo1_clase2;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Trabajo3_Clase2 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase;
        
        System.out.print("Ingrese una frase: ");
        frase = input.nextLine();
        
        System.out.println("Frase en mayúsculas: " + frase.toUpperCase());
        System.out.println("Frase en minúsculas: " + frase.toLowerCase());
    } 
}
