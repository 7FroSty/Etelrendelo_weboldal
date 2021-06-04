package application.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import application.model.Rendeles;

@Controller
public class htmlController {

	

	@GetMapping("/bejelentkezes")
	public String bejelentkezes() {
		return "bejelentkezes";
	}
	
	@GetMapping("/kosar")
	public String kosar(HttpSession session) {
		if(session.getAttribute("belepve")!="igaz") {
			Rendeles x = new Rendeles();
			session.setAttribute("rendeles", x);
		}
		return "kosar";
	}
	

	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	
	@GetMapping("/regisztracio")
	public String regisztracio() {
		return "regisztracio";
	}
	
	@GetMapping("/sikeres")
	public String sikeres() {
		return "sikeres_regisztracio";
	}
	
    @GetMapping("/sikeres_bejelentkezes")
    public String sikeres_bejelentkezes(HttpSession session) {
    	session.setAttribute("nev", "Én");

        return "redirect:/ettermek";
    }

    @GetMapping("/sikeres_fizetes")
    public String sikeres_fizetes(HttpSession session) {
    	session.setAttribute("nev", "Én");

        return "sikeres_fizetes";
    }
}
