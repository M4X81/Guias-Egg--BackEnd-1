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
package main;

import entidad.CantanteFamoso;
import java.util.ArrayList;
import servicio.CantanteFamosoServicio;

/**
 *
 * @author Max
 */
public class Main {
    public static void main(String[] args) {
        CantanteFamosoServicio cantanteFam = new CantanteFamosoServicio();
        ArrayList<CantanteFamoso> cantantes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            cantanteFam.crearCantante();  
        }
        cantanteFam.mostrarCantantes();
        System.out.println("Cargamos los 5 cantantes ya, ahora accederemos al menú.");
        
        
    }
}
