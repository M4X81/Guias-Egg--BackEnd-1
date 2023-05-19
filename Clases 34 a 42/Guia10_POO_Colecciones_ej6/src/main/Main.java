/*
6. Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package main;

import java.util.Scanner;
import servicio.TiendaServicio;

/**
 *
 * @author Max
 */
public class Main {

    public static void main(String[] args) {
        TiendaServicio tiendaServ = new TiendaServicio();
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        do {
            tiendaServ.menu();
            System.out.println("Ingrese la opción a realizar.");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    tiendaServ.crearProducto();
                    break;
                case 2:
                    tiendaServ.modificarPrecio();
                    break;
                case 3:
                    tiendaServ.eliminarProducto();
                    break;
                case 4:
                    tiendaServ.mostrarProductos();
                    break;
                case 5:
                    tiendaServ.mostrarOrdenados();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    System.out.println("Hasta luego!!");
                    break;
            }
        }while (opcion < 6 && opcion > 0);   
    }
}