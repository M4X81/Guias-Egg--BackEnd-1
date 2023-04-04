/*
 * Simular la división usando solamente restas. Dados dos números enteros 
mayores que uno, realizar un algoritmo que calcule el cociente y el residuo 
usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un 
resultado menor que el divisor, este resultado es el residuo, y el número de 
restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.

 */
package ejercicios.extra.guia3;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Eje9_Cl6_extra {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dividendo,divisor,contadorRestas = 0;
        System.out.println("Ingrese un número mayor a uno como dividendo");
        dividendo= input.nextInt();
        System.out.println("Ingrese un número mayor a uno como divisor");
        divisor= input.nextInt();
        
        while (dividendo >= divisor) {
            System.out.println(dividendo + " - " + divisor + " = " + (dividendo - divisor) + "    " + (contadorRestas + 1) + " restas realizadas");
            dividendo = dividendo - divisor;
            contadorRestas++;
        }

        System.out.println("El cociente es: " + (contadorRestas));
        System.out.println("El residuo es: " + dividendo);
    }
}

