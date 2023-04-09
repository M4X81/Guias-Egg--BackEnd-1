/*
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
a medida que el usuario las va ingresando, construya una “sopa de letras para niños” 
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden 
horizontal en una fila que será seleccionada de manera aleatoria. Una vez 
concluida la ubicación de las palabras, rellene los espacios no utilizados 
con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java substring(), Length() y Math.random().
 */
package ej_extra_guia5;


import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Eje6_extra_Cl11 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        char[][] sopa = new char[20][20];

        // Solicitar las palabras
        String[] palabras = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la palabra " + (i+1) + ": ");
            palabras[i] = input.nextLine().toUpperCase();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 caracteres.");
                System.out.print("Ingrese la palabra " + (i+1) + ": ");
                palabras[i] = input.nextLine().toUpperCase();
            }
        }

        // Seleccionar aleatoriamente una fila y columna para colocar las palabras
        int fila = (int) (Math.random() * 20);
        int col = (int) (Math.random() * (20 - palabras[0].length())); // Se asegura que la palabra quepa en la fila

        // Colocar las palabras en la fila seleccionada
        for (String palabra : palabras) {
            int offset = (int) (Math.random() * (20 - palabra.length() - col)); // Se asegura que la palabra quepa en la fila
            for (int i = 0; i < palabra.length(); i++) {
                char letra = palabra.charAt(i);
                if (sopa[fila][col+offset+i] != 0 && sopa[fila][col+offset+i] != letra) {
                    System.out.println("No se puede colocar la palabra " + palabra + ".");
                    System.out.println("Por favor, ingrese otra palabra.");
                    i = palabra.length(); // Salir del ciclo interno
                    col = (int) (Math.random() * (20 - palabra.length())); // Seleccionar una nueva posición
                    offset = (int) (Math.random() * (20 - palabra.length() - col)); // Calcular un nuevo offset
                    palabra = ""; // Borrar la palabra
                } else {
                    sopa[fila][col+offset+i] = letra;
                }
            }
            col += offset + palabra.length() + 1; // Avanzar a la siguiente posición disponible
        }

        // Rellenar los espacios vacíos con números aleatorios del 0 al 9
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                if (sopa[i][j] == 0) {
                    sopa[i][j] = (char) ((int) (Math.random() * 10) + '0');
                }
            }
        }

        // Imprimir la sopa de letras
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}

