/*
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package entity;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Polideportivo extends Edificio {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    /*• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.*/
    private String nombre;
    private boolean techo;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techo) {
        this.nombre = nombre;
        this.techo = techo;
    }

    public Polideportivo(String nombre, boolean techo, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techo = techo;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTecho() {
        return techo;
    }

    public void setTecho(boolean techo) {
        this.techo = techo;
    }
private double anchoSup;
private double largoSup;
    @Override
    public double calcularSuperficie() {
        System.out.println("Ingrese ancho del terreno");
        ancho = input.nextDouble();
        System.out.println("Ingrese largo del terreno");
        largo = input.nextDouble();
        double sup = largo * ancho;
        System.out.println("La Superficie del polideportivo es de " + sup + "m2");
        anchoSup=ancho;
        largoSup=largo;
        return sup;
    }

    @Override
    public double calcularVolumen() {
        System.out.println("Ingrese la altura de la construccion");
        alto = input.nextDouble();
        double vol = largoSup * anchoSup * alto;
        System.out.println("El volumen del polideportivo es " + vol + " m3");
        return vol;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", techo=" + techo + ", anchoSup=" + anchoSup + ", largoSup=" + largoSup + '}';
    }

}
