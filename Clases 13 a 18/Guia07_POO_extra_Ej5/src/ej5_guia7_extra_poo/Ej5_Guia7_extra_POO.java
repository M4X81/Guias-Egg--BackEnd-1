/*
5-Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un 
empleado en función de su edad y salario actual. El aumento salarial debe ser 
del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package ej5_guia7_extra_poo;

import ej5_guia7_extra_poo.Empleado.Empleado;


/**
 *
 * @author Max
 */
public class Ej5_Guia7_extra_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.calcular_aumento();

        }

}
