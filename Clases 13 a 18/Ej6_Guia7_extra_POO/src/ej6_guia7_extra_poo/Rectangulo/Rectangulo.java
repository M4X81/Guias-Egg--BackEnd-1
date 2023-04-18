/*
6-Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método 
"calcular_area" que calcule y devuelva el área del rectángulo. Luego crea un objeto 
"rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.
 */
package ej6_guia7_extra_poo.Rectangulo;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Rectangulo {

    private int lado1;
    private int lado2;

    //constructor
    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //getter y setter
    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    //calculo
    public void calcular_area() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese tamaño de  la base");
        this.lado1 = input.nextInt();
        System.out.println("Ingrese tamaño de  la altura");
        this.lado2 = input.nextInt();
        int area = lado1 * lado2;
        System.out.println("El area del rectangulo ingresado es :" + area);
        //return area;
    }

}
