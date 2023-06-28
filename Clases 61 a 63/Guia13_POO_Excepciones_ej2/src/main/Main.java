/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para 
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera 
de rango)
 */
package main;

import entity.Persona;

/**
 *
 * @author Max
 */
public class Main {

    public static void main(String[] args) {

        Persona p1 = new Persona("Juan", 25, 'H', 75.5, 1.75);
        Persona p2 = new Persona("María", 30, 'M', 62.0, 1.60);
        Persona p3 = new Persona("Carlos", 17, 'H', 68.3, 1.80);
        Persona p4 = new Persona("Laura", 22, 'M', 55.7, 1.68);
       
        Persona[] personas = {p1, p2, p3, p4};
        try {
            for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[3]);
        }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Se produjo un error en relacion al tamaño del arreglo: Fuera de rango... ");
        }
        
    }
}
