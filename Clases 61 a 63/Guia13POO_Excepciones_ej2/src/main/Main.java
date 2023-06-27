/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para 
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera 
de rango)
 */
package main;

import entity.Persona;
import java.util.ArrayList;

/**
 *
 * @author Max
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList();

        Persona p1 = new Persona("Juan", 25, 'H', 75.5, 1.75);
        personas.add(p1);
        Persona p2 = new Persona("María", 30, 'M', 62.0, 1.60);
        personas.add(p2);
        Persona p3 = new Persona("Carlos", 17, 'H', 68.3, 1.80);
        personas.add(p3);
        Persona p4 = new Persona("Laura", 22, 'M', 55.7, 1.68);
        personas.add(p4);
    }
}
