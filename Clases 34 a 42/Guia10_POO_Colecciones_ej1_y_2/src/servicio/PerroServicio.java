/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package servicio;

import entidad.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class PerroServicio {

    ArrayList<Perro> Raza = new ArrayList();
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void crearPerro() {
        Perro perros = new Perro();
        System.out.println("Ingrese la raza del perro a guardar: ");
        perros.setRaza(input.next());
        Raza.add(perros);
    }

    public void cargarPerros() {
        do {
            crearPerro();
            System.out.println("Desea continuar? (S=Si)");
        } while (input.next().equalsIgnoreCase("S"));
    }

    public void mostrarPerros() {
        for (Perro perro : Raza) {
            System.out.println("Las razas ingresadas son : " + perro.getRaza());
        }
        /*
        puede ser cualquiera de ambos:
         Raza.forEach((perro) -> {
            System.out.println("Las razas ingresadas son : " + perro.getRaza());
        });
         */
    }

    /*
    al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada.Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
     */
    public void seekNDestroyPerro() {
        Iterator<Perro> it = Raza.iterator();
        boolean encontrada = false;
        System.out.println("Ingrese el perro a buscar en la lista: ");
        String seekPerro = input.next();
        while (it.hasNext()) {
            if (it.next().getRaza().equalsIgnoreCase(seekPerro)) {
                it.remove();
                encontrada = true;
                System.out.println("Raza quitada de la lista");
            }
        }
        if (!encontrada) {
            System.out.println("La raza solicitada no se encuentra en la lista.");
        }
    }

    public void listaPerrosOrdenada() {

        Comparator<Perro> compararRaza = (Perro t, Perro t1) -> t.getRaza().compareTo(t1.getRaza());
        Collections.sort(Raza, compararRaza);
        System.out.println("La lista ordenada es la siguiente:");
        for (Perro perro : Raza) {

            System.out.println(perro.getRaza());
        }

        /*
         o asi:
        
           Raza.forEach((_item) -> {
             System.out.println("La lista ordenada es la siguiente : " + Raza);
        }); 
         */
    }

}
