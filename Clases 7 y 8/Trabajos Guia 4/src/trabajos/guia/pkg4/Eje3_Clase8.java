/*
* Crea una aplicación que a través de una función nos convierta una
* cantidad de euros introducida por teclado a otra moneda, estas pueden ser
* a dólares, yenes o libras. La función tendrá como parámetros, la cantidad
* de euros y la moneda a convertir que será una cadena, este no devolverá
* ningún valor y mostrará un mensaje indicando el cambio (void).
*
* El cambio de divisas es: 0.86 libras es un 1 € 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*
*/

package trabajos.guia.pkg4;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Eje3_Clase8 {
 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de Euros: ");
    System.out.println("Euros: ");
        double euros = leer.nextDouble();

    System.out.println (

    "");
    System.out.println (

    "A qué divisa desea convertir"
                + "\nLibra"
                + "\nDolar"
                + "\nYen");
    leer.nextLine ();
    String divisa = leer.nextLine();

    conversionDivisas(euros, divisa);
}

public static int conversionDivisas(double euros, String divisa) {
        double valorConvertido = 0;
        String valor = "h";

        if (divisa.equalsIgnoreCase("Libra")) {
            valorConvertido = euros * 0.86;
            valor = "Libras";
        } else if (divisa.equalsIgnoreCase("Dolar")) {
            valorConvertido = euros * 1.28611;
            valor = "Dólares";
        } else if (divisa.equalsIgnoreCase("Yen")) {
            valorConvertido = euros * 129.852;
            valor = "Yenes";
        }

        System.out.println(euros + " euros son igual a: " + valorConvertido
                + " " + valor);
        return 0;
    }
}

