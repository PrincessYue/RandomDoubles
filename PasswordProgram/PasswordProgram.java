/* 
 * Program description: Takes password from user input and informs user as to whether or not password
 * meets specified parameters
 * Pseudocode:
 * Give user password directions
 * Prompt user to enter password
 * If password does not meet parameters, inform user what issue is
 * If password does meet parameters, inform user that the password is valid
 */

import java.util.Scanner;
public class PasswordProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Prompt user to enter a password given the specified parameters.
		
System.out.println("Please enter a password.");
System.out.println("The password must have:");
System.out.println("One or more uppcase letters");
System.out.println("Two lower case letters");
System.out.println("One or two digits");
System.out.println("Zero or one uppcase letters");
System.out.println("Any two of the following: @#$%^&");
System.out.println("Password:");
Scanner input = new Scanner(System.in);

//Assign user's input to password.

String password = input.nextLine();

//Use the  "matches" method to determine whether or not user's password meets parameters

String upperCase = "(.*[A-Z].*)";
if(!password.matches(upperCase)){
	
//If the user's password does not meet the parameters, print out a statement informing them
	
    System.out.println("Password must contain at least two uppercase letters.");
	}
String lowerCase = "(.*[a-z].*)";
if(!password.matches(lowerCase)) {
	System.out.println("Password must contain one or more lowercase letters.");
}
String numbers = "(.*[0-9].*)";
if(!password.matches(numbers)) {
	System.out.println("Password must contain one or two digits.");
}
String specialCharacters = "(.*[ @ # % ^ & ]*.)";
if(!password.matches(specialCharacters)) {
	System.out.println("Password must contain any two of the following special characters:"
			+ "@ # % ^ &");
}

//If the user's password does meet the specified parameters, print out "Password is valid"

if(password.matches(upperCase))  if(password.matches(lowerCase))  if(password.matches(numbers))
	 if(password.matches(specialCharacters)) {
		System.out.println("Password is valid.");
	}
}

 
}

