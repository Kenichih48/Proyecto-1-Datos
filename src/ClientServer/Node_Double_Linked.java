/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientServer;

/**
 *
 * @author kenic
 */
public class Node_Double_Linked{
        String tipo;
        String nombre;
        int costo;
        int id;
        int ataque;
        Node_Double_Linked next;
        Node_Double_Linked prev;
        
    public String get_tipo(){
        return tipo;
    }
    
    public String get_nombre(){
        return nombre;
    }
    
    public int get_costo(){
        return costo;
    }
    
    public int get_id(){
        return id;
    }
    
    public int get_ataque(){
        return ataque;
    }
    
    public Node_Double_Linked next(){
        return next;      
    }
    
    public Node_Double_Linked previous(){
        return prev;      
    }
}


