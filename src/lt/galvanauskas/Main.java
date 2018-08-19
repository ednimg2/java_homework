package lt.galvanauskas;

public class Main {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		int c;

		System.out.println(a);
		System.out.println(a + 1);

		System.out.println(a / b);

		c = a * b;
		System.out.println(a + " * " + b + " = " + c);

		/* String */

		String tekstas = "Mindaugas";
		System.out.println("Hello, " + tekstas);

		/* float */

		float x = 1.5f, y = 3.4f;

		System.out.println(x);

		float z = x + y;
		System.out.println(z);

		System.out.println(skaicius(3));

		System.out.println(suma(3, 5));

		System.out.println(sujungtosRaides('a', 's'));

		skaiciusTekstas("Skaicius:", 9);

		System.out.println(!isActive() ? "Taip" : "Ne");

		System.out.println(isActive());

	}

	public static int skaicius(int a) {
		return a;
	}

	public static int suma(int a, int b) {
		return a + b;
	}

	public static String sujungtosRaides(char a, char b) {
		StringBuilder builder = new StringBuilder();
		builder.append(a);
		builder.append(b);
		return builder.toString();
		// String tekstas;
		// tekstas = Character.toString(a);
		// tekstas += Character.toString(b);
		// return tekstas;

	}

	public static void skaiciusTekstas(String a, int b) {
		String tekstas;
		tekstas = a + " " + b;
		System.out.println(tekstas);
	}

	public static boolean isActive() {
		return true;
	}

}
