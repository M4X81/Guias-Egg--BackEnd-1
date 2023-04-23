/*
1) Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
Crea tres objetos de la clase "Coche" y muéstralos por pantalla.
 */
package ej1_extra_cl17_poo;

import ej1_extra_cl17_poo.Coche.Coche;
import java.util.Scanner;
/**
 *
 * @author Max
 */
public class Ej1_extra_Cl17_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Coche coche1=new Coche("BMW","320",85000); 
//        Coche coche2=new Coche("Citroen", "C3",6500); 
//        Coche coche3=new Coche("Ford","Ranger",25000); 
//        
//        Coche[] coches = {coche1, coche2, coche3};
//    for (Coche coche : coches) {
//        System.out.println(coche.toString());
//    }
//    }

        
        //esta es x si los quiero ingresar x teclado
        Scanner scanner = new Scanner(System.in);
        
        Coche[] coches = new Coche[3]; // Creamos un arreglo de coches vacío
        
        for (int i = 0; i < coches.length; i++) {
            System.out.println("Ingrese los datos del coche " + (i+1) + ":");
            
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Consumimos el salto de línea después del double 
                                //sino no me toma el ingreso
            
            Coche coche = new Coche(marca, modelo, precio);
            coches[i] = coche; // Agregamos el coche al arreglo
        }
        
        for (Coche coche : coches) {
            System.out.println(coche.toString());
        }
    }
}



