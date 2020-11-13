package ClientServer;

import java.io.Serializable;
import java.util.Random;

public class Hechizo implements Serializable{
    String tipo;
    String nombre;
    int costo;
    int id;
    int ataque;
    int heal;
    Random rand = new Random();
    
public Hechizo(){
        super();
    }
    
    public Hechizo(String tipo, String nombre, int costo, int id, int ataque){
        super();
        this.tipo = tipo;
        this.nombre = nombre;
        this.costo = costo;
        this.id = id;
        this.ataque = rand.nextInt(300) + 100;
    }
    
    public int get_costo(){
        return costo;
    }
    
    public String get_nombre(){
        return nombre;
    }
    
    public String get_tipo(){
        return tipo;
    }
    
    public int get_heal(){
        return ataque;
    }
    
    public int get_id(){
        return id;
    }
    
    public void set_costo(int costo){
        this.costo = costo;
    }
    
    public void set_nombre(String nombre){
        this.nombre = nombre;
    }
    
    public void set_id(int id){
        this.id = id;
    }
}
