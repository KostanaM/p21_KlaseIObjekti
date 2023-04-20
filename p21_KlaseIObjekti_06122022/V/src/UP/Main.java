package UP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		K obj = new K();
		
		System.out.println("Unesite ime knjige");
		String unetoIme = sc.nextLine();
		obj.setIme(unetoIme);

		System.out.println("Unsite broj stranica");
		int unetBr = sc.nextInt();
		obj.setBrojStranica(unetBr);
		System.out.println(obj.getIme());
		System.out.println(obj.getBrojStranica());
		
	}

}
