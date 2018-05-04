import java.io.*;

import java.net.*;

public class firstclient

{

  public static void main(String[] args) throws Exception

  {

     Socket sock = new Socket("192.168.124.134", 36862);

                            
     BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));

                             
     OutputStream ostream = sock.getOutputStream(); 

     PrintWriter pwrite = new PrintWriter(ostream, true);


     InputStream istream = sock.getInputStream();

     BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));

System.out.println("Start chatting");

 

     String receiveMessage, sendMessage;               

     while(true)

     {

        sendMessage = keyRead.readLine(); 

        pwrite.println(sendMessage);       

        pwrite.flush();                    

        if((receiveMessage = receiveRead.readLine()) != null) 

        {

            System.out.println(receiveMessage);

        }         

      }               

    }                    

}                     
