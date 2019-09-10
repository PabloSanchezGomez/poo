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
public class fechaBuena {
        public static void main(String[] args ){
            boolean existe;
            for(int i = 0;i<200;i++){
            existe = true;
            int dia = (int) (Math.random()*31 + 1);
            int mes = (int) (Math.random()*12 + 1);
            int anyo = (int) (Math.random()*200 + 1900);
            if(mes == 4 || mes == 6 || mes == 5 || mes == 9 || mes == 11){
                if(dia>30){
                    existe = false;
                }
                
}
            else if(mes == 2){
                if(anyo % 4 == 0){
                    if(dia >29 ){
                        existe = false;
                    }
                }
                else{
                    if(dia>28){
                        existe = false;
                    }
                }
            }
            if(existe == true){
                System.out.println(dia + "-" + mes + "-" + anyo + " existe");
            }
            else{
                 System.out.println(dia + "-" + mes + "-" + anyo + " NO existe");
            }
}
}
}