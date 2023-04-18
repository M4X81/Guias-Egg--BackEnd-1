/*
6-Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método 
"calcular_area" que calcule y devuelva el área del rectángulo. Luego crea un objeto 
"rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.
 */
package ej6_guia7_extra_poo;

import ej6_guia7_extra_poo.Rectangulo.Rectangulo;

/**
 *
 * @author Max
 */
public class Ej6_Guia7_extra_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo(0, 0);
        rectangulo.calcular_area();

        Rectangulo rectangulo1 = new Rectangulo(4, 6);
        int area = rectangulo1.getLado1() * rectangulo1.getLado2();
        System.out.println("El área del rectángulo de lados 4 y 6 es " + area);

    }

}
