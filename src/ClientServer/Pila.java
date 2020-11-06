package ClientServer;

public class Pila {
    String tipo;
    String nombre;
    int costo;
    int id;
    int ataque;
    Nodo_Pila ult;
    
    Pila(){
        this.ult = null;
    }
    
    public void insert(String tipo, String nombre, int costo, int id, int ataque){
        Nodo_Pila nodo = new Nodo_Pila(tipo, nombre, costo, id, ataque);
        
        if (this.ult == null) {
            this.ult = nodo; 
        }
        else {
            Nodo_Pila temp = this.ult;
            nodo.prev = temp;
            this.ult = nodo;
        }
    }
    
    public void next(){
        if (this.ult == null){
            System.out.print("Pila Vacía");
        }
        else {
            this.ult = this.ult.prev;
        }
    }
    
    public String get_tipo(){
        return this.ult.tipo;
    }
    
    public String get_nombre(){
        return this.ult.nombre;
    }
    
    public int get_costo(){
        return this.ult.costo;
    }
    
    public int get_id(){
        return this.ult.id;
    }
    
    public int get_ataque(){
        return this.ult.ataque;   
    }
}

