/*
 *  Escriba un programa que pida una frase o palabra y valide si la primera letra
de esa frase es una "A". Si la primera letra es una "A", se deberaÌ� de imprimir 
un mensaje por pantalla que diga "CORRECTO", en caso contrario, se debera"
imprimir "INCORRECTO". Nota: investigar la funcioÌ�n Substring y equals() de Java.
 */

package ejercicios.guia.pkg3;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Ejercicio4_Clase5 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una frase o palabra: ");
        String frase = input.nextLine();
 
        if (frase.substring(0, 1).equalsIgnoreCase("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
