/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado 
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo 
con los datos del Rectángulo dados por el usuario. También incluirá un método para 
calcular la superficie del rectángulo y un método para calcular el perímetro del 
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante 
asteriscos usando la base y la altura. Se deberán además definir los métodos 
getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ej4_guia7_poo;

import ej4_guia7_poo.Rectangulo.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ej4_Guia7_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        Rectangulo rectangulo = new Rectangulo(base, altura);

        System.out.println("Superficie del rectángulo: " + rectangulo.calcularSuperficie());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

        System.out.println("Dibujo del rectángulo:");
        rectangulo.dibujarRectangulo();
    }
}
