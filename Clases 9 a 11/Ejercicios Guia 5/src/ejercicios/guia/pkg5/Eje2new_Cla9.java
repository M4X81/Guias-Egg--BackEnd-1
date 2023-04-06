/*
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
y le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
se encuentra el numero y si se encuentra repetido
 */
package ejercicios.guia.pkg5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Eje2new_Cla9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el tamaño del vector: ");
    int N = scanner.nextInt();
    int[] vector = new int[N];
    Random random = new Random();

    System.out.print("Vector generado: ");
    for (int i = 0; i < N; i++) {
        vector[i] = random.nextInt(10) + 1;
        System.out.print(vector[i] + " ");
    }
    System.out.println();

    // Buscamos el número en el vector
    int num_buscar;
    System.out.print("Ingrese un número a buscar en el vector: ");
    num_buscar = scanner.nextInt();
    boolean encontrado = false;
    int contador = 0;
    System.out.print("El número " + num_buscar + " se encuentra en las posiciones: ");
    for (int i = 0; i < N; i++) {
        if (vector[i] == num_buscar) {
            System.out.print(i + " ");
            contador++;
            encontrado = true;
        }
    }

    if (encontrado) {
        System.out.println("\n El número " + num_buscar + " se encuentra repetido " + contador + " veces en el vector");
    } else {
        System.out.println("El número " + num_buscar + " no se encuentra en el vector");
    }
}
    }


