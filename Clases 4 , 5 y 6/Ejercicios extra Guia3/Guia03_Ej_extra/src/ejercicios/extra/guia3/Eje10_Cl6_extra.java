/*
 * Realice un programa para que el usuario adivine el resultado de una 
multiplicación entre dos números generados aleatoriamente entre 0 y 10. El programa 
debe indicar al usuario si su respuesta es o no correcta. En caso que la respuesta 
sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. 
Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.

 */
package ejercicios.extra.guia3;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Eje10_Cl6_extra {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 10);
       //System.out.println("" + numeroAleatorio);
        int num;
        System.out.println("Ingrese numero entero entre 1 y 10 ");
        num = input.nextInt();
        while (num !=numeroAleatorio ) {
           System.out.println("El número ingresado no es el correcto");
           num = input.nextInt();
        }if (num == numeroAleatorio) {
            System.out.println("Acertaste, el número era " + numeroAleatorio);
        }

    }
}
