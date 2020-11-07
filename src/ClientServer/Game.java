package ClientServer;

import javax.swing.JOptionPane;

public class Game {
    static public void main (String[] args){
        
        int host = JOptionPane.showConfirmDialog(null, "Do you want to host a game?", 
                "Select an option", JOptionPane.YES_NO_OPTION);
        
        if (host == 0){
            Server.main(new String[0]);
        }else if (host == 1){
            Client.main(new String[0]);
        }
        
    }
}
