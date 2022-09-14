package SkillBuilding;

import java.util.Scanner;

public class ClassDemo
{

	public static void main(String[] args) 
	{
		
		//Hardcoding - puts in set variables - no user input
		//create a space for an whole number integer, then name the space, then prompt the user to input data
		int age1 = 17;
		//create a space for a decimal integer, 
		double salary1 = 100.8;
		//create a space for letters that are together
		String name1 = "Kearmouy";
		//create a space for a single character
		char firstinitial1 = 'K';

		System.out.print("My name is " + name1 + ", the first intial of my name is " + firstinitial1 + ", I am " + age1
				+ " and I make " + salary1 + ".");
		
		//Soft coding - allows for user input
		
		Scanner UserInput = new Scanner(System.in);
		
		int age2;
		double salary2; 
		String name2;
		char firstinitial2; 
		
		System.out.print("\n\nPlease enter your name:");
		name2 = UserInput.nextLine();
		
		System.out.print("\nPlease enter your first initial:");
		firstinitial2 = UserInput.next().charAt(0);
		
		System.out.print("\nPlease enter your age:");
		age2 = UserInput.nextInt();
		
		System.out.print("\nPlease enter your salary:");
		salary2 = UserInput.nextDouble();

		System.out.print("\nYour name is " + name2 + "and your first intial is " + firstinitial2 + ", you're " + age2
				+ " and you make " + salary2);
	}

}
