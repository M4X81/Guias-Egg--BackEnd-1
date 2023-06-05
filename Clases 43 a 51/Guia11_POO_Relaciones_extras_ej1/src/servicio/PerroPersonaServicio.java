/*
1. Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package servicio;

import entidad.Perro;
import entidad.Persona;
import enumeraciones.Raza;
import enumeraciones.Tamanio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class PerroPersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Persona> personas = new ArrayList();
    List<Perro> enAdopcion = new ArrayList();
    String[] nombresDePerros = {"Cacho", "Cholo", "Chacho", "Chicho", "Checho"};
    Raza[] razas = enumeraciones.Raza.values();
    Tamanio[] tamanios = enumeraciones.Tamanio.values();

    public void crearPerros() {
        Raza raza;
        Tamanio tamanio;
        int edad, randomRaza, randomTamanio;
        for (String nombre : nombresDePerros) {
            randomRaza = (int) (Math.random() * razas.length);
            raza = razas[randomRaza];
            randomTamanio = (int) (Math.random() * tamanios.length);
            tamanio = tamanios[randomTamanio];
            edad = (int) (Math.random() * 20);
            Perro p = new Perro(nombre, raza, edad, tamanio);
            enAdopcion.add(p);
        }
    }

    public void listarPerros() {
        for (Perro p : enAdopcion) {
            System.out.println(p.toString());
        }
    }

    public void crearPersonas() {
        String nombre, apellido;
        int edad, documento;
        do {
            System.out.println("Ingrese Nombre y Apellido");
            nombre = leer.next();
            apellido = leer.next();
            edad = (int) (Math.random() * 100);
            documento = (int) (Math.random() * 10000000);
            Persona p = new Persona(nombre, apellido, edad, documento, null);
            personas.add(p);
            System.out.println("Desea ingresar otra Persona? (S=Si)");
        } while (leer.next().equalsIgnoreCase("S"));
    }

    public void listarPersonas() {
        for (Persona p : personas) {
            System.out.println(p.toString());
        }
    }

//    public void adoptarPerro() {
//       
//        String aux, aux2;
//        ArrayList<Perro> listaAuxPerro = new ArrayList();
//        for (Persona per : personas) {
//             
//            do {
//                Iterator it = enAdopcion.iterator();
//                listarPerros();
//                System.out.println(per.getNombre() + " Ingrese el perro que desea adoptar");
//                aux = leer.next();
//                while (it.hasNext()) {
//                    Perro nextP = (Perro) it.next();
//
//                    if (nextP.getNombre().equalsIgnoreCase(aux)) {
//                        listaAuxPerro.add(nextP);
//                        per.setMascota(listaAuxPerro);
//                        it.remove();   
//                    }
//                    
//                }
//                listarPersonas();
//                System.out.println("Desea adoptar otro? (S/si)");
//                aux2 = leer.next();
//               
//            } while (aux2.equalsIgnoreCase("S"));               
//        }
//    }
    public void adoptarPerro() {
        String aux, aux2;

        for (Persona per : personas) {
            //meto el Arraylist dentro del for xq quedaba cargado y x eso asignaba la misma lista a todas las personas
            //y el iterator lo vuelvo a dejar fuera del do
            ArrayList<Perro> listaAuxPerro = new ArrayList<>();
            Iterator it = enAdopcion.iterator();

            do {
                listarPerros();
                System.out.println(per.getNombre() + " Ingrese el perro que desea adoptar");
                aux = leer.next();

                while (it.hasNext()) {
                    Perro nextP = (Perro) it.next();
                    if (nextP.getNombre().equalsIgnoreCase(aux)) {
                        listaAuxPerro.add(nextP);
                        it.remove();
                        break;
                        //el per.setMascota lo dejo fuera para que cargue una vez q termina el ciclo
                    }
                }

                System.out.println("Desea adoptar otro? (S/si)");
                aux2 = leer.next();
            } while (aux2.equalsIgnoreCase("S"));

            // Faltaba verificar si la lista mascota era null y crear una nueva instancia si es necesario
            //y recien ahi setear la mascota a la persona
            if (per.getMascota() == null) {
                per.setMascota(new ArrayList<>());
            }
            per.getMascota().addAll(listaAuxPerro);
            //con este cargo toda la lista de mascotas de la aux a la del constructor
        }
        /*
        si voy cargando en orden las mascotas, independientemente de cuantas asigne a cada persona anda perfecto
        cuando altero el orden de las mascotas al asignarlas se rompe...despues revisare
        */
    }

    public void mostrarPersona() {
        for (Persona pers : personas) {
            System.out.println("Lista de personas con sus mascotas");
            System.out.println(pers.getNombre() + pers.getApellido() + pers.getMascota());
        }
    }
    public void listaMascotasNoAdoptadas(){
        
        for (Perro perros : enAdopcion) {
            if (perros.getNombre()==null) {
                System.out.println("Todas las mascotas han sido adoptadas");
            }else{
               System.out.println("Las siguientes mascotas no han sido adoptadas...");
            System.out.println(perros.getNombre()); 
            } 
        }
    }
}
