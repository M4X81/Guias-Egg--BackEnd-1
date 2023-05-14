/*
* Diseñe una función que pida el nombre y la edad de N personas e
* imprima los datos de las personas ingresadas por teclado e indique si
* son mayores o menores de edad. Después de cada persona, el programa
* debe preguntarle al usuario si quiere seguir mostrando personas y
* frenar cuando el usuario ingrese la palabra “No”.
*/

package trabajos.guia.pkg4;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Eje2_Cl8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        int edad, num;
        String nombre = "a";
        boolean respuesta;

        num = 0;
        edad = 0;
        do {
            respuesta = funcionGeneral(nombre, edad);
            if (respuesta == true) {
            } else if (respuesta == false) {
                num++;
            }

        } while (num == 0);

    }

    public static boolean funcionGeneral(String nombre, int edad) {
        String cadena;
        Scanner leer = new Scanner(System.in);

        System.out.print("Nombre: ");
        nombre = leer.nextLine();
        System.out.println("");

        System.out.print("Edad: ");
        edad = leer.nextInt();
        System.out.println("");

        if (edad >= 18) {
            cadena = "Sí";
        } else {
            cadena = "No";
        }
        System.out.println("Nombre: " + nombre
                + "\nEdad: " + edad
                + "\nEs mayor?: " + cadena);

        System.out.println("Desea seguir mostrando personas?(SI/NO)");
        leer.nextLine();
        String respuesta = leer.nextLine();

        respuesta = respuesta.toUpperCase();
        boolean confirmacion;
        confirmacion = true;
        if (respuesta.equals("NO")) {
            confirmacion = false;
        }
        return confirmacion;
    }
}

