package guru.springframework.sftpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	public IndexController() {
		String a[] = {"1","2","3"};
	}
	@RequestMapping(path = {"","/","index","index.html"},method = RequestMethod.GET)
	public String index() {
		return "index";
	}
}
