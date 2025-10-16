package praktikum3.soal2;

public class Negara {
	private String nama, jenis, namaPemimpin;
	private int tanggal, bulan, tahun;
	
	public Negara(String nama, String jenis, String namaPemimpin, int tanggal, int bulan, int tahun) {
		this.nama = nama;
		this.jenis = jenis;
		this.namaPemimpin = namaPemimpin;
		this.tanggal = tanggal;
		this.bulan = bulan;
		this.tahun = tahun;
	}
	
	public Negara(String nama, String jenis, String namaPemimpin) {
		this.nama = nama;
		this.jenis = jenis;
		this.namaPemimpin = namaPemimpin;
		this.tanggal = 0;
		this.bulan = 0;
		this.tahun = 0;
	}
	
	public String getNama() {
		return nama;
	}

	public String getJenis() {
		return jenis;
	}

	public String getNamaPemimpin() {
		return namaPemimpin;
	}

	public int getTanggal() {
		return tanggal;
	}

	public int getBulan() {
		return bulan;
	}

	public int getTahun() {
		return tahun;
	}
	
}