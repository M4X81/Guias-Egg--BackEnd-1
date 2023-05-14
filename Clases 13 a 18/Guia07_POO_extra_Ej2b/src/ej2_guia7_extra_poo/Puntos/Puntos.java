/*
2-Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus 
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos 
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa 
en los atributos del objeto. Después, a través de otro método calcular y devolver 
la distancia que existe entre los dos puntos que existen en la clase Puntos.
 */
package ej2_guia7_extra_poo.Puntos;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Puntos {

    private double x1, y1, x2, y2;

    public void crearPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas del primer punto(x1,y1): ");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        System.out.println("Ingrese las coordenadas del segundo punto(x2,y2): ");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
    }

    public double calcularDistancia() {
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
    }

}

