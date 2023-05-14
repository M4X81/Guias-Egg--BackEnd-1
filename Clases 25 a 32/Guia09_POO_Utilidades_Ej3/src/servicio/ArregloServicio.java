/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Max
 */
public class ArregloServicio {
     //Metodo 1)
    public void inicializarA(double[] vectorA) {
        Random random = new Random();
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = (random.nextDouble() * 10) + 1;    // genera numeros entre 1 y 10
        }
    }

    //Metodo 2)
    public void mostrarA(double[] vectorA) {
        System.out.println("Vector Original");

        for (int i = 0; i < vectorA.length; i++) {
            System.out.println(vectorA[i]);
        }
        System.out.println(" ");
    }

    //Metodo 3)
    public void ordenar(double[] vectorA) {
        System.out.println("Vector Ordenado");
        Arrays.sort(vectorA);

        for (int i = vectorA.length - 1; i >= 0; i--) {
            System.out.println(vectorA[i] + " ");
        }
        System.out.println(" ");
    }

    //Metodo 4)
    public void inicializarB(double[] vectorA, double[] vectorB) {
        System.out.println("El vector B es: ");

        for (int i = 0; i < 10; i++) {
            vectorB[i] = vectorA[i];
        }
        Arrays.fill(vectorB, 10, 20, 0.5);

        for (int i = 0; i < vectorB.length; i++) {
            System.out.println(vectorB[i] + " ");
        }
        System.out.println(" ");
    }
}
    

