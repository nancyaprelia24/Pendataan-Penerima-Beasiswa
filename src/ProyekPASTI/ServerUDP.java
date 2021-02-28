package ProyekPASTI;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author ArryFebryan
 */
public class ServerUDP {
    
   public static void main(String args[]) throws IOException{
        System.out.print(""
                + "==========================================================\n"
                + "\tUDP Server - Kelompok PASTI\n"
                + "==========================================================\n");
        
        DatagramSocket serverSocket = null;     
        int port = 2302; 

        serverSocket = new DatagramSocket(port); 
        System.out.println("[UDP Server] Memulai Datagram Socket pada port "+ port);

       
        while(true){
            int dataLength = 100;
            byte[] receiveData = new byte[dataLength];  
            DatagramPacket receivePacket = null;
                    
            receivePacket = new DatagramPacket(receiveData, receiveData.length);
        
          
            System.out.println("\n[UDP Server] Menunggu datangnya pesan pada port "+port+" ...");
            serverSocket.receive(receivePacket); //menerima datagram yg masuk
            
            //menyimpan IP Address dan port yang digunakan oleh client
            InetAddress IPAddress = receivePacket.getAddress();
            int clientPort = receivePacket.getPort();
            String message = new String(receivePacket.getData());
            
            //menampilkan pesan yang diterima oleh server
            message = message.trim();
            System.out.println(" Permintaan telah diterima : "+message);
            
            /////Message incoming
            try{
                String sql = message;
                java.sql.Connection conn=(Connection)Config.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                
                System.out.println("\tPermintaan berhasil diproses..");
                
                String messageSend = "Permintaan berhasil diproses";
                //printStream.println(messageSend);
                message = null;
                sql = null;
            }catch(SQLException e){
                System.out.println("\tError: Permintaan tidak dapat diproses..");  
                
                String messageSend = "Permintaan tidak dapat diproses";
               // printStream.println(messageSend);
                message = null;
            }
            
            //memberikan respon untuk dikirim kembali kepada client
            byte[] sendData = new byte[1024];   //membuat varibel untuk menyimpan pesan balasan
            String responseMessage = "Thank you client, I Recevied your message";  //pesan balasan
            
            //mengirim respon pesan yang yang telah dibuat kepada client
            sendData = responseMessage.getBytes(); //memasukan pesan ke dalam variabel sendData
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, clientPort);
            serverSocket.send(sendPacket);
            
            message = null;
        }   
    }   

}