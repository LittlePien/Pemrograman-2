package PRAK203_2410817210020_AMalikFajarPutraSyamsi;

//Baris ini menyebabkan file Pegawai.java error dikarenakan beda nama dengan class nya
//public class Employee{
public class Pegawai{
	public String nama;
	
	//Pada baris ini salah penggunaan tipe data, dimana seharusnya String
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
	
	//Baris ini error karena tidak memiliki parameter
	//public void setJabatan() {
	//	this.jabatan = j;
	//}
	public void setJabatan(String j) {
		this.jabatan = j;
	}
}