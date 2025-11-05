package praktikum5.soal1;

public class Paint {
	private double coverage;
	
	public Paint(double c) {
		coverage = c;
	}
	
	public double amount(Shape s) {
		double result = s.area() / coverage;
		return result;
	}
}
