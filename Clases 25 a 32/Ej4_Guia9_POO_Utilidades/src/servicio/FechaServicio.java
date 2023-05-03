/*
4-Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, 
en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento.
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el 
constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia 
de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
 */
package servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class FechaServicio {
    
     private Scanner leer = new Scanner(System.in);
    
    
    public Date fechaNacimiento(){
        System.out.println("Ingrese su día de nacimiento");
        int dia=leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        int mes=leer.nextInt()-1;
        System.out.println("Ingrese su año de nacimiento");
        int anio=leer.nextInt();
        Date fechaNacimiento=new Date(anio-1900,mes,dia);
        System.out.println("fecha nacimiento: "+fechaNacimiento);
        return fechaNacimiento;
    } 
    
    public Date fechaActual(){
        Date fechaActual=new Date();
        System.out.println("fecha actual: "+fechaActual);
        return fechaActual;
    }
    
    public int diferencia(Date fechaNacimiento, Date fechaActual){
        int edad=fechaActual.getYear()-fechaNacimiento.getYear();
        
        return edad;
    }
}
