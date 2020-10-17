/**This is a Names and Initials Project, that will list my full name and initials 
 * Jazz Girard 
 * October 10, 2020
*/
public class Girard_JNamesandInitials 
{ 
    public static void main (String[] args)
{
    String firstName = "Jazz";  // First Name 
    String middleName = "Senia"; // Middle Name 
    String lastName = "Girard"; // Last Name 

    char firstInitial;  //First name initial 
    char middleInitial; //Middle name initial 
    char lastInitial; //Last name initial 

    //Obtain the initials, where charAt(0) indicates the first character letter
    firstInitial = firstName.charAt (0); 
    middleInitial = middleName.charAt(0);
    lastInitial = lastName.charAt(0);

    //Display name and initials  
    System.out.println("Name: " + firstName + " " + middleName + " " + lastName); //Display full name 
    System.out.println("Initials: " + firstInitial + middleInitial + lastInitial); //Display initials 
} 
} 