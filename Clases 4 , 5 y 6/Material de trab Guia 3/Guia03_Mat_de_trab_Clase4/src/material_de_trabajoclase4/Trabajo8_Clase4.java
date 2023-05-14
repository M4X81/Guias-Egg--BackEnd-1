/*
 * Ejercicio 8
Escriba un programa que valide si una nota esta entre 0 y 10, sino esta 
entre 0 y 10 la nota se pedira de nuevo hasta que la nota sea correcta.
 */
package material_de_trabajoclase4;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Trabajo8_Clase4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota = -1;
        
        while (nota < 0 || nota > 10) {
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = input.nextInt();
            
            if (nota < 0 || nota > 10) {
                System.out.println("La nota ingresada no es válida.");
            }
        }
        
        System.out.println("La nota ingresada es: " + nota);
    }

    }