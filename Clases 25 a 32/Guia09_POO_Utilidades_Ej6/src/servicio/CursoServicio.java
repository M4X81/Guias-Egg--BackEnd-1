/*
6-Un profesor particular está dando cursos para grupos de cinco alumnos y necesita 
un programa para organizar la información de cada curso. Para ello, crearemos una clase 
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia, 
cantidadDiasPorSemana, turno (mañana o tarde),  precioPorHora y alumnos. 
Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán 
los nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
Un constructor por defecto.
Un constructor con todos los atributos como parámetro.
Métodos getters y setters de cada atributo.
Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos 
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información en un arreglo 
e iterar con un bucle, solicitando en cada repetición que se ingrese el nombre de cada alumno.
Método crearCurso(): el método crear curso, le pide los valores de los atributos 
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso. 
En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia 
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día, 
el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que 
se repite el encuentro.
 */
package servicio;

import entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class CursoServicio {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    /*
    Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos 
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información en un arreglo 
e iterar con un bucle, solicitando en cada repetición que se ingrese el nombre de cada alumno.
     */
    private String[] cargarAlumnos(int longitudVector) {
        String[] alumnos = new String[longitudVector];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1));
            alumnos[i] = input.next();
        }
        return alumnos;
    }

    /*
   Método crearCurso(): el método crear curso, le pide los valores de los atributos 
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso. 
   En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
     */
    public Curso crearCurso() {
        boolean maniana = false;
        boolean tarde = false;
        Curso cursoObjeto = new Curso();
        cursoObjeto.setAlumnos(cargarAlumnos(cursoObjeto.getAlumnos().length));
        System.out.println("Ingrese el nombre del curso. ");
        cursoObjeto.setNombreCurso(input.nextLine());
        input.nextLine();
        System.out.println("Ingrese horas diarias de cursada. ");
        cursoObjeto.setCantidadHorasPorDia(input.nextInt());
        System.out.println("Ingrese cuantos dias por semana cursa. ");
        cursoObjeto.setCantidadDiasPorSemana(input.nextInt());
        System.out.println("Ingrese horario de cursada,'M' si es de mañana o 'T' si es de tarde. ");
        input.nextLine();
        if (input.nextLine().equalsIgnoreCase("M")) {
            maniana = true;
        } else tarde = true;            
        cursoObjeto.setTurnoManiana(maniana);
        cursoObjeto.setTurnoTarde(tarde);

        System.out.println("Ingrese el precio por hora del curso. ");
        cursoObjeto.setPrecioPorHora(input.nextDouble());

        return cursoObjeto;
    }
    public void calcularGananciaSemanal(Curso curso) {

        System.out.println("La ganancia semanal es: $ " +  (curso.getCantidadDiasPorSemana()
                * curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * curso.getAlumnos().length));

        
    }
}
