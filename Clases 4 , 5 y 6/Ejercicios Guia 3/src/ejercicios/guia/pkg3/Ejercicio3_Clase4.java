/*
 * 3-Realizar un programa que solo permita introducir solo frases o palabras 
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se 
deberaÌ� de imprimir un mensaje por pantalla que diga â€œCORRECTOâ€�, en caso 
contrario, se deberaÌ� imprimir â€œINCORRECTOâ€�. Nota: investigar la funcioÌ�n 
Lenght() en Java.
 */
package ejercicios.guia.pkg3;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Ejercicio3_Clase4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        System.out.print("Ingrese una palabra o frase de 8 caracteres: ");
        String palabra = input.nextLine();

        if (palabra.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
