/*
3. Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package main;

import entity.Electrodomestico;
import entity.Lavadora;
import entity.Televisor;
import java.util.ArrayList;
import service.ElectrodomesticoService;
import service.LavadoraService;


/**
 *
 * @author Max
 */
public class Main {

    public static void main(String[] args) {
        /*
        vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
         */
        ArrayList<Electrodomestico> electro = new ArrayList();
        electro.add(new Lavadora(15d, 2500d, "Blanco", 'D', 50d));
        electro.add(new Lavadora(18d, 3700d, "Gris", 'A', 32d));
        electro.add(new Televisor(55, false, 2500d, "Negro", 'B', 10d));
        electro.add(new Televisor(75, true, 6500d, "Negro", 'A', 18d));

        /*
        Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras.
         */
        ElectrodomesticoService electrodomesticoServ = new ElectrodomesticoService();
        double precioTotal = 0;
        double precioLavadoras = 0;
        double precioTelevisores = 0;
        for (Electrodomestico electrodomestico : electro) {
            //System.out.println("Caracteristicas del electrodoméstico:");
            electrodomesticoServ.precioFinal(electrodomestico);
            precioTotal += electrodomestico.getPrecio();
            if (electrodomestico instanceof Lavadora) {
                precioLavadoras += electrodomestico.getPrecio();
            } else if (electrodomestico instanceof Televisor) {
                precioTelevisores += electrodomestico.getPrecio();
            }
            /*
    si no coloco el "instanceof" cada vez q llamo a getPrecio los precios se ma cargaban en un
    solo objeto indistinto de que sea lavadora o tele, con esto en cada iteracion comprueba hacia 
    que objeto va dirigido el getPrecio 
             */

            System.out.println(electrodomestico.toString());
            System.out.println("------------------------------");
        }

        System.out.println("Precio por objetos:");
        System.out.println("Precio de las lavadoras: " + precioLavadoras);
        System.out.println("Precio de los televisores: " + precioTelevisores);
        System.out.println("------------------------------");
        System.out.println("Precio total de todos los electrodomésticos: " + precioTotal);
    }
}
