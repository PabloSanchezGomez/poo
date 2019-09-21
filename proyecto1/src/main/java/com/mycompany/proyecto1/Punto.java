/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1;

/**
 *
 * @author pablo
 */
public class Punto {
    private int x,y;

    
    public Punto(){
        x=0;
        y=0;
    }
    public Punto(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    public void desplazar(int x, int y)
    {
        this.setX(this.getX() + x);
        this.setX(this.getX() + y);
    }
    public void desplazar(int x)
    {
        this.setX(this.getX() + x);
        
    }
    public int coordenadaX(){
        return getX();
    }
    public int coordenadaY(){
        return getY();
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    void posicion(){
        System.out.println(x + (",")+y);
    }
    Punto copia(){
       Punto p2 = new Punto(x,y);
       return p2;
    }
    int distancia(Punto p2){
        int x1 = this.getX();
        int x2 = p2.getX();
        int y1 = this.getY();
        int y2 = p2.getY();
        return  (Math.abs(x1-x2)+ Math.abs(y1+y2));
    }
    
    public static void main(String [] arg){
         Punto p1 = new Punto (); 
         Punto p2 = new Punto (5,5);
         Punto p3 = p1.copia();
         p1.desplazar(5);
         System.out.print("p1: ");
         p1.posicion();
         p2.desplazar(3,7);
         System.out.print ("p2: ");
         p2.posicion();
         System.out.print ("p3: ");
         p3.posicion();
         p3.setX(4);
         p3.setY(7);
         int x = p3.coordenadaX();
         int y = p3.coordenadaY();
         System.out.print ("p4: ");
         System.out.println(x + (",") + y);
    }
}
