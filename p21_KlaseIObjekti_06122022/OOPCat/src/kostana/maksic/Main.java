package kostana.maksic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Macka macka = new Macka();

		System.out.println("Unesite ime mačke"); // unos imena

		macka.ime = sc.nextLine();
		System.out.println(macka.toString());

		sc.close();
	}

}
