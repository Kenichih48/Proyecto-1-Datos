package ClientServer;

import javax.swing.JOptionPane;

public class Game {
    static public void main (String[] args){
        
        int host = JOptionPane.showConfirmDialog(null, "Are you sure?", 
                "Select an option", JOptionPane.YES_NO_OPTION);
        
        if (host == 0){
            Server.main(new String[0]);
        }else if (host == 1){
            Client.main(new String[0]);
        }
        
    }
}
