

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
	
		
}