package ClientServer;

//Para el manejo de la mano de cartas
public class DoublyLinkedListHistorial {
    static Node_Double_Linked_Historial head = null;
    
    public static void addNode(String nombre_carta, String jugador, int turno_jugado){
        if (head==null){
            Node_Double_Linked_Historial new_node = new Node_Double_Linked_Historial();
            new_node.nombre_carta = nombre_carta;
            new_node.jugador = jugador;
            new_node.turno_jugado = turno_jugado;
            new_node.next = new_node.prev = new_node;
            head = new_node;
        }
        else{
        Node_Double_Linked_Historial last = head.prev;
        
        Node_Double_Linked_Historial new_node = new Node_Double_Linked_Historial();
        new_node.nombre_carta = nombre_carta;
        new_node.jugador = jugador;
        new_node.turno_jugado = turno_jugado;
        
        new_node.next = head;
        
        head.prev = new_node;
        
        new_node.prev = last;
        
        last.next = new_node;
        }
    }
    
    public void deleteNode(Node_Double_Linked_Historial del){
        if (head==null || del==null){
            return;
        }
        
        if (head.prev == head && head.next == head){
            head.prev = null;
            head.next = null;
            head = null;
            
        } else{
        
            if (head==del){
                head = del.next;
            }

            if (del.next != null){
                del.next.prev = del.prev;
            }

            if (del.prev != null){
                del.prev.next = del.next;
            }
        }
        
    }    
    
    public static Node_Double_Linked_Historial get_head(){
        return head;
    }
     
}