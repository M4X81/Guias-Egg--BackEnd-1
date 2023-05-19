/*
6. Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package servicio;

import entidad.Tienda;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Max
 */
public class TiendaServicio {

    HashMap<String, Double> productos = new HashMap();
    /*
    creo un tree map xq sino no voy a poder ordenar el mapa y a este le cargo 
    "productos" que serian los elementos del hashMap
    */
    TreeMap<String, Double> productosTree= new TreeMap<>(productos);
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    Tienda producto = new Tienda();

    public void menu() {
//        System.out.println("Bienvenido a la interfaz de tu tienda.");
//        System.out.println("A continuación tendrás las opciones de tu tienda...");
//        System.out.println(" ");
        System.out.println("|----------Menú---------|");
        System.out.println("| 1- Ingresar productos |");
        System.out.println("| 2- Modificar precios  |");
        System.out.println("| 3- Quitar producto    |");
        System.out.println("| 4- Mostrar lista      |");
        System.out.println("| 5- Ordenar lista      |");
        System.out.println("| 6- Salir              |");
        System.out.println("|-----------------------|");
    }
public void crearProducto() {
    Tienda producto = new Tienda();

    System.out.println("Ingrese el nombre del producto a registrar: ");
    producto.setNombreProducto(input.nextLine());
    System.out.println("Ingrese su valor");
    producto.setPrecio(input.nextDouble());
    input.nextLine(); 

    productos.put(producto.getNombreProducto(), producto.getPrecio());
}

    public void modificarPrecio() {

        System.out.println("Ingrese el producto al cual desea modificar su valor.");
        String modifPrecio = input.nextLine();
        System.out.println("Ingrese su nuevo valor");
        double NuevoPrecio = input.nextDouble();
        input.nextLine();
        if (productos.containsKey(modifPrecio)) {
            productos.put(modifPrecio, NuevoPrecio);
            System.out.println("El valor de <" + modifPrecio + "> fue modificado exitosamente.");
        } else {
            System.out.println("El producto <" + modifPrecio + "> no se encuentra en la lista");
        }
        System.out.println(productos);
    }

    public void eliminarProducto() {
        System.out.println("Ingrese el producto que desea eliminar de la lista.");
        String eliminarProd = input.nextLine();
        if (productos.containsKey(eliminarProd)) {
            productos.remove(eliminarProd);
            System.out.println("El producto <" + eliminarProd + "> fue eliminado exitosamente.");
        } else {
            System.out.println("El producto <" + eliminarProd + "> no se encuentra en la lista");
        }
        System.out.println(productos);
    }
    public void mostrarProductos(){
        for(Map.Entry<String, Double> entry : productos.entrySet()){
            System.out.println("Producto: " + entry.getKey());
            System.out.println("Precio: " + entry.getValue());
        }
    }
    public void mostrarOrdenados(){
        System.out.println("Ordenando productos...");
        Iterator<Map.Entry<String, Double>> iterator = productosTree.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Double> entry = iterator.next();
            System.out.println("Producto: " + entry.getKey());
            System.out.println("Precio: " + entry.getValue());
        }
    }
}
