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
public class Camping extends AlojamientoExtraHotelero {
    public int maxCarpas;
    public int banios;
    public boolean restaurante;

    public Camping() {
    }

    public Camping(int maxCarpas, int banios, boolean restaurante) {
        this.maxCarpas = maxCarpas;
        this.banios = banios;
        this.restaurante = restaurante;
    }

    public Camping(int maxCarpas, int banios, boolean restaurante, boolean privado, int superficie) {
        super(privado, superficie);
        this.maxCarpas = maxCarpas;
        this.banios = banios;
        this.restaurante = restaurante;
    }

    public Camping(String nombreAloj, String direccion, String localidad, String encargado,int maxCarpas, int banios, boolean restaurante, boolean privado, int superficie) {
        super(nombreAloj, direccion, localidad, encargado,privado, superficie);
        this.maxCarpas = maxCarpas;
        this.banios = banios;
        this.restaurante = restaurante;
    }

    public int getMaxCarpas() {
        return maxCarpas;
    }

    public void setMaxCarpas(int maxCarpas) {
        this.maxCarpas = maxCarpas;
    }

    public int getBanios() {
        return banios;
    }

    public void setBanios(int banios) {
        this.banios = banios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }
    
}
