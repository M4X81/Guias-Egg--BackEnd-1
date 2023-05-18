/*
3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class AlumnoServicio {

    ArrayList<Alumno> listaAlumnos = new ArrayList();
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void crearAlumno() {
        Alumno alumno = new Alumno();
        System.out.println("Ingrese el nombre del alumno:");
        String nombre = input.next();
        alumno.setNombre(nombre);
        alumno.setNotas(cargarNotas());
        listaAlumnos.add(alumno);
        System.out.println("Alumno creado exitosamente.");
    }

    public ArrayList<Integer> cargarNotas() {
        ArrayList<Integer> notas = new ArrayList();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese nota " + (i + 1) + " del alumno: ");
            int notaAlum = input.nextInt();
            notas.add(notaAlum);
        }
        return notas;
    }

    public void cargarAlumno() {
        String completar = "S";
        do {
            crearAlumno();
            System.out.println("Desea cargar otro alumno?");
        } while (input.next().equalsIgnoreCase("S"));
    }

    public double notaFinal() {
        double sumaNotas = 0;
        double promedioNotas = 0;
        System.out.println("Ingrese nombre de alumno para calcular su nota: ");
        String nombreAl = input.next();
        for (Alumno alumnos : listaAlumnos) {
            if (alumnos.getNombre().equalsIgnoreCase(nombreAl)) {             
                ArrayList<Integer> notas = alumnos.getNotas();
                for (int nota : notas) {
                    sumaNotas += nota;
                }
                promedioNotas = sumaNotas / notas.size();
            }
        }
        return promedioNotas;
        
    }
}
