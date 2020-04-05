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
public class Tablero {
    private Casilla tablero[][];
    ArrayList<Casilla> orden;
    boolean encontrado;
    public Tablero(int f, int c){
        tablero = new Casilla[f][c];
        encontrado = false;
    }
    public void recorrido(Casilla c){
        while(c.mp.size() > 0){
            orden.add(c);//
            recorrido(c.mp.get(0));
            c.mp.remove(c.mp.get(0));
        }
        if(orden.size() == tablero.length){
            encontrado = true;
        }
    }
    
}
