/*
 * Ejercicio 10
Realizar un programa que lea 4 nÃºmeros (comprendidos entre 1 y 20) e imprima el 
nÃºmero ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package material_de_trabajoclase4;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Trabajo10_Clase4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           for (int i = 1; i <= 4; i++) {
            System.out.print("Ingrese un número entre 1 y 20: ");
            int numero = input.nextInt();
            
            if (numero >= 1 && numero <= 20) {
                System.out.print(numero + " ");
                
                for (int j = 1; j <= numero; j++) {
                    System.out.print("*");
                }
                
                System.out.println();
            } else {
                System.out.println("El número ingresado no está en el rango válido.");
                i--; // Disminuir el contador del bucle para repetir la iteraciÃ³n
            }
        }
    }   
    }

