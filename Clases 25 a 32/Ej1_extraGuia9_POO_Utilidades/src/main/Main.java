/*
1-Crea una clase en Java donde declares una variable de tipo array de Strings que 
contenga los doce meses del año, en minúsculas. A continuación, declara una variable 
mesSecreto de tipo String, y hazla igual a un elemento del array 
(por ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. 
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a 
intentar adivinar el mes secreto.  Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!

 */
package main;

import java.util.Scanner;

/**
 *
 * @author Max
 */

public class Main {
    
    public static void main(String[] args) {
        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = mes[6];
        Scanner input = new Scanner(System.in);
        System.out.println("Adivine el mes secreto");
        System.out.println("-------------------------------");
        System.out.println("Introduzca el nombre del mes en minúsculas: ");
        String intento = input.nextLine();
        
        while (!intento.equals(mesSecreto)) {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            intento = input.nextLine();
        }
        System.out.println("¡Ha acertado!");
    }
}

