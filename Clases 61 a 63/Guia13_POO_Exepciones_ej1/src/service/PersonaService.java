/*
Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar 
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código 
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
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

    

 

    public void crearPersona(Persona persona) {
        System.out.println("Ingrese el nombre:");
        persona.setNombre(input.nextLine());

        System.out.println("Ingrese la edad:");
        persona.setEdad(input.nextInt());

        System.out.println("Ingrese el sexo (H/hombre, M/mujer, O/otro):");
        persona.setSexo(input.next().toUpperCase().charAt(0));

        while (persona.getSexo() != 'H' && persona.getSexo() != 'M' && persona.getSexo() != 'O') {
            System.out.println("Sexo inválido. Ingrese nuevamente (H/hombre, M/mujer, O/otro):");
            persona.setSexo(input.nextLine().toUpperCase().charAt(0));
        }

        System.out.println("Ingrese el peso (en kg):");
        persona.setPeso(input.nextDouble());

        System.out.println("Ingrese la altura (en metros):");
        persona.setAltura(input.nextDouble());
    }

    public int calcularIMC(Persona persona) {
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
}
