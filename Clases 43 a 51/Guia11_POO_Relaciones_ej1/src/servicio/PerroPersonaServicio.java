/*
1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package servicio;

/**
 *
 * @author Max
 */
import entidad.Perro;
import entidad.Persona;
import java.util.Scanner;

public class PerroPersonaServicio {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre ");
        persona.setNombre(input.next());
        System.out.println("Ingrese apellido");
        persona.setApellido(input.next());
        System.out.println("Ingrese la edad");
        persona.setEdad(input.nextInt());
        System.out.println("Ingrese DNI");
        persona.setDni(input.nextInt());

        return persona;

    }

    public Perro crearPerro() {
        Perro perro = new Perro();
        System.out.println("Ingrese el nombre del perro");
        perro.setNombre(input.next());
        System.out.println("Ingrese raza");
        perro.setRaza(input.next());
        System.out.println("Ingrese edad del perro");
        perro.setEdad(input.nextInt());
        System.out.println("Ingrese tamaño(grande, mediano, chico)");
        perro.setTamanio(input.next());
        
        return perro;

    }
    
    
}
