/*
 AUTHOR: Richard Soria
 DESCR:	 Subclass of Shape superclass that returns the volume and 
 		 surface area of a Cube.
 */


package projectMidterm;


//Cube implements Shape
public class Cube extends Shape implements computeVolume{

	private double surfaceArea, volume, radius;
	
	//Constructor
	Cube(){
		this.radius = 5.5;
		this.surfaceArea = 0.0;
		this.volume = 0.0;
	}
	
	
	//getter
	public double getArea() {
		return this.surfaceArea;
	}
	
	//Setter
	public void setArea(double area) {
		this.surfaceArea = surfaceArea;
	}
	
	//Surface area = 6 * area^2
	@Override
	public void find_area() {
		this.surfaceArea = 6 * this.radius * this.radius;
		
	}

	
	//Volume = a^3
	@Override
	public void calculate_Volume() {
		this.volume = this.radius * this.radius * this.radius;
		
	}
	
	public String toString() {
		return "Cube area: " + this.surfaceArea + "\nCube Volume: " + this.volume;
	}

}
