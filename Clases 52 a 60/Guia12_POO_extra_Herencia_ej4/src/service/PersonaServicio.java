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
import enums.Departamento;
import enums.EstadoCivil;
import enums.Individuos;
import enums.Seccion;
import interfaces.Empleado;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class PersonaServicio {


    Scanner input = new Scanner(System.in).useDelimiter("\n");
    private List<Persona> personas = new ArrayList<>();
    Persona persona;

    public void crearEstudiante() {
        persona = new Estudiante();
        System.out.println("Ingrese nombre del alumno");
        persona.setNombre(input.next());
        System.out.println("Ingrese apellido");
        persona.setApellido(input.next());
        System.out.println("Cargando numero de ID...");
       //((Estudiante) persona).setId(((Estudiante) persona). + 1);
        Persona.setIdentificacion(Persona.getIdentificacion() + 1);
        System.out.println("Su numero de identificación es: " + Persona.getIdentificacion() );
        System.out.println(" ");
        cargarEstadoCivil();
        System.out.println(" ");
        cargarCurso();
        personas.add(((Estudiante) persona));
    }

    public void crearProfesor() {
        persona = new Profesor();
        System.out.println("Ingrese nombre del agente");
        persona.setNombre(input.next());
        System.out.println("Ingrese apellido");
        persona.setApellido(input.next());
        System.out.println("Cargando numero de ID...");
        ((Profesor) persona).setId(((Profesor) persona).getId() + 1);
        System.out.println("Su numero de identificación es: " + ((Profesor) persona).getId());
        System.out.println(" ");
        cargarEstadoCivil();
        System.out.println(" ");
        ((Profesor) persona).cargarAnioIncorporacion();
        System.out.println("A continuación seleccione departamento al que pertenece...");
        cargarDepartamento();
        System.out.println("");
        ((Profesor) persona).cargarNumDespacho();
        personas.add(((Profesor) persona));
    }

    public void crearPersonalServ() {
        persona = new PersonalServ();
        System.out.println("Ingrese nombre del agente");
        persona.setNombre(input.next());
        System.out.println("Ingrese apellido");
        persona.setApellido(input.next());
        System.out.println("Cargando numero de ID...");
        ((PersonalServ) persona).setId(((PersonalServ) persona).getId() + 1);
        System.out.println("Su numero de identificación es: " + ((PersonalServ) persona).getId());
        System.out.println(" ");
        cargarEstadoCivil();
        System.out.println(" ");
        ((PersonalServ) persona).cargarAnioIncorporacion();
        System.out.println("A continuación indique sección a la que pertenece...");
        asignarSeccion();
        System.out.println("");
        ((PersonalServ) persona).cargarNumDespacho();
        personas.add(((PersonalServ) persona));
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
                    persona.setEstadoCivil(EstadoCivil.CASADO_A);
                    break;
                case 2:
                    persona.setEstadoCivil(EstadoCivil.SOLTERO_A);
                    break;
                case 3:
                    persona.setEstadoCivil(EstadoCivil.DIVORCIADO_A);
                    break;
                case 4:
                    persona.setEstadoCivil(EstadoCivil.VIUDO_A);
                    break;
                case 5:
                    persona.setEstadoCivil(EstadoCivil.OTRO);
                    break;
                default:
                    System.out.println("Opción inválida.");
                    return;
            }
            System.out.println("Estado civil asignado: " + persona.getEstadoCivil());
        } while (opcionSeleccionada < 1 || opcionSeleccionada > 5);

    }

    public void cambioEstadoCivil() {

        System.out.println("Usted va a modificar su estado civil...");
        System.out.println("Estado civil actual: " + persona.getEstadoCivil());
        cargarEstadoCivil();
        System.out.println("Modificando...");
        System.out.println("Estado civil modificado: " + persona.getEstadoCivil());
    }

    public void cargarCurso() {

        System.out.println("Seleccione curso a matricular...");
        System.out.println("Opciones de materias: ");
        for (int i = 0; i < Departamento.values().length; i++) {
            System.out.println((i + 1) + ". " + Departamento.values()[i]);
        }

        int opcionSeleccionada = input.nextInt();
        do {
            switch (opcionSeleccionada) {
                case 1:
                    ((Estudiante) persona).setCurso(Departamento.LENGUAJES);
                    break;
                case 2:
                    ((Estudiante) persona).setCurso(Departamento.MATEMATICAS);
                    break;
                case 3:
                    ((Estudiante) persona).setCurso(Departamento.ARQUITECTURA);
                    break;
                case 4:
                    ((Estudiante) persona).setCurso(Departamento.HISTORIA);
                    break;
                case 5:
                    ((Estudiante) persona).setCurso(Departamento.BIOLOGIA);
                    break;
                case 6:
                    ((Estudiante) persona).setCurso(Departamento.QUIMICA);
                    break;
                case 7:
                    ((Estudiante) persona).setCurso(Departamento.FISICA);
                    break;
                case 8:
                    ((Estudiante) persona).setCurso(Departamento.LITERATURA);
                    break;
                case 9:
                    ((Estudiante) persona).setCurso(Departamento.INFORMATICA);
                    break;
                case 10:
                    ((Estudiante) persona).setCurso(Departamento.ECONOMIA);
                    break;
                default:
                    System.out.println("Opción inválida.");
                    return;
            }
            System.out.println("Materia asignada: " + ((Estudiante) persona).getCurso());
        } while (opcionSeleccionada < 1 || opcionSeleccionada > 10);
    }

    public void reasignarCurso() {
        System.out.print("Seleccione nueva materia a asignar: ");
        System.out.println("");
        cargarCurso();
        System.out.println("Nueva materia asignada...");

    }

    public void cargarDepartamento() {
        System.out.println("Opciones de departamentos: ");
        for (int i = 0; i < Departamento.values().length; i++) {
            System.out.println((i + 1) + ". " + Departamento.values()[i]);
        }
        System.out.print("Seleccione departamento");
        System.out.println("");
        int opcionSeleccionada = input.nextInt();

        do {
            switch (opcionSeleccionada) {
                case 1:
                    ((Profesor) persona).setDepartamento(Departamento.LENGUAJES);
                    break;
                case 2:
                    ((Profesor) persona).setDepartamento(Departamento.MATEMATICAS);
                    break;
                case 3:
                    ((Profesor) persona).setDepartamento(Departamento.ARQUITECTURA);
                    break;
                case 4:
                    ((Profesor) persona).setDepartamento(Departamento.HISTORIA);
                    break;
                case 5:
                    ((Profesor) persona).setDepartamento(Departamento.BIOLOGIA);
                    break;
                case 6:
                    ((Profesor) persona).setDepartamento(Departamento.QUIMICA);
                    break;
                case 7:
                    ((Profesor) persona).setDepartamento(Departamento.FISICA);
                    break;
                case 8:
                    ((Profesor) persona).setDepartamento(Departamento.LITERATURA);
                    break;
                case 9:
                    ((Profesor) persona).setDepartamento(Departamento.INFORMATICA);
                    break;
                case 10:
                    ((Profesor) persona).setDepartamento(Departamento.ECONOMIA);
                    break;
                default:
                    System.out.println("Opción inválida.");
                    return;
            }
            System.out.println("Departamento asignada: " + ((Profesor) persona).getDepartamento());
        } while (opcionSeleccionada < 1 || opcionSeleccionada > 10);

    }

    public void reasignarDepartamento() {
        System.out.println("Usted esta a punto de reasignar departamento");
        cargarDepartamento();
        System.out.println("Nueva departamento asignado correctamente ");
    }

    public void asignarSeccion() {
        System.out.println("Opciones de sección: ");
        for (int i = 0; i < Seccion.values().length; i++) {
            System.out.println((i + 1) + ". " + Seccion.values()[i]);
        }
        System.out.print("Seleccione sección");
        System.out.println("");
        int opcionSeleccionada = input.nextInt();

        do {
            switch (opcionSeleccionada) {
                case 1:
                    ((PersonalServ) persona).setSeccion(Seccion.DECANATO);
                    break;
                case 2:
                    ((PersonalServ) persona).setSeccion(Seccion.BIBLIOTECA);
                    break;
                case 3:
                    ((PersonalServ) persona).setSeccion(Seccion.DECANATO);
                    break;
                case 4:
                    ((PersonalServ) persona).setSeccion(Seccion.FINANZAS);
                    break;
                case 5:
                    ((PersonalServ) persona).setSeccion(Seccion.MANTENIMIENTO);
                    break;
                case 6:
                    ((PersonalServ) persona).setSeccion(Seccion.RECURSOS_HUMANOS);
                    break;
                case 7:
                    ((PersonalServ) persona).setSeccion(Seccion.REGISTRO_ACADEMICO);
                    break;
                case 8:
                    ((PersonalServ) persona).setSeccion(Seccion.SECRETARIA);
                    break;
                case 9:
                    ((PersonalServ) persona).setSeccion(Seccion.SEGURIDAD);
                    break;
                case 10:
                    ((PersonalServ) persona).setSeccion(Seccion.SERVICIOS_ESTUDIANTILES);
                    break;
                default:
                    System.out.println("Opción inválida.");
                    return;
            }
            System.out.println("Sección asignada: " + ((PersonalServ) persona).getSeccion());
        } while (opcionSeleccionada < 1 || opcionSeleccionada > 10);
    }

    public void reasignarSeccion() {
        System.out.println("Reasignando sección...");
        asignarSeccion();
        System.out.println("Nueva sección asignada correctamente");
    }

    public void menu() {
        int opcion;
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
                    System.out.println("Ingrese número de ID de la persona para modificar los datos");
                    int opcionID = input.nextInt();
                    Persona personaEncontrada = null;
                    for (Persona p : personas) {
                        if (p.getId() == opcionID) {
                            personaEncontrada = p;
                            break;
                        }
                    }
                    if (personaEncontrada != null) {
                       cambioEstadoCivil();
                    } else {
                        System.out.println("El ID ingresado no se registra en la base de datos...");
                    }
                    break;

//                    System.out.println("Ingrese número de ID de la persona para modificar los datos");
//                    int opcionID = input.nextInt();
//                    if (persona.getId() == opcionID) {
//                        cambioEstadoCivil();
//                    } else {
//                        System.out.println("El ID ingresado no se registra en la base de datos...");
//                    }
//                    break;
                case 3:
                    System.out.println("Ingrese número de ID de la persona para modificar los datos");
                    int opcionID2 = input.nextInt();
                    if (persona.getId() == opcionID2) {
                        Empleado empleado = null;
                        if (empleado instanceof Profesor) {
                            ((Profesor) empleado).cargarNumDespacho();
                        } else if (empleado instanceof PersonalServ) {
                            ((PersonalServ) empleado).cargarNumDespacho();
                        }
                    } else {
                        System.out.println("El ID ingresado no se registra en la base de datos...");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese número de ID de la persona para modificar los datos");
                    int opcionID3 = input.nextInt();
                    if (persona.getId() == opcionID3) {
                        reasignarCurso();
                    } else {
                        System.out.println("El ID ingresado no se registra en la base de datos...");
                    }
                    break;
                case 5:
                    System.out.println("Ingrese número de ID de la persona para modificar los datos");
                    int opcionID4 = input.nextInt();
                    if (persona.getId() == opcionID4) {
                        reasignarDepartamento();
                    } else {
                        System.out.println("El ID ingresado no se registra en la base de datos...");
                    }
                    break;
                case 6:
                    System.out.println("Ingrese número de ID de la persona para modificar los datos");
                    int opcionID5 = input.nextInt();
                    if (persona.getId() == opcionID5) {
                        reasignarSeccion();
                    } else {
                        System.out.println("El ID ingresado no se registra en la base de datos...");
                    }
                    break;
                case 7:
                    System.out.print(personas.toString());
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
}
