package praktikum1;

import java.util.Scanner;
import java.util.Locale;

public class Prak105_2410817210020_AMalikFajarPutraSyamsi {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan jari-jari: ");
		double radius = input.nextDouble();
		
		System.out.print("Masukkan tinggi: ");
		double height = input.nextDouble();
		
		double volume = 3.14 * radius * radius * height;
		String volumeFormat = String.format("%.3f", volume);
		
		System.out.print("Volume tabung dengan jari-jari " + radius + " cm dan tinggi " + height + " cm adalah " + volumeFormat + " m3");
		
		input.close();

	}

}