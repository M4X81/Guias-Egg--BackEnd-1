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
package main;

import entity.A;

/**
 *
 * @author Max
 */
public class Main {

    public static void main(String[] args) {
        A objA = new A();
        objA.metodoA();
    }

}

/*
a) Si se produce la excepción MioException, el flujo de ejecución será el siguiente:
Se ejecuta la sentencia_a1 y la sentencia_a2.
Dependiendo donde lanze la excepcion me va a cortar el flujo ( en a3 o a4) y me queda un error.
No aclara bien el tema de donde generar la excepcion (el throw new...) por eso segun donde la ponga es lo q va a hacer.
Si coloco debajo de sentencia_a3 y sentencia_a4 es como si no la pusiera ( se ejecuta como en caso b)

b) Si no se produce la excepción MioException, el flujo de ejecución será el siguiente:
Se ejecuta la sentencia_a1, sentencia_a2,sentencia_a3,sentencia_a4,sentencia_a6,sentencia_a5

*/
/*
El ejercicio 7 es lo mismo, no lo voy a hacer xq la verdad q creo q esta mal planteado o yo no lo entiendo... 
*/