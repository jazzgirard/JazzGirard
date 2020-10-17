// The purpose of this program is to lead the user through troubleshooting a bad WiFi connection
import java.util.Scanner;

public class GirardJ_WifiDiagnosticTree
{
   public static void main(String[] args) {
  
	   //Create a Scanner object
   Scanner sc = new Scanner(System.in);
  
       System.out.println("Reboot the computer and try to connect."); //Step 1
      
       System.out.print("Did that fix the problem? ");
       String response = sc.nextLine(); //User response
      
       if(response.toLowerCase().equals("no"))
       {
       System.out.println("Reboot the router and try to connect."); //Step 2
      
       System.out.print("Did that fix the problem? ");
       response = sc.nextLine(); //User response
      
       if(response.toLowerCase().equals("no"))
       {
       System.out.println("Make sure the cables between the router & modem are plugged in firmly."); //Step 3
      
       System.out.print("Did that fix the problem? ");
       response = sc.nextLine(); //User response
      
       if(response.toLowerCase().equals("no"))
       {
       System.out.println("Move the router to a new location and try to connect."); //Step 4
      
       System.out.print("Did that fix the problem? ");
       response = sc.nextLine(); //User response
      
       if(response.toLowerCase().equals("no"))
       {
       System.out.println("Get a new router."); //Step 5
       
       // The program will stop running if the user enters "yes"
       }
       }
       }
       }
   }
}

