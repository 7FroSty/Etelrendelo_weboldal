package application.controller;

import application.dao.EtelDAO;
import application.dao.EtteremDAO;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EtteremController {

    @Autowired
    private EtteremDAO etteremDAO;
    
    @Autowired
    private EtelDAO etelDAO;

    @GetMapping("/ettermek")
    public String listEtterem(Model model) {
        model.addAttribute("ettermek", etteremDAO.listEtterem());

        return "index";
    }
    
    @GetMapping("/")
    public String listEtteremm(Model model) {
        model.addAttribute("ettermek", etteremDAO.listEtterem());

        return "index";
    }
    
    @GetMapping("/ettermekadmin")
    public String listEtteremmm(Model model) {
        model.addAttribute("ettermek", etteremDAO.listEtterem());

        return "ettermekadmin";
    }
    
    @GetMapping(value = "ettermekadmin/delete/{id}")
	public String deleteEtterem(@PathVariable("id") int id) {
		etteremDAO.deleteEtterem(id);
		
		return "redirect:/ettermekadmin";
	}
    
    @GetMapping(value = "/etteremMegnyitas")
	public String etterem(Model model, @RequestParam("id") int id, HttpSession session) {
		session.setAttribute("etterem", id);
		System.out.println(session.getAttribute("etterem"));
		model.addAttribute("etelek", etelDAO.listEtel(id));
		model.addAttribute("ettermek", etteremDAO.listEtterem());
		return "etterem";
	}
}
