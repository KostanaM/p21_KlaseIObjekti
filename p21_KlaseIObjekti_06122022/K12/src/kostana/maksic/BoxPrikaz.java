package kostana.maksic;

public class BoxPrikaz {

	public static void main(String[] args) {
		Box b1 = new Box();

		double zapremina;

		b1.dubina = 20;
		b1.sirina = 10;
		b1.visina = 15;

		zapremina = b1.dubina * b1.sirina * b1.visina;

		System.out.println("Zapremina: " + zapremina);

	}

}