import java.net.*;
import java.io.*;

class Client
{
       public static void main(String Arg[]) throws Exception
       {
             System.out.println("Client Application is Running...............................");

             System.out.println("Client is Waiting for Connection............................");

             Socket s = new Socket("localhost",2100);

             PrintStream ps = new PrintStream(s.getOutputStream());

             BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));

             BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

             System.out.println("Chat Messanger Started........................................");

             String str1, str2;

             System.out.println("Enter the Message For Server :");

             while(!(str1 = br2.readLine()).equals("end"))
             {
                 ps.println(str1);

                 str2 = br1.readLine();

                 System.out.println("Server Says :"+str2);

                 System.out.println("Enter the Message for Server :");

                 
             }

             System.out.println("Thank You...");
             

       }


}