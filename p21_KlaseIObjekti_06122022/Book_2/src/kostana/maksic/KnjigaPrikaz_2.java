package kostana.maksic;
import java.util.Scanner;
public class KnjigaPrikaz_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Knjiga_2 n = new Knjiga_2();
		Knjiga_2 b = new Knjiga_2();

		System.out.println("Unesite naslov knjige");

		n.naslov = sc.nextLine();

		System.out.println("Unesite broj strana");
		b.brojStranica = sc.nextInt();

		n.PrikaziIme1();
		b.PrikaziIme2();

		sc.close();
	}

}