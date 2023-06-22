package interfaces;

/**
 *
 * @author Max
 */
public interface Empleado {
/*• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.*/
    void cargarAnioIncorporacion();
    void cargarNumDespacho();
    
    Integer getFechaIncorp();
    Integer getNumDespacho();
}

