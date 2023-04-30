/*
Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes 
atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), 
peso y altura. Si desea añadir algún otro atributo, puede hacerlo. Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
A- Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
B- Metodo crearPersona(): el método crear persona, le pide los valores de los atributos 
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Persona. 
Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje


C- Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo 
de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número 
entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. 
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que 
la persona tiene sobrepeso, y la función devuelve un 1.

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, 
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si 
la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad 
en distintas variables(arrays), para después calcular un porcentaje de esas 4 personas 
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, 
y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. 
Para esto, podemos crear unos métodos adicionales.
 */
package main;

import entidad.Persona;
import servicio.PersonaServicio;

/**
 *
 * @author Meli
 */
public class Main {

    public static void main(String[] args) {

        PersonaServicio miPersonaServicio = new PersonaServicio();
        Persona persona1 = new Persona("Juan", 25, "h", 85, 1.75);
        Persona persona2 = new Persona("Pedro", 40, "h", 63, 1.62);
        Persona persona3 = miPersonaServicio.CrearPersona();
        Persona persona4 = miPersonaServicio.CrearPersona();

        int[] resultadoIMC = new int[4];
        resultadoIMC[0] = miPersonaServicio.calcularIMC(persona1);
        resultadoIMC[1] = miPersonaServicio.calcularIMC(persona2);
        resultadoIMC[2] = miPersonaServicio.calcularIMC(persona3);
        resultadoIMC[3] = miPersonaServicio.calcularIMC(persona4);
//        for (int i = 0; i < resultadoIMC.length; i++) {
//            System.out.println("Persona " + (i + 1) + " IMC: " + resultadoIMC[i]);
//        }
        int porDebajo = 0;
        int enPesoIdeal = 0;
        int porEncima = 0;

        for (int i = 0; i < resultadoIMC.length; i++) {
            System.out.print("Persona " + (i + 1) + ": ");
            switch (resultadoIMC[i]) {
                case -1:
                    System.out.println("Por debajo del peso ideal");
                    porDebajo++;
                    break;
                case 0:
                    System.out.println("En el peso ideal");
                    enPesoIdeal++;
                    break;
                default:
                    System.out.println("Por encima del peso ideal");
                    porEncima++;
                    break;
            }
        }

        double porcentajeDebajo = ((double) porDebajo / resultadoIMC.length) * 100;
        double porcentajePesoIdeal = ((double) enPesoIdeal / resultadoIMC.length) * 100;
        double porcentajeEncima = ((double) porEncima / resultadoIMC.length) * 100;

        System.out.println("Porcentaje debajo de peso: " + porcentajeDebajo + "%");
        System.out.println("Porcentaje en peso ideal: " + porcentajePesoIdeal + "%");
        System.out.println("Porcentaje encima de peso: " + porcentajeEncima + "%");

        boolean[] esMayorDeEdad = new boolean[4];
        esMayorDeEdad[0] = miPersonaServicio.esMayorDeEdad(persona1);
        esMayorDeEdad[1] = miPersonaServicio.esMayorDeEdad(persona2);
        esMayorDeEdad[2] = miPersonaServicio.esMayorDeEdad(persona3);
        esMayorDeEdad[3] = miPersonaServicio.esMayorDeEdad(persona4);
        int mayoresEdad = 0;
        int menoresEdad = 0;
        for (int i = 0; i < esMayorDeEdad.length; i++) {
            System.out.println("Persona " + (i + 1) + ": " + esMayorDeEdad[i]);

            if (esMayorDeEdad[i]) {
                mayoresEdad++;
            } else {
                menoresEdad++;
            }
        }

//        System.out.println("Cantidad de personas mayores de edad: " + mayoresEdad);
//        System.out.println("Cantidad de personas menores de edad: " + menoresEdad);

        double porcentajeMayores = (double) mayoresEdad / esMayorDeEdad.length * 100.0;
        double porcentajeMenores = (double) menoresEdad / esMayorDeEdad.length * 100.0;

        System.out.println("Porcentaje mayores de edad: " + porcentajeMayores + "%");
        System.out.println("Porcentaje menores de edad: " + porcentajeMenores + "%");

    }

}
