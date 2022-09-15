/*
Program: GradeAvgP2.java          Date: 2022-09-15
Author: Kearmouy Heng
School: CHHS
Course: Computer Science 20
*/
package SkillBuilding;

import java.util.Scanner;

public class GradeAvgP2 
{

	public static void main(String[] args) 
	{
Scanner UserInput = new Scanner(System.in);
		
		int g1;
		int g2;
		int g3;
		int g4;
		int g5;
		
		System.out.print("Please enter 5 grades below \n\n");
		
		System.out.print("Grade 1: ");
		g1 = UserInput.nextInt();
		
		System.out.print("Your current average is: " + g1);
		
		System.out.print("Grade 2: ");
		g2 = UserInput.nextInt();
		
		System.out.print("Your current average is: " + g1 += g2);
		
		System.out.print("Grade 3: ");
		g3 = UserInput.nextInt();

		System.out.print("Grade 4: ");
		g4 = UserInput.nextInt();

		System.out.print("Grade 5: ");
		g5 = UserInput.nextInt();
		
		int avg = (g1 + g2 + g3 + g4 + g5) / 5;
		
		System.out.print("\nYou entered " + g1 + ", " + g2 + ", " + g3 + ", " + g4 + ", " + "and " + g5 + ". \n"
				+ "The average of your grades is: " + avg + ".");

	}

}
