/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entity.Tres;

/**
 *
 * @author Max
 */
public class MainTres {

    public static void main(String[] args) {
        try {
            System.out.println(Tres.metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo ( ) ");
            e.printStackTrace();
        }
    }
}
