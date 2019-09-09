/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bucle;

/**
 *
 * @author ORDENADOR PABLO
 */
public class calendario {
    public static void main(String[] args ){
        int c = 1, x = 0;
        while(c <=30){
        if (x == 7){
            x = 0;
        }    
          switch(x)
        {
            case 0:
            {
                System.out.println(c + " -" + " Lunes");
                break;
            }
            case 1:
            {
                System.out.println(c + " -" + " Martes");
                break;
            }
            case 2:
            {
                System.out.println(c + " -" + " Miercoles");
                break;
            }
            case 3:
            {
                System.out.println(c + " -" + " Jueves");
                break;
            }
            case 4:
            {
                System.out.println(c + " -" + " Viernes");
                break;
            }
            case 5:
            {
                System.out.println(c + " -" + " Sabado");
                break;
            }
            case 6:
            {
                System.out.println(c + " -" + " Domingo");
                break;
            }
            
        }
        c++;
        x++;
        }
        
        
        
        
    }
    
}
