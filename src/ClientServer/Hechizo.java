package ClientServer;

import java.io.Serializable;

public class Hechizo implements Serializable{
    private int costo;
    private String hechizo;
    private String efecto;
    private String tipo;
    private int id;
    
public Hechizo(){
        super();
    }
    
    public Hechizo(String hechizo, String efecto, int costo, int id){
        super();
        this.hechizo = hechizo;
        this.costo = costo;
        this.id = id;
        this.tipo = "hechizo";
    }
    
    public int getcosto(){
        return costo;
    }
    
    public String gethechizo(){
        return hechizo;
    }
    
    public String gettipo(){
        return tipo;
    }
    
    public int getid(){
        return id;
    }
    
    public void setcosto(int costo){
        this.costo = costo;
    }
    
    public void sethechizo(String hechizo){
        this.hechizo = hechizo;
    }
    
    public void setid(int id){
        this.id = id;
    }
    
    public String efecto(){
        if (id == 1){
            //next attack deals double damage
            return "double damage";
        }else if (id == 2){
            //heals 250 hp
            return "heals 250 hp";
        }else if (id == 3){
            //gives 600 mana
            return "gives 600 mana";
        }else if (id == 4){
            //takes 100 mana from oponent
            return "vanish 100 mana from opponent";
        }else if (id == 5){
            //deals 50 damage to opponent
            return "deals 50 damage";
        }else if (id == 6){
            //steals random card from oponent
            return "steals random card";
        }else if (id == 7){
            //can place 3 cards without mana usage
            return "can place 3 cards without mana usage";
        }else if (id == 8){
            //oponent cant attack in next turn
            return "opponent cant attack in next turn";
        }else if (id == 9){
            //deals 200 damage to oponent
            return "deals 200 damage";
        }else if (id == 10){
            //destroys random oponent card
            return "destroys random card from opponent";
        }
        return null;
    }        
}
