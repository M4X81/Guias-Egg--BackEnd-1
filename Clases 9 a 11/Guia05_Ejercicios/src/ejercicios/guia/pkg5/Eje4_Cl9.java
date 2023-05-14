package ejercicios.guia.pkg5;


import java.util.Random;
import java.util.Scanner;

/*
 *Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota 
por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
/**
 *
 * @author Max
 */
public class Eje4_Cl9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[j][i] = aleatorio.nextInt(100) + 1;
                System.out.print(" " + matriz[j][i]);
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println(""); //Para separar visualmente en la consola
        System.out.println("");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + matriz[i][j]);   //Solo se cambia i con j de lugar para hacer la transpuesta
            }
            System.out.println("");
        }
    }
}
