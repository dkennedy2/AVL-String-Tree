import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.util.concurrent.*;

import ds.util.AVLTree;


public class TreeMain {

	public static void main(String[] args) {

		int loop = 1;
		

		AVLTree<String> theTree = new AVLTree<String>(); //Initialize the AVL tree.
		

		System.out.println("This program will take your input and print them back in a tree.");
		

		while (loop == 1) {

			Scanner userinput = new Scanner(System.in); // Initialize scanner.
			

			try {
				System.out.println("Type the word you wish to insert into the tree.");
				Scanner scanner = new Scanner(System.in);
				String input = scanner.nextLine();
				System.out.println("INSERT: " + input);

				theTree.add(input); //adds user input to the tree.
				System.out.println(theTree.displayTree(2));
				

				
			}

			catch (Exception e) {
				System.out.println(" Error, unable to add element.");

			}

			System.out.println("Do you wish to add more words? Press 1 for yes and 2 for no."); 
																								
			loop = userinput.nextInt();//Allows user to end the loop.

		}

		
		// Displays and prints the tree.
		System.out.println("Here are the tree values in alphabetical order.");
		System.out.print(theTree);
		
		System.out.println("");
		System.out.println("Here is the tree, see drawing window for a graphical representation");
		System.out.println("");
		System.out.println(theTree.displayTree(2));
		theTree.drawTree(2);
	}
}