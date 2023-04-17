/*
1-Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
Se deberá definir además dos constructores: uno vacío que inicializa el título y 
el autor a cadenas vacías y otro que reciba como parámetros el título y el autor 
de la canción. Se deberán además definir los métodos getters y setters correspondientes.
 */
package ej1_guia7_extra_poo.Cancion;

/**
 *
 * @author Meli
 */
public class Cancion {
    public String titulo;
    public String autor;
    //CONSTRUCTOR VACIO
    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    //getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
      public static Cancion getCancion1() {
        return new Cancion("Bohemian Rhapsody", "Queen");
    }

    public static Cancion getCancion2() {
        return new Cancion("Stairway to Heaven", "Led Zeppelin");
    }
    
}
