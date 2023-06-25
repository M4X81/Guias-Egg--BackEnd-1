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
    private static int contadorID = 1000;

    private int generarNumeroID() {
        return ++contadorID;
    }

    public void crearEstudiante() {
        Estudiante estudiante = new Estudiante();
        System.out.println("Ingrese nombre del alumno");
        estudiante.setNombre(input.next());
        System.out.println("Ingrese apellido");
        estudiante.setApellido(input.next());
        System.out.println("Cargando numero de ID...");
        estudiante.setCodigoEstudiante(generarNumeroID());
        System.out.println("Su numero de identificación es: " + estudiante.getCodigoEstudiante());
        System.out.println(" ");
        estudiante.setEstadoCivil(cargarEstadoCivil(estudiante));
        System.out.println(" ");
        estudiante.setCurso(cargarCurso(estudiante));
        personas.add(estudiante);
    }

    public void crearProfesor() {
        Profesor profesor = new Profesor();
        System.out.println("Ingrese nombre del agente");
        profesor.setNombre(input.next());
        System.out.println("Ingrese apellido");
        profesor.setApellido(input.next());
        System.out.println("Cargando numero de ID...");
        profesor.setCodigoProfesor(generarNumeroID());
        System.out.println("Su numero de identificación es: " + profesor.getCodigoProfesor());
        System.out.println(" ");
        profesor.setEstadoCivil(cargarEstadoCivil(profesor));
        System.out.println(" ");
        profesor.cargarAnioIncorporacion();
        System.out.println("A continuación seleccione departamento al que pertenece...");
        profesor.setDepartamento(cargarDepartamento(profesor));
        System.out.println("");
        profesor.cargarNumDespacho();
        personas.add(profesor);
    }

    public void crearPersonalServ() {
        PersonalServ serv = new PersonalServ();
        System.out.println("Ingrese nombre del agente");
        serv.setNombre(input.next());
        System.out.println("Ingrese apellido");
        serv.setApellido(input.next());
        System.out.println("Cargando numero de ID...");
        serv.setCodigoPersServ(generarNumeroID());
        System.out.println("Su numero de identificación es: " + serv.getCodigoPersServ());
        System.out.println(" ");
        serv.setEstadoCivil(cargarEstadoCivil(serv));
        System.out.println(" ");
        serv.cargarAnioIncorporacion();
        System.out.println("A continuación indique sección a la que pertenece...");
        serv.setSeccion(asignarSeccion(serv));
        System.out.println("");
        serv.cargarNumDespacho();
        personas.add(serv);
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

    public EstadoCivil cargarEstadoCivil(Persona persona) {
        if (persona instanceof Estudiante || persona instanceof Profesor || persona instanceof PersonalServ) {
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

                }
                System.out.println("Estado civil asignado: " + persona.getEstadoCivil());
            } while (opcionSeleccionada < 1 || opcionSeleccionada > 5);
        }
        return persona.getEstadoCivil();
    }

    public void cambioEstadoCivil(Persona persona) {

        System.out.println("Usted va a modificar su estado civil...");
        System.out.println("Estado civil actual: " + persona.getEstadoCivil());
        cargarEstadoCivil(persona);
        System.out.println("Modificando...");
        System.out.println("Estado civil modificado: " + persona.getEstadoCivil());
    }

    public Departamento cargarCurso(Persona persona) {

        System.out.println("Seleccione curso a matricular...");
        System.out.println("Opciones de materias: ");
        for (int i = 0; i < Departamento.values().length; i++) {
            System.out.println((i + 1) + ". " + Departamento.values()[i]);
        }
        if (persona instanceof Estudiante) {
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

                }
                System.out.println("Materia asignada: " + ((Estudiante) persona).getCurso());
            } while (opcionSeleccionada < 1 || opcionSeleccionada > 10);
        }
        return ((Estudiante) persona).getCurso();
    }

    public void reasignarCurso(Persona persona) {

        if (persona instanceof Estudiante) {
            System.out.print("Seleccione nueva materia a asignar: ");
            System.out.println("");
            cargarCurso(((Estudiante) persona));
            System.out.println("Nueva materia asignada...");
        }
    }

    public Departamento cargarDepartamento(Persona persona) {
        if (persona instanceof Profesor) {
            System.out.println("Opciones de departamentos: ");
            for (int i = 0; i < Departamento.values().length; i++) {
                System.out.println((i + 1) + ". " + Departamento.values()[i]);
            }
            System.out.print("Seleccione departamento");
            System.out.println("");
            int opcionSeleccionada = input.nextInt();
            if (persona instanceof Profesor) {
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

                    }
                    System.out.println("Departamento asignada: " + ((Profesor) persona).getDepartamento());
                } while (opcionSeleccionada < 1 || opcionSeleccionada > 10);
            }
        }
        return ((Profesor) persona).getDepartamento();

    }

    public Departamento reasignarDepartamento(Persona persona) {
        System.out.println("Usted esta a punto de reasignar departamento");
        cargarDepartamento(((Profesor) persona));
        System.out.println("Nueva departamento asignado correctamente ");
        return ((Profesor) persona).getDepartamento();
    }

    public Seccion asignarSeccion(Persona persona) {
        if (persona instanceof PersonalServ) {
            System.out.println("Opciones de sección: ");
            for (int i = 0; i < Seccion.values().length; i++) {
                System.out.println((i + 1) + ". " + Seccion.values()[i]);
            }
            if (persona instanceof PersonalServ) {
                System.out.print("Seleccione sección");
                System.out.println("");
                int opcionSeleccionada = input.nextInt();

                do {
                    switch (opcionSeleccionada) {
                        case 1:
                            ((PersonalServ) persona).setSeccion(Seccion.BIBLIOTECA);
                            break;
                        case 2:
                            ((PersonalServ) persona).setSeccion(Seccion.DECANATO);
                            break;
                        case 3:
                            ((PersonalServ) persona).setSeccion(Seccion.SECRETARIA);
                            break;
                        case 4:
                            ((PersonalServ) persona).setSeccion(Seccion.ADMINISTRACION);
                            break;
                        case 5:
                            ((PersonalServ) persona).setSeccion(Seccion.REGISTRO_ACADEMICO);
                            break;
                        case 6:
                            ((PersonalServ) persona).setSeccion(Seccion.RECURSOS_HUMANOS);
                            break;
                        case 7:
                            ((PersonalServ) persona).setSeccion(Seccion.FINANZAS);
                            break;
                        case 8:
                            ((PersonalServ) persona).setSeccion(Seccion.SERVICIOS_ESTUDIANTILES);
                            break;
                        case 9:
                            ((PersonalServ) persona).setSeccion(Seccion.MANTENIMIENTO);
                            break;
                        case 10:
                            ((PersonalServ) persona).setSeccion(Seccion.SEGURIDAD);
                            break;
                        default:
                            System.out.println("Opción inválida.");
                    }
                    System.out.println("Sección asignada: " + ((PersonalServ) persona).getSeccion());
                } while (opcionSeleccionada < 1 || opcionSeleccionada > 10);
            }
        }

        return ((PersonalServ) persona).getSeccion();
    }

    public void reasignarSeccion(Persona persona) {
        System.out.println("Reasignando sección...");
        asignarSeccion((PersonalServ) persona);
        System.out.println("Nueva sección asignada correctamente");
    }

    public void mostrarLista() {
        for (Persona persona1 : personas) {
            System.out.println(persona1.toString());
            if (personas instanceof Estudiante) {
                System.out.print(((Estudiante) persona).toString());
            }
            if (personas instanceof Profesor) {
                System.out.print(((Profesor) persona).toString());
            }
            if (personas instanceof PersonalServ) {
                System.out.print(((PersonalServ) persona).toString());
            }
        }

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
            System.out.println("");

            switch (opcion) {
                case 1:
                    crearPersona();
                    break;

                case 2:
                    System.out.println("Ingrese número de ID de la persona para modificar los datos");
                    int opcionID = input.nextInt();
                    input.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < personas.size(); i++) {
                        Persona p = personas.get(i);

                        if (p instanceof Estudiante) {
                            if (opcionID == ((Estudiante) p).getCodigoEstudiante()) {
                                cambioEstadoCivil(p);
                                encontrado = true;
                                break;
                            }
                        } else if (p instanceof Profesor) {
                            if (opcionID == ((Profesor) p).getCodigoProfesor()) {
                                cambioEstadoCivil(p);
                                encontrado = true;
                                break;
                            }
                        } else if (p instanceof PersonalServ) {
                            if (opcionID == ((PersonalServ) p).getCodigoPersServ()) {
                                cambioEstadoCivil(p);
                                encontrado = true;
                                break;
                            }
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontró ninguna persona con el ID ingresado.");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese número de ID de la persona para modificar los datos");
                    int opcionID2 = input.nextInt();
                    input.nextLine();
                    boolean encontrado2 = false;

                    for (Persona p : personas) {
                        if (p instanceof Estudiante) {
                            if (opcionID2 == ((Estudiante) p).getCodigoEstudiante()) {
                                System.out.println("Los estudiantes no poseen despacho :( ");
                                encontrado2 = true;
                                break;
                            }
                        } else if (p instanceof Profesor) {
                            if (opcionID2 == ((Profesor) p).getCodigoProfesor()) {
                                ((Profesor) p).cambiarNumDespacho((Profesor) p);
                                encontrado2 = true;
                                System.out.println("Nuevo despacho asignado " + ((Profesor) p).getNumDespacho());
                                break;
                            }
                        } else if (p instanceof PersonalServ) {
                            if (opcionID2 == ((PersonalServ) p).getCodigoPersServ()) {
                                ((PersonalServ) p).cambiarNumDespacho((PersonalServ) p);
                                encontrado2 = true;
                                System.out.println("Nuevo despacho asignado " + ((PersonalServ) p).getNumDespacho());
                                break;
                            }
                        }
                    }
                    if (!encontrado2) {
                        System.out.println("No se encontró ninguna persona con el ID ingresado.");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese número de ID de la persona para modificar los datos");
                    int opcionID3 = input.nextInt();
                    input.nextLine();
                    boolean encontrado3 = false;

                    for (Persona p : personas) {
                        if (p instanceof Estudiante) {
                            if (opcionID3 == ((Estudiante) p).getCodigoEstudiante()) {
                                if (opcionID3 == ((Estudiante) p).getCodigoEstudiante()) {
                                    encontrado3 = true;
                                    reasignarCurso(((Estudiante) p));
                                    break;
                                }
                            } else if (p instanceof Profesor) {
                                if (opcionID3 == ((Profesor) p).getCodigoProfesor()) {
                                    if (opcionID3 == ((Profesor) persona).getCodigoProfesor()) {
                                        encontrado3 = true;
                                        System.out.println("No se puede matricular a un profesor...");
                                    }
                                }
                            } else if (p instanceof PersonalServ) {
                                if (opcionID3 == ((PersonalServ) p).getCodigoPersServ()) {
                                    if (opcionID3 == ((PersonalServ) p).getCodigoPersServ()) {
                                        encontrado3 = true;
                                        System.out.println("No se puede matricular al personal de servicio...");
                                    }
                                    break;
                                }
                            }
                        }
                        if (!encontrado3) {
                            System.out.println("No se encontró ninguna persona con el ID ingresado.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Ingrese número de ID de la persona para modificar los datos");
                    int opcionID4 = input.nextInt();
                    for (Persona persona1 : personas) {
                        if (persona1 instanceof Profesor) {
                            if (((Profesor) persona1).getCodigoProfesor() == opcionID4) {
                                reasignarDepartamento((Profesor) persona1);
                            }

                        } else {
                            System.out.println("El ID ingresado no se registra en la base de datos...");
                        }

                    }
                    break;
                case 6:
                    System.out.println("Ingrese número de ID de la persona para modificar los datos");
                    int opcionID5 = input.nextInt();
                    for (Persona persona2 : personas) {
                        if (((PersonalServ) persona2).getCodigoPersServ() == opcionID5) {
                            reasignarSeccion((PersonalServ) persona2);
                        } else {
                            System.out.println("El ID ingresado no se registra en la base de datos...");
                        }
                    }

                    break;
                case 7:

                    mostrarLista();

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
