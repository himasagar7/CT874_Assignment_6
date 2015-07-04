package assignment_6;

import java.text.DecimalFormat;
import java.util.Scanner;
/*
 * program that accepts the unit of weight of a bag of coffee in pounds and the number of bags sold and display the total price of the sale
 */
class CoffeeBag {
	// Defining class constants
	static final double pricePerPound = 5.55d;
	static final int taxRate = 10;

	public double totalPrice(int bagWeight, int numberOfBags, double pricePerLb) {
		return bagWeight * numberOfBags * pricePerLb;
	}

	public double totalPriceWithTax(double totalPrice, double taxRate) {

		return totalPrice + totalPrice * taxRate;
	}

}

public class CoffeeShop {

	public static void main(String[] args) {
		CoffeeBag c = new CoffeeBag();
		Scanner s = new Scanner(System.in);
		DecimalFormat d = new DecimalFormat("0.00");
		double totalPrice, totalPriceWithTax;
		int numberOfBags, bagWeight;
		
		// Reading inputs from user
		System.out.print("Number of bags sold:");
		numberOfBags = s.nextInt();
		System.out.print("Weight per bag:");
		bagWeight = s.nextInt();
		
		// Displaying the price using the constant
		System.out.println("Price per pound:  €" + CoffeeBag.pricePerPound);
		totalPrice = c.totalPrice(bagWeight, numberOfBags,
				CoffeeBag.pricePerPound);
		//Displaying the price using the constant
		System.out.println("Sales tax: " + CoffeeBag.taxRate +"%");
		
		// calling method totalPriceWithTax 
		totalPriceWithTax = c.totalPriceWithTax(totalPrice,
				CoffeeBag.taxRate * 0.01);
		System.out.println("Total price: € " + d.format(totalPriceWithTax));
		s.close();

	}

}
