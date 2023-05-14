/*
 * 2-Crear un programa que pida una frase y si esa frase es igual a â€œeurekaâ€� el 
programa pondrÃ¡ un mensaje de Correcto, sino mostrarÃ¡ un mensaje de Incorrecto. 
Nota: investigar la funciÃ³n equals() en Java.
 */
package ejercicios.guia.pkg3;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Ejercicio2_Clase4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase = "eureka";
        System.out.println("Ingrese la frase correcta");
        String frase2 = input.nextLine();
        if(frase.equals(frase2)){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
                
        
                
    }
}
