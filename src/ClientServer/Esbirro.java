package ClientServer;

import java.io.Serializable;

public class Esbirro implements Serializable{
    private int ataque;
    private int costo;
    private String esbirro;
    private String tipo;
    
    public Esbirro(){
        super();
    }
    
    public Esbirro(String esbirro, int ataque, int costo){
        super();
        this.esbirro = esbirro;
        this.ataque = ataque;
        this.costo = costo;
        this.tipo = "esbirro";
    }
    
    public int getataque(){
        return ataque;
    }
    
    public int getcosto(){
        return costo;
    }
    
    public String getesbirro(){
        return esbirro;
    }
    
    public String gettipo(){
        return tipo;
    }
    
    public void setataque(int ataque){
        this.ataque = ataque;
    }
    
    public void setcosto(int costo){
        this.costo = costo;
    }
    
    public void setesbirro(String esbirro){
        this.esbirro = esbirro;
    }
}