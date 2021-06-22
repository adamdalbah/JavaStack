package com.adam.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adam.languages.models.Language;
import com.adam.languages.services.LanguageService;

@Controller
public class LanguageController {
	private final LanguageService langService;

	public LanguageController(LanguageService langService) {
		this.langService = langService;
	}

	@RequestMapping("/languages")
	public String index(Model model, @ModelAttribute("language") Language language) {
		List<Language> languages = langService.allLanguages();
		model.addAttribute("languages", languages);
		return "/languages/index.jsp";
	}

	@RequestMapping(value = "/languages", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if (result.hasErrors()) {
			return "/languages/index.jsp";
		} else {
			langService.createLanguage(language);
			return "redirect:/languages";
		}
	}

	@RequestMapping("/languages/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
		Language language = langService.findLanguge(id);
		model.addAttribute("language", language);
		return "/languages/show.jsp";
	}

	@RequestMapping("/languages/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model, @ModelAttribute("language") Language language) {
		Language lang = langService.findLanguge(id);
		model.addAttribute("lang", lang);
		return "/languages/edit.jsp";
	}
	
	@RequestMapping(value="/languages/edit/{id}", method = RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("language") Language language, BindingResult result, @PathVariable("id") Long id) {
		if(result.hasErrors()) {
			return "languages/edit.jsp";
		}
		langService.update(language);
		return "redirect:/languages";
	}
	
	@RequestMapping("/languages/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		langService.delete(id);
		return "redirect:/languages";
	}
}
