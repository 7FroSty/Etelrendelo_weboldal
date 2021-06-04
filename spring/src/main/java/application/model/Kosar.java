package application.model;

public class Kosar {
	int ID;
	int darab;
	String nev;
	int ar;
	int osszAr;
	
	public Kosar(String nev, int ar) {
		this.nev=nev;
		this.ar=ar;
		this.darab=1;
	}
	
	public int getDarab() {
		return this.darab;
	}
	public void setDarab(int darab) {
		this.darab=darab;
	}
	
	public String getNev() {
		return this.nev;
	}
	public void setNev(String nev) {
		this.nev=nev;
	}
	
	public int getAr() {
		return this.ar;
	}
	
	public int getOsszAr() {
		this.updateOsszAr();
		return this.osszAr;
	}
	public void updateOsszAr() {
		this.osszAr=this.ar*this.darab;
	}
}
