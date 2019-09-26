/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabajos4;

/**
 *
 * @author pablo
 */
public class Punto {
    private int x,y;

    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public Punto(int x,int y){
        this.x = x;
        this.y = y;
}
    public String toString (){
        return("x:" +x+" y" +y);
    }
    public void desplazarXY(int x,int y){
        this.x = x;
        this.y = y;        
    }
    public boolean esIgual(Punto p){
        return(this.x == p.getX() && this.y == p.getY());
    }
    public Punto copia(){
        Punto p = new Punto(this.x,this.y);
        return p;
    }
    public boolean estaDebajo(Punto p){
        return(this.y<p.getY());
    
    }
 public boolean estaDerecha(Punto p){
        return(this.x<p.getX());
}
}