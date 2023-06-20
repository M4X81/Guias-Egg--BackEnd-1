/*Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
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
public class Hotel extends Alojamiento{
    protected int cantHabitaciones;
    protected int numCamas;
    protected int cantPisos;


    public Hotel() {
    }

    public Hotel(String nombreAloj, String direccion, String localidad, String encargado, double precioHab,int cantHabitaciones, int numCamas, int cantPisos) {
        super(nombreAloj, direccion, localidad, encargado, precioHab);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

  
        
    @Override
public String toString() {
    String parentString = super.toString();
    return parentString + 
            "Cantidad de Habitaciones= " + cantHabitaciones + "\n" +
            "Número de Camas= " + numCamas + "\n" +
            "Cantidad de Pisos= " + cantPisos + "\n" +
            "Precio por Habitacion= " + precioHab + "$ \n";
}
}
