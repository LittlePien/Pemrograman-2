package praktikum3.soal2;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.Scanner;

public class Soal2Main {
	
	public static void main(String[] args) {
		HashMap<Integer, String> namaBulan = new HashMap<>();
		
		namaBulan.put(1, "Januari");
		namaBulan.put(2, "Februari");
		namaBulan.put(3, "Maret");
		namaBulan.put(4, "April");
		namaBulan.put(5, "Mei");
		namaBulan.put(6, "Juni");
		namaBulan.put(7, "Juli");
		namaBulan.put(8, "Agustus");
		namaBulan.put(9, "September");
		namaBulan.put(10, "Oktober");
		namaBulan.put(11, "November");
		namaBulan.put(12, "Desember");
				
		LinkedList<Negara> negaras = new LinkedList<>();

		Scanner input = new Scanner(System.in);
				
		int jmlNegara = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i < jmlNegara; i++) {
			String nama = input.nextLine();
			String jenis = input.nextLine();
			String namaPemimpin = input.nextLine();
			
			Negara negara;
			
			if(!jenis.toLowerCase().equals("monarki")){
				int tanggal = input.nextInt();
				int bulan = input.nextInt();
				int tahun = input.nextInt();
				input.nextLine();
				negara = new Negara(nama, jenis, namaPemimpin, tanggal, bulan, tahun);
			} else	{
				negara = new Negara(nama, jenis, namaPemimpin);
			}
			negaras.add(negara);
  			
		}
		input.close();
		
		for(Negara negara : negaras) {
			System.out.print("Negara " + negara.getNama() + " mempunyai ");
			
			if(negara.getJenis().toLowerCase().equals("monarki")) {
				System.out.println("Raja bernama " + negara.getNamaPemimpin());
				System.out.println();
			} else {
				System.out.println(negara.getJenis() + " bernama " + negara.getNamaPemimpin());
				
				String namaBulanString = namaBulan.get(negara.getBulan());
				System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.getTanggal() + " " + namaBulanString + " " + negara.getTahun());
				System.out.println();
			}
		}
	}
}