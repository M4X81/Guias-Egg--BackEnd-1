/*
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
 */
package entity;

/**
 *
 * @author Max
 */
public class AlojamientoExtraHotelero extends Alojamiento {

    protected boolean privado;
    protected int superficie;
  

    public AlojamientoExtraHotelero() {
    }

    public AlojamientoExtraHotelero(boolean privado, int superficie) {
        this.privado = privado;
        this.superficie = superficie;
    }

    public AlojamientoExtraHotelero(String nombreAloj, String direccion, String localidad, String encargado, double precioHab,boolean privado, int superficie) {
        super(nombreAloj, direccion, localidad, encargado, precioHab);
        this.privado = privado;
        this.superficie = superficie;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        String parentString = super.toString();
        return parentString
                + "Establecimiento privado = " + privado + "\n"
                + "Superficie del predio= " + superficie + " m2 \n";
                
    }

}
