package praktikum5.soal1;

public abstract class Shape {
	protected String shapeName;
	
	public Shape(String n) {
		shapeName = n;
	}
	
	protected abstract double area();
	
	public abstract String toString();
}
