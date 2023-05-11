/*
Ejercicio integrador
Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el
examen final. La escuela nos ha pedido que calculemos el promedio de notas
final de todos sus alumnos y saber qué alumnos han recibido una nota por
encima de ese promedio.
Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
van a ser nombre y nota (representando la nota obtenida en el final).
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un
arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
dos tareas que nos ha pedido la escuela.
1. Calcular y mostrar el promedio de notas de todo el curso
2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
nota mayor al promedio del curso
3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];
 */
package estudiante;

/**
 *
 * @author Max
 */
public class Estudiante {
    private String nombre;
    private double notas;

    public Estudiante() {
    }

    public Estudiante(String nombre, double notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }   
}
