/*
 * Realizar un programa que complete un vector con los N primeros números de la 
sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que 
reciba como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente link: https://quantdare.com/numeros-de-fibonacci/
 */
package ej_extra_guia5;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Eje7_extra_Cl11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el número de términos de Fibonacci a generar: ");
        int n = input.nextInt(); 
        int[] vectorFibonacci = new int[n]; 
        for (int i = 0; i < n; i++) {
            if (i <= 1) { // Casos base: los primeros dos términos son 1
                vectorFibonacci[i] = 1;
            } else { // El resto de los términos se calculan sumando los dos términos anteriores
                vectorFibonacci[i] = vectorFibonacci[i - 1] + vectorFibonacci[i - 2];
            }
        }
        System.out.print("La sucesión de Fibonacci de " + n + " términos es: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vectorFibonacci[i] + " "); 
        }
    }
}
