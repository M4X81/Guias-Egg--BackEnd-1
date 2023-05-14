/*
 2) Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
Crea un método para calcular la nota media de un grupo de estudiantes y otro para 
mostrar por pantalla los estudiantes que tienen una nota media superior.
 */
package ej2_extra_cl17_poo;

import ej2_extra_cl17_poo.Estudiante.Estudiante;

/**
 *
 * @author Max
 */
public class Ej2_extra_Cl17_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("", 0, 0);
        Estudiante[] estudiantes = estudiante.cargarEstudiantes();
        double promedio = estudiante.calcularPromedioNotas(estudiantes);
        estudiante.mostrarEstudiantesSuperiores(estudiantes, promedio);
    }
}
