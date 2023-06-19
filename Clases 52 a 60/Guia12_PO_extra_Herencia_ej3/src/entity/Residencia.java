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
public class Residencia extends AlojamientoExtraHotelero {
   public int cantHab;
   public boolean descuento;
   public boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHab, boolean descuento, boolean campoDeportivo) {
        this.cantHab = cantHab;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencia(int cantHab, boolean descuento, boolean campoDeportivo, boolean privado, int superficie) {
        super(privado, superficie);
        this.cantHab = cantHab;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencia(String nombreAloj, String direccion, String localidad, String encargado,int cantHab, boolean descuento, boolean campoDeportivo, boolean privado, int superficie) {
        super(nombreAloj, direccion, localidad, encargado,privado, superficie);
        this.cantHab = cantHab;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHab() {
        return cantHab;
    }

    public void setCantHab(int cantHab) {
        this.cantHab = cantHab;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }
   
}
