/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.segundahoja;

/**
 *
 * @author pablo
 */
public class ejercicio3 {
    public static void main(String [] arg){
        int matriz[];
        matriz = new int[60];
        for(int i = 1;i<= 50;i++){
            matriz[i] = i;
        }
        for(int i = 50;i>=1 ;i--){
            System.out.println(matriz[i]);
        }
    }    
}
