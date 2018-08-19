package lt.galvanauskas;

public class Salygos {

	public static void main(String[] args) {
		int i = 55;

		if (i == 0)
			System.out.println("i == 0");

		if (i > 0) {
			System.out.println("i > 0");
		} else {
			System.out.println("i < 0");
		}

		if (!(i > 0 && i < 50)) {
			System.out.println("i yra tarp 0 ir 50");
		} else {
			System.out.println("i nera tarp 0 ir 50");
		}

		switch (i) {
		case (0):
			System.out.println("i yra 0");
			break;
		case (55):
			System.out.println("i yra 55");
			break;
		default:
			break;
		}
	}

}
