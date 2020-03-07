/*
 * Program description: Reads the randomDoubles file and prints the sum of the doubles 
 * Pseudocode:
 * Print the double from the file
 * Sum the doubles using a for loop
 * Print the sum of the doubles
 */

//Import Scanner

import java.util.Scanner;
public class RandomDouble {

	//Code an exception in the main method
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
java.io.File file = new java.io.File("randomDoubles.txt");

//Call the scanner

Scanner input = new Scanner(file);

//Use a while loop to print the doubles from the file

while(input.hasNextDouble()) {
System.out.println(input.nextDouble());
}

Scanner num = new Scanner(file);

//Initialize sum with 0

double sum = 0;

//Use a while loop to sum all of the numbers

while (num.hasNextDouble()) {
	sum += num.nextDouble();
}

//Print the total of all of the numbers

System.out.printf("\nThe total is " + "%1.2f",(sum));

//Close the files

input.close();
num.close();
}
	}


