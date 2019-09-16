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
        this.x = this.x+x;
        this.x = this.x+y;
    }
    public int coordenadaX(){
        return x;
    }
    public int coordenadaY(){
        return y;
    }
    
}
