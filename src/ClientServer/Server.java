package ClientServer;

import com.google.gson.Gson;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Server extends javax.swing.JFrame {
    
    static ServerSocket ss;
    static Socket socket;
    static DataInputStream dinput;
    static DataOutputStream doutput;
    static Random rand = new Random();
    static int port = rand.nextInt(65535-1080+1)+1080;
    static String str_port = String.valueOf(port);
    static boolean cardSelected = false;
    static boolean myTurn = true;
    Test_object cardPlayed = new Test_object();

    public Server() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardSlot1 = new javax.swing.JButton();
        cardSlot2 = new javax.swing.JButton();
        cardSlot3 = new javax.swing.JButton();
        cardSlot4 = new javax.swing.JButton();
        cardSlot5 = new javax.swing.JButton();
        cardSlot6 = new javax.swing.JButton();
        cardSlot7 = new javax.swing.JButton();
        cardSlot8 = new javax.swing.JButton();
        cardSlot9 = new javax.swing.JButton();
        cardSlot10 = new javax.swing.JButton();
        playCard = new javax.swing.JButton();
        passTurn = new javax.swing.JButton();
        instructionLabel = new javax.swing.JLabel();
        portLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cardSlot1.setText("Card Slot 1");
        cardSlot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardSlot1ActionPerformed(evt);
            }
        });

        cardSlot2.setText("Card Slot 2");

        cardSlot3.setText("Card Slot 3");

        cardSlot4.setText("Card Slot 4");

        cardSlot5.setText("Card Slot 5");

        cardSlot6.setText("Card Slot 6");

        cardSlot7.setText("Card Slot 7");

        cardSlot8.setText("Card Slot 8");

        cardSlot9.setText("Card Slot 9");

        cardSlot10.setText("Card Slot 10");

        playCard.setText("Play Selected Card");
        playCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playCardActionPerformed(evt);
            }
        });

        passTurn.setText("Pass turn");
        passTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTurnActionPerformed(evt);
            }
        });

        instructionLabel.setText("Please select a card you want to play from your hand");

        portLabel.setText("Server port: " + str_port);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(portLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playCard, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(passTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cardSlot6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardSlot7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardSlot8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardSlot9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cardSlot1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardSlot2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardSlot3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardSlot4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(instructionLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cardSlot10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardSlot5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(portLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(playCard, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)))
                .addComponent(instructionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardSlot4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardSlot2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardSlot1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardSlot3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardSlot5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardSlot9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardSlot7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardSlot6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardSlot8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardSlot10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playCardActionPerformed
        if (myTurn == true){
            if (cardSelected == true){
                int confirm = JOptionPane.showConfirmDialog(null, "Are you sure?", 
                "Select an option", JOptionPane.YES_NO_OPTION);
                if (confirm == 0){
                    try{
                        Gson gson2 = new Gson();
                        String jsonOutput = gson2.toJson(cardPlayed);
                        doutput.writeUTF(jsonOutput);
                        cardPlayed = new Test_object();
                        cardSelected = false;
                    }catch(Exception e){
                        //Exceptions
                    }
                
                }
            }else if (cardSelected == false){
                JOptionPane.showMessageDialog(null, "Please select a card first",
                "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }else JOptionPane.showMessageDialog(null, "Please wait until it's your turn",
                "Warning", JOptionPane.WARNING_MESSAGE);
            
    }//GEN-LAST:event_playCardActionPerformed

    private void passTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTurnActionPerformed
        if (myTurn == true){
            myTurn = false;
            try{
                cardPlayed = new Test_object("endedTurn", 0, 0);
                Gson gson2 = new Gson();
                String jsonOutput1 = gson2.toJson(cardPlayed);
                doutput.writeUTF(jsonOutput1);
            }catch(Exception e){
                //Exceptions
            }
            
        }else JOptionPane.showMessageDialog(null, "Please wait until it's your turn",
                "Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_passTurnActionPerformed

    private void cardSlot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardSlot1ActionPerformed
        if (myTurn == true){
            cardSelected = true;
            cardPlayed = new Test_object("Baby Dragon", 60, 300);
        }else JOptionPane.showMessageDialog(null, "Please wait until it's your turn",
                "Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_cardSlot1ActionPerformed

    
    public static void main(String args[]) {
        {
            //JSON parser object to parse read file
            JSONParser jsonParser = new JSONParser();

            try (FileReader reader = new FileReader("cards.json"))
            {
                //Read JSON file
                Object obj = jsonParser.parse(reader);

                JSONArray cardList = (JSONArray) obj;
                System.out.println(cardList + "\n");

                //Iterate over employee array
                cardList.forEach( card -> parseCardObject( (JSONObject) card ) );

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server().setVisible(true);
            }
        });
        
        try{
            //setting up the socket
            ss = new ServerSocket(port);
            System.out.println("Waiting for connection in port: " + port);
            socket = ss.accept();
            System.out.println("Connection accepted");
            dinput = new DataInputStream(socket.getInputStream());
            doutput = new DataOutputStream(socket.getOutputStream());
            
            //Naming the object/cards
            Test_object objectReceived = new Test_object();
            
            //Code that receives message/object
            String jsonInput = dinput.readUTF();
            Gson gson3 = new Gson();
            objectReceived = gson3.fromJson(jsonInput, objectReceived.getClass());
            if ("endedTurn".equals(objectReceived.getnombre())){
                myTurn = true;
            }else{
            System.out.println("El objeto recibido es: " + objectReceived.getnombre() 
                    + ", ataque: " + objectReceived.getataque() + ", costo: " 
                    + objectReceived.getcosto());
            }
            
        }catch(Exception e){
            //Exceptions
        }
    }
    private static void parseCardObject(JSONObject card) 
    {
        //Get card object within list
        JSONObject cardObject = (JSONObject) card.get("card");
        
        //Get card type
        String tipo = (String) cardObject.get("tipo");    
        System.out.println(tipo); 
        
        //Get card name 
        String nombre = (String) cardObject.get("nombre");    
        System.out.println(nombre);  
        
        //Get card cost
        String costo = (String) cardObject.get("costo");    
        System.out.println("costo: " + costo);
        
        switch(tipo){
            case "esbirro":
                String ataque = (String) cardObject.get("ataque");    
                System.out.println("ataque: " + ataque + "\n");
                break;
            case "hechizo":
                String id = (String) cardObject.get("id");    
                System.out.println("id: " + id + "\n");  
                break;  
            case "secreto":
                String ids = (String) cardObject.get("id");    
                System.out.println("id: " + ids + "\n");  
                break;  
        }
    }
        


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cardSlot1;
    private javax.swing.JButton cardSlot10;
    private javax.swing.JButton cardSlot2;
    private javax.swing.JButton cardSlot3;
    private javax.swing.JButton cardSlot4;
    private javax.swing.JButton cardSlot5;
    private javax.swing.JButton cardSlot6;
    private javax.swing.JButton cardSlot7;
    private javax.swing.JButton cardSlot8;
    private javax.swing.JButton cardSlot9;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JButton passTurn;
    private javax.swing.JButton playCard;
    private javax.swing.JLabel portLabel;
    // End of variables declaration//GEN-END:variables
}
