/*
1-Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, 
Autor, Número de páginas, y un constructor con todos los atributos pasados por 
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo 
los datos al usuario y luego informar mediante otro método el número de ISBN, el 
título, el autor del libro y el número de páginas.
 */
package ej1_guia7poo;

import ej1_guia7poo.Libro.Libro;



/**
 *
 * @author Meli
 */
public class Ejercicio_1_Cl13_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1= new Libro();
        
        libro1.cargarLibro();
        libro1.mostrarLibro();
    }
    
}