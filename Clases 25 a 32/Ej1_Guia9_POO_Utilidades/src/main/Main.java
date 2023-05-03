/*
1-Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos 
una frase (String) y su longitud. Agregar constructor vacío y con atributo frase solamente. 
Agregar getters y setters. El constructor con frase como atributo debe setear la longitud 
de la frase de manera automática. Crear una clase CadenaServicio en el paquete 
servicios que implemente los siguientes métodos:
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario 
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone 
la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena 
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa 
el usuario y devuelve verdadero si la contiene y falso si no.
 */
package main;

import entidad.Cadena;
import java.util.Scanner;
import servicio.CadenaServicio;

/**
 *
 * @author Max
 */
public class Main {
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio miCadenaServicio = new CadenaServicio();
        Cadena miCadena = miCadenaServicio.crearCadena();

        int opcion;
        char respuesta = 'a';

        do {
            System.out.println("Menu de Opciones");
            System.out.println("1 - Contar la cantidad de vocales que contiene la frase.");
            System.out.println("2 - Invertir frase.");
            System.out.println("3 - Cuantas veces se repite un caracter.");
            System.out.println("4 - Comparacion de longitud de frases.");
            System.out.println("5 - Concatenar frase.");
            System.out.println("6 - Reemplazar las 'a' de la frase original.");
            System.out.println("7 - Comprueba la existencia de un caracter en la frase original.");
            System.out.println("8 - Salir.");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    miCadenaServicio.mostrarVocales(miCadena);
                    break;
                case 2:
                    miCadenaServicio.invertirFrase(miCadena);
                    break;
                case 3:
                    miCadenaServicio.vecesRepetido(miCadena);
                    break;
                case 4:
                    miCadenaServicio.comprarLongitud(miCadena);
                    break;
                case 5:
                    miCadenaServicio.unirFrase(miCadena);
                    break;
                case 6:
                    miCadenaServicio.reemplazar(miCadena);
                    break;
                case 7:
                    miCadenaServicio.contiene(miCadena);
                    break;

                case 8:
                    System.out.println("Desea salir? s/n");
                    respuesta = leer.next().charAt(0);
                    break;
            }
        } while (!(respuesta == 's'));
    }
}
