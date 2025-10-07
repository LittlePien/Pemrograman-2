package PRAK203_2410817210020_AMalikFajarPutraSyamsi;

public class Soal3Main {

	public static void main(String[] args) {
		Pegawai p1 = new Pegawai();
		
		//Pada baris ini terjadi error karena kurangnya titik koma (;)
		//p1.nama = "Roi"
		p1.nama = "Roi";
		
		p1.asal = "Kingdom of Orvel";
		p1.setJabatan("Assasin");
		
		//Variabel umur belum diberi nilai, hingga output yang dikeluarkan
		//bernilai nol.
		p1.umur = 17;
		
		//Menggunakan keterangan yang salah dibanding dengan output yang diminta
		//System.out.println("Nama Pegawai: " + p1.getNama());
		System.out.println("Nama: " + p1.getNama());
		
		System.out.println("Asal: " + p1.getAsal());
		System.out.println("Jabatan: " + p1.jabatan);
		
		//Memiliki keterangan yang kurang dibanding dengan output yang diminta
		//System.out.println("Umur: " + p1.umur);
		System.out.println("Umur: " + p1.umur + " tahun");		
	}

}