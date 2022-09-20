package Mastery;

import java.text.NumberFormat;
import java.util.Scanner;

public class Order 
{

	public static void main(String[] args) 
	{
		Scanner UserInput = new Scanner (System.in);
		
	int burgers, fries, sodas; 
	double burgersc, friesc, sodasc, btax, tax, total, tendered, change;
	NumberFormat money = NumberFormat.getCurrencyInstance();

	System.out.print("Enter the number of burgers: ");
	burgers = UserInput.nextInt();

	System.out.print("Enter the number of fries: ");
	fries = UserInput.nextInt();
	
	System.out.print("Enter the number of sodas: ");
	sodas = UserInput.nextInt();
	
	burgersc =  1.69;
	friesc = 1.09;
	sodasc = 0.99;
	btax = burgersc * burgers + friesc * fries + sodasc * sodas;
	tax = btax * 6.5 / 100;
	total = btax + tax;
	
	System.out.print("You have ordered " + burgers + " burgers, " + fries + " fries, and " + sodas + " sodas. \nYour total before tax is: " + money.format(btax) + "\nTax: " + money.format(tax)
	+ "\nFinal total: " + money.format(total) +"\nEnter amount tendered: $");
	tendered = UserInput.nextDouble();
	UserInput.close();
	
	change = tendered - total;
	
	System.out.print("Change: " + money.format(change));
	}
}
/*
Enter the number of burgers: 2
Enter the number of fries: 5
Enter the number of sodas: 5
You have ordered 2 burgers, 5 fries, and 5 sodas. 
Your total before tax is: $13.78
Tax: $0.90
Final total: $14.68
Enter amount tendered: $20
Change: $5.32
*/