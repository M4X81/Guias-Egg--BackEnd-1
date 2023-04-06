/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.guia.pkg5;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Eje5new_Cl10 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n;
       int m;
       int c=0;
        System.out.println("ingrese la cantidad de fila y columna de la matriz");
        n=sc.nextInt();
        m=sc.nextInt();
       int matriz1[][]=new int[n][m];
       int matriz2[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("ingrese el valor ["+i+"]["+j+"]");
             matriz1[i][j]=sc.nextInt();   
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz2[i][j]=matriz1[j][i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print( "["+matriz1[i][j]+"]");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print( "["+matriz2[i][j]+"]");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               if(matriz1[i][j]==(matriz2[i][j]*(-1))){
                   c++;
               }
            }
        }
        if(c==(n*m)){
            System.out.println("la matris es antisimétrica");
        }else{
            System.out.println("la matris no es antisimétrica");
        }
        }
    }
 
