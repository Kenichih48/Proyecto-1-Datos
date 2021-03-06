package ClientServer;

import java.io.Serializable;

public class Esbirro implements Serializable{
    String tipo;
    String nombre;
    int costo;
    int id;
    int ataque;
    
    public Esbirro(){
        super();
    }
    
    public Esbirro(String tipo, String nombre, int costo, int id, int ataque){
        super();
        this.tipo = tipo;
        this.nombre = nombre;
        this.costo = costo;
        this.id = id;
        this.ataque = ataque;
        
    }
    
    public int get_ataque(){
        return ataque;
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
    
    public int get_id(){
        return id;
    }
    
    public void set_ataque(int ataque){
        this.ataque = ataque;
    }
    
    public void set_costo(int costo){
        this.costo = costo;
    }
    
    public void set_nombre(String nombre){
        this.nombre = nombre;
    }
}