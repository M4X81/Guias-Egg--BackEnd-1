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
public class Ejercicio7_Clase6_extra {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de números: N (Ingrese un número mayor a 0)");
        int N = leer.nextInt(), Ncopia = N, minimo, maximo, numeroIngresado, pregunta;

        minimo = 0;
        maximo = 0;

        System.out.println("Con cuál bucle realizar el programa? While (1), do-While (2)");
        pregunta = leer.nextInt();
        if (pregunta == 1) {
            System.out.println("Usted está realizando el programa con el bucle While (1)");
            //Bucle While
            if (N > 0) {
                System.out.println("Ingrese los números, " + N + " valores restantes");
                numeroIngresado = leer.nextInt();
                minimo = numeroIngresado;
            }

            while (N - 1 > 0) {
                System.out.println("Ingrese los números, " + (N - 1) + " valores restantes");
                numeroIngresado = leer.nextInt();
                if (numeroIngresado > maximo) {

                    maximo = numeroIngresado;
                } else if (numeroIngresado < minimo) {

                    minimo = numeroIngresado;
                }
                N--;
            }
            System.out.println("Valor mínimo: " + minimo + ", y valor máximo: " + maximo);
        } else if (pregunta == 2) {
            System.out.println("Usted está realizando el programa con el bucle do-While");
            //Bucle do-While
            if (N > 0) {
                do {
                    System.out.println("Ingrese los números, " + N + " valores restantes");
                    numeroIngresado = leer.nextInt();
                    if (N == Ncopia) {
                        minimo = numeroIngresado;
                    }

                    if (numeroIngresado > maximo) {

                        maximo = numeroIngresado;
                    } else if (numeroIngresado < minimo) {

                        minimo = numeroIngresado;
                    }
                    N--;

                } while (N > 0);
                System.out.println("Valor mínimo: " + minimo + ", y valor máximo: " + maximo);
            }
        } else {
            System.out.println("ERROR: La opción ingresada es incorrecta");
        }
    }

}
