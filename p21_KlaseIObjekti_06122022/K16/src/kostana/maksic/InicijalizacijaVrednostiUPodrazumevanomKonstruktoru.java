package kostana.maksic;

public class InicijalizacijaVrednostiUPodrazumevanomKonstruktoru {

	public static void main(String[] args) {
		// u trenutku kreiranja objekta, pozvaće se podrazumevani konstruktor
		Box b1 = new Box();
		Box b2 = new Box();

		b1.initBox(10, 15, 20); // poziv metode za objekat b1
		b2.initBox(5, 6, 7);

		System.out.println("Zapremina: " + b1.volume());
		System.out.println("Zapremina: " + b2.volume());

	}

}
