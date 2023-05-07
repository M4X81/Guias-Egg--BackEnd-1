package servicio;

import entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class CursoServicio {

    Curso objCurso = new Curso();
    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void cargarAlumnos() {
        String[] alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            alumnos[i] = input.nextLine();
        }
        objCurso.setAlumnos(alumnos);
    }

    public void crearCurso() {
        boolean maniana = false;
        boolean tarde = false;

        System.out.print("Ingrese el nombre del curso: ");
        objCurso.setNombreCurso(input.nextLine());

        System.out.print("Ingrese la cantidad de horas por día: ");
        objCurso.setCantidadHorasPorDia(input.nextInt());
        System.out.print("Ingrese la cantidad de días por semana: ");
        objCurso.setCantidadDiasPorSemana(input.nextInt());

        input.nextLine(); // Limpia el buffer del scanner

        System.out.print("Ingrese horario de cursada, 'M' si es de mañana o 'T' si es de tarde: ");
        String turno = input.nextLine().toUpperCase();
        if (turno.equals("M")) {
            maniana = true;
        } else if (turno.equals("T")) {
            tarde = true;
        }
        objCurso.setTurnoManiana(maniana);
        objCurso.setTurnoTarde(tarde);

        System.out.print("Ingrese el precio por hora: ");
        objCurso.setPrecioPorHora(input.nextDouble());

        input.nextLine(); // Limpia el buffer del scanner

        cargarAlumnos();
    }

    public double calcularGananciaSemanal() {
        return objCurso.getCantidadHorasPorDia() * objCurso.getPrecioPorHora() * objCurso.getAlumnos().length * objCurso.getCantidadDiasPorSemana();
    }

    public void imprimirAlumnos() {
        String[] alumnos = objCurso.getAlumnos();
        System.out.println("Lista de alumnos:");
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }
    }

}
