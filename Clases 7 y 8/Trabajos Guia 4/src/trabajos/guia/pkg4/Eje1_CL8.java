/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajos.guia.pkg4;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Eje1_CL8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int opcion;
        int num1 = 0, num2 = 0;
        
        do {
            System.out.println("Elija una opción:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = input.nextInt();
            
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                num1 = input.nextInt();
                System.out.print("Ingrese el segundo número: ");
                num2 = input.nextInt();
            }
            
            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + restar(num1, num2));
                    break;
                case 3:
                    System.out.println("El producto es: " + multiplicar(num1, num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir entre cero.");
                    } else {
                        System.out.println("La división es: " + dividir(num1, num2));
                    }
                    break;
                case 5:
                    System.out.println("Adiós.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            
            System.out.println();
            
        } while (opcion != 5);
    }
    
    public static int sumar(int a, int b) {
        return a + b;
    }
    
    public static int restar(int a, int b) {
        return a - b;
    }
    
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    
    public static double dividir(int a, int b) {
        return (double) a / b;
    }
}
