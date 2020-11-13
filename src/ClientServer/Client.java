package ClientServer;

<<<<<<< Updated upstream
=======
import static ClientServer.Server.Deck;
import static ClientServer.Server.Hand;
import static ClientServer.Server.selectedtext;
>>>>>>> Stashed changes
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
    static int port;
    static String str_port;
    static boolean cardSelected = false;
    static boolean myTurn = true;
    static boolean card_drawn = true;
    static boolean hechizo1 = false;
    static boolean hechizo7 = false;
<<<<<<< Updated upstream
=======
    static boolean Ohechizo7 = false;
    static boolean Ohechizo8 = false;
>>>>>>> Stashed changes
    static boolean Osecreto11 = false;
    static boolean Osecreto12 = false;
    static boolean Osecreto13 = false;
    static boolean Osecreto14 = false;
    static boolean Osecreto15 = false;
    static boolean Osecreto16 = false;
    static boolean Osecreto17 = false;
    static boolean Osecreto18 = false;
<<<<<<< Updated upstream
    static boolean secreto18 = false;
=======
    static boolean secreto16 = false;
    static boolean secreto18 = false;
    static boolean secreto14 = false;
    static boolean secreto15 = false;
    static boolean secreto20 = false;
>>>>>>> Stashed changes
    static boolean Osecreto19 = false;
    static boolean Osecreto20 = false;
    static int enemyHealthInt = 1000;
    static int enemyManaInt = 200;
    static int myHealthInt = 1000;
<<<<<<< Updated upstream
    static int myManaInt = 200; 
    static int contadorTurno = 0;
=======
    static int myManaInt = 200;
    static int contadorTurno = 0;
    static int hand_count = 0;
    static int deck_count = 16;
    static int contadorTurnoEnemy = 0;
>>>>>>> Stashed changes
    static String cardType;
    static Esbirro esbirro = new Esbirro();
    static Hechizo hechizo = new Hechizo();
    static Secreto secreto = new Secreto();
<<<<<<< Updated upstream
    
=======
    static DoublyLinkedList Hand = new DoublyLinkedList();
    static Pila Deck = new Pila();
    static Node_Double_Linked selectedcard;
    static DoublyLinkedListHistorial Historial = new DoublyLinkedListHistorial();
    static int game_turn = 1;
    static Node_Double_Linked_Historial selectedtext;
>>>>>>> Stashed changes
    
    public Client() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManaImage4 = new javax.swing.JLabel();
        cardSlot = new javax.swing.JButton();
        LeftArrow = new javax.swing.JButton();
        RightArrow = new javax.swing.JButton();
        playCard = new javax.swing.JButton();
        drawCard = new javax.swing.JButton();
        historial_gui = new javax.swing.JLabel();
        passTurn = new javax.swing.JButton();
<<<<<<< Updated upstream
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
=======
        historial_prev = new javax.swing.JButton();
        instructionLabel = new javax.swing.JLabel();
        historial_next = new javax.swing.JButton();
        portLabel = new javax.swing.JLabel();
>>>>>>> Stashed changes
        enemyHealth = new javax.swing.JLabel();
        myHealth = new javax.swing.JLabel();
        myMana = new javax.swing.JLabel();
        enemyHealthF = new javax.swing.JTextField();
        myHealthF = new javax.swing.JTextField();
        myManaF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        enemyManaF = new javax.swing.JTextField();
<<<<<<< Updated upstream
=======
        costoLabel1 = new javax.swing.JLabel();
        HealthImage = new javax.swing.JLabel();
        ManaImage2 = new javax.swing.JLabel();
        ManaImage3 = new javax.swing.JLabel();
        costoLabel2 = new javax.swing.JLabel();
>>>>>>> Stashed changes

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ManaImage4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        ManaImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Sword.jpg"))); // NOI18N

        cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/HogRider.jpg"))); // NOI18N
        cardSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardSlotActionPerformed(evt);
            }
        });

        LeftArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/LeftArrow.png"))); // NOI18N
        LeftArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeftArrowActionPerformed(evt);
            }
        });

        RightArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/RightArrow.png"))); // NOI18N
        RightArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RightArrowActionPerformed(evt);
            }
        });

        playCard.setText("Play Selected Card");
        playCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playCardActionPerformed(evt);
            }
        });

        drawCard.setText("Draw a Card");
        drawCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawCardActionPerformed(evt);
            }
        });

        historial_gui.setText("No cards have been played yet");

        passTurn.setText("End turn");
        passTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTurnActionPerformed(evt);
            }
        });

<<<<<<< Updated upstream
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
=======
        historial_prev.setText("Previous Play");
        historial_prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historial_prevActionPerformed(evt);
            }
        });
>>>>>>> Stashed changes

        instructionLabel.setText("Please select a card you want to play from your hand");

        historial_next.setText("Next Play");
        historial_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historial_nextActionPerformed(evt);
            }
        });

        portLabel.setText("Server port: " + str_port);

        enemyHealth.setText("Enemy's health");

        myHealth.setText("Your health");

        myMana.setText("Your mana");

        enemyHealthF.setEditable(false);
        enemyHealthF.setText(String.valueOf(enemyHealthInt));

        myHealthF.setEditable(false);
        myHealthF.setText(String.valueOf(myHealthInt));

        myManaF.setEditable(false);
        myManaF.setText(String.valueOf(myManaInt));

        jLabel1.setText("Enemy's mana");

        enemyManaF.setEditable(false);
        enemyManaF.setText(String.valueOf(enemyManaInt));

<<<<<<< Updated upstream
=======
        costoLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        costoLabel1.setText("Costo");

        HealthImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Health.png"))); // NOI18N

        ManaImage2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        ManaImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Elixir Small.jpg"))); // NOI18N

        ManaImage3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        ManaImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Elixir.jpg"))); // NOI18N

        costoLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        costoLabel2.setText("Ataque");

>>>>>>> Stashed changes
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(portLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
<<<<<<< Updated upstream
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
=======
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(enemyHealth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(enemyHealthF)
                            .addComponent(enemyManaF)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(myHealth)
                            .addComponent(myHealthF, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HealthImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(myMana)
                            .addComponent(myManaF, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ManaImage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(costoLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ManaImage2)
                        .addGap(72, 72, 72)
                        .addComponent(costoLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ManaImage4)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(playCard, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(drawCard, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LeftArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(instructionLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cardSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RightArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(historial_prev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(historial_gui)
                .addGap(34, 34, 34)
                .addComponent(historial_next)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> Stashed changes
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< Updated upstream
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
=======
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(portLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enemyHealth)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enemyHealthF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enemyManaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(myHealth)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myHealthF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HealthImage)
                        .addGap(18, 18, 18)
                        .addComponent(myMana)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myManaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ManaImage3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(playCard, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drawCard, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(instructionLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cardSlot)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(RightArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(LeftArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(costoLabel2)
                            .addComponent(ManaImage4)
                            .addComponent(costoLabel1)
                            .addComponent(ManaImage2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(historial_gui, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historial_prev, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historial_next, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
>>>>>>> Stashed changes
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cardSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardSlotActionPerformed
        if (myTurn == true){
            if (hand_count == 0){
                JOptionPane.showMessageDialog(null, "You have no cards left in your hand",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            }else {
                cardSelected = true;
                String type = selectedcard.get_tipo();
                System.out.println(type);
                System.out.println(selectedcard.get_nombre());

                if ("esbirro".equals(type)){
                    System.out.println("entre a esbirro");
                    esbirro = new Esbirro(selectedcard.get_tipo(),selectedcard.get_nombre(),selectedcard.get_costo(),
                        selectedcard.get_id(),selectedcard.get_ataque());
                }
                else if ("hechizo".equals(type)){
                    hechizo = new Hechizo(selectedcard.get_tipo(),selectedcard.get_nombre(),selectedcard.get_costo(),
                        selectedcard.get_id(),selectedcard.get_ataque());
                }
                else if ("secreto".equals(type)){
                    secreto = new Secreto(selectedcard.get_tipo(),selectedcard.get_nombre(),selectedcard.get_costo(),
                        selectedcard.get_id(),selectedcard.get_ataque());
                }else {JOptionPane.showMessageDialog(null, "Please wait until it's your turn",
                    "Warning", JOptionPane.WARNING_MESSAGE);}
        }
        }

    }//GEN-LAST:event_cardSlotActionPerformed

    private void LeftArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeftArrowActionPerformed
        if (myTurn == true){
            if (hand_count > 0){
                cardSelected = false;
                selectedcard = selectedcard.next_card();
                Image_mod(selectedcard.get_nombre()); 
            }
        }
    }//GEN-LAST:event_LeftArrowActionPerformed

    private void RightArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RightArrowActionPerformed
        if (myTurn == true){
            if (hand_count > 0){
                cardSelected = false;
                selectedcard = selectedcard.previous_card();
                Image_mod(selectedcard.get_nombre());
            }
        }
    }//GEN-LAST:event_RightArrowActionPerformed

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
                                        hechizo1 = false;
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
<<<<<<< Updated upstream
                                    
=======
                                    Historial.addNode(selectedcard.get_nombre(),"Client Player",game_turn);
                                    Node_Double_Linked_Historial head_text = Historial.get_head();
                                    selectedtext = head_text;
                                    historial_gui.setText("Server Turn " + selectedtext.get_turno_jugado() + ": " + selectedtext.get_jugador() + " played a " + selectedtext.get_nombre_carta());                          
>>>>>>> Stashed changes
                                    String str_esbirroPlayed = gson1.toJson(esbirro);
                                    doutput.writeUTF(str_esbirroPlayed);
                                    enemyHealthInt = enemyHealthInt - esbirro.getataque();
                                    enemyHealthF.setText(String.valueOf(enemyHealthInt));
                                    myManaInt = myManaInt - esbirro.getcosto();
                                    myManaF.setText(String.valueOf(myManaInt));
<<<<<<< Updated upstream
                                    System.out.println("El esbirro enviado es: " + esbirro.getesbirro());
=======
                                    System.out.println("El esbirro enviado es: " + esbirro.get_nombre()); 
                                    Hand.deleteNode(selectedcard);
                                    hand_count -= 1;
                                    Node_Double_Linked head_card = Hand.get_head();
                                    selectedcard = head_card;
                                    if (hand_count > 0){
                                        Image_mod(selectedcard.get_nombre());
                                    } else{
                                        cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Question.jpg")));
                                    }
>>>>>>> Stashed changes
                                    cardSelected = false;
                                //Checks if hechizo7 is active  
                                }else if (hechizo7 == true){
                                    Gson gson1 = new Gson();
                                    if (hechizo1 == true){
                                        esbirro.setataque(esbirro.getataque()*2);
                                        hechizo1 = false;
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
                                    Historial.addNode(selectedcard.get_nombre(),"Client Player",game_turn);
                                    Node_Double_Linked_Historial head_text = Historial.get_head();
                                    selectedtext = head_text;
                                    historial_gui.setText("Server Turn " + selectedtext.get_turno_jugado() + ": " + selectedtext.get_jugador() + " played a " + selectedtext.get_nombre_carta());                          
                                    String str_esbirroPlayed = gson1.toJson(esbirro);
                                    doutput.writeUTF(str_esbirroPlayed);
                                    enemyHealthInt = enemyHealthInt - esbirro.getataque();
                                    enemyHealthF.setText(String.valueOf(enemyHealthInt));
<<<<<<< Updated upstream
                                    System.out.println("El esbirro enviado es: " + esbirro.getesbirro());
=======
                                    System.out.println("El esbirro enviado es: " + esbirro.get_nombre());
                                    Hand.deleteNode(selectedcard);
                                    hand_count -= 1;
                                    Node_Double_Linked head_card = Hand.get_head();
                                    selectedcard = head_card;
                                    if (hand_count > 0){
                                        Image_mod(selectedcard.get_nombre());
                                    } else{
                                        cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Question.jpg")));
                                    }
>>>>>>> Stashed changes
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
                                        JOptionPane.showMessageDialog(null, "You taken 100 mana from your opponent",
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
                                        
                                        
                                            if (hand_count < 10){
                                                
                                                JOptionPane.showMessageDialog(null, "You stole a card from your opponent",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                                }else{
                                                 JOptionPane.showMessageDialog(null, "Your hand is full",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                            }
                                                                              
                                    }else if (id == 6 && Osecreto20 == true){
                                        JOptionPane.showMessageDialog(null, "Your opponent used Mega Knight secret",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto20 = false;
                                    }else if (id == 7){
                                        JOptionPane.showMessageDialog(null, "You can now place 3 cards without mana usage",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        hechizo7 = true;
<<<<<<< Updated upstream
                                    }else if (id == 8){
=======
                                    }else if (id == 8 && Osecreto15 == false){
>>>>>>> Stashed changes
                                        JOptionPane.showMessageDialog(null, "You froze your opponent for his next turn",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                    }else if (id == 8 && Osecreto15 == true){
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
<<<<<<< Updated upstream
                                    System.out.println("El hechizo enviado es: " + hechizo.gethechizo());
=======
                                    Historial.addNode(selectedcard.get_nombre(),"Client Player",game_turn);
                                    Node_Double_Linked_Historial head_text = Historial.get_head();
                                    selectedtext = head_text;
                                    historial_gui.setText("Server Turn " + selectedtext.get_turno_jugado() + ": " + selectedtext.get_jugador() + " played a " + selectedtext.get_nombre_carta());                          
                                    System.out.println("El hechizo enviado es: " + selectedcard.get_nombre());
                                    Hand.deleteNode(selectedcard);
                                    hand_count -= 1;
                                    Node_Double_Linked head_card = Hand.get_head();
                                    selectedcard = head_card;
                                    if (hand_count > 0){
                                        Image_mod(selectedcard.get_nombre());
                                    } else{
                                        cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Question.jpg")));
                                    }
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
                                    }else if (id == 4){
                                        JOptionPane.showMessageDialog(null, "You vanished 100 mana from your opponent",
=======
                                    }else if (id == 4 && Osecreto15 == false && Osecreto20 == false){
                                        JOptionPane.showMessageDialog(null, "You took 100 mana from your opponent",
>>>>>>> Stashed changes
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                    }else if (id == 5){
                                        JOptionPane.showMessageDialog(null, "You dealt 50 damage to your opponent",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        enemyHealthInt -= 50;
                                        enemyHealthF.setText(String.valueOf(enemyHealthInt));
<<<<<<< Updated upstream
                                    }else if (id == 6){
                                        JOptionPane.showMessageDialog(null, "You stole a card from your opponent",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
=======
                                    }else if (id == 5 && Osecreto14 == true && Osecreto15 == false){
                                        JOptionPane.showMessageDialog(null, "Your opponent used Tesla Coil secret",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto14 = false;
                                    }else if (id == 5 && Osecreto14 == false && Osecreto15 == true){
                                        JOptionPane.showMessageDialog(null, "Your opponent used Shield secret",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto15 = false;
                                    }else if (id == 6 && Osecreto20 == false){
                                        
                                            if (hand_count < 10){
                                                Client.Hand.deleteNode(Client.Hand.head);
                                                Hand.addNode(Client.Hand.head.tipo,Client.Hand.head.nombre,
                                                        Client.Hand.head.costo,
                                                        Client.Hand.head.id,Client.Hand.head.ataque);
                                                hand_count += 1;
                                                System.out.println("image mod should be happening");
                                                Image_mod(Client.Hand.head.get_nombre());
                                                JOptionPane.showMessageDialog(null, "You stole a card from your opponent",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                            }else{
                                                JOptionPane.showMessageDialog(null, "Your hand is full",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                            }
                                           
                                    }else if (id == 6 && Osecreto20 == true){
                                        JOptionPane.showMessageDialog(null, "Your opponent used Mega Knight secret",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto20 = false;
>>>>>>> Stashed changes
                                    }else if (id == 7){
                                        JOptionPane.showMessageDialog(null, "You can now place 3 cards without mana usage",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        hechizo7 = true;
                                    }else if (id == 8 && Osecreto15 == false){
                                        JOptionPane.showMessageDialog(null, "You freezed your opponent for his next turn",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
<<<<<<< Updated upstream
                                    }else if (id == 9){
                                        JOptionPane.showMessageDialog(null, "You dealt 200 damage to your opponent",
=======
                                    }else if (id == 8 && Osecreto15 == true){
                                        JOptionPane.showMessageDialog(null, "Your opponent used Shield secret",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                    }else if (id == 9 && Osecreto14 == false && Osecreto15 == false){
                                        JOptionPane.showMessageDialog(null, "You dealt 100 damage to your opponent",
>>>>>>> Stashed changes
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                        enemyHealthInt -= 200;
                                        enemyHealthF.setText(String.valueOf(enemyHealthInt));
                                    }else if (id == 10){
                                        JOptionPane.showMessageDialog(null, "You destroyed one of your opponent's cards",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                                    }
<<<<<<< Updated upstream
                                    System.out.println("El hechizo enviado es: " + hechizo.gethechizo());
=======
                                    Historial.addNode(selectedcard.get_nombre(),"Client Player",game_turn);
                                    Node_Double_Linked_Historial head_text = Historial.get_head();
                                    selectedtext = head_text;
                                    historial_gui.setText("Server Turn " + selectedtext.get_turno_jugado() + ": " + selectedtext.get_jugador() + " played a " + selectedtext.get_nombre_carta());                          
                                    Hand.deleteNode(selectedcard);
                                    hand_count -= 1;
                                    Node_Double_Linked head_card = Hand.get_head();
                                    selectedcard = head_card;
                                    if (hand_count > 0){
                                        Image_mod(selectedcard.get_nombre());
                                    } else{
                                        cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Question.jpg")));
                                    }
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
                                        myManaInt = myManaInt - secreto.getcosto();
                                        myManaF.setText(String.valueOf(myManaInt));
                                        System.out.println("El secreto enviado es: " + secreto.getsecreto());
=======
                                        Historial.addNode(selectedcard.get_nombre(),"Client Player",game_turn);
                                        Node_Double_Linked_Historial head_text = Historial.get_head();
                                        selectedtext = head_text;
                                        historial_gui.setText("Server Turn " + selectedtext.get_turno_jugado() + ": " + selectedtext.get_jugador() + " played a " + selectedtext.get_nombre_carta());                          
                                        myManaInt -= selectedcard.get_costo();
                                        myManaF.setText(String.valueOf(myManaInt));
                                        System.out.println("El secreto enviado es: " + selectedcard.get_nombre());
                                        Hand.deleteNode(selectedcard);
                                        hand_count -= 1;
                                        Node_Double_Linked head_card = Hand.get_head();
                                        selectedcard = head_card;
                                        if (hand_count > 0){
                                        Image_mod(selectedcard.get_nombre());
                                        } else{
                                        cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Question.jpg")));
                                        }
>>>>>>> Stashed changes
                                        cardSelected = false;
                                        
                                    }else if (Osecreto19 == true){
                                        JOptionPane.showMessageDialog(null, "Your opponent has used Miner secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto19 = false;
                                        str_secretPlayed = "";
                                        Historial.addNode(selectedcard.get_nombre(),"Client Player",game_turn);
                                        Node_Double_Linked_Historial head_text = Historial.get_head();
                                        selectedtext = head_text;
                                        historial_gui.setText("Server Turn " + selectedtext.get_turno_jugado() + ": " + selectedtext.get_jugador() + " played a " + selectedtext.get_nombre_carta());                          
                                        doutput.writeUTF(str_secretPlayed);
                                        myManaInt = myManaInt - secreto.getcosto();
                                        myManaF.setText(String.valueOf(myManaInt));
<<<<<<< Updated upstream
                                        System.out.println("El secreto enviado es: " + secreto.getsecreto());
=======
                                        System.out.println("El secreto enviado es: " + selectedcard.get_nombre());
                                        Hand.deleteNode(selectedcard);
                                        hand_count -= 1;
                                        Node_Double_Linked head_card = Hand.get_head();
                                        selectedcard = head_card;
                                        if (hand_count > 0){
                                        Image_mod(selectedcard.get_nombre());
                                        } else{
                                            cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Question.jpg")));
                                        }
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
                                        myManaInt = myManaInt - secreto.getcosto();
                                        myManaF.setText(String.valueOf(myManaInt));
                                        System.out.println("El secreto enviado es: " + secreto.getsecreto());
=======
                                        Historial.addNode(selectedcard.get_nombre(),"Client Player",game_turn);
                                        Node_Double_Linked_Historial head_text = Historial.get_head();
                                        selectedtext = head_text;
                                        historial_gui.setText("Server Turn " + selectedtext.get_turno_jugado() + ": " + selectedtext.get_jugador() + " played a " + selectedtext.get_nombre_carta());                          
                                        myManaInt -= selectedcard.get_costo();
                                        myManaF.setText(String.valueOf(myManaInt));
                                        System.out.println("El secreto enviado es: " + selectedcard.get_nombre());
                                        Hand.deleteNode(selectedcard);
                                        hand_count -= 1;
                                        Node_Double_Linked head_card = Hand.get_head();
                                        selectedcard = head_card;
                                        if (hand_count > 0){
                                        Image_mod(selectedcard.get_nombre());
                                        } else{
                                            cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Question.jpg")));
                                        }
>>>>>>> Stashed changes
                                        cardSelected = false;
                                        
                                    }else if (Osecreto19 == true){
                                        JOptionPane.showMessageDialog(null, "Your opponent has used Miner secret",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                                        Osecreto19 = false;
                                        str_secretPlayed = "";
                                        Historial.addNode(selectedcard.get_nombre(),"Client Player",game_turn);
                                        Node_Double_Linked_Historial head_text = Historial.get_head();
                                        selectedtext = head_text;
                                        historial_gui.setText("Server Turn " + selectedtext.get_turno_jugado() + ": " + selectedtext.get_jugador() + " played a " + selectedtext.get_nombre_carta());                          
                                        doutput.writeUTF(str_secretPlayed);
                                        myManaInt = myManaInt - secreto.getcosto();
                                        myManaF.setText(String.valueOf(myManaInt));
<<<<<<< Updated upstream
                                        System.out.println("El secreto enviado es: " + secreto.getsecreto());
=======
                                        System.out.println("El secreto enviado es: " + selectedcard.get_nombre());
                                        Hand.deleteNode(selectedcard);
                                        hand_count -= 1;
                                        Node_Double_Linked head_card = Hand.get_head();
                                        selectedcard = head_card;
                                        if (hand_count > 0){
                                            Image_mod(selectedcard.get_nombre());
                                        } else{
                                            cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Question.jpg")));
                                        }
>>>>>>> Stashed changes
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

    private void drawCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawCardActionPerformed
        if (myTurn == true){
            if (Osecreto17 != true){
                if (card_drawn == false){
                    if (hand_count < 10 && deck_count > 0){
                        cardSelected = false;
                        Hand.addNode(Deck.get_tipo(),Deck.get_nombre(),Deck.get_costo(),Deck.get_id(),Deck.get_ataque());
                        Deck.next();
                        deck_count -= 1;
                        hand_count += 1;
                        System.out.println("hand:" + hand_count);     
                        System.out.println("deck:" + deck_count);   
                        selectedcard = Hand.get_head();
                        Image_mod(selectedcard.get_nombre());
                        card_drawn = true;
                        JOptionPane.showMessageDialog(null, "You Drew a Card",
                                                "Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You have already drawn a card this turn!",
                    "Warning", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Your opponent played a Goblin Cage",
                    "Warning", JOptionPane.WARNING_MESSAGE);
                    Osecreto17 = false;
                    card_drawn = true;
            }
        } 
    }//GEN-LAST:event_drawCardActionPerformed

    private void passTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTurnActionPerformed
        if (myTurn == true || Ohechizo8 == true){
            try{
                NextTurn endedturn= new NextTurn("endedTurn");
                Gson gson1 = new Gson();
                String str_endedTurn = gson1.toJson(endedturn);
                doutput.writeUTF(str_endedTurn);
                System.out.println("El objeto enviado es: " + endedturn.getmensaje());

                myManaInt += 250;
<<<<<<< Updated upstream
                myManaF.setText(String.valueOf(myManaInt));
=======
                if (myManaInt > 1000){
                    myManaInt = 1000;
                }
                myManaF.setText(String.valueOf(myManaInt));

                game_turn += 1;
>>>>>>> Stashed changes
                myTurn = false;
                Ohechizo8 = false;
                
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
            }catch(Exception e){
                //Exceptions
            }

        }else {
            JOptionPane.showMessageDialog(null, "Please wait until it's your turn",
                "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_passTurnActionPerformed

<<<<<<< Updated upstream
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
=======
    private void historial_prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historial_prevActionPerformed
        if (myTurn == true){
            if (Historial.head != null){
                selectedtext = selectedtext.previous_card();
                historial_gui.setText("Turn " + selectedtext.get_turno_jugado() + " " + selectedtext.get_jugador() + " played a " + selectedtext.get_nombre_carta());

            }
        }
    }//GEN-LAST:event_historial_prevActionPerformed

    private void historial_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historial_nextActionPerformed
        if (myTurn == true){
            if (Historial.head != null){
                selectedtext = selectedtext.next_card();
                historial_gui.setText("Turn " + selectedtext.get_turno_jugado() + " " + selectedtext.get_jugador() + " played a " + selectedtext.get_nombre_carta());

            }
        }
    }//GEN-LAST:event_historial_nextActionPerformed
    
    public static void main(String args[]) {
        int deck_count = 0;
        int card_getter;
        Random rand = new Random();
        List<List<String>> list = new ArrayList<>();
        ArrayList<String> unit = new ArrayList<>();
        
        
        int a = 0;
        int b = 5;
        
        {
>>>>>>> Stashed changes
            //JSON parser object to parse read file
            JSONParser jsonParser = new JSONParser();

            try (FileReader reader = new FileReader("cards.json"))
            {
                //Read JSON file
                Object obj = jsonParser.parse(reader);

                JSONArray cardList = (JSONArray) obj;
                System.out.println(cardList + "\n");
<<<<<<< Updated upstream

                //Iterate over employee array
                cardList.forEach( card -> parseCardObject( (JSONObject) card ) );
=======
                //Iterate over card array
                cardList.forEach( card -> parseCardObject( (JSONObject) card , unit) );
                
                while (b <= 150){
                    List<String> unit2 = unit.subList(a,b);
                    list.add(unit2);
                    a += 5;
                    b+=5;
                }
                System.out.println(list);
                    
                
                //while (deck < 20) {
                  //  Deck.insert(cardList[i]);
                    //}
>>>>>>> Stashed changes

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
<<<<<<< Updated upstream
        } 
=======
        }
        
        /**
        while (deck_count < 20){
            card_getter = rand.nextInt(30);
            Deck.insert(list.get(card_getter).get(0),list.get(card_getter).get(1),
                    Integer.parseInt(list.get(card_getter).get(2)),Integer.parseInt(list.get(card_getter).get(3)),Integer.parseInt(list.get(card_getter).get(4)));
            deck_count += 1;
        }
        **/
        
        while (deck_count < 30){ 
            Deck.insert(list.get(deck_count).get(0),list.get(deck_count).get(1),
                    Integer.parseInt(list.get(deck_count).get(2)),Integer.parseInt(list.get(deck_count).get(3)),Integer.parseInt(list.get(deck_count).get(4)));
            deck_count += 1;
        }
        
        /**Deck.insert(list.get(17).get(0),list.get(17).get(1),
                    Integer.parseInt(list.get(17).get(2)),Integer.parseInt(list.get(17).get(3)),Integer.parseInt(list.get(17).get(4)));
          **/  
        
        Hand_Creation(Deck);
        Node_Double_Linked head_card = Hand.get_head();
        selectedcard = head_card;
        
        
>>>>>>> Stashed changes
        //Asking for the port number
        str_port = JOptionPane.showInputDialog("Please enter the port number of "
                + "the game you want to join");
        port = Integer.valueOf(str_port);
        
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
<<<<<<< Updated upstream
=======
                jsonInput = dinput.readUTF();
                Gson gson3 = new Gson();
                
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
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
=======
                
                //Checks for conditions to cap the values or end the game
                if (myHealthInt > 1000){
                    myHealthInt = 1000;
                    myHealthF.setText(String.valueOf(myHealthInt));
                }else if (myHealthInt <= 0){
                    JOptionPane.showMessageDialog(null, "You lost the game, thanks for playing",
                    "Warning", JOptionPane.WARNING_MESSAGE);
                    //Server.dispose();
                    System.exit(0);
                }else if (myManaInt > 1000){
                    myManaInt = 1000;
                    myManaF.setText(String.valueOf(myManaInt));
                }else if (myManaInt <= 0){
                    myManaInt = 0;
                }else if (enemyHealthInt > 1000){
                    enemyHealthInt = 1000;
                    enemyHealthF.setText(String.valueOf(enemyHealthInt));
                }else if (enemyHealthInt <= 0){
                    new Server().setVisible(false);
                    JOptionPane.showMessageDialog(null, "You won the game, thanks for playing",
                    "Warning", JOptionPane.WARNING_MESSAGE);
                }else if (enemyManaInt > 1000){
                    enemyManaInt = 1000;
                }else if (enemyManaInt <= 0){
                    enemyManaInt = 0;
                    enemyManaF.setText(String.valueOf(enemyManaInt));
                }
        
                
                //Checks to see if you have no cards left to draw and have no cards in your hand
                if (deck_count == 0 && Hand.count_hand()==0){
                    new Server().setVisible(false);
                    JOptionPane.showMessageDialog(null, "You lost the game, thanks for playing",
                    "Warning", JOptionPane.WARNING_MESSAGE);
                }  
              
                //checks if message received is mensaje
                if (jsonInput.contains("mensaje")){
                    if (Ohechizo8 == true){                        
                        myTurn = false;
                        
                    }else{
                        myTurn = true;  
                    }
                    card_drawn = false;
                    game_turn += 1;
                    enemyManaInt += 250;
                    if (enemyManaInt > 1000){
                        enemyManaInt = 1000;
                    }
                    
                    enemyManaF.setText(String.valueOf(enemyManaInt));

                    
                //checks if message received is esbirro
                }else if (jsonInput.contains("esbirro")){
                    if (Ohechizo7 == false && secreto16 == false){
                        Esbirro esbirroreceived = new Esbirro();
                        esbirroreceived = gson3.fromJson(jsonInput, esbirroreceived.getClass());
                        System.out.println(esbirroreceived);
                        myHealthInt -= esbirroreceived.get_ataque();
                        myHealthF.setText(String.valueOf(myHealthInt));
                        System.out.println(esbirroreceived.get_costo());
                        enemyManaInt -= esbirroreceived.get_costo();
                        enemyManaF.setText(String.valueOf(enemyManaInt));
                        System.out.println("El esbirro recibido es: " + esbirroreceived.get_nombre());
                        Historial.addNode(esbirroreceived.get_nombre(),"Server Player",game_turn);
                    }else if (Ohechizo7 == true && secreto16 == false){
                        Esbirro esbirroreceived = new Esbirro();
                        esbirroreceived = gson3.fromJson(jsonInput, esbirroreceived.getClass());
                        myHealthInt -= esbirroreceived.get_ataque();
                        myHealthF.setText(String.valueOf(myHealthInt));
                        System.out.println(esbirroreceived.get_costo());
                        System.out.println("El esbirro recibido es: " + esbirroreceived.get_nombre());
                        Historial.addNode(esbirroreceived.get_nombre(),"Server Player",game_turn);
                        contadorTurnoEnemy += 1;
                        if (contadorTurnoEnemy >= 2){
                            contadorTurnoEnemy = 0;
                            Ohechizo7 = false;
                        }
                    }else if (Ohechizo7 == false && secreto16 == true){
                        Esbirro esbirroreceived = new Esbirro();
                        esbirroreceived = gson3.fromJson(jsonInput, esbirroreceived.getClass());
                        myHealthInt -= esbirroreceived.get_ataque();
                        myHealthF.setText(String.valueOf(myHealthInt));
                        System.out.println(esbirroreceived.get_costo());
                        enemyHealthInt -= esbirroreceived.get_ataque();
                        enemyHealthF.setText(String.valueOf(enemyHealthInt));
                        enemyManaInt -= esbirroreceived.get_costo();
                        enemyManaF.setText(String.valueOf(enemyManaInt));
                        System.out.println("El esbirro recibido es: " + esbirroreceived.get_nombre());
                        Historial.addNode(esbirroreceived.get_nombre(),"Server Player",game_turn);
                        secreto16 = false;
                    }
                    
                    
                //checks if message received is hechizo    
                }else if (jsonInput.contains("hechizo")){
                    if (Ohechizo7 == false){
                        Hechizo hechizoreceived = new Hechizo();
                        hechizoreceived = gson3.fromJson(jsonInput, hechizoreceived.getClass());
                        enemyManaInt -= hechizoreceived.get_costo();
                        enemyManaF.setText(String.valueOf(enemyManaInt));
                        int id = hechizoreceived.get_id();
                        if (id == 1 && secreto20 == false){
                            JOptionPane.showMessageDialog(null, "Your opponent's next attack yields double the damage",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                        }else if (id == 1 && secreto20 == true){
                            JOptionPane.showMessageDialog(null, "You were protected by the Mega Knight",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                            secreto20 = false;
                        }else if (id == 2 && secreto15 == false){
                            JOptionPane.showMessageDialog(null, "Your opponent restored 250 health",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                            enemyHealthInt += 250;
                            if (enemyHealthInt > 1000){
                                enemyHealthInt = 1000;
                            }
                            enemyHealthF.setText(String.valueOf(enemyHealthInt));
                        }else if (id == 2 && secreto15 == true){
                            JOptionPane.showMessageDialog(null, "You were protected by the Shield",
                        "Information", JOptionPane.INFORMATION_MESSAGE); 
                            secreto15 = false;
                        }else if (id == 3){
                            JOptionPane.showMessageDialog(null, "Your opponent restored 600 mana",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                            enemyManaInt += 600;
                            if (enemyManaInt > 1000){
                                enemyManaInt = 1000;
                            }
                            enemyManaF.setText(String.valueOf(enemyManaInt));
                        }else if (id == 4 && secreto15 == false && secreto20 == false){
                            JOptionPane.showMessageDialog(null, "Your opponent vanished 100 mana from you",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                            myManaInt -= 100;
                            if (myManaInt < 0){
                                myManaInt = 0;
                            }
                            myManaF.setText(String.valueOf(myManaInt));
                        }else if (id == 4 && secreto15 == true && secreto20 == false){
                            JOptionPane.showMessageDialog(null, "You were protected by the shield",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                            secreto15 = false;
                        }else if (id == 4 && secreto15 == false && secreto20 == true){
                            JOptionPane.showMessageDialog(null, "You were protected by the Mega Knight",
                        "Information", JOptionPane.INFORMATION_MESSAGE);   
                            secreto20 = false;
                        }else if (id == 5 && secreto14 == false && secreto15 == false){
                            JOptionPane.showMessageDialog(null, "Your opponent dealt 50 damage to you",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                            myHealthInt -= 50;
                            myHealthF.setText(String.valueOf(myHealthInt));
                        }else if (id == 5 && secreto14 == true && secreto15 == false){
                            JOptionPane.showMessageDialog(null, "You were protected by the Tesla Coil",
                        "Information", JOptionPane.INFORMATION_MESSAGE); 
                            secreto14 = false;
                        }else if (id == 5 && secreto14 == false && secreto15 == true){
                            JOptionPane.showMessageDialog(null, "You were protected by the Shield",
                        "Information", JOptionPane.INFORMATION_MESSAGE); 
                            secreto15 = false;
                        }else if (id == 6){
                            JOptionPane.showMessageDialog(null, "Your opponent stole a card from you",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                        }else if (id == 7){
                            JOptionPane.showMessageDialog(null, "Your opponent can now place 3 cards without mana usage",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                            Ohechizo7 = true;
                        }else if (id == 8){
                            JOptionPane.showMessageDialog(null, "Your oponent freezed you for the next turn",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                            Ohechizo8 = true;
                        }else if (id == 9 && secreto14 == false && secreto15 == false){
                            JOptionPane.showMessageDialog(null, "Your opponent dealt 100 damage to you",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                            myHealthInt -= 100;
                            myHealthF.setText(String.valueOf(myHealthInt));
                        }else if (id == 9 && secreto14 == true && secreto15 == false){
                            JOptionPane.showMessageDialog(null, "You were protected by the Tesla Coil",
                        "Information", JOptionPane.INFORMATION_MESSAGE); 
                            secreto14 = false;
                        }else if (id == 9 && secreto14 == false && secreto15 == true){
                            JOptionPane.showMessageDialog(null, "You were protected by the Shield",
                        "Information", JOptionPane.INFORMATION_MESSAGE);   
                            secreto15 = false;
                        }else if (id == 10 && secreto15 == false && secreto20 == false){
                            JOptionPane.showMessageDialog(null, "Your opponent dealt 50 damage and destroyed 50 mana",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                                        myManaInt -= 50;
                                        if (myManaInt < 0){
                                            myManaInt = 0;
                                        }
                                        myManaF.setText(String.valueOf(myManaInt));
                                        myHealthInt -= 50;
                                        myHealthF.setText(String.valueOf(myHealthInt));
                        }else if (id == 10 && secreto15 == true && secreto20 == false){
                            JOptionPane.showMessageDialog(null, "You were protected by the Shield",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                            secreto15 = false;
                        }
                        else if (id == 10 && secreto15 == false && secreto20 == true){
                            JOptionPane.showMessageDialog(null, "You were protected by the Mega Knight",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                            secreto20 = false;
                        }    
                        System.out.println("El hechizo recibido es: " + hechizoreceived.get_nombre());
                        Historial.addNode(hechizoreceived.get_nombre(),"Client Player",game_turn);
                        
                    }else if (Ohechizo7 == true){
                        Hechizo hechizoreceived = new Hechizo();
                        hechizoreceived = gson3.fromJson(jsonInput, hechizoreceived.getClass());
                        int id = hechizoreceived.get_id();
                        if (id == 1 && secreto20 == false){
                            JOptionPane.showMessageDialog(null, "Your opponent's next attack yields double the damage",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                        }else if (id == 1 && secreto20 == true){
                            JOptionPane.showMessageDialog(null, "You were protected by the Mega Knight",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                            secreto20 = false;
                        }else if (id == 2 && secreto15 == false){
                            JOptionPane.showMessageDialog(null, "Your opponent restored 250 health",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                            enemyHealthInt += 250;
                            if (enemyHealthInt > 1000){
                                enemyHealthInt = 1000;
                            }
                            enemyHealthF.setText(String.valueOf(enemyHealthInt));
                        }else if (id == 2 && secreto15 == true){
                            JOptionPane.showMessageDialog(null, "You were protected by the Shield",
                        "Information", JOptionPane.INFORMATION_MESSAGE); 
                            secreto15 = false;
                        }else if (id == 3){
                            JOptionPane.showMessageDialog(null, "Your opponent restored 600 mana",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                            enemyManaInt += 600;
                            if (enemyManaInt > 1000){
                                enemyManaInt = 1000;
                            }
                            enemyManaF.setText(String.valueOf(enemyManaInt));
                        }else if (id == 4 && secreto15 == false && secreto20 == false){
                            JOptionPane.showMessageDialog(null, "Your opponent vanished 100 mana from you",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                            myManaInt -= 100;
                            if (myManaInt < 0){
                                myManaInt = 0;
                            }
                            myManaF.setText(String.valueOf(myManaInt));
                        }else if (id == 4 && secreto15 == true && secreto20 == false){
                            JOptionPane.showMessageDialog(null, "You were protected by the shield",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                            secreto15 = false;
                        }else if (id == 4 && secreto15 == false && secreto20 == true){
                            JOptionPane.showMessageDialog(null, "You were protected by the Mega Knight",
                        "Information", JOptionPane.INFORMATION_MESSAGE);   
                            secreto20 = false;
                        }else if (id == 5 && secreto14 == false && secreto15 == false){
                            JOptionPane.showMessageDialog(null, "Your opponent dealt 50 damage to you",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                            myHealthInt -= 50;
                            myHealthF.setText(String.valueOf(myHealthInt));
                        }else if (id == 5 && secreto14 == true && secreto15 == false){
                            JOptionPane.showMessageDialog(null, "You were protected by the Tesla Coil",
                        "Information", JOptionPane.INFORMATION_MESSAGE); 
                            secreto14 = false;
                        }else if (id == 5 && secreto14 == false && secreto15 == true){
                            JOptionPane.showMessageDialog(null, "You were protected by the Shield",
                        "Information", JOptionPane.INFORMATION_MESSAGE); 
                            secreto15 = false;
                        }else if (id == 6){
                            JOptionPane.showMessageDialog(null, "Your opponent stole a card from you",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                        }else if (id == 7){
                            JOptionPane.showMessageDialog(null, "Your opponent can now place 3 cards without mana usage",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                            Ohechizo7 = true;
                        }else if (id == 8){
                            JOptionPane.showMessageDialog(null, "Your oponent freezed you for the next turn",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                            Ohechizo8 = true;
                        }else if (id == 9 && secreto14 == false && secreto15 == false){
                            JOptionPane.showMessageDialog(null, "Your opponent dealt 100 damage to you",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                            myHealthInt -= 100;
                            myHealthF.setText(String.valueOf(myHealthInt));
                        }else if (id == 9 && secreto14 == true && secreto15 == false){
                            JOptionPane.showMessageDialog(null, "You were protected by the Tesla Coil",
                        "Information", JOptionPane.INFORMATION_MESSAGE); 
                            secreto14 = false;
                        }else if (id == 9 && secreto14 == false && secreto15 == true){
                            JOptionPane.showMessageDialog(null, "You were protected by the Shield",
                        "Information", JOptionPane.INFORMATION_MESSAGE);   
                            secreto15 = false;
                        }else if (id == 10 && secreto15 == false && secreto20 == false){
                            JOptionPane.showMessageDialog(null, "Your opponent dealt 50 damage and destroyed 50 mana",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                                        myManaInt -= 50;
                                        if (myManaInt < 0){
                                            myManaInt = 0;
                                        }
                                        myManaF.setText(String.valueOf(myManaInt));
                                        myHealthInt -= 50;
                                        myHealthF.setText(String.valueOf(myHealthInt));
                        }else if (id == 10 && secreto15 == true && secreto20 == false){
                            JOptionPane.showMessageDialog(null, "You were protected by the Shield",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                            secreto15 = false;
                        }
                        else if (id == 10 && secreto15 == false && secreto20 == true){
                            JOptionPane.showMessageDialog(null, "You were protected by the Mega Knight",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
                            secreto20 = false;
                        }
                        contadorTurnoEnemy += 1;
                        if (contadorTurnoEnemy >= 2){
                            contadorTurnoEnemy = 0;
                            Ohechizo7 = false;
                        }
                        Historial.addNode(hechizoreceived.get_nombre(),"Client Player",game_turn);
>>>>>>> Stashed changes
                    }
                    System.out.println("El hechizo recibido es: " + hechizoReceived.gethechizo());
                //checks if message received is secreto
                }else if (jsonInput.contains("secreto")){
<<<<<<< Updated upstream
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
                    
=======
                    if (Ohechizo7 == false){
                        Secreto secretoreceived = new Secreto();
                        secretoreceived = gson3.fromJson(jsonInput, secretoreceived.getClass());
                        enemyManaInt -= secretoreceived.get_costo();
                        enemyManaF.setText(String.valueOf(enemyManaInt));
                        int id = secretoreceived.get_id();
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
                        System.out.println("El secreto recibido es: " + secretoreceived.get_nombre());
                        Historial.addNode(secretoreceived.get_nombre(),"Client Player",game_turn);
                    }else if (Ohechizo7 == true){
                    Secreto secretoreceived = new Secreto();
                        secretoreceived = gson3.fromJson(jsonInput, secretoreceived.getClass());
                        int id = secretoreceived.get_id();
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
                        System.out.println("El secreto recibido es: " + secretoreceived.get_nombre());
                        Historial.addNode(secretoreceived.get_nombre(),"Client Player",game_turn);
                        contadorTurnoEnemy += 1;
                        if (contadorTurnoEnemy >= 2){
                            contadorTurnoEnemy = 0;
                            Ohechizo7 = false;
                        }
>>>>>>> Stashed changes
                }
                }
                        
            }
          
            
            
        }catch(Exception e){
            //Exceptions
        }
<<<<<<< Updated upstream
=======
    
    
    
    
>>>>>>> Stashed changes
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
        
<<<<<<< Updated upstream
        switch(tipo){
            case "esbirro":
                String ataque = (String) cardObject.get("ataque");    
                System.out.println("ataque: " + ataque + "\n");
=======
        String id = (String) cardObject.get("id");    
        System.out.println("id: " + id);  
        
        String ataque = (String) cardObject.get("ataque");    
        System.out.println("ataque: " + ataque + "\n");        
        
        unit.add(tipo);
        unit.add(nombre);
        unit.add(costo);
        unit.add(id);
        unit.add(ataque);        
        
        //Deck.insert(tipo,nombre,costo,id,ataque);
    
    }
    
    public static void Hand_Creation(Pila Deck){
        String tipo = Deck.get_tipo();
        String nombre = Deck.get_nombre();
        int costo = Deck.get_costo();
        int id = Deck.get_id();
        int ataque = Deck.get_ataque();
        while (hand_count < 29){
            Hand.addNode(tipo,nombre,costo,id,ataque);
            Deck.next();
            hand_count += 1;
            tipo = Deck.get_tipo();
            nombre = Deck.get_nombre();
            costo = Deck.get_costo();
            id = Deck.get_id();
            ataque = Deck.get_ataque();
        }
    }
    
    public void Image_mod(String nombre){
        switch(nombre){
            case "Barbarian":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Barbarian.jpg")));
                break;
            case "HogRider":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/HogRider.jpg")));
                break;
            case "Giant":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Giant.jpg")));
                break;
            case "Pekka":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Pekka.jpg")));
                break;
            case "IceWizard":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/IceWizard.jpg")));
                break;
            case "BabyDragon":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/BabyDragon.jpg")));
                break;
            case "Skeleton":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Skeleton.jpg")));
                break;
            case "Witch":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Witch.jpg")));
                break;
            case "Goblin":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Goblin.jpg")));
                break;
            case "Minion":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Minion.jpg")));
                break;
            case "Clone Spell":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Clone.jpg")));
                break;
            case "Heal Spell":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Heal.jpg")));
                break;
            case "Elixir Collector":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/ElixirCollector.jpg")));
                break;
            case "Log":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Log.jpg")));
                break;
            case "Zap Spell":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Zap.jpg")));
                break;
            case "Bandit":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Bandit.jpg")));
                break;
            case "Supreme Power":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/PoderSupremo.jpg")));
                break;
            case "Freeze Spell":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Freeze.jpg")));
                break;
            case "Lightning Spell":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Lightning.jpg")));
                break;
            case "Earthquake Spell":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Earthquake.jpg")));
                break;
            case "Goblin Barrel":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/GoblinBarrel.jpg")));
                break;
            case "Skeleton Barrel":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/SkeletonBarrel.jpg")));
                break;
            case "Barbarian Barrel":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/BarbarianBarrel.jpg")));
                break;
            case "Tesla Coil":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/TeslaCoil.jpg")));
                break;
            case "Shield":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Shield.jpg")));
                break;
            case "Mirror":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Mirror.jpg")));
                break;
            case "Goblin Cage":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/GoblinCage.jpg")));
                break;
            case "Graveyard":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Graveyard.jpg")));
                break;
            case "Miner":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Miner.jpg")));
                break;
            case "Mega Knight":
                cardSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/MegaKnight.jpg")));
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
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
=======
    private javax.swing.JLabel HealthImage;
    private javax.swing.JButton LeftArrow;
    private javax.swing.JLabel ManaImage2;
    private javax.swing.JLabel ManaImage3;
    private javax.swing.JLabel ManaImage4;
    private javax.swing.JButton RightArrow;
    private javax.swing.JButton cardSlot;
    private javax.swing.JLabel costoLabel1;
    private javax.swing.JLabel costoLabel2;
    private javax.swing.JButton drawCard;
>>>>>>> Stashed changes
    private javax.swing.JLabel enemyHealth;
    private static javax.swing.JTextField enemyHealthF;
    private static javax.swing.JTextField enemyManaF;
    private javax.swing.JLabel historial_gui;
    private javax.swing.JButton historial_next;
    private javax.swing.JButton historial_prev;
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
