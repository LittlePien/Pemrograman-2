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
		
		buah2.nama = "Mangga";
		buah2.berat = 0.2;
		buah2.harga = 3500;
		buah2.jumlah = 15;
		
		buah2.info();
		
		buah3.nama = "Alpukat";
		buah3.berat = 0.25;
		buah3.harga = 10000;
		buah3.jumlah = 12;
		
		buah3.info();
	}

}