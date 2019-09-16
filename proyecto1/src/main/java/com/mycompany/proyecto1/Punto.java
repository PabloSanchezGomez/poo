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
  
}
