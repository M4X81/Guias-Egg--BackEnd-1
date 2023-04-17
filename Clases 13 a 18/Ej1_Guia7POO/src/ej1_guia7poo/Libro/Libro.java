/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo 
los datos al usuario y luego informar mediante otro método el número de ISBN, 
el título, el autor del libro y el número de páginas.
 */
package ej1_guia7poo.Libro;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Libro {

    //Carga de atributos
    public int ISBN;
    public String titulo;
    public String autor;
    public int numeroPaginas;

    //Constructor vacio
    public Libro() {
    }
    //Constructor con argumentos

    public Libro(int ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ISBN del libro: ");
        this.ISBN = scanner.nextInt();
        System.out.println("Ingrese el título del libro: ");
        scanner.nextLine(); //repito xq no me toma el escaner
        this.titulo = scanner.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        this.autor = scanner.nextLine();
        System.out.println("Ingrese el número de páginas del libro: ");
        this.numeroPaginas = scanner.nextInt();
    }
    
    public void mostrarLibro(){
        System.out.println("El libro solicitado es el siguiente :");
        System.out.println("ISBN : " + this.ISBN);
        System.out.println("El titulo es: " + this.titulo);
        System.out.println("El autor del libro es : " +this.autor);
        System.out.println("El número de páginas del libro es : " +this.numeroPaginas);
    }
}