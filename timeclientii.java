import java.net.*;

import java.io.*;

public class timeclientii {

 public static void main(String[] args) throws IOException
{

   Socket cs= new Socket("192.168.124.134",7778);

System.out.println("client"+cs.getInetAddress()+"is communicating from port no.:"+cs.getPort());


BufferedReader fromserver=new BufferedReader(new 
InputStreamReader(cs.getInputStream()));


        

        System.out.println(fromserver.readLine());

        fromserver.close();

        cs.close();

        

    }

}
