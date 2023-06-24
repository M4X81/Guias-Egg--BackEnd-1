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
import enums.Seccion;
import interfaces.Empleado;

/**
 *
 * @author Max
 */
public class PersonalServ extends Persona implements Empleado {

    /*• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).*/
    private Seccion seccion;
    private Integer fechaIncorp = (int) (Math.random() * 40) + 1981;
    private static Integer numDespacho = (int) (Math.random() * 200) + 101;

    public PersonalServ() {
    }

    public PersonalServ(Seccion seccion, Integer fechaIncorp, Integer numDespacho) {
        this.seccion = seccion;
        this.fechaIncorp = fechaIncorp;
        this.numDespacho = numDespacho;
    }

    public PersonalServ(Seccion seccion, Integer fechaIncorp, Integer numDespacho, String nombre, String apellido, Integer identificacion, EstadoCivil estadoCivil) {
        super(nombre, apellido, identificacion, estadoCivil);
        this.seccion = seccion;
        this.fechaIncorp = fechaIncorp;
        this.numDespacho = numDespacho;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        String parentString = super.toString();
        return parentString + "\n"
                + "Función: Personal de servicio " + "\n"
                + "Sección= " + seccion + "\n"
                + "Fecha de Incorporación= " + fechaIncorp + "\n"
                + "Número de despacho: " + numDespacho + "\n"
                +"\n";
    }

    @Override
    public void cargarAnioIncorporacion() {
        System.out.println("El año de incorporacion  para su ID es el siguiente: " + getFechaIncorp());
    }

    @Override
    public void cargarNumDespacho() {
        System.out.println("Su número de despacho es: " + getNumDespacho());
    }

    @Override
    public Integer getFechaIncorp() {
        return fechaIncorp;
    }

    @Override
    public Integer getNumDespacho() {
        return numDespacho;
    }
}
