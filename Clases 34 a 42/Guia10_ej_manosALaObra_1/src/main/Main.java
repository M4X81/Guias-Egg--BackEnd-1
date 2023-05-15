/*
EJERCICIO COLECCIONES
Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
 */
package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        //LISTAS
        ArrayList<Integer> numerosA = new ArrayList();//lista tipo Integer
        int x = 20;
        numerosA.add(x); //agregamos el numero 20 a la lista, en la posicion 0

        //CONJUNTOS
        HashSet<Integer> numerosB = new HashSet();
        Integer y = 20;
        numerosB.add(y);

        //MAPAS
        HashMap<Integer, String> alumnos = new HashMap();
        int dni = 34576189;
        String nombreAlumno = "Pepe";
        alumnos.put(dni, nombreAlumno);//agregamos la llave y el valor

        /*
        EJERCICIO COLECCIONES
Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
         */
        //  listas
        System.out.println("Cargamos las listas: ");
        for (int i = 0; i < 5; i++) {
            int numRandom = (int) (Math.random() * 10) + 1;
            numerosA.add(numRandom);
        }

        for (int numero : numerosA) {
            System.out.println(numero);
        }
        //este tambien se puede plantear asi:
//         numerosA.forEach((numero) -> {
//            System.out.println(numero);
//        });

        //conjuntos
        System.out.println("Ahora los conjuntos: ");
        for (int i = 0; i < 5; i++) {
            int numRandom = (int) (Math.random() * 100) + 1;
            numerosB.add(numRandom);
            /*
             utilizando el random en este tipo de coleccion cuando me genera el numero 20, 
             que ya esta cargado manualmente no lo toma(xq no acepta elementos repetidos) 
             por lo tanto solo se carga una vez el numero 20. en las listas puede aparecer 2 veces
             */
        }
        for (int numero : numerosB) {
            System.out.println(numero);
        }

        //mapas
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese DNI de la persona " + i);
            int dniAlumnos = input.nextInt();
            input.nextLine();
            System.out.println("Ingrese el nombre de la persona " + i);
            String nombre = input.nextLine();

            alumnos.put(dniAlumnos, nombre);
        }
        for (Integer documAlumno : alumnos.keySet()) {
            String nombre = alumnos.get(documAlumno);
            System.out.println("DNI: " + documAlumno + ", Nombre: " + nombre);
        }
        
        /*
        Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina en cada uno un objeto de
cada forma que aprendiste arriba.
        */
        
        
    }

}
