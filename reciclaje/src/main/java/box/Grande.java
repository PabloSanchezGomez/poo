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
public class Grande extends Botella{
    private static int num = 0;
    private static final double precioG = 0.20;
    
    public Grande(double precio){
        super(precioG);
        num++;
    }
    @Override
    public String toString(){
        return("botella de plastico pequeña");
    }


    public static int getNum() {
        return num;
    }
}
