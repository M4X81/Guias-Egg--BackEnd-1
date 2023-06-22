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
import interfaces.Empleado;

/**
 *
 * @author Max
 */
public class Profesor extends Persona implements Empleado {

    /*• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).*/
    private Departamento departamento;
    private Integer fechaIncorp;
    private Integer numDespacho;

    public Profesor() {
    }

    public Profesor(Departamento departamento, Integer fechaIncorp, Integer numDespacho, String nombre, String apellido, Integer identificacion, EstadoCivil estadoCivil) {
        super(nombre, apellido, identificacion, estadoCivil);
        this.departamento = departamento;
        this.fechaIncorp = fechaIncorp;
        this.numDespacho = numDespacho;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    

    @Override
    public void cargarAnioIncorporacion() {
        
    }

    @Override
    public void cargarNumDespacho() {
        
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
