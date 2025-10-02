package PRAK202_2410817210020_AMalikFajarPutraSyamsi;

public class Kopi {
	public String namaKopi;
	public String ukuran;
	public double harga;
	private String pembeli;
	
	public void info() {
		System.out.println("Nama Kopi: " + namaKopi);
		System.out.println("Ukuran: " + ukuran);
		System.out.println("Harga: Rp." + harga);
	}
	
	public void setPembeli(String pembeli) {
		this.pembeli = pembeli;
	}
	
	public String getPembeli() {
		return this.pembeli;
	}
	
	public double getPajak() {
		double pajak = this.harga * 0.11;
		return pajak;
	}
}