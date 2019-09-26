/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1;
/**
 *
 * @author ORDENADOR PABLO
 */
public class MainIntervalos {
    public static void main(String [] args){ 
        Intervalos i1 = new Intervalos();  
        Intervalos i2 = new Intervalos(2.0);  
        Intervalos i3 = new Intervalos(5.0, 10.0);  
        Intervalos i4 = new Intervalos(i3); 
        System.out.println (i1.getLI());  
        System.out.println (i1.getLS());   
        i4.setLI (4.0);  
        i4.setLS(11.0);  
        System.out.println (i4.getLI());
        System.out.println (i4.getLS());   
        i1.visualizar(); 
        i2.visualizar();  
        i3.visualizar();       i4.visualizar();    
        double l1 = i1.longitud(); 
        double l2 = i2.longitud();    
        double l3 = i3.longitud();   
        double l4 = i4.longitud();   
        System.out.println ("longitud de i1: "+l1);   
        System.out.println ("longitud de i2: "+l2);   
        System.out.println ("longitud de i3: "+l3);   
        System.out.println ("longitud de i4: "+l4);     
        if (i1.mismaLongitud(i2))
            System.out.println(i1 + "mide  lo mismo que" + i2);   
        if (i3.mismaLongitud(i4))
            System.out.println(i3 + "mide  lo mismo que" + i4);
       
        i1.visualizar();   
        
        i3.desplazar(4); 
        i3.visualizar();  
        Intervalos i6 =i1.unir(i3); 
        Intervalos i7 =i2.unir(i4);
        i6.visualizar();    
        i7.visualizar();    
        if(i1.incluido(0))
            System.out.println ("El 0 está  incluido en el intervalo i1");   
        if (i7.incluido(7))
            System.out.println ("El 7 está  incluido en el intervalo i7"); 
       
        Intervalos i8 = i7.copia(); 
        i7.visualizar(); 
        i8.visualizar(); 
    }
}

