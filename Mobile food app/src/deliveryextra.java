import java.text.DecimalFormat;
import java.util.Scanner;

public class deliveryextra {
	public void Deliveryextramenu() {

	int burgercost, drinkcost, friescost, dessertcost;
	int burgernum, drinknum, friesnum, dessertnum;
	int burgertotal, drinktotal, friestotal, desserttotal;
	double	foodcost;
	int deliveryfee, extradeliveryfee;
	double tax; {
	
	burgercost = 450;
	drinkcost = 150;
	friescost = 250;
	dessertcost = 300;
			
	
	System.out.print("Flyer's Menue \n Burger: $4.50 \nDrink: $1.50 \nFries: @2.50 \nDessert: $3.00 \n");
	
	System.out.print("How many burgers would you like to order?");
	Scanner scanburger = new Scanner(System.in);
	burgernum = scanburger.nextInt();
	burgertotal = burgernum * burgercost;
			
	System.out.print("How many Drink's would you like to order?");
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
	
	foodcost = (burgertotal + drinktotal + friestotal + desserttotal) + ((burgertotal + drinktotal + friestotal + desserttotal)*.05) + 700;
	foodcost = foodcost / 100;
	DecimalFormat df = new DecimalFormat();
	df.setMaximumFractionDigits(2);
	System.out.printf("Your order will be "+ df.format(foodcost));
}}}