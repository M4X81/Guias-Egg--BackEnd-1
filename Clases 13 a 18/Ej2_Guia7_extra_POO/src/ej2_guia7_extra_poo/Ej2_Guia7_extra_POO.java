/*
2-Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus 
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos 
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa 
en los atributos del objeto. Después, a través de otro método calcular y devolver 
la distancia que existe entre los dos puntos que existen en la clase Puntos.
 */
package ej2_guia7_extra_poo;

import ej2_guia7_extra_poo.Puntos.Puntos;

/**
 *
 * @author Meli
 */
public class Ej2_Guia7_extra_POO {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Puntos puntos = new Puntos();
        puntos.crearPuntos();
        double distancia = puntos.calcularDistancia();
        System.out.println("La distancia entre los dos puntos es: " + distancia);
    }
    
}
