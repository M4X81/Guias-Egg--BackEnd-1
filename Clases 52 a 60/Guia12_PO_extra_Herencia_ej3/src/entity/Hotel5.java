/*
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, 
Cantidad Salones de Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.
 */
package entity;

/**
 *
 * @author Max
 */
public final class Hotel5 extends Hotel4{
    public int salonesConferencia;
    public int suites;
    public int limosinas;

    public Hotel5() {
    }

    public Hotel5(int salonesConferencia, int suites, int limosinas) {
        this.salonesConferencia = salonesConferencia;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    public Hotel5(boolean gimnasio, String nombreResto, int capacidadResto,int salonesConferencia, int suites, int limosinas) {
        super(gimnasio, nombreResto, capacidadResto);
        this.salonesConferencia = salonesConferencia;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    public Hotel5(boolean gimnasio, String nombreResto, int capacidadResto, int cantHabitaciones, int numCamas, int cantPisos, double precioHab,int salonesConferencia, int suites, int limosinas) {
        super(gimnasio, nombreResto, capacidadResto, cantHabitaciones, numCamas, cantPisos, precioHab);
        this.salonesConferencia = salonesConferencia;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    public Hotel5(String nombreAloj, String direccion, String localidad, String encargado, boolean gimnasio, String nombreResto, int capacidadResto, int cantHabitaciones, int numCamas, int cantPisos, double precioHab,int salonesConferencia, int suites, int limosinas) {
        super(nombreAloj, direccion, localidad, encargado, gimnasio, nombreResto, capacidadResto, cantHabitaciones, numCamas, cantPisos, precioHab);
        this.salonesConferencia = salonesConferencia;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    public int getSalonesConferencia() {
        return salonesConferencia;
    }

    public void setSalonesConferencia(int salonesConferencia) {
        this.salonesConferencia = salonesConferencia;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getLimosinas() {
        return limosinas;
    }

    public void setLimosinas(int limosinas) {
        this.limosinas = limosinas;
    }

}
