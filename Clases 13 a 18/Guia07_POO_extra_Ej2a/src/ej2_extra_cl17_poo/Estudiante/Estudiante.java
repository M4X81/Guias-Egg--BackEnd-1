/*
 2) Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
Crea un método para calcular la nota media de un grupo de estudiantes y otro para
mostrar por pantalla los estudiantes que tienen una nota media superior.
 */
package ej2_extra_cl17_poo.Estudiante;

import java.util.Random;
import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private int edad;
    private double notaMedia;

    public Estudiante(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }
    
    // getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    // Método para cargar los estudiantes
    public Estudiante[] cargarEstudiantes() {
        Random notaAleatoria = new Random();
        Random edadAleatoria = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos a evaluar: ");
        int total = input.nextInt();
        input.nextLine(); // Consumir el salto de línea después de nextInt()

        Estudiante[] estudiantes = new Estudiante[total];
        for (int i = 0; i < total; i++) {
            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = input.nextLine();
            
            int edad = edadAleatoria.nextInt(50) + 1;
            System.out.println("La edad de " + nombre + " es: " + edad);
           // input.nextLine(); // Consumir el salto de línea después de nextInt()

            int notaMedia = notaAleatoria.nextInt(10) + 1;
            System.out.println("Nota Media : " + notaMedia);
            
            estudiantes[i] = new Estudiante(nombre, edad, notaMedia);
        }
        return estudiantes;
    }
    
    // Método para calcular el promedio de notas
    public double calcularPromedioNotas(Estudiante[] estudiantes) {
        double sumatoriaNotas = 0;
        for (Estudiante estudiante : estudiantes) {
            sumatoriaNotas += estudiante.getNotaMedia();
        }
        double promedioNotas = sumatoriaNotas / estudiantes.length;
        return promedioNotas;
    }
    
    // Método para mostrar los estudiantes con nota media superior al promedio
    public void mostrarEstudiantesSuperiores(Estudiante[] estudiantes, double promedio) {
        System.out.println("Los estudiantes con nota media superior al promedio (" + promedio + ") son:");
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNotaMedia() > promedio) {
                System.out.println(estudiante);
            }
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Nota Media: " + notaMedia;
    }
}
