/*
 * 1-Escribir un programa que pida dos números enteros por teclado y calcule 
la suma de los dos. El programa deberá¡ después mostrar el resultado de la suma
 */
package trabajo1_clase2;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Trabajo1_Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
        int num1, num2, suma;
        
        System.out.println("Ingrese el primer número: ");
        num1 = input.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        num2 = input.nextInt();
        
        suma = num1 + num2;
        
        System.out.println("La suma de los dos números es: " + suma);
        
    }
    
    }
    

