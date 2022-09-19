package Mastery;

import java.util.Scanner;

public class Digits 
{

	public static void main(String[] args) 
	{
		Scanner UserInput = new Scanner (System.in);
		
		System.out.print("Enter a three digit number: ");
		int digit3 = UserInput.nextInt(); //Recording user three digit number input
		System.out.print("\r\n");
		
		int hundredsplace3 = digit3 / 100; //hundreds place calculation
		int tensplace3 = (digit3 - (hundredsplace3 * 100)) / 10; //tens place calculation
		int onesplace3 = digit3 - (hundredsplace3 * 100) - (tensplace3 * 10); //ones place calculation
		
		System.out.println("The hundreds-place digit is: " + hundredsplace3 + "\r\n" + "The tens-place digit is: " + tensplace3 + "\r\n" + "The ones-place digit is: " + onesplace3); //Printing dialogue with user input
	
	}

}
/*
Enter a three digit number: 385

The hundreds-place digit is: 3
The tens-place digit is: 8
The ones-place digit is: 5
 */
