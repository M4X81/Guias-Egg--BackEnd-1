/*
2. Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
 */
package servicio;

import entidad.CantanteFamoso;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class CantanteFamosoServicio {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, String> musicos = new HashMap();

    public void crearCantante() {
        CantanteFamoso cantante = new CantanteFamoso();
        System.out.println("Ingrese nombre del artista.");
        cantante.setNombre(input.nextLine());
        System.out.println("Ingrese el nombre del disco con más ventas");
        cantante.setDiscoConMasVentas(input.nextLine());
        musicos.put(cantante.getNombre(), cantante.getDiscoConMasVentas());
    }

    public void mostrarCantantes() {
        for (Map.Entry<String, String> entry : musicos.entrySet()) {
            System.out.println("Artista: " + entry.getKey());
            System.out.println("Disco con más ventas: " + entry.getValue());
        }
    }
}
