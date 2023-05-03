/*
1-Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos 
una frase (String) y su longitud. Agregar constructor vacío y con atributo frase solamente. 
Agregar getters y setters. El constructor con frase como atributo debe setear la longitud 
de la frase de manera automática. Crear una clase CadenaServicio en el paquete 
servicios que implemente los siguientes métodos:
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario 
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone 
la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena 
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa 
el usuario y devuelve verdadero si la contiene y falso si no.
 */
package servicio;

import entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class CadenaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Creacion del objeto
    public Cadena crearCadena() {
        Cadena objetoCadena = new Cadena();

        System.out.println("Ingrese una frase");
        objetoCadena.setFrase(leer.next());

        return objetoCadena;
    }

    //Metodo a)
    public void mostrarVocales(Cadena objetoCadena) {
        int contador = 0;

        for (int i = 0; i < objetoCadena.getLongitudFrase(); i++) {
            char vocal = objetoCadena.getFrase().charAt(i);
            if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
                contador++;
            }
        }
        System.out.println("La cantidad de vocales es: " + contador);
    }

    //Metodo b)
    public void invertirFrase(Cadena objetoCadena) {

        // Crear un StringBuilder a partir de la cadena
        StringBuilder stringBuilder = new StringBuilder(objetoCadena.getFrase());
        // Y llamar al mÃ©todo reverse de StringBuilder (lo convertimos a cadena con toString)
        String invertida = stringBuilder.reverse().toString();
        System.out.println("Cadena original: " + objetoCadena.getFrase());
        System.out.println("Cadena invertida: " + invertida);
    }

    //Metodo c)
    public void vecesRepetido(Cadena objetoCadena) {

        System.out.println("Ingrese una vocal a contabilizar: ");

        char vocalBuscada = leer.next().charAt(0);

        int contadorVocal = 0;

        for (int i = 0; i < objetoCadena.getLongitudFrase(); i++) {
            char vocal = objetoCadena.getFrase().charAt(i);
            if (vocal == vocalBuscada) {
                contadorVocal++;
            }
        }
        System.out.println("La cantidad de " + vocalBuscada + " en la frase es de: " + contadorVocal);
    }

    //Metodo d)
    public void comprarLongitud(Cadena objetoCadena) {

        System.out.println("Ingrese otra frase: ");
        String FraseNueva = leer.next();
        int longFraseNueva = FraseNueva.length();

        if (objetoCadena.getLongitudFrase() < longFraseNueva) {
            System.out.println("La longitud de la nueva frase es mas grande que la primera frase ingresada.");

        } else if (objetoCadena.getLongitudFrase() > longFraseNueva) {
            System.out.println("La longitud de la nueva frase es menor que la primera frase ingresada.");
        } else {
            System.out.println("La longitud de la nueva frase es igual que la primera frase ingresada.");
        }
    }

    //Metodo e)
    public void unirFrase(Cadena objetoCadena) {
        System.out.println("Ingrese una frase a concatenar: ");
        String fraseConcatenar = leer.next();
        System.out.println("La frase concatenada es: ");
        System.out.println(objetoCadena.getFrase() + " " + fraseConcatenar);
    }

    //Metodo f)
    public void reemplazar(Cadena objetoCadena) {
        System.out.println("Ingrese un caracter que sera reemplazado en la frase por todas las 'a' que tenga: ");
        char vocalReemplazo = leer.next().charAt(0);

        String nuevaFrase = objetoCadena.getFrase().replace('a', vocalReemplazo);
        System.out.println(nuevaFrase);
    }

    //Metodo g)
    public void contiene(Cadena objetoCadena) {
        System.out.println("Ingrese la letra que desea buscar en la frase: ");
        String letraBuscar = leer.next();

        boolean tieneLetra = objetoCadena.getFrase().contains(letraBuscar);
        System.out.println(tieneLetra);
    }
}
