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

import enumeraciones.Raza;
import enumeraciones.Tamanio;

/**
 *
 * @author Max
 */
public class Perro {

    private String nombre;
    private Raza raza;
    private int edad;
    private Tamanio tamanio;

    public Perro() {
    }

    public Perro(String nombre, Raza raza, int edad, Tamanio tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + ", raza= " + raza + ", edad= " + edad + ", tamaño= " + tamanio;
    }
}
