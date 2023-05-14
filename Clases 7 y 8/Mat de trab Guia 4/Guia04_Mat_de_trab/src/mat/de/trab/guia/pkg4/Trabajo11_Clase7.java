/*
 * Ejercicio 11
Escribir un programa que procese una secuencia de caracteres ingresada por 
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de 
la siguiente manera: cada vocal se reemplaza por el carÃ¡cter que se indica en 
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la 
codificaciÃ³n correspondiente. Utilice la estructura â€œsegÃºnâ€� para la transformaciÃ³n. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa deberÃ­a ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package mat.de.trab.guia.pkg4;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Trabajo11_Clase7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();
        String fraseCodificada = codificarFrase(frase.toLowerCase());
        System.out.println("Frase codificada: " + fraseCodificada);
    }

    public static String codificarFrase(String frase) {
        String fraseCodificada = "";
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            switch (caracter) {
                case 'a':
                    fraseCodificada += '@';
                    break;
                case 'e':
                    fraseCodificada += '#';
                    break;
                case 'i':
                    fraseCodificada += '$';
                    break;
                case 'o':
                    fraseCodificada += '%';
                    break;
                case 'u':
                    fraseCodificada += '*';
                    break;
                default:
                    fraseCodificada += caracter;
                    break;
            }
        }
        return fraseCodificada; 
    }
}
