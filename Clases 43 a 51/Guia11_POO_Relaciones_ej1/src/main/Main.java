/*
1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package main;

/**
 *
 * @author Max
 */
import entidad.Perro;
import entidad.Persona;
import servicio.PerroPersonaServicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        PerroPersonaServicio pServ = new PerroPersonaServicio();
        
        List<Persona> personas = new ArrayList();
        List<Perro> adoptarPerro = new ArrayList();

        System.out.println("A continuacion ingrese los datos de las 2 personas.");
        for (int i = 0; i < 2; i++) {
            personas.add(pServ.crearPersona());
        }

        System.out.println("");
        System.out.println("Ingrese los perros a adoptar");
        for (int i = 0; i < 2; i++) {
            adoptarPerro.add(pServ.crearPerro());
        }

        System.out.println("");
        for (Persona aux : personas) {
            System.out.println(aux.getNombre() + " " + aux.getApellido() + " seleccione que perro va a adoptar : ");
            for (Perro aux2 : adoptarPerro) {
                System.out.println("Nombre: " + aux2.getNombre() + " - Raza: " + aux2.getRaza());
            }
            String adoptable = input.next();

            int cont = 0;
            for (int i = 0; i < adoptarPerro.size(); i++) {
                if (adoptable.equalsIgnoreCase(adoptarPerro.get(i).getNombre())) {
                    aux.setPerro(adoptarPerro.get(i));
                    cont++;
                    adoptarPerro.remove(i);
                }
            }
            if (cont == 0) {
                System.out.println("No se ha adoptado un perro válido");
            }
        }

        System.out.println("");
        System.out.println("Las siguientes personas han adoptado: ");
        for (Persona aux : personas) {
            if (aux.getPerro() == null) {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " no ha adoptado a ningun perro");
            } else {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " a adoptado a " + aux.getPerro().getNombre() + " de raza " + aux.getPerro().getRaza());
            }

        }
    }

}
