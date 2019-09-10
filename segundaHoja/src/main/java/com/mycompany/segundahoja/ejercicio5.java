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
public class ejercicio5 {
    
    public static void main(String [] arg){
        for(int i = 3;i<=100;i++){
            if(esPrimo(i)){
                System.out.println(i);
            }
        }
    
    }   
    public static boolean esPrimo(int n){
        boolean primo = true;
        for(int j = 2;j < n;j++){
            if(n%j == 0){
                primo = false;
            }
        }
        return primo;
    }
}
