package com.adam.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CountCountroller {
	public void setAttribute(HttpSession session) {
		if (session.isNew())
			session.setAttribute("count", 0);
	}
	
	@RequestMapping("/")
	public String welcome(HttpSession session) {
		setAttribute(session);
		Integer count = (Integer)session.getAttribute("count");
		count++;
		session.setAttribute("count", count);
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String welcome(Model model, HttpSession session) {
		setAttribute(session);
		model.addAttribute("count",session.getAttribute("count"));
		return "counter.jsp";
	}
}
