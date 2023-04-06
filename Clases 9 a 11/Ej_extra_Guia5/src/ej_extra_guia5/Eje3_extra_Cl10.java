/*
 * Crear una función rellene un vector con números aleatorios, pasándole un 
arreglo por parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package ej_extra_guia5;

import java.util.Random;

/**
 *
 * @author Max
 */
public class Eje3_extra_Cl10 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        //agrego 2 sout para que se entienda la ejecucion
        System.out.println("El tamaño de vector es : " + vector.length);
        cargarVector(vector);
        imprimirVector(vector);
    }
    
    
    public static void cargarVector (int[] vector) {
       Random aleatorio = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i]= aleatorio.nextInt(100)+1;
        }
    }
    public static void imprimirVector(int[] vector) {
        System.out.println("Los numeros que conforman el vector son: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" " + vector[i] + "\t");
  
        }
        
    }
}
