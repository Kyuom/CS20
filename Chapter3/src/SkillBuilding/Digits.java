/*
Program: Digits.java          Date: 2022-09-15
Author: Kearmouy Heng
School: CHHS
Course: Computer Science 20
*/
package SkillBuilding;

import java.util.Scanner;

public class Digits 
{

	public static void main(String[] args) 
	{
		Scanner UserInput = new Scanner(System.in);
		
		int number;
		
		System.out.print("Please enter a two digit number: ");
		number = UserInput.nextInt();
		
		int ten = number / 10;
		int one = number - (ten * 10);
		
		System.out.print("\nYou entered: " + number + "\n\n"
				+ "Tens Place \t Ones Place \n"
				+ ten + "\t\t " + one);
		

	}

}
