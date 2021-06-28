package com.adam.lookify.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.adam.lookify.models.Lookify;
import com.adam.lookify.service.LookifyService;

@Controller
public class LookifyController {
	private final LookifyService lookifyService;

	public LookifyController(LookifyService lookifyService) {
		this.lookifyService = lookifyService;
	}

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping("/dashboard")
	public String mainPage(Model model) {
		List<Lookify> lookify = lookifyService.allLookifies();
		model.addAttribute("lookifies", lookify);
		return "main.jsp";
	}
	
	@RequestMapping("/songs/new")
	public String newSong(@ModelAttribute("lookify") Lookify lookify) {
		return "new.jsp";
	}
	
	@RequestMapping(value ="/songs/new", method=RequestMethod.POST)
	public String add(@Valid @ModelAttribute("lookify") Lookify lookify, BindingResult result) {
		if (result.hasErrors()) {
			return "new.jsp";
		} else {
			lookifyService.createLookify(lookify);
			return "redirect:/dashboard";
		}
	}
	
	@RequestMapping("/songs/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Lookify lookify = lookifyService.findLookify(id);
		model.addAttribute("lookify", lookify);
		return "show.jsp";
	}
	@RequestMapping("/search")
	public String search(@RequestParam("artist") String artist) {
		return "redirect/search/" + artist;
	}
	@RequestMapping("/search/{artist}")
	public String showsearch(@RequestParam("artist") String artist, Model model) {
		List<Lookify> lookify = lookifyService.findByName(artist);
		model.addAttribute("songs", lookify);
		model.addAttribute("artist", artist);
		return "search.jsp";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		lookifyService.delete(id);
		return"redirect:/dashboard";
	}

}
