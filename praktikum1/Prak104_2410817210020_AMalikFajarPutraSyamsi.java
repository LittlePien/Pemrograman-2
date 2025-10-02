package praktikum1;

import java.util.Scanner;

public class Prak104_2410817210020_AMalikFajarPutraSyamsi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Tangan Abu: ");
		String tanganAbu1 = input.next();
		String tanganAbu2 = input.next();
		String tanganAbu3 = input.next();
		
		System.out.print("Tangan Bagas: ");
		String tanganBagas1 = input.next();
		String tanganBagas2 = input.next();
		String tanganBagas3 = input.next();
		
		String[] tanganAbu = {tanganAbu1, tanganAbu2, tanganAbu3};
		String[] tanganBagas = {tanganBagas1, tanganBagas2, tanganBagas3};
		
		int scoreAbu = 0;
		int scoreBagas = 0;
		
		for(int i = 0; i < 3; i++) {
			String pilAbu = tanganAbu[i];
			String pilBagas = tanganBagas[i];
			
			if(pilAbu.equals(pilBagas)) {
				continue;
			}
			
			else if((pilAbu.equals("B") && pilBagas.equals("G")) ||
					(pilAbu.equals("G") && pilBagas.equals("K")) ||
					(pilAbu.equals("K") && pilBagas.equals("B"))) {
				scoreAbu++;
			}
			else {
				scoreBagas++;
			}
		}
		
		if(scoreAbu > scoreBagas) {
			System.out.println("Abu");
		}else if(scoreBagas > scoreAbu) {
			System.out.println("Bagas");
		}else {
			System.out.println("Seri");
		}
		
		input.close();
		
	}

}