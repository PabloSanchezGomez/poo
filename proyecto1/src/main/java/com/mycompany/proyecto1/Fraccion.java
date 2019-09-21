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
public class Fraccion {
    private int num,dem;
    
    public void Fraccion(){
        setNum(1);
        setDem(1);
    }
   public void Fraccion(int x){
        setNum(x);
        setDem(1);
   }
   public void Fraccion(int x,int y){
        setNum(x);
        setDem(y);
   }
   public void Fra

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @return the dem
     */
    public int getDem() {
        return dem;
    }

    /**
     * @param dem the dem to set
     */
    public void setDem(int dem) {
        this.dem = dem;
    }
    
}
