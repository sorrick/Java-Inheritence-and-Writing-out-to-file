/*
 AUTHOR: Richard Soria
 DESCR:	 Sub class of Shape that acts as a circle and returns its area.
 */


package projectMidterm;

//Inherits the Shape class
public class Circle extends Shape{
	
	//need variables to find area of Circle
	private double area, radius;
	
	//Constructor
	Circle(){
		this.area = 0.0;
		this.radius = 1;
	}

	@Override
	public void find_area() {
		this.area = 3.14 * this.radius * this.radius;
		
	}
	
	//getter
	public double getRadius() {
		return this.radius;
	}
	
	//setter 
	public void setRadius(double Radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "Circle: " + area;
	}

}
