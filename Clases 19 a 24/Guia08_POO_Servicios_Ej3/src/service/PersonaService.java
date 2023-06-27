/*
En el paquete Servicios crear PersonaServicio con los siguientes 3
métodos:
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.
b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje
c) Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
● Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.
● Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos métodos adicionales.
 */
package service;

import entity.Persona;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class PersonaService {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona persona = new Persona();
        //String nombre, int edad, String sexo, int peso, int altura
        System.out.println("Cargando persona...");
        System.out.println("Ingrese el nombre");
        persona.setNombre(input.next());
        System.out.println("Ingrese la edad");
        persona.setEdad(input.nextInt());
        do {
            System.out.println("Ingrese el sexo: H/hombre, M/mujer, O/otro...");
            persona.setSexo(input.next().toUpperCase());           
        } while (!persona.getSexo().equals("H") && !persona.getSexo().equals("M") && !persona.getSexo().equals("O"));

        System.out.println("Ingrese peso");
        persona.setPeso(input.nextDouble());
        System.out.println("Ingrese altura");
        persona.setAltura(input.nextDouble());
        return persona;
    }

    public boolean esMayorDeEdad(Persona persona) {
        boolean mayor = false;
        if (persona.getEdad() >= 18) {
            mayor = true;        
        }       
        return mayor;
    }

    public int calcularIMC(Persona persona) {
        System.out.println("Calculando IMC...");
        //calcularIMC(): calculara si la persona está en su peso ideal
        //(peso en kg/(altura^2 en mt2)
        double Imc = persona.getPeso() / (Math.pow(persona.getAltura(), 2));
        int rango=0;
        if (Imc < 20) {
            rango = -1;          
        }
        if (Imc > 19 && Imc <= 25) {
            rango = 0;
        }
        if (Imc > 25) {
            rango = 1;            
        }
        System.out.println("El valor del calculo del IMC esta en el rango " + rango);
        return rango;
    }
   
}
