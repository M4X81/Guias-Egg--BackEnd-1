/*
1. Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package entidad;

import java.util.List;

/**
 *
 * @author Max
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private List<Perro> mascota;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int documento, List<Perro> mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.mascota = mascota;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public List<Perro> getMascota() {
        return mascota;
    }

    public void setMascota(List<Perro> mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + ", apellido= " + apellido + ", edad= " + edad + ", documento= " + documento + ", mascota=" + mascota + '}';
    }
}
