/*
Program: TempConverter.java          Date: 2022-09-15
Author: Kearmouy Heng
School: CHHS
Course: Computer Science 20
*/
package SkillBuilding;

import java.util.Scanner;

public class TempConverter 
{

	public static void main(String[] args) 
	{
		Scanner UserInput = new Scanner(System.in);
		
		int ftemp, ctemp;
		
		System.out.print("Enter a Fahrenheit temperature to be converted into the corresponding Celsius temperature: ");
		ftemp = UserInput.nextInt();
		UserInput.close();
		
		ctemp = (ftemp-32) * 5/9;
		
		System.out.print("\nYou entered " + ftemp + "°F as your Fahrenheit temperature. \n"
				+ "\nYour Fahrenheit temperature converted to Celsius is: " + ctemp + "°C.") ;
	}

}
/*
Enter a Fahrenheit temperature to be converted into the corresponding Celsius temperature: 100

You entered 100°F as your Fahrenheit temperature. 

Your Fahrenheit temperature converted to Celsius is: 37°C.
*/