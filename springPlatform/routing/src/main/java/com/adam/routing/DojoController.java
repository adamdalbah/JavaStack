package com.adam.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{name}")
	public String dojo(@PathVariable("name") String name) {
		return "The " + name + " is awesome!";
	}

	@RequestMapping("/burbank-dojo/{location}")
	public String location(@PathVariable("location") String location){
		return location + " is located in Southern California";
	}

	@RequestMapping("/san-jose/{quarter}")
	public String quarter(@PathVariable("quarter") String quarter){
		return quarter + " is the headquarter";
	
	}
}