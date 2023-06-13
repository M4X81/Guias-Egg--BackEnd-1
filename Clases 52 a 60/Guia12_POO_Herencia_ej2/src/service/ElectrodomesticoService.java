/*
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:

LETRA PRECIO                PESO PRECIO
A $1000             Entre 1 y 19 kg $100
B $800              Entre 20 y 49 kg $500
C $600              Entre 50 y 79 kg $800
D $500              Mayor que 80 kg $1000
E $300
F $100

A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
package service;

import entity.Electrodomestico;
import enums.Color;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class ElectrodomesticoService {

    /*
    • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
     */
    public char comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return 'F';
        }
    }

    /*
    • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
     */
    public String controlarColor(String color) {
        for (Color col : Color.values()) {
            if (col.name().equalsIgnoreCase(color)) {
                return color;
            }
        }
        return "Blanco";
    }

    /*
    • Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
     */
    public Electrodomestico crearElectrodomestico() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico electrod = new Electrodomestico();
        System.out.println("Ingrese el color del electrodoméstico ");
        String color = input.next();
        electrod.setColor(controlarColor(color));
        System.out.println("Ingrese el consumo(A,B,C,D,E,F)");
        char consumo = input.next().charAt(0);
        electrod.setConsumoEnergetico(comprobarConsumoEnergetico(consumo));
        electrod.setPrecio(1000);
        System.out.println("Ingrese el peso");
        double peso = input.nextDouble();
        electrod.setPeso(peso);
        return electrod;
    }

    /*
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
LETRA PRECIO                PESO PRECIO
A $1000             Entre 1 y 19 kg $100
B $800              Entre 20 y 49 kg $500
C $600              Entre 50 y 79 kg $800
D $500              Mayor que 80 kg $1000
E $300
F $100
     */
    public void precioFinal(Electrodomestico electrod) {
        switch (electrod.getConsumoEnergetico()) {
            case 'A':
                electrod.setPrecio(electrod.getPrecio() + 1000);
                break;
            case 'B':
                electrod.setPrecio(electrod.getPrecio() + 800);
                break;
            case 'C':
                electrod.setPrecio(electrod.getPrecio() + 600);
                break;
            case 'D':
                electrod.setPrecio(electrod.getPrecio() + 500);
                break;
            case 'E':
                electrod.setPrecio(electrod.getPrecio() + 300);
                break;
            case 'F':
                electrod.setPrecio(electrod.getPrecio() + 100);
                break;

        }
        if (electrod.getPeso()>=1 && electrod.getPeso()<= 19) {
            electrod.setPrecio(electrod.getPrecio() + 100);
        }else if (electrod.getPeso()>=20 && electrod.getPeso()<= 49) {
            electrod.setPrecio(electrod.getPrecio() + 500);   
        }else if (electrod.getPeso()>=50 && electrod.getPeso()<= 79) {
            electrod.setPrecio(electrod.getPrecio() + 800);
        }else if (electrod.getPeso()>80 ) {
            electrod.setPrecio(electrod.getPrecio() + 1000);
        }
    }
}