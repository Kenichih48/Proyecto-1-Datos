package ClientServer;

import java.io.Serializable;

public class Secreto implements Serializable{
    private int costo;
    private String secreto;
    private String message;
    private String tipo;
    private int id;
    
public Secreto(){
        super();
    }
    
    public Secreto(String secreto, int id, int costo, String tipo){
        super();
        this.secreto = secreto;
        this.costo = costo;
        this.id = id;
        this.tipo = "secreto";
        this.message = "The oponent has used a secret";
    }
    
    public int getid(){
        return id;
    }
    
    public int getcosto(){
        return costo;
    }
    
    public String getsecreto(){
        return secreto;
    }
    
    public String gettipo(){
        return tipo;
    }
    
    public String getmessage(){
        return message;
    }
    
    public void setid(int id){
        this.id = id;
    }
    
    public void setcosto(int costo){
        this.costo = costo;
    }
    
    public void setsecreto(String secreto){
        this.secreto = secreto;
    }
    
    public String efecto(){
        if (id == 11){
            //if oponent plays medium cost minion, attack is dinied
            return "if oponent plays medium cost minion, attack is dinied";
        }else if (id == 12){
            //if oponent plays low cost minion, attack is dinied
            return "if oponent plays low cost minion, attack is dinied";
        }else if (id == 13){
            //if oponent plays high cost minion, attack is dinied
            return "if oponent plays high cost minion, attack is dinied";
        }else if (id == 14){
            //if oponent plays thunder or zap, spell is denied
            return "if oponent plays thunder or zap, spell is denied";
        }else if (id == 15){
            //if oponent plays damaging spell, spell is denied
            return "if oponent plays damaging spell, spell is denied";
        }else if (id == 16){
            //if oponent plays over 75 damage card, damage is reversed too
            return "if oponent plays over 75 damage card, damage is reversed too";
        }else if (id == 17){
            //if opponent has over 7 cards, one is destroyed
            return "if opponent has over 7 cards, one is destroyed";
        }else if (id == 18){
            //if opponent has over 700 mana, steals 300 mana
            return "if opponent has over 700 mana, steals 300 mana";
        }else if (id == 19){
            //if opponent has secret in play, secret is destroyed
            return "if opponent has secret in play, the secret is destroyed";
        }else if (id == 20){
            //if opponent plays self benefit spell, spell is denied
            return "if opponent plays self benefit spell, spell is denied";
        }
            return null;
    }
}

