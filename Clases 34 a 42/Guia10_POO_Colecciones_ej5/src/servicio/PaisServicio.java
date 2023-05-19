/*
5. Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package servicio;

import entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class PaisServicio {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    HashSet<Pais> paisIngreso = new HashSet();

    public void crearPais() {
        Pais paises = new Pais();
        System.out.println("Ingrese el pais a guardar: ");
        paises.setPais(input.next());
        paisIngreso.add(paises);
    }

    /*
    El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. 
     */
    public void cargarPaises() {
        do {
            crearPais();
            System.out.println("Desea continuar guardando paises? (S=Si)");
            System.out.println("Presione cualquier tecla para salir.");
        } while (input.next().equalsIgnoreCase("S"));
        System.out.println("Usted ha finalizado la carga. Presione Enter para continuar...");
        if (!input.next().equalsIgnoreCase("S")) {
            System.out.println("Saliendo del programa, a continuacion se mostrara"
                    + " la lista de paises ingresados...");
            mostrarPaises();
        }
    }

    public void mostrarPaises() {
        System.out.println("Los paises cargados son los siguientes: ");
        for (Pais pais : paisIngreso) {
            System.out.println("- " + pais.getNombre());
        }
    }

    /*
    Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
     */
    public void mostrarOrdenados() {
        /*
        tengo q crear una Arraylist xq el conjunto no me lo ordena con el sort( debe ser x lo de los hash
         */
        ArrayList<Pais> listaPaises = new ArrayList<>(paisIngreso);
        Comparator<Pais> compararPaises = (Pais t, Pais t1) -> t.getNombre().compareTo(t1.getNombre());
        Collections.sort(listaPaises, compararPaises);

        System.out.println("Los paises ordenados alfabéticamente son:");
        for (Pais pais : listaPaises) {
            System.out.println("- " + pais.getNombre());
        }
    }

    /*
    Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
     */
    public void quitarPais() {
        Iterator<Pais> it = paisIngreso.iterator();
        boolean encontrada = false;
        System.out.println("Ingrese el pais a buscar en la lista: ");
        String buscaPais = input.next();
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(buscaPais)) {
                it.remove();
                encontrada = true;
                System.out.println(buscaPais +  " eliminado de la lista");
            }
        }
        if (!encontrada) {
            System.out.println("El pais " + buscaPais + " no se encuentra en la lista.");
        }
        System.out.println("Luego de la busqueda el listado es el Siguiente: ");
        mostrarOrdenados();
    }
}
