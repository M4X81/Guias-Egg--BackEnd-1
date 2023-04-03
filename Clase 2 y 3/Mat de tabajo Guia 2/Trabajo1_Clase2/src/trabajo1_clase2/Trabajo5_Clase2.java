/*
 * 5-Escribir un programa que lea un numero entero por teclado y muestre por 
pantalla el doble, el triple y la raiz cuadrada de ese numero. 
Nota: investigar la funcion Math.sqrt().
 */
package trabajo1_clase2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Trabajo5_Clase2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero entero");
        num = input.nextInt();
        System.out.println("El doble del numero ingresado es : " + (num*2));
        System.out.println("El triple del numero ingresado es : " + (num*3));
        System.out.println("La raiz cuadrada del numero ingresado es : " + sqrt(num));
    }
    
}
