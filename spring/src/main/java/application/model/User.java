package application.model;

import java.io.Serializable;

public class User implements Serializable {
	int ID;
	String felhasznalonev;
	String email;
	String jelszo;
	String nev;
	
	
	public int getID() {
		return this.ID;
	}
	public void setID(int ID) {
		this.ID=ID;
	}
	
	public String getJelszo() {
		return this.jelszo;
	}
	public void setJelszo(String jelszo) {
		this.jelszo=jelszo;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getNev() {
		return this.nev;
	}
	public void setNev(String nev) {
		this.nev=nev;
	}
	
	public String getFelhasznalonev() {
		return this.felhasznalonev;
	}
	public void setFelhasznalonev(String nev) {
		this.felhasznalonev=nev;
	}
}
