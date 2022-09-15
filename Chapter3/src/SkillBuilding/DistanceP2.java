/*
Program: DistanceP2.java          Date: 2022-09-15
Author: Kearmouy Heng
School: CHHS
Course: Computer Science 20
*/
package SkillBuilding;

import java.util.Scanner;

public class DistanceP2 
{

	public static void main(String[] args) 
	{
		Scanner UserInput = new Scanner (System.in);
		
		System.out.print("There is a race with three segments, please enter the distance of each race segment in km "
				+ "in the following space below. \n\n");
		
		double Segment1;
		double Segment2;
		double Segment3;
		
		System.out.print("Enter the distance for segment 1 of the race to the nearest hundredth: ");
		Segment1 = UserInput.nextDouble();
		
		System.out.print("Enter the distance for segment 2 of the race to the nearest hundredth: ");
		Segment2 = UserInput.nextDouble();
		
		System.out.print("Enter the distance for segment 3 of the race to the nearest hundredth: ");
		Segment3 = UserInput.nextDouble();
		
		double total = Segment1 + Segment2 + Segment3;
		
		System.out.print("\nYou entered " + Segment1 + "km for the distance of segment 1, " + Segment2 + "km for segment "
				+ "2, and a distance of " + Segment3 + "km for segment 3. \nThe total distance of the race is " + total);

	}

}
/*
There is a race with three segments, please enter the distance of each race segment in km in the following space below. 

Enter the distance for segment 1 of the race to the nearest hundredth: 31.15
Enter the distance for segment 2 of the race to the nearest hundredth: 84.91
Enter the distance for segment 3 of the race to the nearest hundredth: 24.32

You entered 31.15km for the distance of segment 1, 84.91km for segment 2, and a distance of 24.32km for segment 3. 
The total distance of the race is 140.38
*/