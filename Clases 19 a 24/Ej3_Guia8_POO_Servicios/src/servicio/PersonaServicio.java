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
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad 
en distintas variables(arrays), para después calcular un porcentaje de esas 4 personas 
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, 
y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. 
Para esto, podemos crear unos métodos adicionales.
 */
package servicio;

import entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class PersonaServicio {

    private Persona personaObjeto;

    /*
    B- Metodo crearPersona(): el método crear persona, le pide los valores de los atributos 
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Persona. 
Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
     */
    public Persona CrearPersona() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        personaObjeto = new Persona();
        //nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura
        System.out.println("Ingrese el nombre de la persona ");
        personaObjeto.setNombre(input.nextLine());
        System.out.println("Ingrese la edad de " + personaObjeto.getNombre());
        personaObjeto.setEdad(input.nextInt());
        input.nextLine();
        char sexo;
        boolean sexoValido = false;
        while (!sexoValido) {
            System.out.println("Ingrese el sexo de " + personaObjeto.getNombre() + " (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro):");
            String sexoInput = input.nextLine();
            if (sexoInput.length() > 0) {
                sexo = Character.toUpperCase(sexoInput.charAt(0));
                if (sexo == 'H' || sexo == 'M' || sexo == 'O') {
                    sexoValido = true;
                } else {
                    System.out.println("El sexo ingresado es incorrecto. Intente nuevamente.");
                }
            } else if (sexoInput.length() == 0) {
                System.out.println("Debe ingresar el sexo de la persona. Intente nuevamente.");
            }
        }
        System.out.println("Ingrese el peso de " + personaObjeto.getNombre());
        personaObjeto.setPeso(input.nextDouble());
        System.out.println("Ingrese la altura de " + personaObjeto.getNombre());
        System.out.println("La misma debe ser ingresada en metros (ej.: 1,80)");
        personaObjeto.setAltura(input.nextDouble());
        return personaObjeto;
    }
//A- Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.

    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    /*
    C- Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo 
de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número 
entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. 
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que 
la persona tiene sobrepeso, y la función devuelve un 1.
     */
    public int calcularIMC(Persona persona) {
        double IMC = persona.getPeso() / (Math.pow(persona.getAltura(), 2));
        if (IMC < 20) {
            return -1;
        } else if (IMC > 19 && IMC < 26) {
            return 0;
        } else {
            return 1;
        }
    }

    public double porcentajeMayoresEdad(Persona[] personas) {
        int mayores = 0;
        for (Persona p : personas) {
            if (esMayorDeEdad(p)) {
                mayores++;
            }
        }
        return (double) mayores / personas.length * 100;
    }

}
