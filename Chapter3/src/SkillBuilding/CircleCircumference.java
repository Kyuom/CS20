/*
Program: CircleCircumferenceP2.java          Date: 2022-09-16
Author: Kearmouy Heng
School: CHHS
Course: Computer Science 20
*/
package SkillBuilding;

import java.util.Scanner;

public class CircleCircumference 
{

	public static void main(String[] args) 
	{
		Scanner UserInput = new Scanner(System.in);
		int radius;
		double circumference, pi=3.14;
		System.out.print("Enter a radius: ");
		radius = UserInput.nextInt();
		UserInput.close();

		circumference = 2 * pi * radius;
		
		System.out.print("The radius you entered is " + radius + ". \nThe circumference of the circle is " + circumference + ".");
	
	}

}
