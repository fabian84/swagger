package de.service.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultServiceController {

	@RequestMapping(path = "/index", method={RequestMethod.GET})
	public String index() {
		return "Greetings from Spring!";
	}
	
	@RequestMapping(path = "/list", method={RequestMethod.GET})
	public List<String> getList() {
		return Arrays.asList("One", "Two", "Three");
	}
	

}
