/*
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector
de tamaño N, con los valores ingresados por el usuario.
 */
package ej_extra_guia5;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Eje1_extra_Cl10 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector ");
        int num = input.nextInt();
        int sumas=0;
        System.out.println("A continuacion ingrese los " + num + " numeros para el vector");
        for (int i = 0; i < num; i++) {
            System.out.println("ingrese el numero para la ubicacion " + (i+1));
            int num2 = input.nextInt();
            sumas += num2;
            
        }
        System.out.println("La suma de los nmeros ingresados es de : " + sumas);
    }
}
