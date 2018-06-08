import java.util.Scanner;

public class Elevator {
	
	private int passengerstart; //Floor passenger is calling elevator from.
	private int passengerdestination; //Floor passenger wishes to take the elevator to.
	private static int elevatorposition;//Floor elevator is located.
	String Door; // Door status, Open or Closed.
	String elevatordirection;	// Direction elevator is going, Up, Down, or "" (no direction). 
		
	public void elevator() { //Takes in user input and sets variables				
		passengerstart = 3;																					//Sets passengerstart and passengerdestination to 3 so loop below will execute.
		passengerdestination =3;
		while (passengerstart>2 || passengerstart <0 || passengerdestination>2 || passengerdestination <0 ) { //Loop is used as a check for invalid input by the user.
		
		Scanner userinput;															//Elevator takes in user input to find where the passenger is calling from and where the passenger wishes to go.															
		userinput=new Scanner(System.in);									
		
		System.out.print("What floor did the passenger call the elevator from? enter number 0:2");	//Asks user what floor passenger is calling elevator from.
		passengerstart = userinput.nextInt();														//Sets user input to variable passengerstart.
				
		System.out.print("What floor does the passenger want to go to? enter number 0:2");			//Asks user what floor they wish to be transported to. 	
		passengerdestination = userinput.nextInt();													//Sets user input to variable passengerdestination.
				
		if (passengerstart>2 || passengerstart <0 || passengerdestination>2 || passengerdestination <0 ) {	//Checks to see if user has entered valid numbers (0:2).
			System.out.println("Error, please enter valid numbers");										//If the user entered an invalid number representing a floor not in existence the system prints out an error statement and the loop continues.
			
		}else {
				continue;																					//If the user did not enter any invalid numbers the continue statement executes passing the loop.
			}
		}
	}
	
	public void printelevatorposition() {	//Prints elevators current position.
		System.out.println("The elevator is on floor " + elevatorposition);			//Prints elevators current position.
					}
		
	public void elevatordoorstatus() {	//Controls door status and elevator movement when elevator goes to pick up passenger.											
		Door = "\"Closed\"";														
		if (elevatorposition == passengerstart) {									//If elevator is on same floor as passenger,
			Door = "\"Open\"";														//sets elevators door status to open.
			System.out.println("The elevator's door is set to " + Door + " to let the passenger in."); //Prints if door status.
		}else {
			System.out.println("The elevator's door is set to " + Door);			//Sets elevators direction of movement to "up" , "down" or " " (no direction).
			if(elevatorposition < passengerstart) {									
				elevatordirection = "up";
			}else if (elevatorposition > passengerstart) {
				elevatordirection = "down";
			}else { 
				elevatordirection = " ";
				}
			
			System.out.println("The elevator moves " + elevatordirection + " from floor " + elevatorposition + " to " + passengerstart);	//Prints elevators movement.
			elevatorposition = passengerstart;															
			Door = "\"Open\"";																												//Sets door to open.
			System.out.println("The elevator's door is set to " + Door + " to let the passenger in.");										//Prints door status.
					
	}
		}
	
	public void sendelevatorpassenger() { //Controls door status and elevator movement when elevator transports passenger.						
		if(elevatorposition < passengerdestination) {																							//sets elevators direction of movement to "up, "down", or " " (no direction).
			elevatordirection = "up";
		}else if (elevatorposition > passengerdestination) {
			elevatordirection = "down";
		}else { 
			elevatordirection = "";
	}
		
		System.out.println("The elevator moves " + elevatordirection + " from floor " + elevatorposition + " to " + passengerdestination);		//Prints elevators movement.
		Door = "\"Open\"";																														//Sets door status.
		System.out.println("The elevator's door is set to " + Door + " to let the passenger out.");												//Prints door status.
		elevatorposition=passengerdestination;																									//Sets elevators new position.
	}
	public void exitcommand() {	//Allows user to terminate program.																				
		int terminate;
		System.out.println("Do you wish to terminate the program? type 2 to exit, any key to continue.");										//Asks user if he/she wants to terminate the program.
		Scanner userinput2;																														//Scans user input.
		userinput2=new Scanner(System.in);
		terminate = userinput2.nextInt();																										//Sets terminate variable to user input.
			if (terminate == 2) {																												//If user inputs 2, program initiates termination sequence.
				System.out.println("The program is shutting down.");																			//Prints program is shutting down.
				System.exit(0);																													//Code that terminates program.
			}else {
			}																																	//If program is not terminated nothing happens, loop in main continues.
		
	}

}
