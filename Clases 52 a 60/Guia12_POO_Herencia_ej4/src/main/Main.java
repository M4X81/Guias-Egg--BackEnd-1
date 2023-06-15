/*
4. Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package main;

import entity.Circulo;
import entity.Rectangulo;

/**
 *
 * @author Max
 */
public class Main {

    public static void main(String[] args) {
        /*
        En el main se crearán las formas y se mostrará el
resultado final.
         */

        Circulo c1 = new Circulo(5);
        Rectangulo r1 = new Rectangulo(2d, 4d);
        System.out.println("El área del circulo es : " + c1.calcularArea());
        System.out.println("El perimetro del circulo es: " + c1.calcularPerimetro());
        System.out.println("--------------------------------");
        System.out.println("El área del rectangulo es : " + r1.calcularArea());
        System.out.println("El perimetro del rectangulo es: " + r1.calcularPerimetro());
    }
}
