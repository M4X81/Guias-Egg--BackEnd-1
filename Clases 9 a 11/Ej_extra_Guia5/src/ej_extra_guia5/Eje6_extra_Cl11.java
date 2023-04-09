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
        Scanner sc = new Scanner(System.in);

        // Leer las 5 palabras ingresadas por teclado
        String[] palabras = new String[5];
        for (int i = 0; i < palabras.length; i++) {
            String palabra;
            do {
                System.out.print("Ingrese la palabra #" + (i + 1) + " (mínimo 3 caracteres, máximo 5): ");
                palabra = sc.next();
            } while (palabra.length() < 3 || palabra.length() > 5);

            palabras[i] = palabra.toUpperCase(); // Convertir la palabra a mayúsculas antes de asignarla
        }

        // Crear una matriz de caracteres de tamaño 20x20
        char[][] matriz = new char[20][20];

        // Utilizar un ciclo for para asignar cada palabra a una posición aleatoria en una fila no usada previamente
        for (int i = 0; i < palabras.length; i++) {
            boolean posicionValida = false;
            while (!posicionValida) {
                // Generar una posición aleatoria para la fila y columna de la matriz
                int fila = (int) (Math.random() * 20);
                int columnaInicial = (int) (Math.random() * 15);

                // Verificar si la fila y columna aleatorias están disponibles para la palabra
                boolean filaYColumnaValidas = true;
                for (int j = 0; j < palabras[i].length(); j++) {
                    if (fila >= 20 || columnaInicial + j >= 20 || matriz[fila][columnaInicial + j] != '\u0000') {
                        filaYColumnaValidas = false;
                        break;
                    }
                }

                // Si la fila y columna están disponibles, asignar la palabra a la fila y columna y marcar la fila como usada
                if (filaYColumnaValidas) {
                    for (int j = 0; j < palabras[i].length(); j++) {
                        matriz[fila][columnaInicial + j] = palabras[i].charAt(j);
                    }
                    posicionValida = true;
                }
            }
        }

        // Completar los espacios vacíos con números aleatorios entre 0 y 9
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == '\u0000') {
                    int numeroAleatorio = (int) (Math.random() * 10);
                    matriz[i][j] = (char) (numeroAleatorio + '0');
                }
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

 

