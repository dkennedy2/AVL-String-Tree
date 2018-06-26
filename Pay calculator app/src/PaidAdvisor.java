	public class PaidAdvisor extends Person {
			
			
			private int regularPayRate;
			private int specialPayRate;
			private int overtimePayRate;
			private int hoursWorked; 
			private int hoursRegular;
			private int hoursSpecial;
			private int hoursOT;
		
			
			public PaidAdvisor() // Default constructor.
			{
			regularPayRate = 2500;
			specialPayRate = 5000;
			overtimePayRate = 3750;
			hoursWorked = 0; 
			hoursRegular = 0;
			hoursSpecial = 0;
			hoursOT = 0;
			}

			
			// Constructor with parameters.
			public PaidAdvisor(int regularPay, int specialPay, int overtimePay, int Regularhours, int Specialhours, int OThours) {
				setPay(regularPay, specialPay, overtimePay, Regularhours, Specialhours, OThours);
			}
			
			// Method to set Pay
			public void setPay(int regularPay, int specialPay, int overtimePay, int Regularhours, int Specialhours, int OThours){
				regularPayRate = regularPay;
				specialPayRate = specialPay;
				overtimePayRate = overtimePay;
				hoursRegular = Regularhours;
				hoursSpecial = Specialhours;
				hoursOT = OThours;
			}
			
			// Method to calculate and return wages.
			public int calculatePay() {
				return (((regularPayRate * hoursRegular) + (overtimePayRate * hoursOT) + (specialPayRate * hoursSpecial))/100);
						}
			
			// Method to return wages.
			public String toString() {
				return ("Here are your wages " + (calculatePay()));
			
			}

			// Method to return the regular hours worked.
			public int gethoursRegular() {
				return hoursRegular;			
			}
			
			// Method to return the special hours worked.
			public int gethoursSpecial() {
				return hoursSpecial;			
			}			
			
			
			
			// Method to return the regularPayRate.
			public int getPayRate() {
				return regularPayRate;			
			}
			

			// Method to return the specialPayRate.
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
			
		
	
	