/*
1-Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
Se deberá definir además dos constructores: uno vacío que inicializa el título y 
el autor a cadenas vacías y otro que reciba como parámetros el título y el autor 
de la canción. Se deberán además definir los métodos getters y setters correspondientes.
 */
package ej1_guia7_extra_poo;

import ej1_guia7_extra_poo.Cancion.Cancion;
import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ej1_Guia7_Extra_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion("Cosas que pasan", "Jose Larralde");
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese titulo de la cancion 1");
        String titulo1 = input.nextLine();
        System.out.println("Ingrese autor de la cancion 1");
        String autor1 = input.nextLine();
        cancion1.setTitulo(titulo1);
        cancion1.setAutor(autor1);
        System.out.println("Canción ingresada: " + cancion1.getTitulo() + " - " + cancion1.getAutor());
        System.out.println("La cancion 2 es : " + cancion2.getTitulo() + " - " + cancion2.getAutor());
    }
    
}
