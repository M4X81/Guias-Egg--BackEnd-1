/*
Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar 
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código 
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
 */
package main;

import entity.Persona;

import service.PersonaService;

/**
 *
 * @author Max
 */
public class Main {

    public static void main(String[] args) {
        PersonaService ps = new PersonaService();
        Persona p1 = new Persona("Juan", 25, 'H', 75.5, 1.75);
        Persona p2 = new Persona("María", 30, 'M', 62.0, 1.60);
        Persona p3 = new Persona("Carlos", 17, 'H', 68.3, 1.80);
        //Persona p4 = new Persona("Laura", 22, 'M', 55.7, 1.68);
        Persona p4 = null;
        try {
            Persona[] personas = {p1, p2, p3, p4};

            int personasPesoIdeal = 0;
            int personasSobrepeso = 0;
            int personasBajoPeso = 0;
            int personasMayoresEdad = 0;
            int personasMenoresEdad = 0;

            for (Persona persona : personas) {
                boolean mayorEdad = persona.esMayorDeEdad(persona);
                int imc = ps.calcularIMC(persona);

                switch (imc) {
                    case 0:
                        personasPesoIdeal++;
                        break;
                    case 1:
                        personasSobrepeso++;
                        break;
                    default:
                        personasBajoPeso++;
                        break;
                }

                if (mayorEdad) {
                    personasMayoresEdad++;
                } else {
                    personasMenoresEdad++;
                }
            }
            double porcentajePesoIdeal = (double) personasPesoIdeal / personas.length * 100;
            double porcentajeSobrepeso = (double) personasSobrepeso / personas.length * 100;
            double porcentajeBajoPeso = (double) personasBajoPeso / personas.length * 100;
            double porcentajeMayoresEdad = (double) personasMayoresEdad / personas.length * 100;
            double porcentajeMenoresEdad = (double) personasMenoresEdad / personas.length * 100;

            System.out.println("");
            System.out.println("Porcentaje de personas en peso ideal: " + porcentajePesoIdeal + "%");
            System.out.println("Porcentaje de personas con sobrepeso: " + porcentajeSobrepeso + "%");
            System.out.println("Porcentaje de personas por debajo del peso ideal: " + porcentajeBajoPeso + "%");
            System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayoresEdad + "%");
            System.out.println("Porcentaje de personas menores de edad: " + porcentajeMenoresEdad + "%");
            for (Persona persona : personas) {
                System.out.println(persona.toString());
            }
        } catch (NullPointerException e) {
            System.out.println("Se produjo una excepción, uno o varios de los objetos creados es : " + e.getMessage());
        }
               
    }
}
