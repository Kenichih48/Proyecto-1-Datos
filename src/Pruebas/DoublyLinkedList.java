package Pruebas;

//Para el manejo de la mano de cartas
public class DoublyLinkedList {
    static Node head;
    
    static class Node{
        int data;
        Node next;
        Node prev;
    }
    static void addNode(int value){
        if (head==null){
            Node new_node = new Node();
            new_node.data = value;
            new_node.next = new_node.prev = new_node;
            head = new_node;
            return;
        }
        
        Node last = head.prev;
        
        Node new_node = new Node();
        new_node.data = value;
        
        new_node.next = head;
        
        head.prev = new_node;
        
        new_node.prev = last;
        
        last.next = new_node;
    }
    
    static void printNodes(){
        Node temp = head;
        while (temp.next != head){
            System.out.printf("%d ",temp.data);
            temp = temp.next;
        }
        System.out.printf("%d ", temp.data);
        
        System.out.printf("\nCircular doubly linked list traversed backward: \n");
        Node last = head.prev;
        temp = last;
        while (temp.prev != last){
            System.out.printf("%d ",temp.data);
            temp = temp.prev;
        }
        System.out.printf("%d ", temp.data);
    }
    
    public static void main(String[] args)
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
    }
}