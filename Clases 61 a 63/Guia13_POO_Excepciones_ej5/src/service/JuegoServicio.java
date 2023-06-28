/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora 
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para 
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el 
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando 
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario 
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe 
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el 
carácter fallido como un intento
 */
package service;

import entity.Juego;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class JuegoServicio {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    public static int contador = 0;
    Juego juego = new Juego();

    public void iniciarJuego() {
        System.out.println("Iniciando juego: ");
        System.out.println("La computadora \n"
                + "generará un número aleatorio entre 1 y 500, y usted tiene que intentar adivinarlo");
        System.out.println("Generando número aleatorio...");
        juego.setNum(juego.getNum());
        //System.out.println("el numero es " +juego.getNum());
        System.out.println("No hay limite para la cantidad de intentos, cuando ya no quiera jugar más, ingrese 0");
    }

  public void jugar() {
    System.out.println("Comienza el juego...");
   // System.out.println(juego.getNum());
    int rta = 0;
    do {
        try {
            System.out.println("Ingrese cualquier número o 0 para salir");
            rta = input.nextInt();
            contador++; 
        } catch (InputMismatchException e) {
            System.out.println("Recuerde que debe ingresar números enteros...");
            input.nextLine();
            contador++; 
            continue; 
        }
        
        if (rta < juego.getNum() && rta != 0) {
            System.out.println("El número a adivinar es mayor a este...");
        } else if (rta == juego.getNum()) {
            System.out.println("Acertaste!!!!");
        } else if (rta > juego.getNum()) {
            System.out.println("El número a adivinar es menor a este...");
        } else if (rta == 0) {
            System.out.println("Saliendo del juego...");
        }
    } while (rta != 0 && rta != juego.getNum());
    
    System.out.println("El numero era el " + juego.getNum());
    System.out.println("El número total de intentos fue: " + contador);
}

}
