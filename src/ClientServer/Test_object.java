package ClientServer;

import java.io.Serializable;

public class Test_object implements Serializable{
    private int ataque;
    private int costo;
    private String nombre;
    
    public Test_object(){
        super();
    }
    
    public Test_object(String nombre, int ataque, int costo){
        super();
        this.nombre = nombre;
        this.ataque = ataque;
        this.costo = costo;
    }
    
    public int getataque(){
        return ataque;
    }
    
    public int getcosto(){
        return costo;
    }
    
    public String getnombre(){
        return nombre;
    }
    
    public void setataque(int x){
        this.ataque = x;
    }
    
    public void setcosto(int x){
        this.costo = x;
    }
    
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
}