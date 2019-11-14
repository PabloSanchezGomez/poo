/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;

/**
 *
 * @author pablo
 */
public abstract class Residuo {
        protected double precio;
        protected double  peso;

public Residuo(double precio){
        this.peso = Math.random();
        this.precio = precio;
}
    public double getPrecio() {
        return precio;
    }


    public double getPeso() {
        return peso;
    }
    
}
