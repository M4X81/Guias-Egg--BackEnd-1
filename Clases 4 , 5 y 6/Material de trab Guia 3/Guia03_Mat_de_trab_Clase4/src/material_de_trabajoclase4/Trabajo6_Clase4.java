/*
 * Ejercicio 6
Implementar un programa que le pida dos numeros enteros al usuario y determine 
si ambos o alguno de ellos es mayor a 25.
 */
package material_de_trabajoclase4;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Trabajo6_Clase4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese un número entero");
        num1 = input.nextInt();
        System.out.println("Ingrese un número entero");
        num2 = input.nextInt();
        if(num1 > 25 && num2 > 25){
            System.out.println("Ambos números ingresados son mayores a 25"); 
        }
        else if(num1 > 25 || num2 > 25){
             System.out.println("Al menos uno de los números ingresados son mayores a 25");
                }
        else{
            System.out.println("Ninguno de los números ingresados en mayor a 25"); 
                }  
                
    }
    
}

