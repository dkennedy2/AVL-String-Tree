import java.text.DecimalFormat;
import java.util.Scanner;

public class delivery {
	public void Deliverymenu() {

	int burgercost, drinkcost, friescost, dessertcost;			//the cost of each item, burger, drink, fries, dessert
	int burgernum, drinknum, friesnum, dessertnum;				// the number of each item ordered.
	int burgertotal, drinktotal, friestotal, desserttotal;		// the total cost for all items in the same category ordered (ex. burgers)
	double	foodcost;											//The cost of all items including delivery fees and tax
	int deliveryfee, extradeliveryfee;							// Cost of delivery fees
	double tax; {												// tax variable
	
	burgercost = 450;		// cost of each item listed here
	drinkcost = 150;
	friescost = 250;
	dessertcost = 300;
			
	
	System.out.print("Flyer's Menue \n Burger: $4.50 \nDrink: $1.50 \nFries: @2.50 \nDessert: $3.00 \n");		// prints menu
	
	System.out.print("How many burgers would you like to order?");												// asks user how many burger's they wish to order
	Scanner scanburger = new Scanner(System.in);																// scans for user input
	burgernum = scanburger.nextInt();																			// sets integer entered to variable burgernum
	burgertotal = burgernum * burgercost;																		// calculates total cost of all burgers ordered and sets value to burgertotal
			
	System.out.print("How many Drink's would you like to order?");												// repeats steps above with each food item
	Scanner scandrink = new Scanner(System.in);
	drinknum = scandrink.nextInt();
	drinktotal = drinknum * drinkcost;
			
	
	System.out.print("How many Fries would you like to order?");
	Scanner scanfries = new Scanner(System.in);
	friesnum = scanfries.nextInt();
	friestotal = friesnum * friescost;

	System.out.print("How many Desserts would you like to order?");
	Scanner scandessert = new Scanner(System.in);
	dessertnum = scandessert.nextInt();
	desserttotal = dessertnum * dessertcost;
	
	foodcost = (burgertotal + drinktotal + friestotal + desserttotal) + ((burgertotal + drinktotal + friestotal + desserttotal)*.05) + 500;		// Calculates the total cost of all items with tax + the delivery fee (not taxed)
	foodcost = foodcost / 100;
	DecimalFormat df = new DecimalFormat();																										//Sets maximum decimal places to 2 spaces
	df.setMaximumFractionDigits(2);
	System.out.printf("Your order will be "+ df.format(foodcost));																				//Prints out cost of order
}}}