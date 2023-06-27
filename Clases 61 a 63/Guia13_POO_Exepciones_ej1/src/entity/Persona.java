/*
Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar 
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código 
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
 */
package entity;

/**
 *
 * @author Max
 */
public class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
       public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre +"\n"
                + "Edad= " + edad + "\n"
                + "Sexo= " + sexo + "\n"
                +"Peso= " + peso +"\n"
                +"Altura= " + altura+"\n";
    }
    
}
