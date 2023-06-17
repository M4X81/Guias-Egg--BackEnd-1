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
public class EdificioDeOficinas extends Edificio {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    private int numeroOficinas;
    private int personasPorOficina;
    private int numeroPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numeroOficinas, int personasPorOficina, int numeroPisos) {
        this.numeroOficinas = numeroOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numeroPisos = numeroPisos;
    }

    public EdificioDeOficinas(int numeroOficinas, int personasPorOficina, int numeroPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numeroPisos = numeroPisos;
    }

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public int getpersonasPorOficina() {
        return personasPorOficina;
    }

    public void setpersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }
    private double anchoSup;
    private double largoSup;

    @Override
    public double calcularSuperficie() {
        System.out.println("Ingrese ancho del terreno");
        double ancho = input.nextDouble();
        System.out.println("Ingrese largo del terreno");
        double largo = input.nextDouble();
        double sup = largo * ancho * numeroPisos;
        System.out.println("La Superficie del edificio de oficinas es de " + sup + "m2");
        anchoSup = ancho;
        largoSup = largo;
        return sup;
    }

    @Override
    public double calcularVolumen() {
        System.out.println("Ingrese altura de cada piso");
        alto = input.nextInt();
        double vol = largoSup * anchoSup * alto * numeroPisos;
        System.out.println("El volumen del edificio de oficinas es " + vol + " m3");
        return vol;
    }

    @Override
public String toString() {
    return super.toString() + " - EdificioDeOficinas{" +
            "numeroOficinas=" + numeroOficinas +
            ", personasPorOficina=" + personasPorOficina +
            ", numeroPisos=" + numeroPisos +
            ", anchoSup=" + anchoSup +
            ", largoSup=" + largoSup +
            '}';
}

}
