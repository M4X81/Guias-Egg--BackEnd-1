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
public class Residencia extends AlojamientoExtraHotelero{
   public int cantHab;
   public boolean descuento;
   public double totDto;
   public boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(String nombreAloj, String direccion, String localidad, String encargado, double precioHab, boolean privado, int superficie,int cantHab, boolean descuento, double totDto, boolean campoDeportivo) {
        super(nombreAloj, direccion, localidad, encargado, precioHab, privado, superficie);
        this.cantHab = cantHab;
        this.descuento = descuento;
        this.totDto = totDto;
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

    public double getTotDto() {
        return totDto;
    }

    public void setTotDto(double totDto) {
        this.totDto = totDto;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }



@Override
public String toString() {
    String parentString = super.toString();
    return parentString +
            "Cantidad de habitaciones: " + cantHab + "\n" +
            "Tiene descuento: " + descuento + "\n" +
            "Total de descuento: " + totDto + "\n" +
            "Tiene campo deportivo: " + campoDeportivo + "\n" +
            "Precio de la residencia: " + precioHab + "\n";
}

}
