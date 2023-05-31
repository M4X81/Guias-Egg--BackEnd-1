/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package entidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver revolver;
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Juego() {
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public void llenarJuego() {
        ArrayList<Jugador> jugadores = new ArrayList();
        int cantidadJug;
        do {
            System.out.println("Ingrese cantidad de jugadores (6 como máximo)");
            cantidadJug = input.nextInt();
        } while (cantidadJug > 6 || cantidadJug < 2);
        int id=1;
        for (int i = 0; i < cantidadJug; i++) {
            Jugador jugador = new Jugador(id);
            jugadores.add(jugador);
            id++;
        }
        this.jugadores = jugadores;
        this.revolver = new Revolver();
        revolver.llenarRevolver();
        System.out.println(revolver.toString());
    }

    public void ronda() {
        boolean juego = true;
        do {
            for (Jugador jugador : jugadores) {
                jugador.disparo(revolver, jugador);
                System.out.println(jugador.getNombre() + " te toca...");
                System.out.println("Continuar");                               
                if (jugador.isMojado()) {
                    juego=false;
                    System.out.println("El juego se ha terminado, el jugador " + jugador.getNombre() + " se mojo.");
                    break;
                }
            }
        } while (juego);

    }
}
