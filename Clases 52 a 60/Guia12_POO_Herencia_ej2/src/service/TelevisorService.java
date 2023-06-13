
package service;

import entity.Electrodomestico;
import entity.Televisor;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class TelevisorService extends ElectrodomesticoService{
    
    /*
    • Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
    */
    public Televisor crearTelevisor(){
        System.out.println("Creando orden de televisor...");
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico electrod = crearElectrodomestico();
        Televisor tele = new Televisor();
        tele.setColor(electrod.getColor());
        tele.setConsumoEnergetico(electrod.getConsumoEnergetico());
        tele.setPeso(electrod.getPeso());
        tele.setPrecio(electrod.getPrecio());
        System.out.println("Ingrese tamaño del televisor en pulgadas");
        int resolucion = input.nextInt();
        tele.setResolucion(resolucion);
        System.out.println("Cuenta con sintonizador?(S/N)");
        if (input.next().toLowerCase().charAt(0)== 's') {
            tele.setSintonizadorTDT(true); 
        }else{
            tele.setSintonizadorTDT(false);
        }
        System.out.println("Creando televisor...");
        System.out.println(tele.toString());
        return tele;
    }
    /*
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
    */
    public void precioFinal(Televisor tele){
        super.precioFinal(tele);
        if (tele.getResolucion()> 40) {
            tele.setPrecio(tele.getPrecio()*1.3); 
        }
        if (tele.isSintonizadorTDT()) {
            tele.setPrecio(tele.getPrecio() + 500);       
        }
        System.out.println("El precio del televisor es " + tele.getPrecio());
    }
}
