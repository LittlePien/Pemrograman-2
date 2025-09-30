package prak100;

import java.util.Scanner;

public class Prak101_2410817210020_AMalikFajarPutraSyamsi {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[] monthsName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		System.out.print("Masukkan Nama Lengkap: ");
		String name = input.nextLine();
		
		System.out.print("Masukkan Tempat Lahir: ");
		String place = input.nextLine();
		
		int date;
		do {
			System.out.print("Masukkan Tanggal Lahir: ");
			
			while(!input.hasNextInt()) {
				System.out.println("Invalid Input.");
				input.next();
				System.out.print("Masukkan Tanggal Lahir: ");
			}
			
			date = input.nextInt();
			
			if(date < 1 || date > 31) {
				System.out.println("Invalid Input.");
			}
		} while(date < 1 || date >31);
		
		int monthNum;
		do {
			System.out.print("Masukkan Bulan Lahir: ");
			
			while(!input.hasNextInt()) {
				System.out.println("Invalid Input.");
				input.next();
				System.out.print("Masukkan Bulan Lahir: ");
			}
			
			monthNum = input.nextInt();
			
			if(monthNum < 1 || monthNum > 12) {
				System.out.println("Invalid Input.");
			}
		} while(monthNum < 1 || monthNum > 12);
		
		int monthIndex = monthNum - 1;
		
		System.out.print("Masukkan Tahun Lahir: ");
		int year = input.nextInt();
		
		System.out.print("Masukkan Tinggi Badan: ");
		int height = input.nextInt();
		
		System.out.print("Masukkan Berat badan: ");
		double weight = input.nextDouble();
		
		System.out.println("Nama Lengkap " + name + ", Lahir di " + place + " pada Tanggal " + date + " " + monthsName[monthIndex] + " " + year);
		System.out.println("Tinggi Badan " + height + " cm dan Berat Badan " + weight + " kilogram");
		
		input.close();
	}

}
