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
package service;

import entity.Estudiante;
import entity.Persona;
import entity.PersonalServ;
import entity.Profesor;
import enums.EstadoCivil;
import enums.Individuos;
import interfaces.Empleado;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class PersonaServicio {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Persona> personas = new ArrayList<>();
    Persona persona = new Persona();

    public void crearEstudiante() {
        Estudiante estudiante = new Estudiante();
        System.out.println("Ingrese nombre del alumno");
        estudiante.setNombre(input.next());
        System.out.println("Ingrese apellido");
        estudiante.setApellido(input.next());
        System.out.println("Cargando numero de ID...");
        persona.setIdentificacion(persona.getIdentificacion() + 1);
        System.out.println("Su numero de identificación es: " + persona.getIdentificacion());
        System.out.println(" ");
        estudiante.cargarEstadoCivil();
        System.out.println(" ");
        System.out.println("A continuación seleccione materia a matricular...");
        estudiante.cargarMateria();
        personas.add(estudiante);
    }

    public void crearProfesor() {
        Profesor profesor = new Profesor();
        System.out.println("Ingrese nombre del agente");
        profesor.setNombre(input.next());
        System.out.println("Ingrese apellido");
        profesor.setApellido(input.next());
        System.out.println("Cargando numero de ID...");
        persona.setIdentificacion(persona.getIdentificacion() + 1);
        System.out.println("Su numero de identificación es: " + persona.getIdentificacion());
        System.out.println(" ");
        profesor.cargarEstadoCivil();
        System.out.println(" ");
        profesor.cargarAnioIncorporacion();
        System.out.println("A continuación seleccione departamento al que pertenece...");
        profesor.cargarMateria();
        System.out.println("");
        profesor.cargarNumDespacho();
        personas.add(profesor);
    }

    public void crearPersonalServ() {
        PersonalServ servicio = new PersonalServ();
        System.out.println("Ingrese nombre del agente");
        servicio.setNombre(input.next());
        System.out.println("Ingrese apellido");
        servicio.setApellido(input.next());
        System.out.println("Cargando numero de ID...");
        persona.setIdentificacion(persona.getIdentificacion() + 1);
        System.out.println("Su numero de identificación es: " + persona.getIdentificacion());
        System.out.println(" ");
        servicio.cargarEstadoCivil();
        System.out.println(" ");
        servicio.cargarAnioIncorporacion();
        System.out.println("A continuación indique sección a la que pertenece...");
        servicio.asignarSeccion();
        System.out.println("");
        servicio.cargarNumDespacho();
        personas.add(servicio);
    }

    public void crearPersona() {
        int opcion;
        System.out.println("Ingrese tipo de individuo que desea cargar");

        for (int i = 0; i < Individuos.values().length; i++) {
            System.out.println((i + 1) + ". " + Individuos.values()[i]);
        }

        opcion = input.nextInt();
        do {
            switch (opcion) {
                case 1:
                    crearEstudiante();
                    break;
                case 2:
                    crearProfesor();
                    break;
                case 3:
                    crearPersonalServ();
                    break;
            }

        } while (opcion < 1 || opcion > 3);
    }

    public void menu() {
        int opcion;
        Persona persona = null;
        do {
            System.out.println("Sistema de Gestión de Facultad");
            System.out.println("1. Cargar una persona");
            System.out.println("2. Cambiar estado civil de una persona");
            System.out.println("3. Reasignar despacho a un empleado");
            System.out.println("4. Matricular un estudiante en un nuevo curso");
            System.out.println("5. Cambiar departamento de un profesor");
            System.out.println("6. Trasladar sección de un empleado del personal de servicio");
            System.out.println("7. Imprimir información de cada tipo de individuo");
            System.out.println("8. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = input.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    crearPersona();
                    break;
                case 2:
                    persona.cambioEstadoCivil();
                    break;
                case 3:
                    Empleado empleado = null;
                    if (empleado instanceof Profesor) {
                        ((Profesor) empleado).cargarNumDespacho();
                    } else if (empleado instanceof PersonalServ) {
                        ((PersonalServ) empleado).cargarNumDespacho();
                    }
                    break;
                case 4:
                    persona.reasignarMateria();
                    break;
                case 5:
                    persona.reasignarMateria();
                    break;
                case 6:
                    persona.reasignarSeccion();
                    break;
                case 7:
                    persona.toString();
                    break;
                case 8:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

            System.out.println();
        } while (opcion != 8);
    }

    public Persona buscarPersonaPorId(int id) {
        for (Persona persona : personas) {
            if (persona.getIdentificacion() == id) {
                return persona;
            }
        }
        return null; 
    }

}
