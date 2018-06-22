

public class Person {

		
		
		private String firstName; // Store the first name.
		private String lastName; // Store the last name.

		public Person() // Default constructor.
		{
			firstName = "";
			lastName = "";

		}

		// Constructor with parameters.
		public Person(String first, String last) {
			setName(first, last);
		}
		
		//Method to output the first and last name
		public String toString()
		{
			System.out.println(firstName + lastName);
			return(firstName + " " + lastName);
		}

		// Method to set firstName and lastName
		public void setName(String first, String last) {
			firstName = first;
			lastName = last;
		}

		// Method to return the firstName.
		
		public String getFirstName() {
			return (firstName);
		}

		// Method to return lastName.
		public String getLastName() {
			return lastName;
		}
	
		
	
		class PaidAdvisor extends Person {
			
			
			private int regularPayRate;
			private int specialPayRate;
			private int overtimePayRate;
			private int hoursWorked; 
			private int hoursRegular;
			private int hoursSpecial;
		
			
			public PaidAdvisor() // Default constructor.
			{
			regularPayRate = 2500;
			specialPayRate = 5000;
			overtimePayRate = 3750;
			hoursWorked = 0; 
			hoursRegular = 0;
			hoursSpecial = 0;
			}

			
			// Constructor with parameters.
			public PaidAdvisor(int regularPay, int specialPay, int overtimePay, int Regularhours, int Specialhours) {
				setPay(regularPay, specialPay, overtimePay, Regularhours, Specialhours);
			}
			
			// Method to set Pay
			public void setPay(int regularPay, int specialPay, int overtimePay, int Regularhours, int Specialhours){
				regularPayRate = regularPay;
				specialPayRate = specialPay;
				overtimePayRate = overtimePay;
				hoursRegular = Regularhours;
				hoursSpecial = Specialhours;
			}
			
			// Method to calculate pay.
			public int calculatePay() {
				return (regularPayRate * hoursRegular) + (specialPayRate * hoursSpecial);
						}
			
			// Method to return wages.
			public String toString() {
				return ("Here are your wages " + calculatePay());
									}

			// Method to return the regularPayRate.
			public int getPayRate() {
				return regularPayRate;			
			}
			

			// Method to return the SpecialrPayRate.
			public int getSpecialPayRate() {
				return specialPayRate;			
			}
			
			// Method to return Hours Worked.
			public int getHoursWorked() {
				hoursWorked = hoursRegular + hoursSpecial;
				return hoursWorked;			
						}
			
					
			// Method to return the regularPay.
			public int getregularPay() {
				return regularPayRate;
			}
			
				
			}
			
		
	}
	
	

	

