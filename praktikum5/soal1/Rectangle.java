package praktikum5.soal1;

public class Rectangle extends Shape{
	private double lenght, width;
	
	public Rectangle(String n, double l, double w) {
		super(n);
		lenght = l;
		width = w;
	}
	
	public double area() {
		double result = lenght * width;
		return result;
	}
	
	public String toString() {
		String result = shapeName + " of lenght " + lenght + " and width " + width;
		return result;
	}
}
