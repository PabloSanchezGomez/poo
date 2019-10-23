
package principal;


public class Coche {
    private String nombre;
    private double velRecta;
    private double velCurva;
    
    
    public Coche(String nombre){
        if(nombre == null){
            this.nombre = ("");
            this.velRecta= this.velCurva = 0;
        }
        else{
            this.nombre = nombre;
            this.velRecta= this.velCurva = 0;
        }
    }
    public Coche(String nombre, double velRecta){
        if(nombre == null){
            this.nombre = ("");
            this.velRecta= velRecta;
            this.velCurva = 0;
        }
        else{
            this.nombre = nombre;
            this.velRecta= velRecta;
            this.velCurva = 0;
        }
    }
    public Coche(String nombre,double velRecta,double velCurva){
        if(nombre == null){
            this.nombre = ("");
            this.velRecta= velRecta;
            this.velCurva = velCurva;
        }
        else{
            this.nombre = nombre;
            this.velRecta= velRecta;
            this.velCurva = velCurva;
        }
    }
    public Coche(String nombre, Coche c){
        if(nombre == null){
           this.nombre = c.getNombre();
           
        }
        else{
            this.nombre = nombre;
        
        }
        this.velCurva = c.getVelCurva();
        this.velRecta= c.getVelRecta();
        
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getVelRecta(){
        return this.velRecta;
    }
    public double getVelCurva(){
        return this.velCurva;
    
    }
    public void setVelRecta(double vel){
        if(vel >= 0){
        this.velRecta = vel;
        }
    }
    public void setVelCurva(double cur){
        if(cur >= 0){
        this.velCurva = cur;
        }
    }
    public void acelerarRecta(){
         this.velRecta = this.velRecta + 5;
    }
    public void acelerarCurva(){
        this.velCurva = this.velCurva + 5;
    }
    public void frenaRecta(){
        this.velRecta -= 5; 
    }
    public void frenaCurva(){
        this.velCurva -= 5;
    }
    public void mejorar(){
        this.velRecta += 15;
        this.velCurva += 15;
    }
    public double calcularRecta(double km){
        if(this.velRecta == 0){
           return -1;
        }
        else{
        return (km / this.velRecta * 3600 );
        }
    }
    public double calcularCurva(double km){
        if(this.velCurva == 0){
           return -1;
        }
        else{
        return (km / this.velCurva * 3600 );
        }
    }
    public  boolean estaDetenido(){
       return((this.velRecta == 0)||(this.velCurva == 0));
    }
    @Override
    public String toString(){
    return (("velRecta") + velRecta + ("velCurva")+ velCurva);
    }
    
    
    
    
    
    
    
    
    
    }    
       