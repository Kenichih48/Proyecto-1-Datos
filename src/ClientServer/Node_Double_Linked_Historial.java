package ClientServer;


public class Node_Double_Linked_Historial{
        String nombre_carta;
        String jugador;
        int turno_jugado;
        Node_Double_Linked_Historial next;
        Node_Double_Linked_Historial prev;
        
    public String get_nombre_carta(){
        return nombre_carta;
    }
    
    public String get_jugador(){
        return jugador;
    }
    
    public int get_turno_jugado(){
        return turno_jugado;
    }

    
    public Node_Double_Linked_Historial next_card(){
        return next;      
    }
    
    public Node_Double_Linked_Historial previous_card(){
        return prev;      
    }
}


