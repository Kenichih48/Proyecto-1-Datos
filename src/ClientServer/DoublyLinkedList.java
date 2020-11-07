package ClientServer;

//Para el manejo de la mano de cartas
public class DoublyLinkedList {
    static Node_Double_Linked head = null;
    
    public static void addNode(String tipo, String nombre, int costo, int id, int ataque){
        if (head==null){
            Node_Double_Linked new_node = new Node_Double_Linked();
            new_node.tipo = tipo;
            new_node.nombre = nombre;
            new_node.costo = costo;
            new_node.id = id;
            new_node.ataque = ataque;
            new_node.next = new_node.prev = new_node;
            head = new_node;
        }
        else{
        Node_Double_Linked last = head.prev;
        
        Node_Double_Linked new_node = new Node_Double_Linked();
        new_node.tipo = tipo;
        new_node.nombre = nombre;
        new_node.costo = costo;
        new_node.id = id;
        new_node.ataque = ataque;
        
        new_node.next = head;
        
        head.prev = new_node;
        
        new_node.prev = last;
        
        last.next = new_node;
        }
    }
    
    public void deleteNode(Node_Double_Linked del){
        if (head==null || del==null){
            return;
        }
        
        if (head==del){
            head = del.next;
        }
        
        if (del.next != null){
            del.next.prev = del.prev;
        }
        
        if (del.prev != null){
            del.prev.next = del.next;
        }
        
        return;
    }
    
    public static void printNodes(){
        Node_Double_Linked temp = head;
        while (temp.next != head){
            System.out.println(temp.nombre);
            temp = temp.next;
        }
        System.out.println(temp.nombre);
        
        System.out.printf("\nCircular doubly linked list traversed backward: \n");
        Node_Double_Linked last = head.prev;
        temp = last;
        while (temp.prev != last){
            System.out.println(temp.nombre);
            temp = temp.prev;
        }
        System.out.println(temp.nombre);
    }
    
    /*public static void main(String[] args)
    {
        Node l_list = null;
        addNode(40);
        addNode(50);
        addNode(60);
        addNode(70);
        addNode(80);
        addNode(90);
        
        System.out.printf("Circular doubly linked list: ");
        printNodes();
    }*/
    
    public static String get_head_tipo(){
        Node_Double_Linked temp2 = head;
        return temp2.tipo;
    }
    
    public static String get_head_nombre(){
        Node_Double_Linked temp2 = head;
        return temp2.nombre;
    }
    
    public static int get_head_costo(){
        Node_Double_Linked temp2 = head;
        return temp2.costo;
    }
    
    public static int get_head_id(){
        Node_Double_Linked temp2 = head;
        return temp2.id;
    }
    
    public static int get_head_ataque(){
        Node_Double_Linked temp2 = head;
        return temp2.ataque;
    }
    
    public static Node_Double_Linked get_head(){
        Node_Double_Linked temp2 = head;
        return temp2;
    }
    
    public static Node_Double_Linked get_next_card(Node_Double_Linked tmp){
        return tmp.next;
    }
    
    public static Node_Double_Linked get_previous_card(Node_Double_Linked tmp){
        return tmp.prev;
    }
    
    
    public static int count_hand(){
        if (head != null){
            Node_Double_Linked temp = head;
            int hand_count = 1;
            while (temp.next != head){
                hand_count += 1;
                temp = temp.next;
            }return hand_count;
            
        } else{
            return 0;
        }
    }    
}