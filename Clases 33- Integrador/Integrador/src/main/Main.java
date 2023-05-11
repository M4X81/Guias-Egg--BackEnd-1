/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import estudiante.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Estudiante[] estudiantes = new Estudiante[8];
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Ingrese nombre del alumno.");
            String nombre = input.next();
            System.out.println("Ingrese la nota del final: ");
            double notas = input.nextDouble();
            estudiantes[i] = new Estudiante(nombre, notas);
        }
        double sumaNotas = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaNotas += estudiante.getNotas();
        }
        double promedioNotas = sumaNotas / estudiantes.length;
        System.out.println("El promedio de las notas es: " + promedioNotas);
        int contador=0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNotas() > promedioNotas) {
                contador++;               
            }
        }
        
        String [] nombreEstudiantes= new String[contador];
        contador=0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNotas() > promedioNotas) {
                nombreEstudiantes[contador] = estudiante.getNombre();
                contador++;
            } 
        }
        for (String nombreEstudiante : nombreEstudiantes) {
            System.out.println("Las notas de " + nombreEstudiante + " están por encima de la media");
        }
    }

}
