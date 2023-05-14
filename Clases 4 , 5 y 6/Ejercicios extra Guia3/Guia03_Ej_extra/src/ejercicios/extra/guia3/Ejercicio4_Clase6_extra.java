/*
 * Elaborar un algoritmo en el cuÃ¡l se ingrese un nÃºmero entre 1 y 10 y
 se muestre su equivalente en romano.
 */
package ejercicios.extra.guia3;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Ejercicio4_Clase6_extra {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingrese un número entre 1 y 10");
            num = leer.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Su equivalente en números romanos es: I");
                    break;
                case 2:
                    System.out.println("Su equivalente en números romanos es: II");
                    break;
                case 3:
                    System.out.println("Su equivalente en números romanos es: III");
                    break;
                case 4:
                    System.out.println("Su equivalente en números romanos es: IV");
                    break;
                case 5:
                    System.out.println("Su equivalente en números romanos es: V");
                    break;
                case 6:
                    System.out.println("Su equivalente en números romanos es: VI");
                    break;
                case 7:
                    System.out.println("Su equivalente en númeroa romanos es: VII");
                    break;
                case 8:
                    System.out.println("Su equivalente en números romanos es: VIII");
                    break;
                case 9:
                    System.out.println("Su equivalente en números romanos es: IX");
                    break;
                case 10:
                    System.out.println("Su equivalente en números romanos es: X");
                    break;

                default:
                    System.out.println("El número no está dentro del rango");;
            }
        } while (num < 1 || num > 10);

    }

}
