/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Electrodomestico;
import entity.Lavadora;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class LavadoraService extends ElectrodomesticoService {

    /*
    • Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
     */
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Lavadora crearLavadora(){
        System.out.println("Creando orden de lavadora...");
        Electrodomestico electrod = crearElectrodomestico();
        Lavadora lavadora = new Lavadora();
        
        lavadora.setColor(electrod.getColor());
        lavadora.setConsumoEnergetico(electrod.getConsumoEnergetico());
        lavadora.setPeso(electrod.getPeso());
        lavadora.setPrecio(electrod.getPrecio());
        System.out.println("Ingrese la capacidad de carga de la lavadora");
        double carga = input.nextDouble();
        lavadora.setCarga(carga);
        System.out.println("Creando lavadora...");
        System.out.println(lavadora.toString());
        return lavadora;
    }
    /*
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
    */
    public void precioFinal(Lavadora lavadora){
        super.precioFinal(lavadora);
        if (lavadora.getCarga()>30) {
            lavadora.setPrecio(lavadora.getPrecio() + 500);
        }else if (lavadora.getCarga()<= 30) {
            lavadora.setPrecio(lavadora.getPrecio());
        }
        System.out.println("El precio de la lavadora es " + lavadora.getPrecio());
    }
}
