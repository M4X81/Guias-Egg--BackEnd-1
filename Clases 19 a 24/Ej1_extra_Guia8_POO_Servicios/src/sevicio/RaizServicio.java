/*
Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
Método getDiscriminante(): devuelve el valor del discriminante (double). 
El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
para que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 
posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. 
Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará 
por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso 
de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
 */
package sevicio;

import entidad.Raiz;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class RaizServicio {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    private Raiz raizObjeto;

    public Raiz crearRaiz() {
        raizObjeto = new Raiz();

        System.out.println("Ingrese el valor de 'a': ");
        raizObjeto.setA(input.nextDouble());
        System.out.println("Ingrese el valor de 'b': ");
        raizObjeto.setB(input.nextDouble());
        System.out.println("Ingrese el valor de 'c': ");
        raizObjeto.setC(input.nextDouble());

        return raizObjeto;
    }

    public double getDiscriminante() {
        // (b ^ 2) - 4 * a * c
        double discriminante = (Math.pow(raizObjeto.getB(), 2)) - 4 * raizObjeto.getA() * raizObjeto.getC();
        return discriminante;
    }

    //Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
    //para que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices() {
        double discriminante = getDiscriminante();        
        return discriminante >= 0;  
    }
    //Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
    //para que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz() {
        double discriminante = getDiscriminante();        
        return discriminante == 0; 
    }
    //Método obtenerRaices(): llama a tieneRaices() y si devolvió́ true, imprime las 2 
    //posibles soluciones.
    
    public void obtenerRaices(){
        if (tieneRaices()) {
            double formula1 = (-raizObjeto.getB() + Math.sqrt(getDiscriminante())) / (2 * raizObjeto.getA());
            double formula2 = (-raizObjeto.getB() - Math.sqrt(getDiscriminante())) / (2 * raizObjeto.getA());
            System.out.println("La ecuación tiene 2 posibles soluciones: x1 = " + formula1 + ", x2 = " + formula2);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
    //Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. 
    //Es en el caso en que se tenga una única solución posible.
    public void obtenerRaiz(){
        if (tieneRaiz()) {
            double formula = -raizObjeto.getB() / (2 * raizObjeto.getA());
            System.out.println("La ecuación tiene una única solución: x = " + formula);
        } else {
            System.out.println("La ecuación no tiene solución única.");
        }
    }
     /*
     Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará 
por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso 
de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
     */
    public void calcular(){
        if (tieneRaiz()) {
            obtenerRaiz();         
        } else if (tieneRaices()) {
            obtenerRaices();            
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
}
