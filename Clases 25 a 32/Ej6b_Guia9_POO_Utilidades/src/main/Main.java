/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import servicio.CursoServicio;

/**
 *
 * @author Max
 */
public class Main {

    public static void main(String[] args) {
        CursoServicio cursoServicio = new CursoServicio();

        cursoServicio.crearCurso();
        cursoServicio.imprimirAlumnos();
        double gananciaSemanal = cursoServicio.calcularGananciaSemanal();
        System.out.println("La ganancia semanal es de: $" + gananciaSemanal);
    }
}
