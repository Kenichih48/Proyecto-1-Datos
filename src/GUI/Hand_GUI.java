package GUI;

public class Hand_GUI extends javax.swing.JFrame {

    public Hand_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Mana_Image = new javax.swing.JLabel();
        Mana_Label = new javax.swing.JLabel();
        Mana_Possessed = new javax.swing.JLabel();
        Health_Label = new javax.swing.JLabel();
        Health_Image = new javax.swing.JLabel();
        Health_Possessed = new javax.swing.JLabel();
        Card_Slot_1 = new javax.swing.JLabel();
        Card_Slot_2 = new javax.swing.JLabel();
        Card_Slot_3 = new javax.swing.JLabel();
        Card_Slot_4 = new javax.swing.JLabel();
        Card_Slot_5 = new javax.swing.JLabel();
        Card_Slot_6 = new javax.swing.JLabel();
        Card_Slot_7 = new javax.swing.JLabel();
        Card_Slot_8 = new javax.swing.JLabel();
        Card_Slot_9 = new javax.swing.JLabel();
        Card_Slot_10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Mana_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Elixir.jpg"))); // NOI18N

        Mana_Label.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        Mana_Label.setText("Cantidad de Maná:");

        Mana_Possessed.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        Mana_Possessed.setText("1000");

        Health_Label.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        Health_Label.setText("Cantidad de Vida:");

        Health_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Health.png"))); // NOI18N

        Health_Possessed.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        Health_Possessed.setText("1000");

        Card_Slot_1.setText("Card Slot 1");
        Card_Slot_1.setBorder(new javax.swing.border.MatteBorder(null));

        Card_Slot_2.setText("Card Slot 2");
        Card_Slot_2.setBorder(new javax.swing.border.MatteBorder(null));

        Card_Slot_3.setText("Card Slot 3");
        Card_Slot_3.setBorder(new javax.swing.border.MatteBorder(null));

        Card_Slot_4.setText("Card Slot 4");
        Card_Slot_4.setBorder(new javax.swing.border.MatteBorder(null));

        Card_Slot_5.setText("Card Slot 5");
        Card_Slot_5.setBorder(new javax.swing.border.MatteBorder(null));

        Card_Slot_6.setText("Card Slot 6");
        Card_Slot_6.setBorder(new javax.swing.border.MatteBorder(null));

        Card_Slot_7.setText("Card Slot 7");
        Card_Slot_7.setBorder(new javax.swing.border.MatteBorder(null));

        Card_Slot_8.setText("Card Slot 8");
        Card_Slot_8.setBorder(new javax.swing.border.MatteBorder(null));

        Card_Slot_9.setText("Card Slot 9");
        Card_Slot_9.setBorder(new javax.swing.border.MatteBorder(null));

        Card_Slot_10.setText("Card Slot 10");
        Card_Slot_10.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Mana_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Mana_Image)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Mana_Possessed, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24)))
                    .addComponent(Health_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Health_Image)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Health_Possessed, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Card_Slot_6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Card_Slot_7, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Card_Slot_8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Card_Slot_9, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Card_Slot_1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Card_Slot_2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Card_Slot_3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Card_Slot_4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Card_Slot_5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Card_Slot_10, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(Mana_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Card_Slot_1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Card_Slot_2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Card_Slot_3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Card_Slot_4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Card_Slot_5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Card_Slot_10, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Card_Slot_6, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Card_Slot_7, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Card_Slot_8, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Card_Slot_9, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mana_Possessed, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mana_Image))
                        .addGap(25, 25, 25)
                        .addComponent(Health_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Health_Image)
                            .addComponent(Health_Possessed, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(218, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Hand_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hand_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hand_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hand_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //code double linked list goes here

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hand_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Card_Slot_1;
    private javax.swing.JLabel Card_Slot_10;
    private javax.swing.JLabel Card_Slot_2;
    private javax.swing.JLabel Card_Slot_3;
    private javax.swing.JLabel Card_Slot_4;
    private javax.swing.JLabel Card_Slot_5;
    private javax.swing.JLabel Card_Slot_6;
    private javax.swing.JLabel Card_Slot_7;
    private javax.swing.JLabel Card_Slot_8;
    private javax.swing.JLabel Card_Slot_9;
    private javax.swing.JLabel Health_Image;
    private javax.swing.JLabel Health_Label;
    private javax.swing.JLabel Health_Possessed;
    private javax.swing.JLabel Mana_Image;
    private javax.swing.JLabel Mana_Label;
    private javax.swing.JLabel Mana_Possessed;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
