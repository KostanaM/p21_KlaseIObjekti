package kostana.maksic;
import java.util.Scanner;
public class KnjigaPrikaz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Knjiga obj = new Knjiga();

		System.out.println("Unesite ime knjige");
		String unetoIme = sc.nextLine();
		obj.setIme(unetoIme);

		System.out.println("Unsite broj stranica");
		int unetBr = sc.nextInt();
		obj.setbrojStranica(unetBr);

		System.out.println("Ime: " + obj.getIme() + "\nBroj stranica: " + obj.getbrojStranica());

		sc.close();
	}
}