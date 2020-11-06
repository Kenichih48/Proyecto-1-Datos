package ClientServer;

//Para el manejo de la mano de cartas
public class DoublyLinkedList {
    static Node head = null;
    
    public static class Node{
        String tipo;
        String nombre;
        int costo;
        int id;
        int ataque;
        Node next;
        Node prev;
    }
    public static void addNode(String tipo, String nombre, int costo, int id, int ataque){
        if (head==null){
            Node new_node = new Node();
            new_node.tipo = tipo;
            new_node.nombre = nombre;
            new_node.costo = costo;
            new_node.id = id;
            new_node.ataque = ataque;
            new_node.next = new_node.prev = new_node;
            head = new_node;
        }
        else{
        Node last = head.prev;
        
        Node new_node = new Node();
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
    
    /*public static void printNodes(){
        Node temp = head;
        while (temp.next != head){
            System.out.println(temp.nombre);
            temp = temp.next;
        }
        System.out.println(temp.nombre);
        
        System.out.printf("\nCircular doubly linked list traversed backward: \n");
        Node last = head.prev;
        temp = last;
        while (temp.prev != last){
            System.out.println(temp.nombre);
            temp = temp.prev;
        }
        System.out.println(temp.nombre);
    }*/
    
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
        Node temp2 = head;
        return temp2.tipo;
    }
    
    public static String get_head_nombre(){
        Node temp2 = head;
        return temp2.nombre;
    }
    
    public static int get_head_costo(){
        Node temp2 = head;
        return temp2.costo;
    }
    
    public static int get_head_id(){
        Node temp2 = head;
        return temp2.id;
    }
    
    public static int get_head_ataque(){
        Node temp2 = head;
        return temp2.ataque;
    }
    
    public static void Next(){
        Node temp = head;
        temp = temp.next;
        head = temp;        
    }
    
    public static void Prev(){
        Node temp = head;
        temp = temp.prev;
        head = temp;        
    }
    
    public static int count_hand(){
        Node temp = head;
        int hand_count = 0;
        while (temp.next != head){
            hand_count += 1;
            temp = temp.next;
        }
        return hand_count;
    }    
}