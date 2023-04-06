/*
 * Los profesores del curso de programación de Egg necesitan llevar un registro 
de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de 
aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas,
2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla la cantidad 
de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con 
promedio mayor o igual al 7 de sus notas del curso.

 */
package ej_extra_guia5;

import java.util.Random;

/**
 *
 * @author Max
 */
public class Eje4_extra_Cl10 {
    public static void main(String[] args) {
        
        double[][] notas = new double[10][4];
        cargarNotasRandom(notas);
        imprimirNotas(notas);
        int aprobados = contarAprobados(notas);
        int desaprobados = notas.length - aprobados;
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }

    public static void cargarNotasRandom(double[][] notas) {
        Random random = new Random();
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = random.nextInt(10) + 1;
            }
        }
    }

    public static void imprimirNotas(double[][] notas) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumno " + (i+1));
            System.out.println("Primer trabajo práctico evaluativo: " + notas[i][0]);
            System.out.println("Segundo trabajo práctico evaluativo: " + notas[i][1]);
            System.out.println("Primer integrador: " + notas[i][2]);
            System.out.println("Segundo integrador: " + notas[i][3]);
            double promedio = (notas[i][0]*0.1 + notas[i][1]*0.15 + notas[i][2]*0.25 + notas[i][3]*0.5);
            System.out.println("Promedio: " + promedio);
            System.out.println("------------------------");
        }
    }

    public static int contarAprobados(double[][] notas) {
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            double promedio = (notas[i][0]*0.1 + notas[i][1]*0.15 + notas[i][2]*0.25 + notas[i][3]*0.5);
            if (promedio >= 7.0) {
                contador++;
            }
        }
        return contador;
    }
}

