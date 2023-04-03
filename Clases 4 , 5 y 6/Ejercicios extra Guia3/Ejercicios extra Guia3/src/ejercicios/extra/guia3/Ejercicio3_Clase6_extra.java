/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.extra.guia3;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Ejercicio3_Clase6_extra {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        String letra;
        
        do {
            System.out.print("Ingrese una letra o '0' para salir: ");
            letra = scanner.nextLine().toLowerCase();

            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                System.out.println("La letra ingresada es una vocal.");
            } else if (letra.equals("0")) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("La letra ingresada no es una vocal.");
            }
        } while (!letra.equals("0"));
    }
}
