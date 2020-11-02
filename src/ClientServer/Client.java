package ClientServer;

import static ClientServer.Server.doutput;
import static ClientServer.Server.socket;
import com.google.gson.Gson;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client extends javax.swing.JFrame {

    static Socket socket;
    static DataInputStream dinput;
    static DataOutputStream doutput;
    static int port;
    static String str_port = String.valueOf(port);
    
    /*public Client() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
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
        
        //Asking user to enter socket port
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un puerto: ");
        str_port = sc.nextLine();
        System.out.println("El puerto ingresado es: " + str_port);
        port = Integer.valueOf(str_port);
/*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });*/

        try{
            //setting up the socket
            socket = new Socket("127.0.0.1", port);
            dinput = new DataInputStream(socket.getInputStream());
            doutput = new DataOutputStream(socket.getOutputStream());
            
            //Naming the object/cards
            Test_object objectReceived = new Test_object();
            
            //Code that receives message/object
            String jsonInput = dinput.readUTF();
            Gson gson3 = new Gson();
            objectReceived = gson3.fromJson(jsonInput, objectReceived.getClass());
            System.out.println("El objeto recibido es: " + objectReceived.getnombre() 
                    + ", ataque: " + objectReceived.getataque() + ", costo: " 
                    + objectReceived.getcosto());
            
       
        }catch(Exception e){
            //Exceptions
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
