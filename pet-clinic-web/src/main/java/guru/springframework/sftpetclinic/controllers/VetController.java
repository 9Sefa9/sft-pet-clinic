package guru.springframework.sftpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VetController {

	@RequestMapping(path = {"vets","/vets","vets.html"}, method = RequestMethod.GET)
	public String listVest() {
		return "vets/index";
	}
}
