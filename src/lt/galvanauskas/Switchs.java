package lt.galvanauskas;

import java.util.Scanner;

public class Switchs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Įveskite skaičių");
		int sk = sc.nextInt();
		switch (sk) {
		case 1:
			spausdinti(sk);
			break;
		case 2:
			spausdinti(sk);
			break;
		case 3:
			spausdinti(sk);
			break;
		case 5:
			spausdinti(sk);
			break;
		default:
			System.out.println("Įvestas nežinomas skaičius");
		}
		sc.close();
	}
	
	public static void spausdinti(int sk) {
		System.out.println("Įvestas žinomas skaičius: "+ sk);
	}
}
