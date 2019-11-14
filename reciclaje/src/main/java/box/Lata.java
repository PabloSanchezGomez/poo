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
public class Lata extends Envase{
    private String etiqueta;
    private static int num = 0;
    private static final double PrecioL =0.10;
    
    
    public Lata(){
        etiqueta = generarFecha(); 
        num++;
    }
    private String generarFecha(){
        int dia = (int)(Math.random()*30)+1;
        int mes = (int)(Math.random()*12)+1;
        int año = (int)(Math.random()*10)+2019;
        return(dia+"/"+mes+"/"+año);
    }
    public void imprimirFecha(){
        System.out.println(etiqueta);
    }
}
