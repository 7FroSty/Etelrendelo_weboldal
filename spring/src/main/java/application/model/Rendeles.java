package application.model;

import java.util.ArrayList;
import java.util.List;

public class Rendeles {
	List<Kosar> etelek;
	int osszeg;
	Vasarlo vasarlo;
	String ID;
	boolean teljesitett;
	
	public Rendeles(Vasarlo vasarlo) {
		this.osszeg = 0;
		this.vasarlo = vasarlo;
		this.etelek = new ArrayList<Kosar>();
	}
	
	public Rendeles() {
		this.osszeg = 0;
		this.etelek = new ArrayList<Kosar>();
	}
	
	public void addEtel(Kosar etel) {
		this.etelek.add(etel);
	}
	
	public int getOsszeg() {
		int temp=0;
		for(int i=0;i<this.etelek.size();i++) {
			temp+=this.etelek.get(i).ar;
		}
		this.osszeg=temp;
		return this.osszeg;
	}
	
	public List<Kosar> getEtelek(){
		return this.etelek;
	}
	
	public String getStringEtelek() {
		String temp="";
		for(int i=0;i<this.etelek.size();i++) {
			temp+=this.etelek.get(i).getNev()+',';
		}
		return temp;
	}
	
	public String getStringVasarlo() {
		return this.vasarlo.nev;
	}
	
	public void etelTorles(String etel) {
		for(int i=0;i<this.etelek.size();i++) {
			System.out.println(etel);
			System.out.println(this.etelek.get(i).getNev());
			if(etel.equals(this.etelek.get(i).getNev())) {
				System.out.println("törlés...");
				this.etelek.remove(i);
				return;
			}
			else {
				System.out.println("nem törlöm (:");
			}
		}
	}
}
