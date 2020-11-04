package Esbirros;

public class Esbirro {
    int ataque;
    int costo;
    
    public int getataque(){
        return ataque;
    }
    
    public int getcosto(){
        return costo;
    }
    
    public void setataque(int x){
        this.ataque = x;
    }
    
    public void setcosto(int x){
        this.costo = x;
    }
}