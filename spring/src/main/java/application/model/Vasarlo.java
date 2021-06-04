package application.model;

public class Vasarlo extends User{
	String cim;
	int telefon;
	Kosar[] kosar;
	
	public Vasarlo() {
	}
	
	public Vasarlo(String email, String jelszo) {
		this.email=email;
		this.jelszo=jelszo;
	}
	
	public Vasarlo(String nev, String email, String jelszo, int telefon){
		this.nev = nev;
		this.jelszo = jelszo;
		this.email = email;
		this.telefon = telefon;
	}
	
	public int getTelefon() {
		return this.telefon;
	}
	public void setTelefon(int telefon) {
		this.telefon=telefon;
	}
}
