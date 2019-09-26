package com.mycompany.trabajos4;

/**
 *
 * @author pablo
 */
public class Rectangulo {
    private Punto izAb;
    private Punto deAr;
        
    public Rectangulo(){
        izAb = new Punto(0,0);
        deAr = new Punto(1,1);
    }
    public Rectangulo(int x,int y){
        izAb = new Punto(0,0);
        deAr = new Punto(x,y);
    }
    public Rectangulo(Punto p1,Punto p2){
        if(p1.estaDebajo(p2) && p1.estaDerecha(p2)){
        izAb = new Punto(p1.getX(),p1.getY());
        deAr = new Punto(p2.getX(),p2.getY());
        }
        else{
        izAb = new Punto(0,0);
        deAr = new Punto(1,1);
        }
    }
    public Rectangulo(Rectangulo r){
        r.izAb = izAb.copia();
        r.deAr = deAr.copia();
    }

    /**
     * @return the izAb
     */
    public Punto getIzAb() {
        return izAb;
    }

    /**
     * @param izAb the izAb to set
     */
    public void setIzAb(Punto izAb) {
        this.izAb = izAb;
    }

    /**
     * @return the deAr
     */
    public Punto getDeAr() {
        return deAr;
    }

    /**
     * @param deAr the deAr to set
     */
    public void setDeAr(Punto deAr) {
        this.deAr = deAr;
    }
    public String toString(){
        return("izAb" + izAb + "deAr" + deAr);    
   }
    public int base(){
        return(deAr.getX()-izAb.getX());
    }
    public int altura(){
        return(deAr.getY()-izAb.getY());
    }
    public int area(){
        return(this.altura()*this.base());
    }
    public int perimetro(){
        return(this.base()*2+this.altura()*2);
    }
    public boolean esIgual(Rectangulo r){
        return(r.getIzAb() == this.izAb && r.getDeAr() == this.getDeAr());
    }
    public void desplazarX(int x){
        izAb.setX(izAb.getX()+x);
        deAr.setX(deAr.getX()+x);
    }
    
}