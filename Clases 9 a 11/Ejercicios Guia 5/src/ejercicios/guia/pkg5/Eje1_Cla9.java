/*
 * Realizar un algoritmo que llene un vector con los 100 primeros números enteros 
y los muestre por pantalla en orden descendente.
 */
package ejercicios.guia.pkg5;

/**
 *
 * @author Max
 */
public class Eje1_Cla9 {
    public static void main(String[] args) {
        int[] numeros = new int[100];        
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }
        // Mostrar los números por pantalla en orden descendente
        System.out.println("Números en orden descendente:");
        for (int i = 99; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
