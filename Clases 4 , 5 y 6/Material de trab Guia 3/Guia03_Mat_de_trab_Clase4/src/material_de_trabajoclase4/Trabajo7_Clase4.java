/*
 * Ejercicio 7
Considera que estás desarrollando una web para una empresa que fabrica motores 
(suponemos que se trata del tipo de motor de una bomba para mover fluidos). 
Definir una variable tipoMotor y permitir que el usuario ingrese un valor
entre 1 y 4. El programa debe mostrar lo siguiente:
oSi el tipo de motor es 1, mostrar un mensaje indicando -La bomba es una bomba de agua-.
oSi el tipo de motor es 2, mostrar un mensaje indicando -La bomba es una bomba de gasolina-.
oSi el tipo de motor es 3, mostrar un mensaje indicando -La bomba es una bomba de hormigón-.
oSi el tipo de motor es 4, mostrar un mensaje indicando -La bomba es una bomba de pasta alimenticia-.
oSi no se cumple ninguno de los valores anteriores mostrar el mensaje 
-No existe un valor valido para tipo de bomba-
 */
package material_de_trabajoclase4;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Trabajo7_Clase4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int tipoMotor; 
        System.out.println("Ingrese un número entero entre 1 y 4 para seleccionar el tipo de motor que desea ver");
        System.out.println("");
        tipoMotor = input.nextInt();
                
        switch (tipoMotor) {
        	case 1:
           System.out.println("La bomba es una bomba de agua");
           break;

        	case 2:
           System.out.println("La bomba es una bomba de gasolina");
            break;
            	case 3:
           System.out.println("La bomba es una bomba de hormigón");
            break;
            	case 4:
           System.out.println("La bomba es una bomba de pasta alimenticia");
            break;

        	default:
           System.out.println("No existe un valor válido para tipo de bomba");
           
    	}
}
        
}
