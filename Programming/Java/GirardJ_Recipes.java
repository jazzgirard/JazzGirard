import javax.swing.JOptionPane; // Tells the compiler where to find the JOptionPane class

/**
* this is a Recipe project, and calculates and prints ingredients required for recipe, based on listed dozens of cookies
* @author Jazz Girard 
* 10/10/20
*/

public class GirardJ_Recipes {

	   public void showIngredients(int dozens)
	   {
			//ingredient list for 4 dozen cookies.
		   double powderedSugar = 1.5;
		   double butterOrMargarine = 1.0;
		   double vanilla = 1.0;
		   double almondExtract = 1.0;
		   double egg = 1.0;
		   double goldMedalFlour = 2.5;
		   double bakingSoda = 1.0;
		   double tartarCream = 1.0;
		  
		   //method to calculate required ingredients and print list
	       System.out.println("list of ingredients for recipe ");
	       System.out.println("Cups of powdered sugar: "+powderedSugar*dozens/4);
	       System.out.println("cup of Butter or margarine : "+butterOrMargarine*dozens/4);
	       System.out.println("Teaspoon of vanilla : "+vanilla*dozens/4);
	       System.out.println("Teaspoon of almond extract : "+almondExtract*dozens/4);
	       System.out.println("Egg : "+egg*dozens/4);
	       System.out.println("Cups of gold medal all purpose flour: "+goldMedalFlour*dozens/4);
	       System.out.println("Teaspoon of baking Soda : "+bakingSoda*dozens/4);
	       System.out.println("Teaspoon of tartar Cream : "+tartarCream*dozens/4);  
	      
	   }
	  
	   public static void main(String[] args) throws Exception
	   {
	       //Create an instance of cookie class to call its member function
	      GirardJ_Recipes c=new GirardJ_Recipes();
	      try {
	    	  
	      //Ask user to input number of dozens of cookies
	      String dozens = JOptionPane.showInputDialog("Enter number of dozens for your recipe");
	     
	      //call method to show ingredients list
	      c.showIngredients(Integer.parseInt(dozens));
	     
	      }catch(Exception e){
	          System.err.println("Please provide input in integer format");
	      }
	   }
	}