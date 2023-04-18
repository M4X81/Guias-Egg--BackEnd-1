/*
5-Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un 
empleado en función de su edad y salario actual. El aumento salarial debe ser 
del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package ej5_guia7_extra_poo.Empleado;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Empleado {
    
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ingrese el nombre del empleado: ");
        this.nombre = input.nextLine();
       
        int min = 18;
        int max = 70;
        this.edad = random.nextInt((max - min) + 1) + min;
       
        double sueldoMin = 120000;
        double sueldoMax = 220000;
        double sueldo = sueldoMin + (sueldoMax - sueldoMin) * random.nextDouble();
        this.salario = sueldo;
        
        System.out.println("Agente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + String.format("%.2f", salario));

    }

    
    public void calcular_aumento() {
    if (edad > 30) {
        salario *= 1.1; // Aumento del 10%
    } else {
        salario *= 1.05; // Aumento del 5%
    }
    // String.format("%.2f", salario) esto hace una especie de trunc para limitar los decimales a 2 digitos
    System.out.println("El nuevo salario de " + nombre + " es $" + String.format("%.2f", salario));

}

    

}
