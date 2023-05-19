/*
4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package servicio;

import utilidades.Comparadores;
import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class PeliculaServicio {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> pelicula = new ArrayList();
    /*
    En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
     */
    public void cargarPeliculas() {
        String aux;
        do {
            System.out.println("Ingrese el titulo de la pelicula");
            String titulo = input.next();
            System.out.println("Ingrese el director.");
            String director = input.next();
            System.out.println("Ingrese la duracion, en horas");
            double horas = input.nextDouble();
            
            Pelicula peli = new Pelicula(titulo, director, horas);
            pelicula.add(peli);
            System.out.println("Desea cargar otra pelicula? : S/N");
            aux = input.next();
            
            while (!aux.equalsIgnoreCase("S") && !aux.equalsIgnoreCase("N")) {
                System.out.println("Ingrese una opcion valida");
                System.out.println("Desea cargar otra pelicula? : S/N");
                aux = input.next();
            }
        } while (aux.equalsIgnoreCase("S"));

    }
    //• Mostrar en pantalla todas las películas.

    public void mostrarPelicula() {
        System.out.println("Las peliculas son: ");
        for (Pelicula var : pelicula) {
            System.out.println(var);
        }
    }
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.

    public void mayorDuracion() {
        Iterator<Pelicula> it = pelicula.iterator();
        while (it.hasNext()) {
            Pelicula aux = it.next();
            if (aux.getDuracion() > 1) {
                System.out.println("Las peliculas con mas de una hora de duracion son : " + aux.getNombre());
            }
        }
    }
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.

    public void mayorAMenor() {
        Collections.sort(pelicula, Comparadores.ordenarDuracion);
        Collections.reverse(pelicula);
        for (Pelicula aux : pelicula) {
            System.out.println(aux.getDuracion());
        }
    }
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//pantalla.

    public void menorAmayor() {
        Collections.sort(pelicula, Comparadores.ordenarDuracion);
        for (Pelicula aux : pelicula) {
            System.out.println(aux.getDuracion());
        }
    }
//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.

    public void ordenTitulo() {
        Collections.sort(pelicula, Comparadores.ordenarNombre);
        for (Pelicula aux : pelicula) {
            System.out.println(aux.getNombre());
        }
    }
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

    public void ordenDirector() {
        Collections.sort(pelicula, Comparadores.ordenarDirector);
        for (Pelicula aux : pelicula) {
            System.out.println(aux.getDirector());
        }
    }
}
