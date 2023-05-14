/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.guia.pkg3;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Ejercicio6_Clase5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
        int num1, num2, opcion;

        do {
            System.out.println("Menú");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = input.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                num1 = input.nextInt();
                System.out.print("Ingrese el segundo número: ");
                num2 = input.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("La suma es: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("La resta es: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("La multiplicación es: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("No se puede dividir por cero.");
                        } else {
                            System.out.println("La división es: " + ((double) num1 / num2));
                        }
                        break;
                }
            } else if (opcion == 5) {
                System.out.print("Está seguro que desea salir del programa (S/N)? ");
                char confirmacion = input.next().charAt(0);
                if (Character.toUpperCase(confirmacion) == 'S') {
                    break;
                }
            } else {
                System.out.println("Opción inválida.");
            }

        } while (true);

        System.out.println("Hasta luego!");
    }
}
