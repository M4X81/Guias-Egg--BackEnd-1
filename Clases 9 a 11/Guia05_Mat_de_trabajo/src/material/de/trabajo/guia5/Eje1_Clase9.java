/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package material.de.trabajo.guia5;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Eje1_Clase9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println(
                "Ingrese la cantidad de integrantes");
        int integrantes = leer.nextInt();

        leer.nextLine(); //agregue esto
        String[] vector = new String[integrantes];
        for (int i = 0;
                i < integrantes;
                i++) {
            System.out.println("Ingrese el participante Nro: " + (i + 1));
            vector[i] = leer.nextLine();
            //leer.nextLine();

        }

        //System.out.println("a escribir");
        for (int i = 0;
                i < integrantes;
                i++) {
            System.out.print("Participante nro: " + (i + 1));
            System.out.println(" " + vector[i]);

        }

    }
}
