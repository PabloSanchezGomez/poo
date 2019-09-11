/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.segundahoja;

/**
 *
 * @author ORDENADOR PABLO
 */
public class ejercicio4 {
    public static void main( String [] arg){
        int array[][];
        int n = 1;
        array = new int [5][6];
        for(int i = 0;i<5;i++){
            System.out.println();
            for(int j = 0;j<6;j++){
                array[i][j] = n;
                n++;
                System.out.print(" " + array[i][j]);
            }
        }
        
    }
}
