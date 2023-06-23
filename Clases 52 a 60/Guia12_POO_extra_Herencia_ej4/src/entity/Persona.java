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

import enums.Departamento;
import enums.EstadoCivil;
import enums.Seccion;
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
Persona persona;
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

    @Override
    public String toString() {
        return "Nombre= " + nombre + "\n"
                + "Apellido= " + apellido + "\n"
                + "Estado Civil= " + estadoCivil + "\n";
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
        System.out.println("Usted va a modificar su estado civil...");
        
        System.out.println("Estado civil actual: " + estadoCivil);
        cargarEstadoCivil();
        System.out.println("Modificando...");
        System.out.println("Estado civil modificado: " + estadoCivil);
    }

    public void cargarMateria() {
        System.out.println("Opciones de materias: ");
        for (int i = 0; i < Departamento.values().length; i++) {
            System.out.println((i + 1) + ". " + Departamento.values()[i]);
        }
        System.out.print("Seleccione materia/despacho");
        System.out.println("");
        int opcionSeleccionada = input.nextInt();
        Departamento departamento;
        do {
            switch (opcionSeleccionada) {
                case 1:
                    departamento = Departamento.LENGUAJES;
                    break;
                case 2:
                    departamento = Departamento.MATEMATICAS;
                    break;
                case 3:
                    departamento = Departamento.ARQUITECTURA;
                    break;
                case 4:
                    departamento = Departamento.HISTORIA;
                    break;
                case 5:
                    departamento = Departamento.BIOLOGIA;
                    break;
                case 6:
                    departamento = Departamento.QUIMICA;
                    break;
                case 7:
                    departamento = Departamento.FISICA;
                    break;
                case 8:
                    departamento = Departamento.LITERATURA;
                    break;
                case 9:
                    departamento = Departamento.INFORMATICA;
                    break;
                case 10:
                    departamento = Departamento.ECONOMIA;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    return;
            }
            System.out.println("Materia asignada: " + departamento);
        } while (opcionSeleccionada < 1 || opcionSeleccionada > 5);

    }

    public void reasignarMateria() {
        System.out.println("Usted esta a punto de reasignar materia/despacho");
        cargarMateria();
        System.out.println("Nueva materia asignada correctamente ");
    }

    public void asignarSeccion() {
        System.out.println("Opciones de sección: ");
        for (int i = 0; i < Seccion.values().length; i++) {
            System.out.println((i + 1) + ". " + Seccion.values()[i]);
        }
        System.out.print("Seleccione sección");
        System.out.println("");
        int opcionSeleccionada = input.nextInt();
        Seccion seccion;
        do {
            switch (opcionSeleccionada) {
                case 1:
                    seccion = Seccion.ADMINISTRACION;
                    break;
                case 2:
                    seccion = Seccion.BIBLIOTECA;
                    break;
                case 3:
                    seccion = Seccion.DECANATO;
                    break;
                case 4:
                    seccion = Seccion.FINANZAS;
                    break;
                case 5:
                    seccion = Seccion.MANTENIMIENTO;
                    break;
                case 6:
                    seccion = Seccion.RECURSOS_HUMANOS;
                    break;
                case 7:
                    seccion = Seccion.REGISTRO_ACADEMICO;
                    break;
                case 8:
                    seccion = Seccion.SECRETARIA;
                    break;
                case 9:
                    seccion = Seccion.SEGURIDAD;
                    break;
                case 10:
                    seccion = Seccion.SERVICIOS_ESTUDIANTILES;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    return;
            }
            System.out.println("Sección asignada: " + seccion);
        } while (opcionSeleccionada < 1 || opcionSeleccionada > 5);
    }

    public void reasignarSeccion() {
        System.out.println("Reasignando sección...");
        asignarSeccion();
        System.out.println("Nueva sección asignada correctamente");
    }

}
