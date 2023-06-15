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
public final class Yate extends BarcoMotor {
    private int camarotes;

    public Yate() {
    }
    
    
    public Yate(int camarotes) {
        this.camarotes = camarotes;
    }

    public Yate(int camarotes, int potencia) {
        super(potencia);
        this.camarotes = camarotes;
    }

    public Yate(int camarotes, int potencia, int matricula, int eslora, int anioFabricacion) {
        super(potencia, matricula, eslora, anioFabricacion);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + "camarotes=" + camarotes + super.toString();
    }
    
}
