/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bucle;

/**
 *
 * @author pablo
 */
public class aleatorio {
    public static void main(String [] arg){
        int aleatorio;
        int suma = 0;
        while(suma <= 25){
           aleatorio = (int)(Math.random()*11); 
              if(aleatorio%2 == 0){
                            System.out.println("El " + aleatorio + " es par");
                        }
                        else{
                            System.out.println("El " + aleatorio + " es impar");
                            suma += aleatorio; 
                        }
        }
        System.out.println(suma);
    }
    
}
