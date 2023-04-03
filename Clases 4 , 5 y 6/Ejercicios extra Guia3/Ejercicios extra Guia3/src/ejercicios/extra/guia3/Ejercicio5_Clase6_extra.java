/*
 * Una obra social tiene tres clases de socios: Los socios tipo â€˜Aâ€™
* abonan una cuota mayor, pero tienen un 50% de descuento en todos los
* tipos de tratamientos. Los socios tipo â€˜Bâ€™ abonan una cuota moderada
* y tienen un 35% de descuento para los mismos tratamientos que los
* socios del tipo A. Los socios que menos aportan, los de tipo â€˜Câ€™, no
* reciben descuentos sobre dichos tratamientos. Solicite una letra
* (carÃ¡cter) que representa la clase de un socio, y luego un valor real
* que represente el costo del tratamiento (previo al descuento) y
* determine el importe en efectivo a pagar por dicho socio.
 */
package ejercicios.extra.guia3;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Ejercicio5_Clase6_extra {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        Scanner leer = new Scanner(System.in);

        String letra;
        Double costo, costosocio;

        do {
            System.out.println("ingrese que tipo de socio es");
            letra = leer.next();
            //letra = leer.nextLine().substring(0, 1);
            letra = letra.toUpperCase();
            if (!letra.equals("A") && !letra.equals("B") && !letra.equals("C")) {
                System.out.println("No existe la categoria de socio, por favor ingrese una correcta");                
            }
        } while (!letra.equalsIgnoreCase("A") && !letra.equals("B") && !letra.equals("C"));

        System.out.println("ingrese el costo del tratamiento");
        costo = leer.nextDouble();

        switch (letra) {
            case "A":
                costosocio = costo * 0.5;
                System.out.println("El costo que debera abonar el socio es: $" + costosocio);
                break;
            case "B":
                costosocio = costo * 0.65;
                System.out.println("El costo que debera abonar el socio es: $" + costosocio);
                break;
            case "C":
                costosocio = costo;
                System.out.println("El costo que debera abonar el socio es: $" + costosocio);
                break;
        }
    }
    
}
