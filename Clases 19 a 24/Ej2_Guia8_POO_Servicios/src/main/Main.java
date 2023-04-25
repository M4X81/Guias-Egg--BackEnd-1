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
package main;

import entidad.Cafetera;
import java.util.Scanner;
import servicio.cafeteraServicio;


/**
 *
 * @author Max
 */
public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    Cafetera cafetera = new Cafetera(1000, 0);
    cafeteraServicio cafeteraServicio = new cafeteraServicio(cafetera);
    char respuesta = 'x';
    int opcion;

    do {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Revisar cafetera");
        System.out.println("2. Llenar la cafetera");
        System.out.println("3. Servir una taza");
        System.out.println("4. Vaciar la cafetera");
        System.out.println("5. Agregar café");
        System.out.println("6. Salir");
        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La cantidad actual de la cafetera es " + cafetera.getCantidadActual()+ " ml" );
                break;
            case 2:
                cafeteraServicio.llenarCafetera();
                        
                break;
            case 3:
                cafeteraServicio.servirTaza();
                break;
            case 4:
                cafeteraServicio.vaciarCafetera();
                break;
            case 5:
                cafeteraServicio.agregarCafe();
                break;
            case 6:
                System.out.println("Hasta luego!");
                respuesta = 's';
                break;
            default:
                System.out.println("Opción inválida. Por favor intente de nuevo.");
        }
    } while (!(respuesta == 's'));
}

}


