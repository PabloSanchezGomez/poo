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
public class Intervalos {
    private double lS,lI;
    
    
        public Intervalos(){
            lS = 1;
            lI= 0;
        }
        public Intervalos(double x){
            lS = x;
            lI = 0;
        }
        public Intervalos(double x,double y){
            if(x>=y){
                lS = x;
                lI = y;               
            }
            else{
                lS = 1;
                lI= 0;
            }
        }
        public Intervalos(Intervalos x){
            this.setLS(x.getLS());
            this.setLI(x.getLI());
        }
        
        
        
        public double getLS(){
            return lS;
        }
        public double getLI(){
            return lI;
        }
        public void setLS(double x){
            this.lS = x;
        }
        public void setLI(double x){
            this.lI = x;
        }
        public void visualizar(){
            System.out.print(this.getLI() + ("-") + this.getLS());
        }
        public double longitud(){
            return(this.getLS()-this.getLI());
        }
        public boolean igual(Intervalos i){
            return(( this.getLI() == i.getLI() && this.getLS() == i.getLS() ));
        }
        public boolean mismaLongitud(Intervalos i){
            return(this.longitud() == i.longitud());
        }
        public void desplazar(double x){
            this.setLI(this.getLI() + x);
            this.setLS(this.getLS() + x);
        }
        public Intervalos unir(Intervalos i){
            Intervalos r = new Intervalos();
            if(this.getLI()<=i.getLI()){
                r.setLI(this.getLI());
            }
            else{
                r.setLI(i.getLI());
            }
            if(this.getLS()>=i.getLS()){
                r.setLS(this.getLS());
            }
            else{
                r.setLS(i.getLS());
            }     
            return r;
        }
        public boolean incluido(double x){
            return(x>=this.getLI() && x<=this.getLS());
        }
        public boolean intervaloIncluido(Intervalos i){
            return(this.incluido(i.getLI()) && this.incluido(i.getLS()));
        }
        public Intervalos copia(){
            Intervalos r = new Intervalos(this.getLS(),this.getLI());
            return r;
        }
}
