/*
 EJERCICIO PERSONA
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package main;

import entidad.Dni;
import entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Dni dni = new Dni();
        Persona personas = new Persona();
        System.out.println("Ingrese nombre de la persona");
        personas.setNombre(input.nextLine());
        System.out.println("Ingrese apellido");
        personas.setApellido(input.nextLine());
        System.out.println("Ingrese serie del DNI");
        dni.setSerie(input.next().charAt(0));
        System.out.println("Ingrese numero del DNI");
        dni.setNumero(input.nextInt());
        System.out.println( personas.toString());
    }
}
