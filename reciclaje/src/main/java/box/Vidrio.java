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
public class Vidrio extends Residuo {
    private static int num;
    private static final double PRECIO_VIDRIO = 0.3;
    
    public Vidrio(){
        num++;
    }
    
    @Override
    public String toString(){
        return("vidrio");
    }
}
