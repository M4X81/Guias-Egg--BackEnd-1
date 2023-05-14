/*
2-Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su correspondiente 
letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra (String o char) 
que le corresponde. En NIFService se dispondrá de los siguientes métodos:
Métodos getters y setters para el número de DNI y la letra.
Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. 
Una vez calculado, le asigna la letra que le corresponde según
Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y 
la letra en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método 
que funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir 
el número de DNI por 23 (el resultado debe ser un número entre 0 y 22). 
El método debe buscar en un array (vector) de caracteres la posición que corresponda 
al resto de la división para obtener la letra correspondiente. La tabla de caracteres 
es la siguiente:
POSICIÓN 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 
LETRA    T R W A G M Y F P D X  B  N  J  Z  S  Q  V   H  L  C  K  E   
 */
package servicio;

import entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class NIFServicio {
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    private String[] letraNif = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

    public NIF crearNIF() {
        System.out.println("Ingrese su número de DNI para calcular su verificador NIF");
        long dni = input.nextLong();
        int restoDni = (int) (dni % 23);
        String letraNif = calcularNif(restoDni);
        return new NIF(dni, letraNif);//si no creaba esta instancia nueva como retorno no me corria, 
                                     //siempre daba null el letraNif al pedirlo en main
    }

    public String calcularNif(int restoDni) {
        return letraNif[restoDni];
    }

    public void mostrarNif(NIF nif) {
        System.out.println("Su verificador NIF es: " + nif.getDNI() + "-" + nif.getLetra());
    }
}
