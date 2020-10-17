import javax.swing.*; // Tells the compiler where to find the JOptionPane class
/** 
 * This SoManyPeople project will calculate, based on a given rate of growth and current population, future populations of India 
 * @author Jazz Girard 
 * October 10, 2020
 */
class SoManyPeople
{
   public static void main(String[] args)
   {
	   //This container is needed because we used a Java swing GUI at the beginning of the program 
       JFrame f = new JFrame();
      
       //Enter the current population 
       long pop2020 = Long.parseLong(JOptionPane.showInputDialog(f,"Enter the approximate current population of India: ")); //Converting String to Long, and then displaying a text box
      
       //Predicting future 2021 and 2022 populations at an assumed growth rate of 1.1%
       long pop2021 = pop2020 + (long)(pop2020*(1.1/100.0)); //Calculating the population for 2021 at an assumed growth rate of 1.1%
       long pop2022 = pop2021 + (long)(pop2021*(1.1/100.0)); //Calculating the population for 2022 at an assumed growth rate of 1.1%
      
       //Final predictions 
       JOptionPane.showMessageDialog(f,"Year: 2021, Estimated Population: " + pop2021 + " \nYear: 2022, Estimated Population: " + pop2022);
   }
}