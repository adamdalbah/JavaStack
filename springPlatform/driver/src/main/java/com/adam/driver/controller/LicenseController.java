package com.adam.driver.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adam.driver.models.License;
import com.adam.driver.models.Person;
import com.adam.driver.service.LicenseService;
import com.adam.driver.service.PersonService;

@Controller
public class LicenseController {
	private final PersonService personService;
	private final LicenseService licenseService;

	public LicenseController(PersonService personService, LicenseService licenseService) {
		this.personService = personService;
		this.licenseService = licenseService;
	}

	@RequestMapping("/licenses/new")
	public String newLicense(Model model, @ModelAttribute("license") License license) {
		List<Person> persons = personService.unlicensed();
		model.addAttribute("persons", persons);
		return "NewLicense.jsp";
	}

	@RequestMapping(value = "/addLicense", method = RequestMethod.POST)
	public String addLicense(@Valid @ModelAttribute("license") License license, BindingResult result, Model model) {
		List<Person> persons = personService.unlicensed();
		model.addAttribute("persons", persons);
		if(result.hasErrors()) {
			return "NewLicense.jsp";
		}
		String number = licenseService.generateNumber();
		license.setNumber(number);
		licenseService.createLicense(license);
		return "redirect:/";

	}
}
