/*
 AUTHOR: Richard Soria
 DESCR:	 Subclass of the Shape super class that has specific info
 		 that a square would have.
 */

package projectMidterm;

//Class extends Shape
public class Square extends Shape{

	private double area, length;
	//Constructor for Square
	Square(){
		this.area = 0.0;
		this.length = 2.3;
	}
	
	//Getter
	public double getArea() {
		return this.area;
	}
	//Setter
	public void setArea(double area) {
		this.area = area;
	}
	
	
	@Override
	public void find_area() {
		this.area = this.length * this.length;
		
	}
	
	public String toString() {
		return "Square: " + area;
	}

}
