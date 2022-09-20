package Mastery;

import java.text.NumberFormat;
import java.util.Scanner;

public class Spending 
{

	public static void main(String[] args) 
	{
		Scanner UserInput = new Scanner(System.in);
		double food, clothing, entertainment, rent, f, c, e, r;
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		System.out.print("Enter the amount spent last month on the following items: \nFood: $");
		food = UserInput.nextDouble();
		System.out.print("Clothing: $");
		clothing = UserInput.nextDouble();
		System.out.print("Entertainment: $");
		entertainment = UserInput.nextDouble();
		System.out.print("Rent: $");
		rent = UserInput.nextDouble();

		f=
		c=
		e=
		r=
		
		System.out.print("Category\tBudget \nFood    \t" + percent.format(f) +"\nClothing\t" + percent.format(c) + "\nEntertainment" + percent.format(e) + "\nRent   \t" + percent.format(r));
	}

}
