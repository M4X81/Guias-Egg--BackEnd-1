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
package main;

import entidad.Persona;
import java.util.Date;
import servicio.PersonaService;

/**
 *
 * @author Max
 */
public class Main {

    public static void main(String[] args) {

        PersonaService personaService = new PersonaService();
        Persona persona = new Persona();
        personaService.crearPersona(persona);
        personaService.mostrarPersona(persona);
        
        Persona persona2 = new Persona();
        persona2.setNombre("Juan");
        persona2.setFechaDeNacimiento(new Date(1990 - 1900, 5, 15));
        
        personaService.mostrarPersona(persona2);
        System.out.println("Es " + persona2.getNombre() + " menor que "  +  persona.getNombre() + " ? "); 
        System.out.println(personaService.menorQue(persona, persona2)); 
               
        
       
      
    }
}



