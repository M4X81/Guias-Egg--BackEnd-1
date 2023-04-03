/*
 * Ejercicio 9
Escriba un programa que lea 20 nÃºmeros. Si el nÃºmero leÃ­do es igual a 
cero se debe salir del bucle y mostrar el mensaje "Se capturÃ³ el numero 
cero".  El programa deberÃ¡ calcular y mostrar el resultado de la suma de los 
nÃºmeros leÃ­dos, pero si el nÃºmero es negativo no debe sumarse. Nota: recordar 
el uso de la sentencia break.
 */
package material_de_trabajoclase4;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Trabajo9_Clase4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int suma = 0;
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese un número: ");
            int numero = input.nextInt();
            
            if (numero == 0) {
                System.out.println("Se capturó el número cero.");
                break;
            } else if (numero > 0) {
                suma += numero;
            }
        }
        
        System.out.println("La suma de los números ingresados es: " + suma);
    }
    
}
