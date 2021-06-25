package com.adam.driver.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adam.driver.models.Person;
import com.adam.driver.service.PersonService;

@Controller
public class PersonController {
	private final PersonService personService;
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	@RequestMapping("/")
	public String index(Model model) {
		List<Person> person = personService.allPersons();
		model.addAttribute("persons", person);
		return "index.jsp";
	}
	
	@RequestMapping("/persons/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "NewPerson.jsp";
	}
	
	@RequestMapping(value="/addPerson", method = RequestMethod.POST)
	public String addPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "NewPerson.jsp";
		}
		personService.createPerson(person);
		return "redirect:/persons/new";
	}
	@RequestMapping("/persons/{id}")
	public String showProfile(@PathVariable("id") Long id, Model model){
		Person person = personService.findPerson(id);
		model.addAttribute("person", person);
		return "show.jsp";
	}
}
