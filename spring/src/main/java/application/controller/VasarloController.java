package application.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import application.dao.AdminDAO;
import application.dao.VasarloDAO;
import application.model.Admin;
import application.model.Kosar;
import application.model.Rendeles;
import application.model.Vasarlo;

@Controller
public class VasarloController {

	@Autowired
	private VasarloDAO vasarloDAO;
	
	@Autowired
	private AdminDAO adminDAO;

	@PostMapping("/register")
	public String regisztracio(@RequestParam("name") String nev, @RequestParam("email") String email, @RequestParam("pwd") String jelszo, @RequestParam("tel") int telefon){
		Vasarlo vasarlo = new Vasarlo(nev, email, jelszo, telefon);
		System.out.println(vasarloDAO.getVasarlo(vasarlo.getEmail()).getEmail());
		if(vasarloDAO.getVasarlo(vasarlo.getEmail()).getEmail()!=null){
			return "regisztracio";
		}
		vasarloDAO.insertVasarlo(vasarlo);

		return "sikeres_regisztracio";
	}

	@PostMapping("/login")
	public String bejelentkezes(@RequestParam("username") String email, @RequestParam("pwd") String jelszo, HttpSession session) {
		Vasarlo vasarlo = new Vasarlo(email, jelszo);
		Admin admin = new Admin(email, jelszo);
		String pw = vasarloDAO.getVasarlo(vasarlo.getEmail()).getJelszo();
		String adminpw = adminDAO.getAdmin(admin.getEmail()).getJelszo();
		Vasarlo user = vasarloDAO.getVasarlo(vasarlo.getEmail());
		Admin adminuser = adminDAO.getAdmin(admin.getEmail());
		if(pw==null) {
			if(adminpw!=null) {
				if(adminpw.equals(admin.getJelszo())) {
					session.setAttribute("nev", adminuser.getNev());
					session.setAttribute("email", adminuser.getEmail());
					session.setAttribute("belepve", "igaz");
					session.setAttribute("uzenet", "");
					return "redirect:/ettermekadmin";
				}
			}
			return "bejelentkezes";
		}
		System.out.println("Elért ide 1");
		if(pw.equals(vasarlo.getJelszo())) {
			Rendeles rendeles = new Rendeles(user);
			session.setAttribute("vasarlo", user);
			session.setAttribute("rendeles", rendeles);
			session.setAttribute("nev", user.getNev());
			session.setAttribute("email", user.getEmail());
			session.setAttribute("telefon", user.getTelefon());
			session.setAttribute("id", user.getID());
			session.setAttribute("belepve", "igaz");
			session.setAttribute("uzenet", "");
			return "redirect:/ettermek";
		}
		System.out.println("Elért ide 2");
		if(adminpw.equals(admin.getJelszo())) {
			session.setAttribute("nev", adminuser.getNev());
			session.setAttribute("email", adminuser.getEmail());
			session.setAttribute("belepve", "igaz");
			session.setAttribute("uzenet", "");
			return "redirect:/ettermekadmin";
		}
		else {
			return "bejelentkezes";
		}
		
	}
		
	@GetMapping("/logout")
	public String kijelentkezes(HttpSession session) {
		session.removeAttribute("vasarlo");
		session.removeAttribute("nev");
		session.removeAttribute("email");
		session.removeAttribute("telefon");
		session.removeAttribute("id");
		session.setAttribute("belepve", "hamis");
		session.removeAttribute("rendeles");
		
		return "bejelentkezes";
	}
	
	@PostMapping("/kosar")
	public String kosarba(@RequestParam("ar") String ar, @RequestParam("nev") String nev, @RequestParam("etterem") String e, HttpSession session) {
		Kosar etel = new Kosar(nev, Integer.parseInt(ar));
		Rendeles x = (Rendeles) session.getAttribute("rendeles");
		
		if(x==null || session.getAttribute("belepve")!="igaz") {
			session.setAttribute("uzenet", "Be kell jelentkezni");
			return "bejelentkezes";
		}
		
		x.addEtel(etel);
		session.setAttribute("rendeles", x);
		
		return "kosar";
	}
	
	@PostMapping("/kedvenc")
	public String kosarba(@RequestParam("nev") String nev, @RequestParam("etterem") String e, HttpSession session) {
		vasarloDAO.insertKedvenc(nev, (int) session.getAttribute("id"));
		
		return "redirect:/"+e;
	}
	
	@PostMapping("/torles")
	public String kosarba(@RequestParam("etel") String etel, HttpSession session) {
		Rendeles x = (Rendeles) session.getAttribute("rendeles");
		x.etelTorles(etel);
		session.setAttribute("rendeles", x);
		
		return "redirect:/kosar";
	}

	@PostMapping("/leadas")
	public String rendelesLeadas(@RequestParam("megjegyzes") String meg, @RequestParam("cim") String cim, HttpSession session) {
		Rendeles x = (Rendeles) session.getAttribute("rendeles");
		if(x.getOsszeg()==0) {
			session.setAttribute("uzenet", "Nem lehet üres kosárral rendelni!");
			return "redirect:/kosar";
		}
		if(cim=="") {
			session.setAttribute("uzenet", "Adj meg egy címet!");
			return "redirect:/kosar";
		}
		session.setAttribute("rendeles", x);
		vasarloDAO.insertRendeles(x, meg, cim);
		session.setAttribute("uzenet", "Sikeres rendelés!!");
		Rendeles ures = new Rendeles((Vasarlo) session.getAttribute("vasarlo"));
		session.setAttribute("rendeles", ures);
		return "redirect:/sikeres_fizetes";
	}
	
	@GetMapping("/kedvencek")
	public String listKedvenc(Model model, HttpSession session) {
		model.addAttribute("kedvenc", vasarloDAO.listEtel((int) session.getAttribute("id")));
		
		return "kedvencek";
	}
}
