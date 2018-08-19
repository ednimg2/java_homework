package lt.galvanauskas;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean on = true;
		while (on) {
			System.out.println("Pasirinkite iš meniu");
			System.out.println("1. Dviejų skaičiu suma");
			System.out.println("2. Dviejų skaičiu sandauga");
			System.out.println("3. 256 pakelti kvadratu");
			System.out.println("0. Įšeiti iš programos");
			System.out.println("Įveskite pasirinktą meniu skaičių");
			int meniu = sc.nextInt();
			switch (meniu) {
			case 0:
				on = false;
				break;
			case 1:
				System.out.println("Įveskite du skaičius");
				System.out.println("Įveskite pirmą skaičių skaičius");
				int pirmasSk = sc.nextInt();
				System.out.println("Įveskite antrą skaičių skaičius");
				int antrasSk = sc.nextInt();
				sudetis(pirmasSk, antrasSk);
				break;
			case 2:
				System.out.println("Įveskite du skaičius");
				System.out.println("Įveskite pirmą skaičių skaičius");
				int pirmasSkS = sc.nextInt();
				System.out.println("Įveskite antrą skaičių skaičius");
				int antrasSkS = sc.nextInt();
				sandauga(pirmasSkS, antrasSkS);
				break;
			case 3:
				System.out.println("256 kvadratu lygu: " + 256 * 256);
				break;
			default:
				System.out.println("Pasirinktas neteisingas meniu punktas");
			}
		}
		// sc.close();

	}

	public static void sudetis(int pirmasSk, int antrasSk) {
		int suma = pirmasSk + antrasSk;
		System.out.println("Skaičių suma yra lygi: " + suma);
	}

	public static void sandauga(int pirmasSkS, int antrasSkS) {
		int sandauga = pirmasSkS * antrasSkS;
		System.out.println("Skaičių sandauga yra lygi: " + sandauga);
	}

}
