/*
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
y le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
se encuentra el numero y si se encuentra repetido
 */
package ejercicios.guia.pkg5;
import java.util.Scanner;
/**
 *
 * @author Max
 */
public class Eje2_Cla9 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
         System.out.println("ingrese el tamaño del vector");
         int n = leer.nextInt();
         int[] vector = new int[n];
         for (int i = 0; i < n; i++) {
            vector[i]= (int) (Math.random() * 100)+1 ;
            System.out.print(vector[i] + " ");
        }
         System.out.println(" ");
         System.out.println("ingrese el numero a buscar");
        int recorrido= leer.nextInt();
        int cont=0;
        for (int i = 0; i < n; i++) {
            if (vector[i]== recorrido) {
            cont++;
                System.out.println("se encontro el numero en el lugar "+(i));
            
        }   
        }
        System.out.println("se encontro las siguientes veces "+cont);
         
     
    }
    
}
   
