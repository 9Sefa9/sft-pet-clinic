package guru.springframework.sftpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import guru.springframework.sftpetclinic.services.VetService;

@Controller
public class VetController {

	private final VetService vetService;
	public VetController(VetService vetService) {
		this.vetService = vetService;
	}
	@RequestMapping(path = {"vets","/vets","vets.html"}, method = RequestMethod.GET)
	public String listVest(Model model) {
		model.addAttribute("vets",vetService.findAll());
		return "vets/index";
	}
}
