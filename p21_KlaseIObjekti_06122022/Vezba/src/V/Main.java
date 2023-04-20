package V;

public class Main {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		K k = new K();
		
		System.out.println("Unesite ime: ");
		String ime=sc.nextLine();
		
		System.out.println("Unesite stranice: ");
		int strane = sc.nextInt();
		
		k.setIme(ime);
		k.setStrane(strane);
		
	System.out.println(k.Ispis());
	System.out.println(k.getIme());
	System.out.println(k.getStrane());
		
	}

}
