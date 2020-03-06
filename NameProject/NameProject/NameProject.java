
/* Author: Ruth Alice Williams
 * ID: 2423310
 * Program description: Prompts user to input full name and provides length
 * of full name, length of middle name, initials and name in all uppercase.
 * Pseudocode:
 * Import scanner
 * Prompt user to enter a full name
 * Assign first, middle and last names to variables
 * Assign the full name to its own variable
 * Obtain and print the length of the full name
 * Obtain and print the length of the middle name
 * Obtain and print the initials
 * Convert the name to uppercase and print it
 */
package NameProject;
//Import scanner
import java.util.Scanner;
public class NameProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Call the scanner
		Scanner input = new Scanner(System.in);
		
		//Print a statement prompting the user to enter a full name
		System.out.println("Please enter a full name.");
		
		//Assign the first input to userFirstName
		String userFirstName = input.next();
		//Assign the second input to userMiddleName
		String userMiddleName = input.next();
		//Assign the third input to userLastName
		String userLastName = input.next();
		
		//Add all the names together and assign it to userFullName
		String userFullName = userFirstName + userMiddleName + userLastName;
		
		/*Use the length() function to print out the 
		 * length of the full name
		 */
		System.out.println("Length of your name: "
		+ userFullName.length());
		
		/*Use the length() function to print out the 
		 * length of the middle name
		 */
		System.out.println("Length of your middle name: "
		+ userMiddleName.length());
		
		/*Obtain and print the first initial of each name using 
		 * the chatAt() function 
		 */
		System.out.println("Your initials are: " 
		+ userFirstName.charAt(0) + userMiddleName.charAt(0)
		+ userLastName.charAt(0));
		
		/*Use the toUpperCase() function to print the
		 * name in uppercase
		 */
		System.out.println(userFirstName.toUpperCase() + " "
		+ userMiddleName.toUpperCase() + " " + userLastName.toUpperCase());

	}

}