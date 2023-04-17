/*
 3-Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores 
jugar un juego de adivinanza de números. El primer jugador elige un número y el 
segundo jugador intenta adivinarlo. El segundo jugador tiene un número limitado 
de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento. 
El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. 
Registra el número de intentos necesarios para adivinar el número y el número de 
veces que cada jugador ha ganado.

 */
package ej3_guia7_extra_poo.Juego;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Juego {

    private int ganados_jugador1;
    private int ganados_jugador2;

    public Juego() {
        ganados_jugador1 = 0;
        ganados_jugador2 = 0;
    }

    public void iniciar_juego() {
        Scanner input = new Scanner(System.in);

        boolean continuar_jugando = true;//con esto continuo hasta que lo paso a false( sigo el ciclo)
        while (continuar_jugando) {
            System.out.println("Jugador 1, por favor elija un número: ");
            int numero_a_adivinar = input.nextInt();

            int intentos_restantes = 5;
            boolean adivino_numero = false;
            while (intentos_restantes > 0 && !adivino_numero) {
                System.out.println("Jugador 2, adivina el número: ");
                int intento = input.nextInt();

                if (intento == numero_a_adivinar) {
                    System.out.println("¡Felicidades, adivinaste el número en " + (6 - intentos_restantes) + " intentos!");
                    ganados_jugador2++;
                    adivino_numero = true;
                } else if (intento > numero_a_adivinar) {
                    System.out.println("El número es más bajo.");
                } else {
                    System.out.println("El número es más alto.");
                }

                intentos_restantes--;
            }

            if (!adivino_numero) {
                System.out.println("Lo siento, se te acabaron los intentos. El número era " + numero_a_adivinar);
                ganados_jugador1++;
            }

            System.out.println("Jugador 1 ha ganado " + ganados_jugador1 + " veces.");
            System.out.println("Jugador 2 ha ganado " + ganados_jugador2 + " veces.");

            System.out.println("¿Quieren jugar de nuevo? (s/n)");
            String respuesta = input.next();
            //cualquier rta diferene a "s" cierra el ciclo
            if (!respuesta.toLowerCase().equals("s")) {
                continuar_jugando = false;
            }
        }

    }
}
