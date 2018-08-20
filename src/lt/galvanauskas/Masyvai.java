package lt.galvanauskas;

import java.util.Scanner;

public class Masyvai {

	public static void main(String[] args) {
		int[] masyvas = {3, 7, 4, 2, 9};
		
		for(int a : masyvas) {
			System.out.print(a + " ");
		}
		
		System.out.println("\n");
		int suma = 0;
		for(int b : masyvas) {
			suma += b;
		}
		System.out.println(suma);
		
		int[] masyvasKopija = new int[masyvas.length];
		for(int i = 0; i < masyvas.length; i++) {
			masyvasKopija[i] = masyvas[i];
		}
		System.out.println(masyvasKopija[0]);
		
		Scanner sc = new Scanner(System.in);
		int[] masyvas3 = new int[5];
		boolean on = true;
		int suma3 = 0;
		int i = 0;
		while(on) {
			System.out.println("Iveskite skaiciu");
			int sk = sc.nextInt();
			masyvas3[i] = sk;
			i++;
			suma3 += sk;
			if(i >= 5) {
				on = false;
			}
		}
		System.out.println(suma3);
		
		
		/* 4 uzduotis */
		
		System.out.println("Iveskite masyvo dydi");
		int masyvoDydis = sc.nextInt();
		on = true;
		int suma4 = 0;
		int z = 0;
		int[] masyvas4 = new int[masyvoDydis];
		while(on) {
			System.out.println("Iveskite skaiciu");
			int sk4 = sc.nextInt();
			masyvas4[z] = sk4;
			z++;
			if(z >= masyvoDydis) {
				on = false;
			}
		}
		System.out.print("Masyvo reikšmės ");
		for(int c : masyvas4) {
			System.out.print(c + " ");
			suma4 += c;
		}
		System.out.println("\n Suma: " + suma4);
		
		
	}

}
