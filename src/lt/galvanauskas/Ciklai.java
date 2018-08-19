package lt.galvanauskas;

import java.util.Scanner;

public class Ciklai {

	public static void main(String[] args) {
				
		int[] masyvas = {2, 5, 9, 0, 4, 7};
		
		/*for (int i = 0; i < masyvas.length; i++) {
			System.out.print(masyvas[i] + " ");
		}
		
		System.out.println("\n");
		for (int nariai : masyvas) {
			System.out.print(nariai + " ");
		}
		System.out.println("\n");
		int a = 5, b = 10;
		while(a < b) {
			System.out.println("aa");
			a++;
		}*/
		/*
		int a = 5, b = 10;
		do {
			System.out.println("Do atvejis");
			a++;
		} while (a < b);
		*/
		/*
		for(int i : masyvas) {
			if(i == 9) {
				continue;
			}
			System.out.print(i + " ");
		}*/
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello World");
		}
		
		System.out.println("\n");
		System.out.println("Įveskite skaičių: ");
		Scanner sc = new Scanner(System.in);
		int sk = sc.nextInt();
		
		for (int i = 1; i <= sk; i++ ) {
			System.out.println("Hello World");
		}
		sc.close();
		
		System.out.println("\n");
		
		for (int i = 1; i <= 50; i ++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		
		int suma = 0;
		for (int i = 1; i <= 100; i++) {
			suma += i;
		}
		System.out.println(suma);
		
		System.out.println("\n");
		
		suma = 0;
		int a = 1;
		while(a <= 100) {
			suma += a;
			a++;
		}
		System.out.println(suma);
		
		System.out.println("\n");
		
		a = 1;
		suma = 0;
		do {
			suma += a;
			a++;
		} while (a <= 100);
		
		System.out.println("Suma:" + suma);
		
	}

}
