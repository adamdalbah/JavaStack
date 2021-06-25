package com.adam.dojoandninja.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adam.dojoandninja.models.Dojo;
import com.adam.dojoandninja.models.Ninja;
import com.adam.dojoandninja.services.DojoService;

@Controller
public class DojoController {
	private final DojoService dojoService;
	
	public DojoController(DojoService dojoService) {
		this.dojoService = dojoService;
	}
	@RequestMapping("")
	public String newDojo() {
		return "redirect:/dojos/new";
	}

	@RequestMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo, Model model) {
		model.addAttribute("dojos", dojoService.allDojos());
		return "NewDojo.jsp";
	}
	
	@RequestMapping(value="/addDojo", method = RequestMethod.POST)
	public String addDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "NewDojo.jsp";
		}
		dojoService.createDojo(dojo);
		return "redirect:/ninjas/new";		
	}
	
	@RequestMapping("/ninjas/new")
	public String newDojo(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojoService.allDojos());
		return "NewNinja.jsp";
	}
	
	@RequestMapping(value="/addNinja", method = RequestMethod.POST)
	public String addDojo(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		model.addAttribute("dojos", dojoService.allDojos());
		if(result.hasErrors()) {
			return "NewNinja.jsp";
		}
		dojoService.createNinja(ninja);
		return "redirect:/";		
	}
	
	@RequestMapping("/dojos/{id}")
	public String dojoNinjas(@PathVariable("id")Long id, Model model) {
		Dojo dojo = dojoService.findDojoByID(id);
		model.addAttribute("ninjas", dojo.getNinjas());
		model.addAttribute("dojo", dojo.getName());
		return "Show.jsp";
	}
}
