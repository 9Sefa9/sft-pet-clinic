package guru.springframework.sftpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/owners")
@Controller
public class OwnerController {

	@RequestMapping(path = {"","/","/index","/index.html"}, method = RequestMethod.GET)
	public String listOwners() {
		return "owners/index";
	}
}
