/*
Dado el método metodoA de la clase A, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
class A {
public void metodoA() {
sentencia_a1
sentencia_a2
try { 
sentencia_a3
sentencia_a4
} catch (MioException e){ 
sentencia_a6 
 } 
sentencia_a5
 } 
} 
 */
package entity;

import exceptions.MioException;

/**
 *
 * @author Max
 */
public class A {

    public void metodoA() {
        System.out.println("sentencia_a1");
        System.out.println("sentencia_a2");

        try {
            
            System.out.println("sentencia_a3");
            
            System.out.println("sentencia_a4");
            throw new MioException();
            

        } catch (MioException e) {
            System.out.println("sentencia_a6");
            }
            System.out.println("sentencia_a5");
    }
}
