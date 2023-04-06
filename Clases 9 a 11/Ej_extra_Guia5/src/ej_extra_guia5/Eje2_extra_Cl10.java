/*
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre 
los elementos).
 */
package ej_extra_guia5;
import java.util.Random;
/**
 *
 * @author Max
 */
public class Eje2_extra_Cl10 {
    public static void main(String[] args) {
        Random random = new Random();
        /*número aleatorio entre 1 y 10 para el tamaño de los vectores
        o puede pedirse al usuario(no aclara)
        */
        int n = random.nextInt(10) + 1; 
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];

        // cargo los vectores
        for (int i = 0; i < n; i++) {
            vector1[i] = random.nextInt(100)+1;
            vector2[i] = random.nextInt(100)+1;
        }

        System.out.print("Vector 1: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vector1[i] + " ");
        }
        System.out.println();

        System.out.print("Vector 2: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vector2[i] + " ");
        }
        System.out.println();

        // aca comparo los vectores(se podria hacer con un boolean tambien)
        int difVectores = 0;
        if (vector1.length != vector2.length) {
            difVectores = 1;
            
        } else {
            for (int i = 0; i < vector1.length; i++) {
                if (vector1[i] != vector2[i]) {
                    difVectores = 1;
                    break;
                }
            }
        }

        if (difVectores == 0) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores no son iguales.");
        }
    }
}