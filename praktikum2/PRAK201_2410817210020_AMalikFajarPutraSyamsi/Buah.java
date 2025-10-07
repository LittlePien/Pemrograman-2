package PRAK201_2410817210020_AMalikFajarPutraSyamsi;

public class Buah {
	public String nama;
	public double berat;
	public double harga;
	public double jumlah;
	
	public void info() {
		System.out.println("Nama Buah: " + nama);
		System.out.println("Berat: " + berat);
		System.out.println("Harga: Rp" + harga);
		System.out.println("Jumlah Beli: " + jumlah + "kg");
		System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", getBeforeDiskon());
		System.out.printf("Total Diskon: Rp%.2f\n", getTotalDiskon());
		System.out.printf("Harga Setelah Diskon: Rp%.2f\n", getAfterDiskon());
		System.out.println();
	}
	
	public double getBeforeDiskon() {
		double totalHarga = harga * (jumlah / berat);
		
		return totalHarga;
		
	}
	
	public double getTotalDiskon() {
		double perKelipatanDiskon = 0.02 * 4 * this.harga;
		double jumlahKelipatanDiskon = Math.floor(this.jumlah/4);
		return jumlahKelipatanDiskon * perKelipatanDiskon;
	}
	
	public double getAfterDiskon() {
		return getBeforeDiskon() - getTotalDiskon();
	}
}