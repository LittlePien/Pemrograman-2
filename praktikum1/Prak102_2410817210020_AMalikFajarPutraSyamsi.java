package praktikum1;

import java.util.Scanner;

public class Prak102_2410817210020_AMalikFajarPutraSyamsi {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input: ");
		int currentNum = input.nextInt();
		
		int i = 0;
		
		while(i <= 10) {
			int value;
			
			if(currentNum % 5 == 0) {
				value = (currentNum / 5) - 1;
				System.out.print(value);
			} else {
				value = currentNum;
				System.out.print(value);
			}
			
			if(i < 10) {
				System.out.print(", ");
			}
			
			currentNum++;
			i++;
		}
		
		input.close();
	}

}