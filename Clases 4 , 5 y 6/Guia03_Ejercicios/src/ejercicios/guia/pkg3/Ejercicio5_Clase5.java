/*
 * 5-Escriba un programa en el cual se ingrese un valor liÌ�mite positivo, y a 
continuacioÌ�n solicite nuÌ�meros al usuario hasta que la suma de los nuÌ�meros 
introducidos supere el liÌ�mite inicial.
 */
package ejercicios.guia.pkg3;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Ejercicio5_Clase5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un valor límite positivo: ");
        int limite = input.nextInt();

        int suma = 0;
        int contador = 0;

        while (suma <= limite) {
            System.out.print("Ingrese un número: ");
            int numero = input.nextInt();
            suma += numero;
            // es lo mismo que suma = suma + numero;
            contador++;
        }

        System.out.println("Se ingresaron " + contador + " números para superar el límite.");
        input.close();
    }
}
