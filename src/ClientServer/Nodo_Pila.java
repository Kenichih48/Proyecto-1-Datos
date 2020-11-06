package ClientServer;

public class Nodo_Pila {
    String tipo;
    String nombre;
    int costo;
    int id;
    int ataque;       
    Nodo_Pila prev;
    
    Nodo_Pila(String tipo, String nombre, int costo, int id, int ataque){
        this.tipo = tipo;
        this.nombre = nombre;
        this.costo = costo;
        this.id = id;
        this.ataque = ataque;      
    }
}
