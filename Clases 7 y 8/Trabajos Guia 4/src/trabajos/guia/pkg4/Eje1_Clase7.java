/**
 * Crea una aplicación que le pida dos números al usuario y este pueda
 * elegir entre sumar, restar, multiplicar y dividir. La aplicación debe
 * tener una función para cada operación matemática y deben devolver sus
 * resultados para imprimirlos en el main.
 */
package trabajos.guia.pkg4;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Eje1_Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1, num2, opcion;
        System.out.print("Número 1: ");
        num1 = leer.nextInt();
        System.out.print("Número 2: ");
        num2 = leer.nextInt();
        String tecla;

        do {
            System.out.println("\nAhora elija la opción a realizar: "
                + "\n1) Sumar"
                + "\n2) Restar"
                + "\n3) Multiplicar"
                + "\n4) Dividir"
                + "\n5) Salir del menú");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("La suma es = " + suma(num1, num2));
                break;
            case 2:
                System.out.println("La resta es = " + resta(num1, num2));
                break;
            case 3:
                System.out.println("La multiplicación es = " + multiplicacion(num1, num2));
                break;
            case 4:
                System.out.println("La división es = " + division(num1, num2));
                break;
            default:
                System.out.println("Usted decidió salir");;
        }
            System.out.println("Presione cualquier tecla para continuar");
            
        tecla = leer.nextLine();
        leer.nextLine();
        } while (opcion != 5);
        
    }
    public static int suma(int num1, int num2) {
        int variableRetorno = num1 + num2;
        return variableRetorno;
    }
    
    public static int resta(int num1, int num2) {
        int variableRetorno = num1 - num2;
        return variableRetorno;
    }
    
    public static int multiplicacion(int num1, int num2) {
        int variableRetorno = num1 * num2;
        return variableRetorno;
    }
    
    public static double division(int num1, int num2) {
        double variableRetorno = num1 / num2;
        return variableRetorno;
    }

}
