import java.util.Scanner;

public class PayCalculatorMain {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userinput;	
		userinput=new Scanner(System.in);
		Person object = new Person(); //Class
		PaidAdvisor advisor1 = new PaidAdvisor();
		advisor1.calculatePay();
	
		
		Person person = new PaidAdvisor();
		((PaidAdvisor) Person).PaidAdvisor();
		
		
		System.out.println("Please enter your first name");
		String inputfirstname = userinput.nextLine();
		System.out.println("Please enter your last name");
		String inputlastname = userinput.nextLine();
		object.setName(inputfirstname, inputlastname);
		
		System.out.print(object.getFirstName());
		System.out.println(" Please enter how many regular hours you have worked");
		
		
		
		
		
	}

}
