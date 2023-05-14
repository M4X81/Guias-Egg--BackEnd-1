/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.extra.guia3;

/**
 *
 * @author Max
 */
public class Ejercicio2_Clase6_extras {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Declarar y asignar valores iniciales a las variables
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        System.out.println("Valores iniciales:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);

        // Intercambiar los valores entre las variables usando una variable auxiliar
        int auxiliar = B;
        B = C;
        C = A;
        A = D;
        D = auxiliar;

        // Mostrar los valores finales de las variables
        System.out.println("Valores finales:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);
    }
}
