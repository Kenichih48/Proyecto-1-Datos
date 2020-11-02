package ClientServer;

import static ClientServer.Client.dinput;
import com.google.gson.Gson;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server extends javax.swing.JFrame {
    
    static ServerSocket ss;
    static Socket socket;
    static DataInputStream dinput;
    static DataOutputStream doutput;
    static Random rand = new Random();
    static int port = rand.nextInt(65535-1080+1)+1080;
    static String str_port = String.valueOf(port);

    //public Server() {
        //initComponents();
    //}


    /*@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    */
    public static void main(String args[]) {
        /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server().setVisible(true);
            }
        });
        */
        try{
            //setting up the socket
            ss = new ServerSocket(port);
            System.out.println("Waiting for connection in port: " + port);
            socket = ss.accept();
            System.out.println("Connection accepted");
            dinput = new DataInputStream(socket.getInputStream());
            doutput = new DataOutputStream(socket.getOutputStream());
            
            //Naming the object/cards
            Test_object objectSent = new Test_object("Baby Dragon", 60, 300);
            
            //Code that sends message/object
            Gson gson2 = new Gson();
            String jsonOutput = gson2.toJson(objectSent);
            doutput.writeUTF(jsonOutput);
            
            
        }catch(Exception e){
            //Exceptions
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
