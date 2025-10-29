package praktikum4.soal1;

import java.util.Scanner;

public class Soal1Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nama Hewan Peliharaan: ");
		String inpName = input.nextLine();
		
		System.out.print("Ras: ");
		String inpRace = input.nextLine();
		
		System.out.println();
		
		input.close();
		
		HewanPeliharaan pet = new HewanPeliharaan(inpName, inpRace);
		
		pet.display();
	}

}
