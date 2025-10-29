package praktikum4.soal2;

import java.util.Scanner;

public class Soal2Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pilih jenis hewan yang ingin diinputkan:");
		System.out.println("1 = Kucing");
		System.out.println("2 = Anjing");
		System.out.print("Masukkan pilihan: ");
		int pilihan = input.nextInt();
		input.nextLine();
		
		if(pilihan == 1) {
			System.out.print("Nama hewan peliharaan: ");
			String inpName = input.nextLine();
			
			System.out.print("Ras: ");
			String inpRace = input.nextLine();
			
			System.out.print("Warna Bulu: ");
			String inpFur = input.nextLine();
			
			Kucing cat = new Kucing(inpName, inpRace, inpFur);
			
			cat.displayDetailKucing();
		} else if(pilihan == 2){
			System.out.print("Nama hewan peliharaan: ");
			String inpName = input.nextLine();
			
			System.out.print("Ras: ");
			String inpRace = input.nextLine();
			
			System.out.print("Warna Bulu: ");
			String inpFur = input.nextLine();
			
			System.out.print("Kemampuan: ");
			String inpAbility = input.nextLine();
			
			String[] kemampuan = inpAbility.split(",");
			for(int i = 0; i < kemampuan.length; i++) {
				kemampuan[i] = kemampuan[i].trim();
			}
			
			Anjing dog = new Anjing(inpName, inpRace, inpFur, kemampuan);
			
			dog.displayDetailAnjing();
		} else {
			System.out.println("Pilihan tidak valid.");
		}
		
		input.close();
	}

}
