/*
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
 */
package entity;

/**
 *
 * @author Max
 */
public class BarcoMotor extends Barco{
    protected int potencia;

    public BarcoMotor() {
    }

    public BarcoMotor(int potencia) {
        this.potencia = potencia;
    }

    public BarcoMotor(int potencia, int matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + "potencia=" + potencia + super.toString();
    }
    
    
}
