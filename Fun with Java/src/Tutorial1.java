import java.util.Scanner;

public class Tutorial1 {											/* This program controls an elevator's, direction of movement, position, and door function.
 																		The program will work for 3 floor's but can be modified to accommodate any number of floors*/
	
public static void main(String[] args) {
	

	while (true){													//Infinite loop
					
		classtutorial object = new classtutorial();					//Class
				
		object.elevator();											//Takes in user input and sets variables.
		object.printelevatorposition();								//Prints elevators current position.
		object.elevatordoorstatus();								//Controls door status and elevator movement when elevator goes to pick up passenger.
		object.sendelevatorpassenger();								//Controls door status and elevator movement when elevator transports passenger.
		object.exitcommand();										//Allows user to terminate program.
		

	}}}
