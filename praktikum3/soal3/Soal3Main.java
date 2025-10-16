package praktikum3.soal3;

import java.util.Scanner;
import java.util.ArrayList;

public class Soal3Main {

	private static ArrayList<Mahasiswa> listMhs = new ArrayList<>();
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int pilihan;
		
		do {
			showMenu();
			System.out.print("Pilihan: ");
			
			try {
				String menu = input.nextLine();
				if(menu.isEmpty()) {
					pilihan = -1;
					continue;
				}
				pilihan = Integer.parseInt(menu);
				
				switch(pilihan) {
				case 1:
					add();
					break;
				case 2:
					delete();
					break;
				case 3:
					search();
					break;
				case 4:
					showList();
					break;
				case 0:
					System.out.println("Terima Kasih!");
					listMhs.clear();
					break;
				default:
					System.out.println("Pilihan tidak valid.");
				}
			} catch(NumberFormatException e) {
				System.out.println("Input harus berupa angka (0-4).");
				pilihan = -1;
			}
			
			System.out.println();
		} while(pilihan != 0);
		
		input.close();
	}
	
	private static void showMenu() {
		System.out.println("Menu: ");
		System.out.println("1. Tambah Mahasiswa");
		System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
		System.out.println("3. Cari Mahasiswa berdasarkan NIM");
		System.out.println("4. Tampilkan Daftar Mahasiswa");
		System.out.println("0. Keluar");
	}
	
	private static void add() {
		System.out.print("Masukkan Nama Mahasiswa: ");
		String nama = input.nextLine();
		System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
		String nim = input.nextLine();
		
		if(searchMhsByNim(nim) != null) {
			System.out.println("NIM " + nim + " sudah ada.");
			return;
		}
		
		Mahasiswa mhsBaru = new Mahasiswa(nama, nim);
		listMhs.add(mhsBaru);
		System.out.println("Mahasiswa " + nama + " ditambahkan.");
	}

	private static void delete() {
		System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
		String nimCari = input.nextLine();
		
		Mahasiswa deletedMhs = searchMhsByNim(nimCari);
		
		if(deletedMhs != null) {
			listMhs.remove(deletedMhs);
			System.out.println("Mahasiswa dengan NIM: " + nimCari + " dihapus.");
		} else {
			System.out.println("Mahasiswa dengan NIM: " + nimCari + " tidak ada.");
		}
	}
	
	private static void search() {
		System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
		String nimCari = input.nextLine();
		
		Mahasiswa foundMhs = searchMhsByNim(nimCari);
		
		if(foundMhs != null) {
			System.out.println("Mahasiswa Ditemukan: " + foundMhs);
		} else {
			System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
		}
	}
	
	private static void showList() {
		System.out.println("Daftar Mahasiswa:");
		
		if(listMhs.isEmpty()) {
			System.out.println("Daftar Mahasiswa kosong.");
			return;
		}
		
		for(Mahasiswa mhs : listMhs) {
			System.out.println(mhs);
		}
		
	}
	
	private static Mahasiswa searchMhsByNim(String nim) {
		for(Mahasiswa mhs : listMhs) {
			if(mhs.getNim().equals(nim)) {
				return mhs;
			}
		}
		return null;
	}
}