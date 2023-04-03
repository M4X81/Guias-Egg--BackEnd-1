/*
 * 8- Escriba un programa que lea nÃºmeros enteros. Si el nÃºmero es mÃºltiplo de 
cinco debe detener la lectura y mostrar la cantidad de nÃºmeros leÃ­dos, la 
cantidad de nÃºmeros pares y la cantidad de nÃºmeros impares. Al igual que en el 
ejercicio anterior los nÃºmeros negativos no deben sumarse. Nota: recordar el 
uso de la sentencia break.
 */
package ejercicios.extra.guia3;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Ejercicio8_Clase_extra {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int num, contador = 0, pares = 0, impares = 0;
        while (true) {
            System.out.print("Ingrese un nÃºmero entero: ");
            num = input.nextInt();
            if (num % 5 == 0) {
                break;
            }
            if (num < 0) {
                continue;
            }
            contador++;
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Cantidad de nÃºmeros leÃ­dos: " + contador);
        System.out.println("Cantidad de nÃºmeros pares: " + pares);
        System.out.println("Cantidad de nÃºmeros impares: " + impares);
    }
}
