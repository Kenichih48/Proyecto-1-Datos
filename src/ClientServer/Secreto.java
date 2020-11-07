package ClientServer;

import java.io.Serializable;

public class Secreto implements Serializable{
    String tipo;
    String nombre;
    String message;
    int costo;
    int id;
    int ataque;
    
public Secreto(){
        super();
    }
    
    public Secreto(String tipo, String nombre, int costo, int id, int ataque){
        super();
        this.tipo = tipo;
        this.nombre = nombre;
        this.costo = costo;
        this.id = id;
        this.ataque = ataque;
        this.message = "The oponent has used a secret";
    }
    
    public int get_id(){
        return id;
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
    
    public String get_message(){
        return message;
    }
    
    public void set_id(int id){
        this.id = id;
    }
    
    public void set_costo(int costo){
        this.costo = costo;
    }
    
    public void set_nombre(String nombre){
        this.nombre = nombre;
    }
}

