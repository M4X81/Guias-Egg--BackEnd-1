/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Max
 */
public class Gato extends Animal{

    public Gato() {
    }

    public Gato(String ruido) {
        super(ruido);
    }

    @Override
    public void hacerRuido() {
        System.out.println("Miau"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
