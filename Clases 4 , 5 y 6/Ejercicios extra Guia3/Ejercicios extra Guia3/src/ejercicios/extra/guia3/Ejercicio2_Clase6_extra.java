/*
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un
 * valor diferente a cada una. A continuaciÃ³n, realizar las
* instrucciones necesarias para que: B tome el valor de C, C tome el
* valor de A, A tome el valor de D y D tome el valor de B. Mostrar los
* valores iniciales y los valores finales de cada variable. Utilizar
 * sÃ³lo una variable auxiliar.
 */
package ejercicios.extra.guia3;

/**
 *
 * @author Max
 */
public class Ejercicio2_Clase6_extra {
     public static void main(String[] args) {
        int A,B,C,D, variableAuxiliar;
        
        A = (int)Math.floor(Math.random()*10);
        
        // Generamos un nÃºmero aleatorio para B
        do {
            B = (int)Math.floor(Math.random()*10);
 
        } while (A == B);
        
        // Generamos un nÃºmero aleatorio para C
        do {          
            C = (int)Math.floor(Math.random()*10);
        
        } while (A == C && B == C);
        
        // Generamos un nÃºmero aleatorio para D
        do {          
            D = (int)Math.floor(Math.random()*10);

        } while (A == D && B == D && C == D);
        
        System.out.println("Valores iniciales:\n" + "A: " + A + "\nB: " + B + "\nC: " + C + "\nD: " + D);
        
        variableAuxiliar = B;
        B = C;
        C = A;
        A = D;
        D = variableAuxiliar;
        
        System.out.println("Valores Finales:\n" + "A: " + A + "\nB: " + B + "\nC: " + C + "\nD: " + D);
    }
}
