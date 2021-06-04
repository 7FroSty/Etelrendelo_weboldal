package application.model;

public class Etterem {
	int id;
	String etterem_neve;
	String etterem_cime;
	String admin_nev;
	//int telefon;
	//float ertekeles;
	//String leiras;


	public Etterem() {
	}

	public Etterem(String etterem_neve, String etterem_cime, String admin_nev) {
		this.etterem_neve = etterem_neve;
		this.etterem_cime = etterem_cime;
		this.admin_nev = admin_nev;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEtterem_neve() {
		return etterem_neve;
	}
	public void setEtterem_neve(String etterem_neve) {
		this.etterem_neve = etterem_neve;
	}
	public String getEtterem_cime() {
		return etterem_cime;
	}
	public void setEtterem_cime(String etterem_cime) {
		this.etterem_cime = etterem_cime;
	}
	public String getAdmin_nev() {
		return admin_nev;
	}
	public void setAdmin_nev(String admin_nev) {
		this.admin_nev = admin_nev;
	}
	
	
	
}