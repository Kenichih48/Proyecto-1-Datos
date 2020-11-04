package ClientServer;

import com.google.gson.Gson;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

public class Client extends javax.swing.JFrame {

    static Socket socket;
    static DataInputStream dinput;
    static DataOutputStream doutput;
    static int port = 12345;
    static String str_port = String.valueOf(port);
    static boolean cardSelected = false;
    static boolean myTurn = false;
    static Test_object cardPlayed = new Test_object();
    static Test_object objectReceived = new Test_object();
    static int enemyHealthInt = 1000;
    static int myHealthInt = 1000;
    static int myManaInt = 200; 

    
    public Client() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        portLabel = new javax.swing.JLabel();
        playCard = new javax.swing.JButton();
        passTurn = new javax.swing.JButton();
        instructionLabel = new javax.swing.JLabel();
        cardSlot10 = new javax.swing.JButton();
        cardSlot1 = new javax.swing.JButton();
        cardSlot2 = new javax.swing.JButton();
        cardSlot3 = new javax.swing.JButton();
        cardSlot4 = new javax.swing.JButton();
        cardSlot5 = new javax.swing.JButton();
        cardSlot6 = new javax.swing.JButton();
        cardSlot7 = new javax.swing.JButton();
        cardSlot8 = new javax.swing.JButton();
        cardSlot9 = new javax.swing.JButton();
        enemyHealthF = new javax.swing.JTextField();
        myHealthF = new javax.swing.JTextField();
        myManaF = new javax.swing.JTextField();
        enemyHealth = new javax.swing.JLabel();
        myHealth = new javax.swing.JLabel();
        myMana = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        portLabel.setText("Server port: " + str_port);

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

        cardSlot10.setText("Card Slot 10");

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

        enemyHealthF.setEditable(false);
        enemyHealthF.setText(String.valueOf(enemyHealthInt));

        myHealthF.setEditable(false);
        myHealthF.setText(String.valueOf(myHealthInt));

        myManaF.setEditable(false);
        myManaF.setText(String.valueOf(myManaInt));

        enemyHealth.setText("Enemy's health");

        myHealth.setText("Your health");

        myMana.setText("Your mana");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(portLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(myHealth)
                                        .addComponent(myHealthF))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(enemyHealth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(enemyHealthF, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(myMana)
                                    .addComponent(myManaF, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(92, 92, 92)
                        .addComponent(playCard, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(passTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(instructionLabel)
                                .addGap(153, 153, 153))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                                        .addComponent(cardSlot4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cardSlot10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cardSlot5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playCard, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
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
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(portLabel)
                .addGap(18, 18, 18)
                .addComponent(enemyHealth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enemyHealthF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(myHealth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myHealthF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(myMana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myManaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                        if (myManaInt - cardPlayed.getcosto() >= 0){
                            Gson gson2 = new Gson();
                            String jsonOutput = gson2.toJson(cardPlayed);
                            doutput.writeUTF(jsonOutput);
                            enemyHealthInt = enemyHealthInt - cardPlayed.getataque();
                            enemyHealthF.setText(String.valueOf(enemyHealthInt));
                            myManaInt = myManaInt - cardPlayed.getcosto();
                            myManaF.setText(String.valueOf(myManaInt));
                            System.out.println("El objeto enviado es: " + cardPlayed.getnombre());
                            cardSelected = false;
                        }else{
                            JOptionPane.showMessageDialog(null, "Not enough mana",
                                "Warning", JOptionPane.WARNING_MESSAGE);
                        }
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
            try{
                cardPlayed = new Test_object("endedTurn", 0, 0);
                Gson gson2 = new Gson();
                String jsonOutput1 = gson2.toJson(cardPlayed);
                doutput.writeUTF(jsonOutput1);
                System.out.println("El objeto enviado es: " + cardPlayed.getnombre());
                myManaInt += 250;
                myManaF.setText(String.valueOf(myManaInt));
                myTurn = false;
            }catch(Exception e){
                //Exceptions
            }
        }else JOptionPane.showMessageDialog(null, "Please wait until it's your turn",
            "Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_passTurnActionPerformed

    private void cardSlot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardSlot1ActionPerformed
        if (myTurn == true){
            cardSelected = true;
            cardPlayed = new Test_object("Baby Dragon", 60, 200);
        }else JOptionPane.showMessageDialog(null, "Please wait until it's your turn",
            "Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_cardSlot1ActionPerformed

    public static void main(String args[]) {
        
        //Asking for the port number
        /*String str_port = JOptionPane.showInputDialog("Please enter the port number of "
                + "the game you want to join");
        port = Integer.valueOf(str_port);
        */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });

        try{
            //setting up the socket
            socket = new Socket("127.0.0.1", port);
            dinput = new DataInputStream(socket.getInputStream());
            doutput = new DataOutputStream(socket.getOutputStream());
            
            
            //Code that receives message/object
            String jsonInput = "";
            while(!jsonInput.equals("exit")){
                jsonInput = dinput.readUTF();
                Gson gson3 = new Gson();
                objectReceived = gson3.fromJson(jsonInput, objectReceived.getClass());
                if ("endedTurn".equals(objectReceived.getnombre())){
                    myTurn = true;
                    System.out.println("El objeto recibido es: " + objectReceived.getnombre());
                }else{
                    System.out.println("El objeto recibido es: " + objectReceived.getnombre());
                    myHealthInt = myHealthInt - objectReceived.getataque();
                    myHealthF.setText(String.valueOf(myHealthInt));
            }
            }
            
       
        }catch(Exception e){
            //Exceptions
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
    private javax.swing.JLabel enemyHealth;
    private javax.swing.JTextField enemyHealthF;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JLabel myHealth;
    private static javax.swing.JTextField myHealthF;
    private javax.swing.JLabel myMana;
    private static javax.swing.JTextField myManaF;
    private javax.swing.JButton passTurn;
    private javax.swing.JButton playCard;
    private javax.swing.JLabel portLabel;
    // End of variables declaration//GEN-END:variables
}
