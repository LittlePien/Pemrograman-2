package praktikum1;

import java.util.Scanner;

public class Prak103_2410817210020_AMalikFajarPutraSyamsi {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input: ");
		int rowNum = input.nextInt();
		int currentNum = input.nextInt();
		
		int i = 0;
		
		do {
			if(currentNum % 2 != 0) {
				System.out.print(currentNum);
				
				i++;
				
				if(i < rowNum) {
					System.out.print(", ");
				}
			}
			
			currentNum++;
			
		} while(i < rowNum);
		
		input.close();
	}
	
}