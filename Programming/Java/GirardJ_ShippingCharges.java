import java.util.Scanner;

public class GirardJ_ShippingCharges {
	public static void main(String[] args) {
		
		//Create a new Scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Declaring package weight 
		int userWeight; //Declare userWeight as an integer
		
		//Declaring shipping charges 
		double shippingCharge = 0; //Declare shippingCharge as a double
		
		//Ask the user to enter package weight  
		System.out.println("Please enter the package weight");
		userWeight = scanner.nextInt(); //Return the package weight as an integer
		
		//Conditions for shippingCharge based on userWeight
		if(userWeight <=2) { //shipping charge for package weight 2 pounds or less 
			shippingCharge=1.10;
	}	else if(userWeight <=6) { //condition for packages between 2 pounds and 6 pounds
			shippingCharge=2.20; 
	}	else if(userWeight<=10) { //Condition for packages between 6 and 10 pounds
			shippingCharge=3.70;
	} 	else { //Condition for packages greater than 10 pounds
			shippingCharge=3.80;
		}
		System.out.printf("For every 500 miles shipped, your shipping charge will be %.2f", shippingCharge);
		//Return output for shipping charge based on input weight
	}
}
