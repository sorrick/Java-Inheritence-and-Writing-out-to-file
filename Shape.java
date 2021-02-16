/*
 AUTHOR: Richard Soria
 DESCR:	 Super abstract class of all other classes that has the basic 
 		 info that other classes pull from.
 */


package projectMidterm;
//Abstract super class of shape
abstract class Shape {
	//Color variable
	private String color;
	
	//Constructor-sets color to Red
	Shape(){
		this.color = "Red";
	}
	
	//Getter function for class
	public String getColor() {
		return this.color;
	}
	
	//Setter for color
	public void setColor(String color) {
		this.color = color;
	}
	
	//Abstract function to find area
	public abstract void find_area();
	
	//Returns color info
	public String toString() {
		return "Color: " + color;
		
	}
	
}
