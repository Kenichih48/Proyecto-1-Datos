package ClientServer;

import com.google.gson.Gson;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Client extends javax.swing.JFrame {

    static Socket socket;
    static DataInputStream dinput;
    static DataOutputStream doutput;
    static int port = 12345;
    static String str_port = String.valueOf(port);
    static boolean cardSelected = false;
    static boolean myTurn = false;
    static boolean hechizo1 = false;
    static boolean hechizo7 = false;
    static boolean Osecreto11 = false;
    static boolean Osecreto12 = false;
    static boolean Osecreto13 = false;
    static boolean Osecreto14 = false;
    static boolean Osecreto15 = false;
    static boolean Osecreto16 = false;
    static boolean Osecreto17 = false;
    static boolean Osecreto18 = false;
    static boolean secreto18 = false;
    static boolean Osecreto19 = false;
    static boolean Osecreto20 = false;
    static int enemyHealthInt = 1000;
    static int enemyManaInt = 200;
    static int myHealthInt = 1000;
    static int myManaInt = 200; 
    static int contadorTurno = 0;
    static String cardType;
    static Esbirro esbirro = new Esbirro();
    static Hechizo hechizo = new Hechizo();
    static Secreto secreto = new Secreto();
    
    
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
        jLabel1 = new javax.swing.JLabel();
        enemyManaF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        portLabel.setText("Server port: " + str_port);

        playCard.setText("Play Selected Card");
        playCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playCardActionPerformed(evt);
            }
        });

        passTurn.setText("End turn");
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

        jLabel1.setText("Enemy's mana");

        enemyManaF.setEditable(false);
        enemyManaF.setText(String.valueOf(enemyManaInt));

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
                                    .addComponent(myMana)
                                    .addComponent(myManaF, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(92, 92, 92)
                        .addComponent(playCard, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(passTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(58, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(enemyHealth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(enemyHealthF)
                                    .addComponent(jLabel1)
                                    .addComponent(enemyManaF))
                                .addGap(33, 33, 33)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enemyHealth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enemyHealthF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enemyManaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
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
       //Checks if its your turn
        if (myTurn == true){
            //Checks if there's a card selected
            if (cardSelected == true){
                //Pop up menu
                int confirm = JOptionPane.showConfirmDialog(null, "Are you sure?", 
                "Select an option", JOptionPane.YES_NO_OPTION);
                if (confirm == 0){
                        //Checks if played card is esbirro
                        if ("esbirro".equals(cardType)){
                            try {
                                //Checks if there's enough mana and hechizo7 not active
                                if (myManaInt - esbirro.getcosto() >= 0 && hechizo7 == false){
                                    Gson gson1 = new Gson();
                                    if (hechizo1 == true){
                                        esbirro.setataque(esbirro.getataque()*2);
                                    }else if (Osecreto11 == true && 100 < esbirro.getcosto() && esbirro.getcosto() <= 250){
                                        esbirro.setataque(0);
                                        JOptionPane.showMessageDialog(null, "Your opponent played Goblin Barrel",
                                            "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto11 = false;
                                    }else if (Osecreto12 == true && esbirro.getcosto() <= 100){
                                        esbirro.setataque(0);
                                        JOptionPane.showMessageDialog(null, "Your opponent played Skeleton Barrel",
                                            "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto12 = false;
                                    }else if (Osecreto13 == true && esbirro.getcosto() > 250){
                                        esbirro.setataque(0);
                                        JOptionPane.showMessageDialog(null, "Your opponent played Barbarian Barrel",
                                            "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto13 = false;
                                    }else if (Osecreto16 == true && esbirro.getataque() < 200){
                                        myHealthInt -= esbirro.getataque();
                                        myHealthF.setText(String.valueOf(myHealthInt));
                                        JOptionPane.showMessageDialog(null, "Your opponent played Mirror",
                                            "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto16 = false;
                                    }
                                    
                                    String str_esbirroPlayed = gson1.toJson(esbirro);
                                    doutput.writeUTF(str_esbirroPlayed);
                                    enemyHealthInt = enemyHealthInt - esbirro.getataque();
                                    enemyHealthF.setText(String.valueOf(enemyHealthInt));
                                    myManaInt = myManaInt - esbirro.getcosto();
                                    myManaF.setText(String.valueOf(myManaInt));
                                    System.out.println("El esbirro enviado es: " + esbirro.getesbirro());
                                    cardSelected = false;
                                //Checks if hechizo7 is active  
                                }else if (hechizo7 == true){
                                    Gson gson1 = new Gson();
                                    if (hechizo1 == true){
                                        esbirro.setataque(esbirro.getataque()*2);
                                    }else if (Osecreto11 == true && 100 < esbirro.getcosto() && esbirro.getcosto() <= 250){
                                        esbirro.setataque(0);
                                        JOptionPane.showMessageDialog(null, "Your opponent played Goblin Barrel",
                                            "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto11 = false;
                                    }else if (Osecreto12 == true && esbirro.getcosto() <= 100){
                                        esbirro.setataque(0);
                                        JOptionPane.showMessageDialog(null, "Your opponent played Skeleton Barrel",
                                            "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto12 = false;
                                    }else if (Osecreto13 == true && esbirro.getcosto() > 250){
                                        esbirro.setataque(0);
                                        JOptionPane.showMessageDialog(null, "Your opponent played Barbarian Barrel",
                                            "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto13 = false;
                                    }
                                    if (contadorTurno >= 3){
                                        contadorTurno = 0;
                                        hechizo7 = false;
                                    }
                                    String str_esbirroPlayed = gson1.toJson(esbirro);
                                    doutput.writeUTF(str_esbirroPlayed);
                                    enemyHealthInt = enemyHealthInt - esbirro.getataque();
                                    enemyHealthF.setText(String.valueOf(enemyHealthInt));
                                    System.out.println("El esbirro enviado es: " + esbirro.getesbirro());
                                    contadorTurno += 1;
                                    cardSelected = false;
                                    
                                }else{
                                    JOptionPane.showMessageDialog(null, "Not enough mana",
                                    "Warning", JOptionPane.WARNING_MESSAGE);
                                }
                            } catch(Exception e){
                             //Exceptions
                            }
                        
                        //Checks if played card is hechizo
                        }else if ("hechizo".equals(cardType)){
                            try {
                                //Checks if there's enough mana and hechizo7 not active
                                if (myManaInt - hechizo.getcosto() >= 0 && hechizo7 == false){
                                    Gson gson1 = new Gson();
                                    String str_hechizoPlayed = gson1.toJson(hechizo);
                                    doutput.writeUTF(str_hechizoPlayed);
                                    myManaInt = myManaInt - hechizo.getcosto();
                                    myManaF.setText(String.valueOf(myManaInt));
                                    int id = hechizo.getid();
                                    if (id == 1 && Osecreto20 == false){
                                        JOptionPane.showMessageDialog(null, "Your next attacks yields double the damage",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        hechizo1 = true;
                                    }else if (id == 1 && Osecreto20 == true){
                                        JOptionPane.showMessageDialog(null, "Your opponent has used Mega Knight secret",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto20 = false;
                                    }else if (id == 2 && Osecreto15 == false){
                                        JOptionPane.showMessageDialog(null, "You restored 250 health",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        myHealthInt += 250;
                                        myHealthF.setText(String.valueOf(myHealthInt));
                                    }else if (id == 2 && Osecreto15 == true){
                                        JOptionPane.showMessageDialog(null, "Your opponent used Shield secret",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto15 = false;
                                    }else if (id == 3){
                                        JOptionPane.showMessageDialog(null, "You restored 600 mana",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        myManaInt += 600;
                                        myManaF.setText(String.valueOf(myManaInt));
                                    }else if (id == 4 && Osecreto15 == false && Osecreto20 == false){
                                        JOptionPane.showMessageDialog(null, "You vanished 100 mana from your opponent",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                    }else if (id == 4 && Osecreto15 == true && Osecreto20 == false){
                                        JOptionPane.showMessageDialog(null, "Your opponent used Shield secret",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto15 = false;
                                    }else if (id == 4 && Osecreto15 == false && Osecreto20 == true){
                                        JOptionPane.showMessageDialog(null, "Your opponent used Mega Knight secret",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto20 = false;
                                    }else if (id == 5 && Osecreto14 == false && Osecreto15 == false){
                                        JOptionPane.showMessageDialog(null, "You dealt 50 damage to your opponent",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        enemyHealthInt -= 50;
                                        enemyHealthF.setText(String.valueOf(enemyHealthInt));
                                    }else if (id == 5 && Osecreto14 == true && Osecreto15 == false){
                                        JOptionPane.showMessageDialog(null, "Your opponent used Tesla Coil secret",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto14 = false;
                                    }else if (id == 5 && Osecreto14 == false && Osecreto15 == true){
                                        JOptionPane.showMessageDialog(null, "Your opponent used Shield secret",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto15 = false;
                                    }else if (id == 6 && Osecreto20 == false){
                                        JOptionPane.showMessageDialog(null, "You stole a card from your opponent",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                    }else if (id == 6 && Osecreto20 == true){
                                        JOptionPane.showMessageDialog(null, "Your opponent used Mega Knight secret",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto20 = false;
                                    }else if (id == 7){
                                        JOptionPane.showMessageDialog(null, "You can now place 3 cards without mana usage",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        hechizo7 = true;
                                    }else if (id == 8){
                                        JOptionPane.showMessageDialog(null, "You freezed your opponent for his next turn",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                    }else if (id == 8){
                                        JOptionPane.showMessageDialog(null, "Your opponent used Shield secret",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                    }else if (id == 9 && Osecreto14 == false && Osecreto15 == false){
                                        JOptionPane.showMessageDialog(null, "You dealt 200 damage to your opponent",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        enemyHealthInt -= 200;
                                        enemyHealthF.setText(String.valueOf(enemyHealthInt));
                                    }else if (id == 9 && Osecreto14 == true && Osecreto15 == false){
                                        JOptionPane.showMessageDialog(null, "Your opponent used Tesla Coil secret",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto14 = false;
                                    }else if (id == 9 && Osecreto14 == false && Osecreto15 == true){
                                        JOptionPane.showMessageDialog(null, "Your opponent used Shield secret",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto15 = false;
                                    }else if (id == 10 && Osecreto15 == false && Osecreto20 == false){
                                        JOptionPane.showMessageDialog(null, "You destroyed one of your opponent's cards",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                    }else if (id == 10 && Osecreto15 == true && Osecreto20 == false){
                                        JOptionPane.showMessageDialog(null, "Your opponent used Shield secret",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto15 = false;
                                    }else if (id == 10 && Osecreto15 == false && Osecreto20 == true){
                                        JOptionPane.showMessageDialog(null, "Your opponent used Mega Knight secret",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);    
                                        Osecreto20 = false;
                                    }
                                    System.out.println("El hechizo enviado es: " + hechizo.gethechizo());
                                    cardSelected = false;
                                //Checks if hechizo7 is active    
                                }else if (hechizo7 == true){
                                    if (contadorTurno >= 3){
                                        contadorTurno = 0;
                                        hechizo7 = false;
                                    }
                                    Gson gson1 = new Gson();
                                    String str_hechizoPlayed = gson1.toJson(hechizo);
                                    doutput.writeUTF(str_hechizoPlayed);
                                    int id = hechizo.getid();
                                    if (id == 1){
                                        JOptionPane.showMessageDialog(null, "Your next attack yields double the damage",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        hechizo1 = true;
                                    }else if (id == 2){
                                        JOptionPane.showMessageDialog(null, "You restored 250 health",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        myHealthInt += 250;
                                        myHealthF.setText(String.valueOf(myHealthInt));
                                    }else if (id == 3){
                                        JOptionPane.showMessageDialog(null, "You restored 600 mana",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        myManaInt += 600;
                                        myManaF.setText(String.valueOf(myManaInt));
                                    }else if (id == 4){
                                        JOptionPane.showMessageDialog(null, "You vanished 100 mana from your opponent",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                    }else if (id == 5){
                                        JOptionPane.showMessageDialog(null, "You dealt 50 damage to your opponent",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        enemyHealthInt -= 50;
                                        enemyHealthF.setText(String.valueOf(enemyHealthInt));
                                    }else if (id == 6){
                                        JOptionPane.showMessageDialog(null, "You stole a card from your opponent",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                    }else if (id == 7){
                                        JOptionPane.showMessageDialog(null, "You can now place 3 cards without mana usage",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        hechizo7 = true;
                                    }else if (id == 8){
                                        JOptionPane.showMessageDialog(null, "You freezed your opponent for his next turn",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                    }else if (id == 9){
                                        JOptionPane.showMessageDialog(null, "You dealt 200 damage to your opponent",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        enemyHealthInt -= 200;
                                        enemyHealthF.setText(String.valueOf(enemyHealthInt));
                                    }else if (id == 10){
                                        JOptionPane.showMessageDialog(null, "You destroyed one of your opponent's cards",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    System.out.println("El hechizo enviado es: " + hechizo.gethechizo());
                                    cardSelected = false;
                                    contadorTurno += 1;
                                }else{
                                    JOptionPane.showMessageDialog(null, "Not enough mana",
                                    "Warning", JOptionPane.WARNING_MESSAGE);
                                }
                            } catch(Exception e){
                             //Exceptions
                            }
                        //Checks if played card is secreto   
                        }else if ("secreto".equals(cardType))
                            try {
                                //Checks if there's enough mana and hechizo7 not active
                                if (myManaInt - secreto.getcosto() >= 0 && hechizo7 == false){
                                    Gson gson1 = new Gson();
                                    String str_secretPlayed = gson1.toJson(secreto);
                                    if (Osecreto19 == false){
                                        int id = secreto.getid();
                                        if (id == 11){
                                            JOptionPane.showMessageDialog(null, "You have played Golbin Barrel secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                        }else if (id == 12){
                                            JOptionPane.showMessageDialog(null, "You have played Skeleton Barrel secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                        }else if (id == 13){
                                            JOptionPane.showMessageDialog(null, "You have played Barbarian Barrel secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                        }else if (id == 14){
                                            JOptionPane.showMessageDialog(null, "You have played Tesla Coil secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                        }else if (id == 15){
                                            JOptionPane.showMessageDialog(null, "You have played Shield secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                        }else if (id == 16){
                                            JOptionPane.showMessageDialog(null, "You have played Mirror secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                        }else if (id == 17){
                                            JOptionPane.showMessageDialog(null, "You have played Goblin Cage secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                        }else if (id == 18){
                                            JOptionPane.showMessageDialog(null, "You have played Graveyard secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                            secreto18 = true;
                                        }else if (id == 19){
                                            JOptionPane.showMessageDialog(null, "You have played Miner secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                        }else if (id == 20){
                                            JOptionPane.showMessageDialog(null, "You have played Mega Knight secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                        doutput.writeUTF(str_secretPlayed);
                                        myManaInt = myManaInt - secreto.getcosto();
                                        myManaF.setText(String.valueOf(myManaInt));
                                        System.out.println("El secreto enviado es: " + secreto.getsecreto());
                                        cardSelected = false;
                                        
                                    }else if (Osecreto19 == true){
                                        JOptionPane.showMessageDialog(null, "Your opponent has used Miner secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto19 = false;
                                        str_secretPlayed = "";
                                        doutput.writeUTF(str_secretPlayed);
                                        myManaInt = myManaInt - secreto.getcosto();
                                        myManaF.setText(String.valueOf(myManaInt));
                                        System.out.println("El secreto enviado es: " + secreto.getsecreto());
                                        cardSelected = false;
                                    }
                                    
                                //Checks if hechizo7 is active    
                                }else if (hechizo7 == true){
                                    if (contadorTurno >= 3){
                                        contadorTurno = 0;
                                        hechizo7 = false;
                                    }
                                    Gson gson1 = new Gson();
                                    String str_secretPlayed = gson1.toJson(secreto.getmessage());
                                    if (Osecreto19 == false){
                                        int id = secreto.getid();
                                        if (id == 11){
                                            JOptionPane.showMessageDialog(null, "You have played Golbin Barrel secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                        }else if (id == 12){
                                            JOptionPane.showMessageDialog(null, "You have played Skeleton Barrel secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                        }else if (id == 13){
                                            JOptionPane.showMessageDialog(null, "You have played Barbarian Barrel secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                        }else if (id == 14){
                                            JOptionPane.showMessageDialog(null, "You have played Tesla Coil secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                        }else if (id == 15){
                                            JOptionPane.showMessageDialog(null, "You have played Shield secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                        }else if (id == 16){
                                            JOptionPane.showMessageDialog(null, "You have played Mirror secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                        }else if (id == 17){
                                            JOptionPane.showMessageDialog(null, "You have played Goblin Cage secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                        }else if (id == 18){
                                            JOptionPane.showMessageDialog(null, "You have played Graveyard secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                            secreto18 = true;
                                        }else if (id == 19){
                                            JOptionPane.showMessageDialog(null, "You have played Miner secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                        }else if (id == 20){
                                            JOptionPane.showMessageDialog(null, "You have played Mega Knight secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                        doutput.writeUTF(str_secretPlayed);
                                        myManaInt = myManaInt - secreto.getcosto();
                                        myManaF.setText(String.valueOf(myManaInt));
                                        System.out.println("El secreto enviado es: " + secreto.getsecreto());
                                        cardSelected = false;
                                        
                                    }else if (Osecreto19 == true){
                                        JOptionPane.showMessageDialog(null, "Your opponent has used Miner secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto19 = false;
                                        str_secretPlayed = "";
                                        doutput.writeUTF(str_secretPlayed);
                                        myManaInt = myManaInt - secreto.getcosto();
                                        myManaF.setText(String.valueOf(myManaInt));
                                        System.out.println("El secreto enviado es: " + secreto.getsecreto());
                                        cardSelected = false;
                                    }
                                    contadorTurno += 1;
                                }else{
                                    JOptionPane.showMessageDialog(null, "Not enough mana",
                                    "Warning", JOptionPane.WARNING_MESSAGE);
                                }
                            } catch(Exception e){
                             //Exceptions
                            }
                
                }
            }else if (cardSelected == false){
                JOptionPane.showMessageDialog(null, "Please select a card first",
                "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }else {JOptionPane.showMessageDialog(null, "Please wait until it's your turn",
                "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_playCardActionPerformed

    private void passTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTurnActionPerformed
        if (myTurn == true){
            try{
                NextTurn endedturn= new NextTurn("endedTurn");
                Gson gson1 = new Gson();
                String str_endedTurn = gson1.toJson(endedturn);
                doutput.writeUTF(str_endedTurn);
                System.out.println("El objeto enviado es: " + endedturn.getmensaje());
                myManaInt += 250;
                myManaF.setText(String.valueOf(myManaInt));
                myTurn = false;
                
            }catch(Exception e){
                //Exceptions
            }
            
        }else {
            JOptionPane.showMessageDialog(null, "Please wait until it's your turn",
                "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_passTurnActionPerformed

    private void cardSlot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardSlot1ActionPerformed
        if (myTurn == true){
            cardSelected = true;
            esbirro = new Esbirro("Baby Dragon", 60, 200);
            cardType = esbirro.gettipo();
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
                if (myManaInt >= 600 && Osecreto18 == true){
                    myManaInt -= 200;
                    enemyManaInt += 200;
                    myManaF.setText(String.valueOf(myManaInt));
                    enemyManaF.setText(String.valueOf(enemyManaInt));
                    Osecreto18 = false;
                    JOptionPane.showMessageDialog(null, "Your opponent played Graveyard secret",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
                }else if (enemyManaInt >= 600 && secreto18 == true){
                    enemyManaInt -= 200;
                    myManaInt += 200;
                    myManaF.setText(String.valueOf(myManaInt));
                    enemyManaF.setText(String.valueOf(enemyManaInt));
                    secreto18 = false;
                    JOptionPane.showMessageDialog(null, "Your played Graveyard secret has activated",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
                }
                jsonInput = dinput.readUTF();
                Gson gson3 = new Gson();
                //checks if message received is mensaje
                if (jsonInput.contains("mensaje")){
                    enemyManaInt += 250;
                    enemyManaF.setText(String.valueOf(enemyManaInt));
                    myTurn = true;
                //checks if message received is esbirro
                }else if (jsonInput.contains("esbirro")){
                    Esbirro esbirroReceived = new Esbirro();
                    esbirroReceived = gson3.fromJson(jsonInput, esbirroReceived.getClass());
                    myHealthInt = esbirroReceived.getataque();
                    myHealthF.setText(String.valueOf(myHealthInt));
                    enemyManaInt -= esbirroReceived.getcosto();
                    enemyManaF.setText(String.valueOf(enemyManaInt));
                    System.out.println("El esbirro recibido es: " + esbirroReceived.getesbirro());
                //checks if message received is hechizo    
                }else if (jsonInput.contains("hechizo")){
                    Hechizo hechizoReceived = new Hechizo();
                    hechizoReceived = gson3.fromJson(jsonInput, hechizoReceived.getClass());
                    enemyManaInt -= hechizoReceived.getcosto();
                    enemyManaF.setText(String.valueOf(enemyManaInt));
                    int id = hechizoReceived.getid();
                    if (id == 1){
                        JOptionPane.showMessageDialog(null, "Your opponent's next attack yields double the damage",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
                    }else if (id == 2){
                        JOptionPane.showMessageDialog(null, "Your opponent restored 250 health",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
                        enemyHealthInt += 250;
                        enemyHealthF.setText(String.valueOf(enemyHealthInt));
                    }else if (id == 3){
                        JOptionPane.showMessageDialog(null, "Your opponent restored 600 mana",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
                    }else if (id == 4){
                        JOptionPane.showMessageDialog(null, "Your opponent vanished 100 mana from you",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
                        myManaInt -= 100;
                        myManaF.setText(String.valueOf(myManaInt));
                    }else if (id == 5){
                        JOptionPane.showMessageDialog(null, "Your opponent dealt 50 damage to you",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
                        myHealthInt -= 50;
                        myHealthF.setText(String.valueOf(myHealthInt));
                    }else if (id == 6){
                        JOptionPane.showMessageDialog(null, "Your opponent stole a card from you",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
                    }else if (id == 7){
                        JOptionPane.showMessageDialog(null, "Your opponent can now place 3 cards without mana usage",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
                    }else if (id == 8){
                        JOptionPane.showMessageDialog(null, "Your oponent freezed you for the next turn",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
                    }else if (id == 9){
                        JOptionPane.showMessageDialog(null, "Your opponent dealt 200 damage to you",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
                        myHealthInt -= 200;
                        myHealthF.setText(String.valueOf(myHealthInt));
                    }else if (id == 10){
                        JOptionPane.showMessageDialog(null, "Your opponent destroyed one of your cards",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                    System.out.println("El hechizo recibido es: " + hechizoReceived.gethechizo());
                //checks if message received is secreto
                }else if (jsonInput.contains("secreto")){
                    Secreto secretoReceived = new Secreto();
                    secretoReceived = gson3.fromJson(jsonInput, secretoReceived.getClass());
                    enemyManaInt -= secretoReceived.getcosto();
                    enemyManaF.setText(String.valueOf(enemyManaInt));
                    int id = secretoReceived.getid();
                    if (id == 11){
                        Osecreto11 = true;
                        JOptionPane.showMessageDialog(null, "Your opponent played a secret",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
                    }else if (id == 12){
                        Osecreto12 = true;
                        JOptionPane.showMessageDialog(null, "Your opponent played a secret",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
                    }else if (id == 13){
                        Osecreto13 = true;
                        JOptionPane.showMessageDialog(null, "Your opponent played a secret",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
                    }else if (id == 14){
                        Osecreto14 = true;
                        JOptionPane.showMessageDialog(null, "Your opponent played a secret",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
                    }else if (id == 15){
                        Osecreto15 = true;
                        JOptionPane.showMessageDialog(null, "Your opponent played a secret",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
                    }else if (id == 16){
                        Osecreto16 = true;
                        JOptionPane.showMessageDialog(null, "Your opponent played a secret",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
                    }else if (id == 17){
                        Osecreto17 = true;
                        JOptionPane.showMessageDialog(null, "Your opponent played a secret",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
                    }else if (id == 18){
                        Osecreto18 = true;
                        JOptionPane.showMessageDialog(null, "Your opponent played a secret",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
                    }else if (id == 19){
                        Osecreto19 = true;
                        JOptionPane.showMessageDialog(null, "Your opponent played a secret",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
                    }else if (id == 20){
                        Osecreto20 = true;
                        JOptionPane.showMessageDialog(null, "Your opponent played a secret",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                    System.out.println("El secreto recibido es: " + secretoReceived.getsecreto());
                    
                }
                        
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
    private javax.swing.JLabel enemyHealth;
    private static javax.swing.JTextField enemyHealthF;
    private static javax.swing.JTextField enemyManaF;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel myHealth;
    private static javax.swing.JTextField myHealthF;
    private javax.swing.JLabel myMana;
    private static javax.swing.JTextField myManaF;
    private javax.swing.JButton passTurn;
    private javax.swing.JButton playCard;
    private javax.swing.JLabel portLabel;
    // End of variables declaration//GEN-END:variables
}
