/*
5-Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre 
y una fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado, 
get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha 
de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la 
persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.

 */
package servicio;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class PersonaService {

    Persona persona = new Persona();
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    //Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
    //Retornar el objeto Persona creado.
    public Persona crearPersona(Persona persona) {

        System.out.println("Ingrese nombre de la persona ");
        persona.setNombre(input.nextLine());
        System.out.println("Ingrese fecha de nacimiento de " + persona.getNombre());
        System.out.println("Ingrese año: ");
        int anio = input.nextInt();
        System.out.println("Ingrese mes: ");
        int mes = input.nextInt() - 1;
        System.out.println("Ingrese día: ");
        int dia = input.nextInt();

        Date fechaNacimiento = new Date(anio - 1900, mes, dia);
        persona.setFechaDeNacimiento(fechaNacimiento);

        return persona;
    }

    //Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha 
    //de nacimiento y la fecha actual.
    public int calcularEdad(Persona persona) {
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - persona.getFechaDeNacimiento().getYear();
        return edad;
    }
    //Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la 
    //persona es menor que la edad consultada o false en caso contrario.

    public boolean menorQue(Persona persona1, Persona persona2) {
    int edadPersona1 = calcularEdad(persona1);
    int edadPersona2 = calcularEdad(persona2);
    return edadPersona1 > edadPersona2;
}
    //Método mostrarPersona que muestra la información de la persona deseada.

    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaDeNacimiento());
        System.out.println("Edad: " + calcularEdad(persona));
    }

}
