/*
 AUTHOR: Richard Soria
 DESCR:	 Test file that tests the implementation of all classes
 		 and then outputs the results to a specified file by 
 		 the user.
 */

package projectMidterm;

import java.io.FileWriter;
import java.util.*;
import java.io.IOException;



public class TestShapes {

	public static void main(String[] args) {
		int n;
		// Need to take input from user
		Scanner kb = new Scanner(System.in);
		//Output file from user
		System.out.println("Enter valid output filename:");
		
		//read next line, used the nextLine function
		String fileName = kb.nextLine();
		//Still kinda rusty on used filewriter
		//Need to check for IO exception
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Need array list
		List<Object> array = new ArrayList<Object>();
		
		//Random number generator
		Random num = new Random();
		
		//For loop for 15 items
		for(int i = 0; i < 15; i++) {
			//Get random number between 1 and 3
			int random = num.nextInt(3) + 1;
			
			switch(random) {
			case 1:
				//Create and load Circle object with constructor into list
				Circle cir = new Circle();
				
				//Move circle into arraylist
				array.add(cir);
				break;
			case 2:
				//New square object
				Square sponge = new Square();
				
				//move square into arraylist
				array.add(sponge);
				break;
			case 3:
				Cube steve = new Cube();
				//move steve into arraylist
				array.add(steve);
				break;
				
			}
			
		}
		
		//Using a loop to go and print out all info in array
		for(int i= 0; i < array.size(); i++) {
			
			//Using instanceof to see if there is an object in array
			if(array.get(i) instanceof Circle) {
				//New thing I learned, typecasting array of i to circle type
				Circle circle1 = (Circle) array.get(i);
				circle1.find_area();
				//Printing out the results of toString
				System.out.println("Shape # " + (i + 1) + ": " + circle1.toString());
				
				//Writing out to file
				try {
					fw.write("Shape # " + (i + 1) + ": " + circle1.toString() + "\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
			else if (array.get(i) instanceof Square){
				//Typecasting new object in array as Square
				Square sponge1 = (Square) array.get(i);
				//Find area function called
				sponge1.find_area();
				//Printint out to screen
				System.out.println("Shape # " + (i + 1) + ": " + sponge1.toString());
				//Writing out to file
				try {
					fw.write("Shape # " + (i + 1) + ": " + sponge1.toString() + "\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
			else if(array.get(i) instanceof Cube) {
				//Typecasting new object in array as Cube
				Cube steve1 = (Cube) array.get(i);
				//Calling both functions in implemented class
				steve1.find_area();
				steve1.calculate_Volume();
				//Printint out to screen
				System.out.println("Shape # " + (i + 1) + ": " + steve1.toString());
				
				//Writing out to file 
				try {
					fw.write("Shape # " + (i + 1) + ": " + steve1.toString() + "\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		
		
		
		}
			//Close the filewriter
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}

	
	
}
