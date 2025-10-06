package PRAK201_2410817210020_AMalikFajarPutraSyamsi;

import java.util.Locale;

public class Soal1Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Buah buah1 = new Buah();
		Buah buah2 = new Buah();
		Buah buah3 = new Buah();
		buah1.nama = "Apel";
		buah1.berat = 0.4;
		buah1.harga = 7000;
		buah1.jumlah = 40;
		
		buah1.info();
		System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", buah1.getBeforeDiskon());
		System.out.printf("Total Diskon: Rp%.2f\n", buah1.getTotalDiskon());
		System.out.printf("Harga Setelah Diskon: Rp%.2f\n", buah1.getAfterDiskon());
		System.out.println();
		
		buah2.nama = "Mangga";
		buah2.berat = 0.2;
		buah2.harga = 3500;
		buah2.jumlah = 15;
		
		buah2.info();
		System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", buah2.getBeforeDiskon());
		System.out.printf("Total Diskon: Rp%.2f\n", buah2.getTotalDiskon());
		System.out.printf("Harga Setelah Diskon: Rp%.2f\n", buah2.getAfterDiskon());
		System.out.println();
		
		buah3.nama = "Alpukat";
		buah3.berat = 0.25;
		buah3.harga = 10000;
		buah3.jumlah = 12;
		
		buah3.info();
		System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", buah3.getBeforeDiskon());
		System.out.printf("Total Diskon: Rp%.2f\n", buah3.getTotalDiskon());
		System.out.printf("Harga Setelah Diskon: Rp%.2f\n", buah3.getAfterDiskon());
		System.out.println();
	}

}
