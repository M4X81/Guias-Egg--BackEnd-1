/*
 * 1-Crear un programa que dado un número determine si es par o impar.
 */
package ejercicios.guia.pkg3;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Ejercicio1_Clase4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número entero para determinar si es par o impar");
        num = input.nextInt();
        if (num % 2 == 0){
            System.out.println("El número ingresado es par");
  
        }else {
           System.out.println("El número ingresado " + num + " es impar"); 
        }
        
    }
    
}
