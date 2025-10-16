package praktikum3.soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Soal1Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		if(!input.hasNextInt()) {
			System.out.println("Input harus berupa angka.");
			input.close();
			return;
		}
		
		int jumlahDadu = input.nextInt();
		input.nextLine();
		
		if(jumlahDadu <= 0) {
			System.out.println("Jumlah dadu harus lebih dari 0.");
			input.close();
			return;
		}
		
		LinkedList<Dadu> kumpulanDadu = new LinkedList<>();
		int totalNilaiKeseluruhan = 0;
		
		for(int i = 0; i < jumlahDadu; i++) {
			Dadu dadu = new Dadu();
			dadu.acakNilai();
			kumpulanDadu.add(dadu);
			
			int nilaiDadu = dadu.getNilai();
			
			System.out.println("Dadu ke-" + (i + 1) + " bernilai " + nilaiDadu);
			totalNilaiKeseluruhan += nilaiDadu;
		}
		
		System.out.println("Total nilai dadu keseluruhan " + totalNilaiKeseluruhan);
		
		input.close();
	}
}
