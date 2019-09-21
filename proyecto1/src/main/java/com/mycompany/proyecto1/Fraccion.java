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
    private int mcd(int a, int b){
       int resultado;
       if (b == 0){
           resultado = a;
       }
       else{
           resultado = mcd(b, a % b);
       }
       return resultado;
    
    }
    
    public Fraccion(){
        setNum(1);
        setDem(1);
    }
   public Fraccion(int x){
        setNum(x);
        setDem(1);
   }
   public  Fraccion(int x,int y){
       if (dem != 0){
        setNum(x);
        setDem(y);
       }
       else{
           setNum(0);
           setDem(0);
       }
   }
   public Fraccion(Fraccion f){
       this.setDem(f.getDem());
       this.setNum(f.getNum());
   }

    /**
     * @return the num
     */
    public int getNum(){
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
    public Fraccion suma(Fraccion f){
        int a,b;
        a = this.getNum()*f.getDem() + this.getDem()*f.getNum();
        b = this.getDem()*f.getDem();
        Fraccion result = new Fraccion(a,b);
        return result;
    }
    public Fraccion resta(Fraccion f){
        int a,b;
        a = this.getNum()*f.getDem() - this.getDem()*f.getNum();
        b = this.getDem()*f.getDem();
        Fraccion result = new Fraccion(a,b);
        return result;
    }
    public Fraccion multiplicar(Fraccion f){
        int a,b;
        a = this.getNum()*f.getNum();
        b = this.getDem()*f.getDem();
        Fraccion result = new Fraccion(a,b);
        return result;       
    }
    public Fraccion dividir(Fraccion f){
        int a,b;
        a = this.getNum()*f.getDem();
        b = this.getDem()*f.getNum();
        Fraccion result = new Fraccion(a,b);
        return result;       
    }
    public void monstrar(){
        System.out.println(this.getNum()+("/")+this.getDem());
    }
    public int entero(){
        int n = this.getNum()/this.getDem();
        return n;
    }
    public double real(){
        double n = this.getNum()/this.getDem();
        return n;
    }
    public boolean irreducible(){
        return(mcd(this.getNum(),this.getDem())==1); 
    }
    public Fraccion copia(){
       return new Fraccion(this.getNum(),this.getDem());
        
    }
    public boolean equivalente(Fraccion f){
        return((this.getNum()/this.getDem()) == f.getNum()/f.getDem());
    }
    public void simplifica(){
        int mcd = mcd(getNum(),getDem());
    this.setNum(num / mcd);
    this.setDem(dem / mcd);}
    
}
