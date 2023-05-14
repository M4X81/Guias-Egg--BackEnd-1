/*
2-Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, 
un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad 
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos en AhorcadoService:
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de 
la palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas 
y el valor que ingresó el usuario.
Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
Nota: buscar como se usa el vector.length.
Método buscar(letra):  este método recibe una letra dada por el usuario y busca 
si la letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre 
cuantas letras han sido encontradas y cuántas le faltan. Este método además deberá 
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez 
que se busque una letra que no esté, se le restará uno a sus oportunidades.
Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
Método juego(): el método juego se encargará de llamar todos los métodos previamente 
mencionados e informará cuando el usuario descubra toda la palabra o se quede sin intentos. 
Este método se llamará en el main.
 */
package service;

import entity.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class AhorcadoService {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    private boolean[] letrasEncontradas;
    private char[] palabra;
    private int letrasEncontradasCount = 0;
    private int letrasFaltantes = 0;
    Ahorcado juegoAhorcado = new Ahorcado();

    /*
    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de 
la palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas 
y el valor que ingresó el usuario.
     */
    public void crearJuego() {
        System.out.println("Ingrese la palabra a adivinar para comenzar el juego.");
        String palabraJuego = input.nextLine();
        // tomo la palabra ingresada y la cargo en un vector
        palabra = new char[palabraJuego.length()];
        for (int i = 0; i < palabraJuego.length(); i++) {
            palabra[i] = palabraJuego.charAt(i);
        }
        juegoAhorcado.setJugadasMax(palabraJuego.length() + 2);
        System.out.println("La cantidad máxima de intentos será igual al largo de la palabra + 2.");
        System.out.println("Sus intentos serán : " + juegoAhorcado.getJugadasMax());
    }

    //Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
    public int longitud() {
        int longPalabra = juegoAhorcado.getJugadasMax();
        System.out.println("La palabra ingresada tiene " + (longPalabra-2) + " letras.");
        return longPalabra;
    }

    //Método buscar(letra):  este método recibe una letra dada por el usuario y busca 
    //si la letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    public boolean buscar() {
    letrasEncontradas = new boolean[palabra.length];
    int intentos = juegoAhorcado.getJugadasMax();

    do {
        System.out.println("Jugador, ingrese la letra.");
        String letraIngresada = input.next();
        boolean encontrada = false;
        for (int i = 0; i < palabra.length; i++) {
            if (!letrasEncontradas[i] && letraIngresada.charAt(0) == palabra[i]) {
                letrasEncontradas[i] = true;
                encontrada = true;
                letrasEncontradasCount++;
                intentos--;
                System.out.println("La letra ingresada está en la palabra en la posición " + i + ". Quedan " + intentos + " intentos.");
            }
        }
        if (!encontrada) {
            intentos--;
            System.out.println("La letra no está en la palabra. Quedan " + intentos + " intentos.");
        }

        letrasFaltantes = palabra.length - letrasEncontradasCount;
        System.out.println("Letras encontradas: " + letrasEncontradasCount);
        System.out.println("Letras faltantes: " + letrasFaltantes);

    } while (intentos > 0 && letrasFaltantes > 0);

    return letrasFaltantes == 0;
}



    /*
    Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre 
cuantas letras han sido encontradas y cuántas le faltan. Este método además deberá 
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez 
que se busque una letra que no esté, se le restará uno a sus oportunidades.
     */
    public boolean encontradas(char letra) {
        letrasEncontradasCount = 0;
        for (int i = 0; i < palabra.length; i++) {
            if (letra == palabra[i]) {
                letrasEncontradasCount++;
            }
        }

        letrasFaltantes = palabra.length - letrasEncontradasCount;
        System.out.println("Letras encontradas: " + letrasEncontradasCount);
        System.out.println("Letras faltantes: " + letrasFaltantes);

        return letrasEncontradasCount > 0;
    }

    //Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
    public void intentos() {
        int oportunidadesRestantes = juegoAhorcado.getJugadasMax();
        for (boolean encontrada : letrasEncontradas) {
            if (encontrada) {
                letrasEncontradasCount++;
            }
        }
        int letrasFaltantes = palabra.length - letrasEncontradasCount;
        oportunidadesRestantes -= letrasFaltantes;
        System.out.println("Le quedan " + oportunidadesRestantes + " intentos.");
    }

    /* Método juego(): el método juego se encargará de llamar todos los métodos previamente 
mencionados e informará cuando el usuario descubra toda la palabra o se quede sin intentos. 
Este método se llamará en el main.
     */
    public void juego() {
        crearJuego();
        longitud();
        boolean encontrada = buscar();

        if (encontrada) {
            System.out.println("¡Felicidades! Has adivinado la palabra.");
        } else {
            System.out.println("Has agotado tus intentos. La palabra era: " + new String(palabra));
        }
    }
}
