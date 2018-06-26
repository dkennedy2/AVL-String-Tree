import java.util.Scanner;

public class PayCalculatorMain {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userinput;	
		userinput=new Scanner(System.in);
		Person object = new Person(); //Class
		PaidAdvisor advisor1 = new PaidAdvisor();//Subclass
			
		
		System.out.println("Please enter your first name."); //Asks for your first and last name, stores user input into variable.
		String inputfirstname = userinput.nextLine();
		System.out.println("Please enter your last name.");
		String inputlastname = userinput.nextLine();
		object.setName(inputfirstname, inputlastname);//Sets name.
		
		System.out.print(object.getFirstName()); //Gets and prints FirstName.
		System.out.println(" please enter how many regular hours you have worked.");
		
		int regularPay=2500;
		int specialPay = 5000;
		int overtimePay = 3750;
		int OThours = 0;
		
		System.out.println("How many regular hours have you worked?"); //Asks how many hours you have worked.
		int Regularhours = userinput.nextInt(); // Stores user input into variable Regularhours.
		
		if (Regularhours > 30) {				// If Regular hours is greater than 30 
			OThours = Regularhours - 30;		// Calculates overtime hours.
			Regularhours = 30;					// Caps Regular hours to 30.
			
	}else {
			OThours = 0;						//Else sets overtime hours to 0.
	}
			
		
		System.out.println("How many special hours have you worked?"); //Asks how many special hours you have worked.
		int Specialhours = userinput.nextInt(); //Stores user input into Specialhours.
		
		
			
		advisor1.setPay(regularPay, specialPay, overtimePay, Regularhours, Specialhours, OThours); //Sets variables used to calculate users pay.
		
		System.out.print("Your pay is $" + advisor1.calculatePay()); // advisor1.calculatePay() calculates your pay which is printed out by the print statement.
		
	
		
		
		
		
		
		
		
	}

}
