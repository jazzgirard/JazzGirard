import java.util.*; //Package containing necessary framework
/** 
 * 
 * @author Jazz Girard
 * October 10,2020
 *
 */

public class JazzG_Strings
{
   //Main method
   public static void main(String[] args)
   {
       try (Scanner reader = new Scanner(System.in)) { 
		
    	   //Reading input response from user
		   System.out.println("\nWhat is your city of birth? ");
		   String birthCity = reader.nextLine();
		  
		   System.out.print("What is your favorite sport? ");
		   String favSport = reader.nextLine();
		  
		   System.out.print("If you could live anywhere in the world, where would you like to live? ");
		   String livePlace = reader.nextLine();
		  
		   System.out.print("What is your dream vacation? ");
		   String dreamVacation = reader.nextLine();
		  
		   //Final string paragraph
		   String output = "Hi everyone! \nI was born in " + birthCity + " but I would like to live in " + livePlace + " \nMy favorite sport is " + favSport + " \nMy dream vacation is " + dreamVacation;
		  
		   //Printing output string
		   System.out.println("\n" + output + "\n");
	}
   }
}