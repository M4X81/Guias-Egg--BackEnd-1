/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entity.Dos;

/**
 *
 * @author Max
 */
public class MainDos {

    public static void main(String[] args) {
        try {
            System.out.println(Dos.metodo());
        } catch (Exception e) {
            System.err.println(" Excepcion en metodo ( ) ");
            e.printStackTrace();
        }
    }
}
