/*
 2-Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
A continuación, se deben crear los siguientes métodos:
a-Método constructor que inicialice el radio pasado como parámetro.
b-Métodos get y set para el atributo radio de la clase Circunferencia.
c-Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
d-Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
e-Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 */
package ej2_guia7poo.Circunferencia;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Circunferencia {
    //atributo privado
    private double radio;
    
    // Método constructor vacío
    public Circunferencia() {}

    //constructor
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    //getter
    public double getRadio() {
        return radio;
    }
    //setter
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //puntos c, d y e
    public void crearCircunferencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();
        this.setRadio(radio);
        //return this;
    }
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }
     public double perimetro() {
        return 2 * Math.PI * radio;
    }
}

        
    