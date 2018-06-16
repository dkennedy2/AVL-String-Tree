import java.util.Scanner;
import java.lang.Math;

public class GradingAppMain {

	public static void main(String[] args) {

		int count;
		int score, size = 1;
		int index;
		int[] Arraystart;
		double[] Array;
		double[] Arraydifference;
		double[] Arraysquared;
		double storeArray[];
		int Arraytest[] = { 0, 0, 0, 0 };
		int Arrayassignment[] = { 0, 0, 0, 0 };
		String[] Arraygrades = {};
		index = 0;
		int sum = 0;
		int sumtest = 0;
		int sumassignment = 0;
		int finalscore;
		double sumofsquares = 0;
		int average;
		char[] grades = { 'A', 'B', 'C', 'D', 'F' };
		double difference = 0;
		double variance = 0;
		double sd = 0;

		Scanner userinput = new Scanner(System.in); // Initialize scanner.

		System.out.println("Directions: You can use the calculator to sum the students test and assighment score's to find there final score. If you already have their final score's written down you can skip the calculator");
		System.out.println("Calculator initialized");
		System.out.println("Do you wish to sum a student's score's?, press 1 for yes and 2 for no");
		int sumloop = userinput.nextInt();

		while (sumloop == 1) { // Loop for calculator.

			for (int t = 0; t < 4; t++) { // Puts test scores entered into Arraytest.
				System.out.println("Enter test scores ");
				Arraytest[t] = userinput.nextInt();

			}

			System.out.println("Enter assignment scores of student");

			for (int t = 0; t < 4; t++) { // Puts assignment scores entered into Arrayassignment.
				System.out.println("Enter assignment scores ");
				Arrayassignment[t] = userinput.nextInt();
			}

			for (int t : Arraytest) // Sums test scores stored into Arraytest.
				sumtest += t;

			for (int t : Arrayassignment) // Sums assignment scores stored into Arrayassignment.
				sumassignment += t;

			finalscore = sumtest + sumassignment; // Sums all scores to calculate the student's final score which is
													// Printed for the user
			System.out.println("The student's final score is " + finalscore);

			System.out.println("Do you wish to sum a student's score's? Press 1 for yes and 2 for no."); // Allows user to end the loop for the calculator.
																											
			sumloop = userinput.nextInt();
		}

		System.out.println(
				"Once the class size has been entered, the program will create a grading curve and print the new grades out at the end.");
		System.out.println("Please enter the size of your class"); // Asks user the size of his/her class and creates
																	// an array of appropriate size.
		size = userinput.nextInt();
		Array = new double[size];

		while (index < size) { // Loop runs while class size is less than array index.

			int testnum = index + 1;

			System.out.println("Enter student score #" + testnum);
			Array[index] = userinput.nextInt(); // Value entered by user is stored in Array.
			System.out.println("You have entered " + Array[index]);
			index = index + 1; // Index goes up 1.

		}

		Arraydifference = new double[size];	//Sets array size used in the standard deviation calculation below.
		Arraysquared = new double [size];

		if (index == size) { // Code runs if index of array equals size of class.
								// Loops through array and sums values.
			for (double i : Array) {
				sum += i;}
			System.out.println("This is the sum: " + sum);

			average = sum / size; // Finds the class average (average score of students).
			System.out.println("This is the average: " + average); // Prints the class average.

			for (int i = 0; i < Array.length; i++) { // Loops through array.
				Arraydifference[i] = Array[i] - average;} // Subtracts the average from each value in the array
																	// and stores the value in Arraydifference.

			for (int i = 0; i < Array.length; i++) { // Loops through array.
				Arraysquared[i] = Math.pow(Arraydifference[i], 2);} // Squares each value in Arraydifference and stores
																	// the value in Arraysquared.

			for (double i : Arraysquared) { // Loops through Arraysquared to find the sum of all squares.
				sumofsquares += i;} // Sums each value in Array and puts it into variable sumofsquares.

			variance = sumofsquares / size; // Calculates the variance.
			System.out.println("This is the variance: " + variance);
			sd = Math.sqrt(variance); // Calculates the standard deviation (sd).
			System.out.println("This is the standard deviation: " + sd);

			double A = Math.min(average + (2 * sd), 449); // Sets grading curve.
			double B = average + (1 * sd);
			double C = average;
			double D = average - (1 * sd);
			double F = Math.min(average - (2 * sd), 349);

			System.out.println("This is the grading curve \n" + " A = " + A + "\n B = " + B + "\n C = " + C + " \n D = "
					+ D + " \n F = " + F); // Prints grading curve.

			Arraygrades = new String[size];

			for (int i = 0; i < Array.length; i++) { // Loops though the scores in array and assigns the corresponding
													// letter grade into Arraygrades.
				if (Array[i] < D) {
					Arraygrades[i] = "F";
					System.out.println(Arraygrades[i]);
				} else if (Array[i] < C) {
					Arraygrades[i] = "D";
					System.out.println(Arraygrades[i]);
				} else if (Array[i] < B) {
					Arraygrades[i] = "C";
					System.out.println(Arraygrades[i]);
				} else if (Array[i] < A) {
					Arraygrades[i] = "B";
					System.out.println(Arraygrades[i]);
				} else if (Array[i] > A) {
					Arraygrades[i] = "A";
					System.out.println(Arraygrades[i]);
				} else {
					Arraygrades[i] = "Error";

				}
			// Prints the student grades out.

		}}

	}}
