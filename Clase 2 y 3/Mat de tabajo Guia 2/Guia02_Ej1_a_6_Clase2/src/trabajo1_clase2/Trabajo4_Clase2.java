/*
 * 4- Dada una cantidad de grados centigrados se debe mostrar su equivalente en 
grados Fahrenheit. La formula correspondiente es: F = 32 + (9 * C / 5).
 */
package trabajo1_clase2;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Trabajo4_Clase2 {
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner input = new Scanner(System.in);
        double celsius, fahrenheit;
        
        System.out.print("Ingrese la temperatura en grados centígrados: ");
        celsius = input.nextDouble();
        
        fahrenheit = 32 + (9 * celsius / 5);
        
        System.out.println(celsius + " grados centígrados equivale a " + fahrenheit + " grados Fahrenheit.");
    }
}