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
public class ejercicio9 {
        public static void main(String [] arg){
            
            for(int i = 10;i>=1;i--){
            System.out.println();
            for(int k = 0;k<=10-i;k++){
                if(k>=1){
                System.out.print(" ");
                }
                
            }
            for(int j = i;j!=0;j--){
                System.out.print("*");
            
        }
    }
        }
}
