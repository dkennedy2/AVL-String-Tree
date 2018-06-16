//This program is a QR code simulator. Run program to produce a QR image.



import javafx.application.Application;											//Import javafx.
	import javafx.scene.Group;
	import javafx.scene.Scene;
	import javafx.scene.paint.Color;
	import javafx.scene.text.Text;
	import javafx.stage.Stage;
	import javafx.scene.shape.*;
	import java.util.Random;
	import java.awt.image.BufferedImage;

public class JavaDemoMain extends Application {
	
	public void start (Stage primaryStage) {
		int x, y, width, height;
		Group root = new Group();											//Groups objects.
		Random gen = new Random();											//Calls gen as a random number.
			
		Scene scene = new Scene(root,512,512,Color.WHITE);					//Creates scene.
		
		for(int count = 0; count < 512; count = count+20){					//Double for loop, loops through every 20 pixels in the 512X512 image to mimic QR picture given in assignment.
		       for(int count2 = 0; count2 < 512; count2=count2+20){
		
		int rand = (int)(Math.random()*2);									// Creates a random number (0 or 1) and stores the number in variable rand.This is used to assign color below.
		
		x = count;
		y = count2;
			
		width = 20;															// Puts the value 20 in variable width and height (Used to create box size).
		height = width;
		
		Color fill = null;													//If variable rand (see above) is 0, square will be set to black, if rand is 1, square will be set to white.
		if (rand==0)
			fill = Color.BLACK;												//Sets variable fill to Color.BLACK.
		else if (rand ==1)	
			fill = Color.WHITE;												//Sets variable fill to Color.WHITE.
		
		Rectangle box = new Rectangle(x,y,width,height);					//Creates a variable called box for rectangle.
		box.setFill(fill);
		
		root.getChildren().add(box);										//Adds variable box to root.
		}}
		
			
		Rectangle blacksquare = new Rectangle(0,362,150,150);				//Code below creates three squares overlapping each other and places them in separate corners of the QR image.
		blacksquare.setFill(Color.BLACK);
		root.getChildren().add(blacksquare);
		
		Rectangle whitesquare = new Rectangle(25,390,100,100);
		whitesquare.setFill(Color.WHITE);
		root.getChildren().add(whitesquare);
		
		Rectangle smallblacksquare = new Rectangle(50,415,50,50);
		smallblacksquare.setFill(Color.BLACK);
		root.getChildren().add(smallblacksquare);
		
		Rectangle blacksquare2 = new Rectangle(0,0,150,150);
		blacksquare.setFill(Color.BLACK);
		root.getChildren().add(blacksquare2);
		
		Rectangle whitesquare2 = new Rectangle(25,25,100,100);
		whitesquare2.setFill(Color.WHITE);
		root.getChildren().add(whitesquare2);
		
		Rectangle smallblacksquare2 = new Rectangle(50,50,50,50);
		smallblacksquare2.setFill(Color.BLACK);
		root.getChildren().add(smallblacksquare2);
		
		Rectangle blacksquare3 = new Rectangle(362,0,150,150);
		blacksquare.setFill(Color.BLACK);
		root.getChildren().add(blacksquare3);
		
		Rectangle whitesquare3 = new Rectangle(390,25,100,100);
		whitesquare3.setFill(Color.WHITE);
		root.getChildren().add(whitesquare3);
		
		Rectangle smallblacksquare3 = new Rectangle(415,50,50,50);
		smallblacksquare3.setFill(Color.BLACK);
		root.getChildren().add(smallblacksquare3);
		
				
		primaryStage.setTitle("QR Code");								//Titles image
		primaryStage.setScene(scene);											//Sets the scene
		primaryStage.show();													//Displays the scene
		
	}}