package com.adam.thecode;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	@RequestMapping("/")
	public String main() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/code", method=RequestMethod.POST)
	public String code(@RequestParam(value="code") String code, HttpSession session, RedirectAttributes redirectAttributes) {
		if (code.equals("bushido")) {
			session.setAttribute("code", code);
			return "home.jsp";
		}
	
		redirectAttributes.addFlashAttribute("error", "You must train harder!");
		return "redirect:/";
	}
	
	@RequestMapping("/code")
	public String code(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("error2", "You must Enter a code!");
		return "redirect:/";
	}
	

}
