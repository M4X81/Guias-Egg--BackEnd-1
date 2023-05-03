/*
2-Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales 
con los cuales se realizarán diferentes operaciones matemáticas. 
La clase debe tener un constructor vacío, getters y setters.  
En el constructor vacío se usará el Math.random para generar los dos números. 
Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además 
implementar los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase 
elevado al menor número. Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package servicio;

import entidad.ParDeNumero;

/**
 *
 * @author Max
 */
public class ParDeNumeroServicio {

    ParDeNumero parNum = new ParDeNumero();

    public ParDeNumero cargarNumeros() {
        parNum.setNumeroA(Math.random() * 10 + 1);
        parNum.setNumeroB(Math.random() * 10 + 1);
        return parNum;
    }

    //Método mostrarValores que muestra cuáles son los dos números guardados.
    public void mostrarValores() {
        System.out.println("El valor de la variable A es: " + parNum.getNumeroA());
        System.out.println("El valor de la variable B es: " + parNum.getNumeroB());
    }

    //Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
    public double devolverMayor() {
        double mayorNum = 0;
        double menorNum = 0;
        if (parNum.getNumeroA() > parNum.getNumeroB()) {
            mayorNum = parNum.getNumeroA();
            menorNum = parNum.getNumeroB();
        } else if (parNum.getNumeroA() == parNum.getNumeroB()) {
            System.out.println("Ambos numeros son iguales ");
        } else {
            mayorNum = parNum.getNumeroB();
            menorNum = parNum.getNumeroA();
        }
        /*tambien puedo usar el metodo Math.max/min para sacar directamente cual es el mayor
        o el menor:
        con esta me ahorro codigo y la puedo reutilizar en todos los metodos
        en vez de usar el condicional if:
        double mayorNum = Math.max(parNum.getNumeroA(), parNum.getNumeroB());
        double menorNum = Math.min(parNum.getNumeroA(), parNum.getNumeroB());
         */       
        return mayorNum;
    }

    //Método calcularPotencia para calcular la potencia del mayor valor de la clase 
    //elevado al menor número. Previamente se deben redondear ambos valores.
    public long calcularPotencia() {
        double mayorNum = devolverMayor();
        double menorNum = 0;
        if (parNum.getNumeroA() > parNum.getNumeroB()) {
            menorNum = parNum.getNumeroB();
        } else {
            menorNum = parNum.getNumeroA();
        }
        mayorNum = Math.round(mayorNum);
        menorNum = Math.round(menorNum);
        /*
        Aca seria lo mismo, puedo hacer el if o simplificar con el metodo Math.max/min
        double mayorNum = Math.round(Math.max(parNum.getNumeroA(), parNum.getNumeroB()));
        double menorNum = Math.round(Math.min(parNum.getNumeroA(), parNum.getNumeroB()));
         */
        System.out.println("Los valores redondeados son: "); 
        System.out.println("Valor máximo: " +Math.round(mayorNum));
        System.out.println("Valor mínimo: " +Math.round(menorNum));
        System.out.println("El resultado de elevar " + mayorNum + " por " + menorNum + " es: ");
        return Math.round(Math.pow(mayorNum, menorNum));
        
    }

    //Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
    //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    public double calculaRaiz() {
        double menorAbsoluto = Math.abs(Math.min(parNum.getNumeroA(), parNum.getNumeroB()));
        return Math.sqrt(menorAbsoluto);
    }
}
