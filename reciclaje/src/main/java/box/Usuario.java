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
public class Usuario {
   private String nombre;
   private int numero;
   private double saldo;
   private int vidrio;
   private int botellaP;
   private int botellaG;
   private int lata;
    
   public Usuario(int  num){
       this.nombre = "";
       this.numero = num;
       saldo = 0;
       vidrio = 0;
       botellaP = 0;
       botellaG = 0;
       lata = 0;
   }
   public Usuario(int numero,String nombre){
       this.nombre = nombre;
       this.numero = numero;
       saldo = 0;
       vidrio = 0;
       botellaP = 0;
       botellaG = 0;
       lata = 0;
   
   }
   public String imprimirTotalReciclado(){
       return("En el total de sesiones realizadas por usted se han reciclado "+vidrio+" vidrio(s)"+lata+" lata(s) "+botellaG+" botella(s) grande(s)"+botellaP + " botella(s) pequeña(s) ");
   }
   
   
    
}
