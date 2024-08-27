import java.net.*;
import java.io.*;

class Server
{
       public static void main(String Arg[]) throws Exception
       {
             System.out.println("Server Application is Running...............................");

             ServerSocket ssobj = new ServerSocket(2100);
             System.out.println("Server is Running at port No : 2100");

             Socket s = ssobj.accept();
             System.out.println("Server & Client Connection is Sucessful......................");
             

             PrintStream ps = new PrintStream(s.getOutputStream());

             BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));

             BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

             System.out.println("Chat Messanger Started......................................");

             String str1, str2;

             while((str1 = br1.readLine()) != null)
             {
                   System.out.println("Client Says :"+str1);

                   System.out.println("Enter the Message for Client :");

                   str2 = br2.readLine();

                   ps.println(str2);

             }

             System.out.println("Thank You For Using This Messanger...");
       }
}