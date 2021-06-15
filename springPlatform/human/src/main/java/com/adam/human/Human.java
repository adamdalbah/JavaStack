package com.adam.human;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Human {
	@RequestMapping("/")
	public String human(@RequestParam(value="name", required=false) String name) {
		if(name != null)
			return String.format("<h1>Hello %s</h1>\nWelcome to SpringBoot!", name);
		return String.format("<h1>Hello Human</h1>\nWelcome to SpringBoot!", name);
	}
}
