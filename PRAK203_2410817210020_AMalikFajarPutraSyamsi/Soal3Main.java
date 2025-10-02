package PRAK203_2410817210020_AMalikFajarPutraSyamsi;

public class Soal3Main {

	public static void main(String[] args) {
		Pegawai p1 = new Pegawai();
		
		//Kekurangan tanda (;)
		//p1.nama = "Roi"
		p1.nama = "Roi";
		
		p1.asal = "Kingdom of Orvel";
		
		//kekurangan penetapan nilai variable umur
		p1.umur = 17;
		
		p1.setJabatan("Assasin");
		
		System.out.println("Nama Pegawai: " + p1.getNama());
		System.out.println("Asal: " + p1.getAsal());
		
		//Salah pada pemanggilan method yang tidak ada
		System.out.println("Jabatan: " + p1.getJabatan());
		
		//Tidak ada penetapan nilai dari variable umur
		//Salah pada pemanggilan method yang tidak ada, dan kurang tambahan kata "tahun" setelah pemanggilan variable umur
		System.out.println("Umur: " + p1.getUmur() + " tahun");
	}

}