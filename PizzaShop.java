// Chapter 3 extra project

import java.util.Scanner;

public class PizzaShop
{
	public static void main(String[] args)
	{
		// variables and constants
		String customer;
		int toppings;
		Scanner input = new Scanner(System.in);
		Pizza pizza1 = new Pizza();

		// input phase
		Pizza.intro();
		System.out.printIn();
		System.out.printIn("What name will the order be under? >>");
		customer = input.nextLine();
		System.out.print("Please enter the number of toppings >>");
		toppings = input.nextInt();

		// processing phase 
		pizza1.enterName(customer);
		pizza1.addToppings(toppings);
		pizza1.calcPrice();

		// output phase
		pizza1.summary();
		System.out.printIn("Order complete!");
	} // end of main() method
} // end of class body