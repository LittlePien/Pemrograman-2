package praktikum5.soal1;

public class Sphere extends Shape{
	private double radius;
	
	public Sphere(String n, double r) {
		super(n);
		radius = r;
	}
	
	public double area() {
		double result = 4 * Math.PI * Math.pow(radius, 2);
		return result;
	}
	
	public String toString() {
		String result = shapeName + " of radius " + radius;
		return result; 
	}
}
