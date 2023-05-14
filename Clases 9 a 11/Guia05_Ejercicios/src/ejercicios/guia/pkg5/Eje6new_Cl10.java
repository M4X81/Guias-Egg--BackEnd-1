package ejercicios.guia.pkg5;

/*
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear 
un programa que permita introducir un cuadrado por teclado y determine si este 
cuadrado es mágico o no. El programa deberá comprobar que los números introducidos 
son correctos, es decir, están entre el 1 y el 9.
 */

/**
 *
 * @author Max
 */
public class Eje6new_Cl10 {
    public static void main(String[] args) {
        boolean noes = true;
        int[][] matriz = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }

        int comparador = 0;

        for (int i = 0; i < 3; i++) {
            comparador = comparador + matriz[0][i];
        }

        int auxiliar = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                auxiliar = auxiliar + matriz[i][j];
            }
            System.out.println("Horizontales: " + auxiliar);
            if (auxiliar == comparador) {
                auxiliar = 0;

            } else {
                noes = false;
                break;
            }

        }
        if (noes) {
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    auxiliar = auxiliar + matriz[i][j];
                }
                System.out.println("Verticales: " + auxiliar);
                if (auxiliar == comparador) {
                    auxiliar = 0;

                } else {
                    noes = false;
                    break;
                }

            }
        }
        auxiliar = 0;
        if (noes) {
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    if (j == i) {
                        auxiliar = auxiliar + matriz[i][j];
                    }
                }
            }
            System.out.println("Diag : " + auxiliar);
            if (auxiliar == comparador) {
                auxiliar = 0;
            } else {
                noes = false;
            }
        }
        auxiliar = 0;
        if (noes) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == j) {
                        auxiliar = auxiliar + matriz[i][j];
                    }
                }
            }
            System.out.println("Diag /: " + auxiliar);
            if (auxiliar == comparador) {
                auxiliar = 0;
            } else {
                noes = false;
            }
        }
        System.out.println("Magica es" + noes);
    }
}
    
