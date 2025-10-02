package PRAK203_2410817210020_AMalikFajarPutraSyamsi;

public class Pegawai {
	public String nama;
	
	//Salah penggunaan tipe data, dimana seharusnya String
	//public char asal;
	public String asal;
	
	public String jabatan;
	public int umur;
	
	public String getNama() {
		return nama;
	}
	
	public String getAsal() {
		return asal;
	}
	
	//Salah pada method nya sendiri, dimana seharusnya memiliki parameter String jabatan
	//public void setJabatan() {
	//	this.jabatan = j;
	//}
	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}
	
	//Tidak adanya method getJabatan
	public String getJabatan() {
		return this.jabatan;
	}
	
	//Tidak adanya method getUmur
	public int getUmur() {
		return umur;
	}
}