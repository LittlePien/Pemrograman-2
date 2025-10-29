package praktikum4.soal2;

public class Anjing extends HewanPeliharaan{
	private String warnaBulu;
	private String kemampuan[];
	
	public Anjing(String n, String r, String w, String[] k) {
		super(n, r);
		this.warnaBulu = w;
		this.kemampuan = k;
	}
	
	public void displayDetailAnjing() {
		super.display();
		
		System.out.println("Warna Bulu: " + this.warnaBulu);
		
		String abilityStr = String.join(", ", kemampuan);
		System.out.println("Memiliki kemampuan: " + abilityStr);
	}
}
