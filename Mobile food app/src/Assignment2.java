
import java.util.Scanner;
public class Assignment2 {
	
	//A mobile application for ordering food for a fast food restaurant. 
	
	//Instructions
	//When prompted press 1 for pickup or 2 for delivery, follow prompts on screen.
	
	public static void main(String[] args) {
		
		int ordertype;
		int zip;
		
		System.out.print(" Press 1 for \"Pick-Up\" or 2 for \"Delivery\"?  "); // Asks user if he/she wishes to use the delivery service
		Scanner scanorder = new Scanner(System.in);
		ordertype = scanorder.nextInt();
		
		if (ordertype == 2){													// If yes, asks user for their zip code
			System.out.println("Enter your zip code");
		}
			else if (ordertype ==1) {											//If no, the program runs nodeliverymenu
				System.out.println("You have selected Pick up");
				nodelivery object = new nodelivery();
				object.Nodeliverymenu();
				
		}else{
			System.out.println("An incorrect value has been entered, restart");	//If user enters an incorrect value program terminates
			System.exit(1);
		}
		
		if (ordertype ==2) {													//If delivery service was selected, the program scans for a zip code entered by the user. 

		Scanner scanzip = new Scanner(System.in);					
		zip = scanzip.nextInt();
		
		if (zip<60451 && zip>60441){											// if (zip<60451 && zip>60441), Delivery is available and the program runs deliverymenu
			System.out.println("Delivery available");							//note: the only difference between deliverymenu, deliveryextramenu, and nodeliverymenu is the totalcost calculation at the end.
			delivery object = new delivery();									//		deliverymenu adds $5 to totalcost for the delivery service, deliveryextramenu adds $7 for the delivery service for a user that is farther away, nodeliverymenu adds nothing.
			object.Deliverymenu();
		}
			else if (zip==60451 || zip==60441) {								// if (zip==60451 || zip==60441), Delivery is available at extra cost, program runs deliveryextramenu
			System.out.println("Delivery with extra cost");
			
			deliveryextra object = new deliveryextra();
			object.Deliveryextramenu();
			
			
			}
			else if (zip>60451 || zip<60441) {									// if (zip>60451 || zip<60441) the customer is too far away and no delivery service is available. program runs nodeliverymenu
				System.out.println("Delivery Not Available, pick up at store");
				
			nodelivery object = new nodelivery();
			object.Nodeliverymenu();
				
	
		
		
		}}}}