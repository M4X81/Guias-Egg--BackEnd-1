
package utilidades;

import entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Max
 */
public class Comparadores {
      public static Comparator<Pelicula> ordenarDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDuracion().compareTo(p2.getDuracion());
        }
    };
     
     public static Comparator<Pelicula> ordenarNombre = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getNombre().compareTo(p2.getNombre());
        }
    };
    
     public static Comparator<Pelicula> ordenarDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };
}
