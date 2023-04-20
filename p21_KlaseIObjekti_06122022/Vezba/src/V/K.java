package V;

public class K {
	
	private String ime;
	private int strane;
	
	
	public void setIme(String i) {
		ime=i;
	}
	public void setStrane(int s) {
		strane=s;
	}
	public String getIme() {
		return ime;
	}
	public int getStrane() {
		return strane;
	}
	public String Ispis() {
		return "Ime: " + ime + ", broj strana: " + strane;
	}
}
