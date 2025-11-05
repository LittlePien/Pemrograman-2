package praktikum5.soal1;

public class Cylinder extends Shape{
	private double radius, height;
	
	public Cylinder(String n, double r, double h) {
		super(n);
		radius = r;
		height = h;
	}
	
	public double area() {
		double result = 2 * Math.PI * radius * (radius + height);
		return result;
	}
	
	public String toString() {
		String result = shapeName + " of radius " + radius + " and height " + height;
		return result;
	}
}
