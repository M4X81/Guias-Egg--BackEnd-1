/*Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con 
los atributos capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) 
y cantidadActual (la cantidad actual de café que hay en la cafetera). Agregar constructor 
vacío y con parámetros así como setters y getters. Crear clase CafeteraServicio en el 
paquete Servicios con los siguiente:
a-Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
b-Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe 
el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. 
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
El método le informará al usuario si se llenó o no la taza, y de no haberse llenado 
en cuanto quedó la taza.
c-Método vaciarCafetera(): pone la cantidad de café actual en cero. 
d-Método agregarCafe(int): se le pide al usuario una cantidad de café, el método 
lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
package servicio;

import entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class cafeteraServicio {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    private Cafetera cafetera;

    public cafeteraServicio(Cafetera cafetera) {
        this.cafetera = cafetera;
    }
//a-Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
   // Cafetera cafeteraServicio = new Cafetera(1000, 0);

    public void llenarCafetera() {

        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("La cafetera ahora esta llena en su totalidad "
                + "( " + cafetera.getCapacidadMaxima() + " ml.)");
    }

    /*b-Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe 
el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. 
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
El método le informará al usuario si se llenó o no la taza, y de no haberse llenado 
en cuanto quedó la taza.*/
    public void servirTaza() {
        System.out.println("Ingrese la capacidad de su taza en ml");
        int taza = input.nextInt();
        if (taza <= cafetera.getCantidadActual()) {
            System.out.println("La taza se ha llenado en su totalidad (" + taza + " ml)");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
        } else {
            System.out.println("No hay suficiente café para llenar la taza en su totalidad. "
                    + "La taza se ha llenado con " + cafetera.getCantidadActual() + " ml.");
            cafetera.setCantidadActual(0);
        }
    }

    //c-Método vaciarCafetera(): pone la cantidad de café actual en cero. 
    public void vaciarCafetera() {
        cafetera.setCantidadActual(0);
        System.out.println("La cafetera ha sido vaciada"
                + " su contenido actual es : " + cafetera.getCantidadActual() + " ml");
    }

    //d-Método agregarCafe(int): se le pide al usuario una cantidad de café, el método 
    //lo recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe() {
        System.out.println("ingrese la cantidad de cafe que desea agregar");
        int agregar = input.nextInt();
        if ((agregar <= cafetera.getCapacidadMaxima()) && ((agregar + cafetera.getCantidadActual()) <= cafetera.getCapacidadMaxima())) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() + agregar);
            System.out.println("Ahora su cafetera cuenta con " + cafetera.getCantidadActual() + " ml");
        } else {
            System.out.println("La cantidad que desea agregar es mayor a la capacidad de "
                    + "la cafetera.");
        }

    }
}
