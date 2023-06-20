/*
Realizar un programa en el que se representen todas las relaciones
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
package service;

import comparator.PrecioComparator;
import entity.Alojamiento;
import entity.Camping;
import entity.Hotel4;
import entity.Hotel5;
import entity.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class AlojamientoService {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alojamiento> alojamientos = new ArrayList();

    public void crearAlojamientos() {
        Hotel4 h1 = new Hotel4("Hotel El Mirador 4****", "Calle Primavera 123", "Ciudad del Sol", "Ana López", 20, 30, 4, 0, true, 'A', "Restaurante La Barraca", 50);
        precioHabitacion(h1);
        //****puedo cargar cada objeto 1x1 debajo del mismo ej.: alojamientos.add(h1)
        Hotel4 h2 = new Hotel4("Hotel Marina Bay 4****", "Avenida del Mar 456", "Costa Dorada", "Juan García", 10, 25, 2, 0, true, 'B', "Restaurante Manolo", 30);
        precioHabitacion(h2);
        Hotel4 h3 = new Hotel4("Hotel Bella Vista 4****", "Calle Principal 789", "Playa Azul", "María Rodríguez", 15, 40, 3, 0, true, 'B', "Restaurante El Paraíso", 40);
        precioHabitacion(h3);
        Hotel5 h4 = new Hotel5("Hotel Central 5*****", "Avenida Principal 987", "Ciudad Central", "Carlos Martínez", 60, 150, 12, 0, true, 'A', "Restaurante Delicias", 100, 2, 10, 4);
        precioHabitacion(h4);
        Hotel5 h5 = new Hotel5("Hotel Playa Dorada 5*****", "Calle del Mar 654", "Playa Blanca", "Laura Sánchez", 45, 105, 10, 0, true, 'A', "Restaurante Sabores del Mar", 90, 3, 12, 4);
        precioHabitacion(h5);
        /*String nombreAloj, String direccion, String localidad, String encargado, int cantHabitaciones, int numCamas, int cantPisos, int precioHab, boolean gimnasio, char tipoGimnasio, String nombreResto, int capacidadResto,int salonesConferencia, int suites, int limosinas*/
 /* String nombreAloj, String direccion, String localidad, String encargado, int cantHabitaciones, int numCamas, int cantPisos, double precioHab,boolean gimnasio, char tipoGimnasio, String nombreResto, int capacidadResto */
        Camping c1 = new Camping("Camping Los Pinos", "Calle del Bosque 123", "Montaña Verde", "Pedro Gómez", 0, true, 500, 50, 8, true);
        precioHabitacion(c1);
        Camping c2 = new Camping("Camping El Roble", "Avenida del Río 456", "Río Azul", "María López", 0, false, 300, 30, 8, false);
        precioHabitacion(c2);
        Camping c3 = new Camping("Camping La Cabaña", "Camino del Lago 789", "Lago Sereno", "Juan Ramírez", 0, true, 700, 45, 6, true);
        precioHabitacion(c3);
//String nombreAloj, String direccion, String localidad, String encargado, double precioHab, boolean privado, int superficie,int maxCarpas, int banios, boolean restaurante
        Residencia r1 = new Residencia("Residencia Estudiantil", "Calle de los Estudiantes 123", "Ciudad Universitaria", "Laura Sánchez", 0, true, 400, 20, true, 15, false);
        precioHabitacion(r1);
        Residencia r2 = new Residencia("Residencia Los Alamos", "Avenida del Bosque 456", "Bosque Encantado", "Juan Ramírez", 0, false, 300, 15, false, 0, false);
        precioHabitacion(r2);
        Residencia r3 = new Residencia("Residencia El Parque", "Calle del Parque 789", "Parque Sereno", "María López", 0, true, 500, 25, true, 10, true);
        precioHabitacion(r3);
        //String nombreAloj, String direccion, String localidad, String encargado, boolean privado, int superficie, double precioHab,int cantHab, boolean descuento, double totDto, boolean campoDeportivo
        //****cargarlos todos juntos al final       
        alojamientos.add(h1);
        alojamientos.add(h2);
        alojamientos.add(h3);
        alojamientos.add(h4);
        alojamientos.add(h5);
        alojamientos.add(c1);
        alojamientos.add(c2);
        alojamientos.add(c3);
        alojamientos.add(r1);
        alojamientos.add(r2);
        alojamientos.add(r3);
        //o usar esta forma q creo una "lista" de los objetos que voy a cargar en el array
        //****alojamientos.addAll(Arrays.asList(h1, h2, h3, h4, h5, c1, c2, c3, r1, r2, r3));
    }

    /*
    El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
     */
    public double precioHabitacion(Alojamiento alojamiento) {
        int precioBase = 50;
        int vAResto = 0;
        int vAGim = 0;
        int vALimo;
        int capHotel;
        double totalDto;
        double desc = 0;
        double precioHab = 0;
        if (alojamiento instanceof Hotel5) {
            Hotel5 hotel = (Hotel5) alojamiento;
            int capacidadResto = hotel.getCapacidadResto();
            if (capacidadResto < 30) {
                vAResto = 10;
            } else if (capacidadResto >= 30 && capacidadResto <= 50) {
                vAResto = 30;
            } else if (capacidadResto > 50) {
                vAResto = 50;
            }

            char tipoGimnasio = hotel.getTipoGimnasio();
            if (tipoGimnasio == 'A') {
                vAGim = 50;
            } else if (tipoGimnasio == 'B') {
                vAGim = 30;
            }

            int cantidadLimosinas = hotel.getLimosinas();
            vALimo = cantidadLimosinas * 15;
            if (((Hotel5) alojamiento).getLimosinas() > 0) {
            }
            capHotel = ((Hotel5) alojamiento).getNumCamas();
            ((Hotel5) alojamiento).setPrecioHab(precioBase + vAResto + vAGim + vALimo + capHotel);
            precioHab=((Hotel5) alojamiento).getPrecioHab();
        }

        if (alojamiento instanceof Hotel4) {
            Hotel4 hotel = (Hotel4) alojamiento;
            int capacidadResto = hotel.getCapacidadResto();
            if (capacidadResto < 30) {
                vAResto = 10;
            } else if (capacidadResto >= 30 && capacidadResto <= 50) {
                vAResto = 30;
            } else if (capacidadResto > 50) {
                vAResto = 50;
            }

            char tipoGimnasio = hotel.getTipoGimnasio();
            if (tipoGimnasio == 'A') {
                vAGim = 50;
            } else if (tipoGimnasio == 'B') {
                vAGim = 30;
            }
            capHotel = ((Hotel4) alojamiento).getNumCamas();
            ((Hotel4) alojamiento).setPrecioHab(precioBase + vAResto + vAGim + capHotel);
            precioHab = ((Hotel4) alojamiento).getPrecioHab();
        }
        /*
        para el precio de los campings y las residencias hay pocos parametros en la consigna asi que voy a tomar
        numero de carpas como numero de habitaciones y asumiendo que entren 2 personas por carpa sacare la "capacidad del hotel",
        en cuanto a los baños no los voy a utilizar como parametro para definir el precio y de poseer restaurante le voy a asignar un 
        valor minimo($10 si la capacidad del restaurante es de menos de 30 personas.)y el precio base va a ser 20 
        y para el caso de residencias agrego un plus de poseer campo deportivo igual a gimnasio B
         */
        if (alojamiento instanceof Camping) {
            Camping camping = (Camping) alojamiento;
            capHotel = camping.getMaxCarpas() * 2;
            if (camping.isRestaurante()) {
                vAResto = 10;
            } else {
                vAResto = 0;
            }
            camping.setPrecioHab((precioBase - 30) + capHotel + vAResto);  
            precioHab = camping.getPrecioHab();
        }
        if (alojamiento instanceof Residencia) {
            Residencia residencia = (Residencia) alojamiento;
            if (residencia.isDescuento()) {
                totalDto = 20;
                residencia.setTotDto(totalDto);
                desc = 0.8;
            } else {
                totalDto = 0;
                residencia.setTotDto(totalDto);
                desc = 1;
            }
            if (residencia.isCampoDeportivo()) {
                vAGim = 30;
            } else {
                vAGim = 0;
            }
            capHotel = residencia.getCantHab() * 2;
            residencia.setPrecioHab((precioBase + vAGim + capHotel) * desc);
            precioHab = residencia.getPrecioHab();
        }
        return precioHab;
    }

    /*
ahora tendria q crear un metodo(varios) para ordenar las busquedas, por precio,por restaurante y 
    por descuento(true o false) y crear aca tambien un menu para desde el main solo llamar al menu
     */
    public void mostrarAlojamientos() {
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento);
        }
    }

   public void ordenarPorPrecio() {
    Collections.sort(alojamientos, new PrecioComparator().reversed());
    System.out.println("Búsqueda por precio (de mayor a menor):");
    mostrarAlojamientos();
}


    private void mostrarResto() {
        System.out.println("Camping con restaurante:");
        System.out.println("-------------------------------");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                Camping camping = (Camping) alojamiento;
                if (camping.isRestaurante()) {
                    System.out.println(camping);
                }
            }
        }
        System.out.println("------------------------------");
    }

    public void mostrarDescuento() {
        System.out.println("Residencias con descuento:");
        System.out.println("-------------------------------");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia) {
                Residencia resid = (Residencia) alojamiento;
                if (resid.isDescuento()) {
                    System.out.println(resid);
                }
            }
        }
        System.out.println("------------------------------");
    }

    public void menu() {
        int opcion;
        crearAlojamientos();
        do {
            System.out.println("1. Mostrar todos los alojamientos");
            System.out.println("2. Ordenar por precio");
            System.out.println("3. Mostrar campings con restaurante");
            System.out.println("4. Mostrar residencias con descuento");
            System.out.println("5. Salir");
            System.out.println("Ingrese su consulta");
            opcion = input.nextInt();
             switch (opcion) {
                case 1:
                    mostrarAlojamientos();
                    break;
                case 2:
                    ordenarPorPrecio();
                    mostrarAlojamientos();
                    break;
                case 3:
                    mostrarResto();
                    break;
                case 4:
                    mostrarDescuento();
                    break;
            }
        } while (opcion != 5);
        System.out.println("¡Hasta luego!");

    }
}
