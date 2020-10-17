// The purpose of this program is to display the average of test scores and letter grades assigned for the test score average //

import java.util.Scanner;
public class GirardJ_TestScores {
	public static void main(String [] args) {
		
		// Create a Scanner object 
		Scanner scanner =new Scanner(System.in); 
		
		//Declaring test scores
		double score1; //Declare score1 for double input 
		double score2; //Declare score2 for double input 
		double score3; //Declare score3 for double input 
		double average; // Declare average of test scores for double input 
		
		//Ask the user to enter the first test score 
		System.out.println( "Please enter the first score");
		score1 = scanner.nextDouble(); //Return test score value as a double
		
		//Ask the user to enter the second test score 
		System.out.println( "Please enter the second score");
		score2 = scanner.nextDouble(); //Return test score value as a double
		
		//Ask the user to enter the third test score 
		System.out.println( "Please enter the third score");
		score3 = scanner.nextDouble(); //Return test score value as a double
		
		//Find the average of text scores 
		average = (score1 + score2 + score3)/ 3;
		
		//Conditions for grade based on average test scores
		
		if(average < 60) { //Calculating conditions for letter grade F
			
			System.out.printf("The average score is: %.2f. That's an F", average); 
		} else if (average < 70) { //Calculating conditions for letter grade D
			
			System.out.printf("The average score is: %.2f. That's an D", average); 
		
		} else if (average < 80) { //Calculating conditions for letter grade C
			
		System.out.printf("The average score is: %.2f. That's an C", average); 
		
		} else if (average < 90) { //Calculating conditions for letter grade B
			
			System.out.printf("The average score is: %.2f. That's an B", average); 
		
		} else if (average <=100) { //Calculating conditions for letter grade A
			
			System.out.printf("The average score is: %.2f. That's an A", average); 
		
		} else {
			System.out.println("The average score is " + average + ". That's an invalid average"); //Conditions for a number outside the range of accepted test scores 
}

}
}