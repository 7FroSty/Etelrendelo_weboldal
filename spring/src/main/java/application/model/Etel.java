package application.model;

public class Etel {
	//int ID;
	String nev;
	float ertekeles;
	String leiras;
	int ar;
	int etterem_id;
	
	/*public int getID() {
		return this.ID;
	}
	public void set(int ID) {
		this.ID=ID;
	}
	*/

	public Etel(String nev, int ar, int etterem_id) {
		this.nev = nev;
		this.ar = ar;
		this.etterem_id = etterem_id;
	}

	public Etel(){
		
	}

	public String getNev() {
		return this.nev;
	}
	public void setNev(String nev) {
		this.nev=nev;
	}
	
	public float getErtekeles() {
		return this.ertekeles;
	}
	public void setErtekeles(float ertekeles) {
		this.ertekeles=ertekeles;
	}
	
	public String getLeiras() {
		return this.leiras;
	}
	public void setLeiras(String leiras) {
		this.leiras=leiras;
	}
	
	public int getAr() {
		return this.ar;
	}
	public void setAr(int ar) {
		this.ar=ar;
	}

	public int getEtterem_id() {
		return etterem_id;
	}

	public void setEtterem_id(int etterem_id) {
		this.etterem_id = etterem_id;
	}
}
