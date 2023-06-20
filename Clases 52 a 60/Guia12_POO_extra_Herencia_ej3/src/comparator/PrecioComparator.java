/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comparator;

import entity.Alojamiento;

import java.util.Comparator;
/**
 *
 * @author Max
 */
public class PrecioComparator implements Comparator<Alojamiento> {
    @Override
    public int compare(Alojamiento alojamiento1, Alojamiento alojamiento2) {
        double precio1 = alojamiento1.getPrecioHab();
        double precio2 = alojamiento2.getPrecioHab();

        if (precio1 < precio2) {
            return -1;
        } else if (precio1 > precio2) {
            return 1;
        } else {
            return 0;
        }
    }
}




