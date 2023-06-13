/*
1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package main;

import entity.Animal;
import entity.Caballo;
import entity.Gato;
import entity.Perro;

/**
 *
 * @author Max
 */
public class Main {
    public static void main(String[] args) {
        Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro1.alimentarse();
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.alimentarse();
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato1.alimentarse();
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.alimentarse();
    }
}
