/*
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
public class Hotel4 extends Hotel{
    protected boolean gimnasio;
    protected char tipoGimnasio;
    protected String nombreResto;
    protected int capacidadResto;


    public Hotel4() {
    }

    public Hotel4(String nombreAloj, String direccion, String localidad, String encargado, double precioHab, int cantHabitaciones, int numCamas, int cantPisos,boolean gimnasio, char tipoGimnasio, String nombreResto, int capacidadResto) {
        super(nombreAloj, direccion, localidad, encargado, precioHab, cantHabitaciones, numCamas, cantPisos);
        this.gimnasio = gimnasio;
        this.tipoGimnasio = tipoGimnasio;
        this.nombreResto = nombreResto;
        this.capacidadResto = capacidadResto;
    }

    public boolean isGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(boolean gimnasio) {
        this.gimnasio = gimnasio;
    }

    public char getTipoGimnasio() {
        return tipoGimnasio;
    }

    public void setTipoGimnasio(char tipoGimnasio) {
        this.tipoGimnasio = tipoGimnasio;
    }

    public String getNombreResto() {
        return nombreResto;
    }

    public void setNombreResto(String nombreResto) {
        this.nombreResto = nombreResto;
    }

    public int getCapacidadResto() {
        return capacidadResto;
    }

    public void setCapacidadResto(int capacidadResto) {
        this.capacidadResto = capacidadResto;
    }

 

    
    @Override
public String toString() {
    String parentString = super.toString();
    return parentString + 
            //"Gimnasio= " + gimnasio + "\n" +
            "Tipo de Gimnasio=" + tipoGimnasio + "\n" +
            "Nombre Restaurante= " + nombreResto + "\n" +
            "Capacidad Restaurante=" + capacidadResto + "\n"+
            "Precio por Habitacion= " + precioHab + "$ \n";
}
}
