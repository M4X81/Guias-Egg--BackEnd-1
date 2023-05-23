/*
1. Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package servicio;

import entidad.ListaNumero;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class ListaServicio {

    ArrayList<Integer> numeros = new ArrayList();
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void crearLista() {
        ListaNumero lista = new ListaNumero();
        int numIngresado;
        int contador = 0;
        do {
            System.out.println("Ingrese números enteros para agregar a la lista");
            numIngresado = input.nextInt();
            if (numIngresado != (-99)) {
                lista.setNumeros(numIngresado);
                numeros.add(numIngresado);
                contador++;
            }
        } while (numIngresado != (-99));
        System.out.println("Se han cargado " + contador + " números.");
    }

    public void mostrarLista() {       
        System.out.println("La lista de números ingresada es: ");
        for (Integer numero : numeros) {
            System.out.println(numero);            
        }       
    }
    public void sumaNumeros(){
        int suma=0;
        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);           
        }
        System.out.println("La suma de los números ingresados es: " + suma);
        System.out.println("Y el promedio de los mismos es: " + suma/(numeros.size()));
    }
}
