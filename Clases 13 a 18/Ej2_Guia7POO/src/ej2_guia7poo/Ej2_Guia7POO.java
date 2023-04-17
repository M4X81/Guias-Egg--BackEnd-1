/*
 * 2-Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
A continuación, se deben crear los siguientes métodos:
a-Método constructor que inicialice el radio pasado como parámetro.
b-Métodos get y set para el atributo radio de la clase Circunferencia.
c-Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
d-Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
e-Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package ej2_guia7poo;

import ej2_guia7poo.Circunferencia.Circunferencia;

/**
 *
 * @author Meli
 */
public class Ej2_Guia7POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia circunferencia= new Circunferencia();
    // Cargar el valor del radio
    circunferencia.crearCircunferencia();

    // Calcular el área y perímetro de la circunferencia
    double area = circunferencia.area();
    double perimetro = circunferencia.perimetro();
    
    // Mostrar resultados
    System.out.println("Área de la circunferencia: " + area);
    System.out.println("Perímetro de la circunferencia: " + perimetro);
    }
    
}
