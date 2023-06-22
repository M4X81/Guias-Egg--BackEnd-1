/*
4. Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
 */
package entity;

import enums.EstadoCivil;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Persona {

    //Clase Padre
    /*
    Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
     */
    protected String nombre;
    protected String apellido;
    protected static Integer identificacion = 1000;
    protected EstadoCivil estadoCivil;
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer identificacion, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void cargarEstadoCivil() {
        System.out.println("Opciones de estado civil:");

        for (int i = 0; i < EstadoCivil.values().length; i++) {
            System.out.println((i + 1) + ". " + EstadoCivil.values()[i]);
        }

        System.out.print("Seleccione su estado civil: ");
        System.out.println("");
        int opcionSeleccionada = input.nextInt();
        do {
            switch (opcionSeleccionada) {
                case 1:
                    estadoCivil = EstadoCivil.CASADO_A;
                    break;
                case 2:
                    estadoCivil = EstadoCivil.SOLTERO_A;
                    break;
                case 3:
                    estadoCivil = EstadoCivil.DIVORCIADO_A;
                    break;
                case 4:
                    estadoCivil = EstadoCivil.VIUDO_A;
                    break;
                case 5:
                    estadoCivil = EstadoCivil.OTRO;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    return;
            }
            System.out.println("Estado civil asignado: " + estadoCivil);
        } while (opcionSeleccionada < 1 || opcionSeleccionada > 5);

    }

    public void cambioEstadoCivil() {
        System.out.println("Modificando su estado civil...");
        System.out.println("Estado civil actual: " + estadoCivil);
        System.out.println("Opciones de estado civil:");

        for (EstadoCivil opcion : EstadoCivil.values()) {
            System.out.println(opcion);
        }

        System.out.print("Seleccione su nuevo estado civil: ");

        int opcionSeleccionada = input.nextInt();
        do {
            switch (opcionSeleccionada) {
                case 1:
                    estadoCivil = EstadoCivil.CASADO_A;
                    break;
                case 2:
                    estadoCivil = EstadoCivil.SOLTERO_A;
                    break;
                case 3:
                    estadoCivil = EstadoCivil.DIVORCIADO_A;
                    break;
                case 4:
                    estadoCivil = EstadoCivil.VIUDO_A;
                    break;
                case 5:
                    estadoCivil = EstadoCivil.OTRO;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    return;
            }
        } while (opcionSeleccionada < 1 || opcionSeleccionada > 5);

        //this.estadoCivil = estadoCivil;
        System.out.println("Modificando su estado civil...");
        System.out.println("Estado civil modificado: " + estadoCivil);
    }

}
