/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_0;

import java.util.ArrayList;

/**
 *
 * @author ORDENADOR PABLO
 */
public class Casilla {
    private int x;
    private int y;
    ArrayList<Casilla> mp;//movimientos posibles
    private boolean usada;
    private Casilla anterior;
    
    
    public Casilla(int x, int y){
        this.x = x;
        this.y = y;
        usada = false;
        anterior = null;
    }
    
}
