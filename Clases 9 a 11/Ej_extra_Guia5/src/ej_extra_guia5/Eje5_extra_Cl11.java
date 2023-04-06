/*
 * Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios 
y muestre la suma de sus elementos.

 */
package ej_extra_guia5;

import java.util.Random;

/**
 *
 * @author Max
 */
public class Eje5_extra_Cl11 {
    public static void main(String[] args) {
        Random num = new Random();
        int N = num.nextInt(10)+1;
        int M = num.nextInt(10)+1;
        int suma=0;
        int [][] matriz = new int [N][M]; 
        System.out.println("El tamaño de la matriz es de " + matriz.length + " x " + matriz[0].length);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = num.nextInt(99) + 1;
                suma += matriz[i][j];
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("La suma de los elementos de la matriz es : " + suma);
    }
}
