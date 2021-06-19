package com.adam.ninjagold;
import java.util.Random;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class GoldController {
	private int count = 0;
	private int money = 0;
	@RequestMapping("/gold")
	public String gold() {
		return "gold.jsp";
	}
	@RequestMapping(value="/form", method=RequestMethod.POST)
	public String gold(@RequestParam(value="form") String form, HttpSession session) {
		Random r = new Random();
		Date current = new Date();
		SimpleDateFormat time = new SimpleDateFormat("EEEE, 'The' dd 'of' MMMM, YYYY hh:mm aa");
		if (session.getAttribute("list") == null) {
		ArrayList<String> list = new ArrayList<String>();	
		session.setAttribute("list", list);
		}
		
		if(form.equals("farm")) {
			money= 10 + r.nextInt(10);
			count += money;
			ArrayList<String> list = (ArrayList<String>)session.getAttribute("list");
			list.add(String.format("You entered a farm and earned %d gold. (%s)", money, time.format(current)) );
			session.setAttribute("list", list);
		}
		else if(form.equals("cave")) {
			money= 5 + r.nextInt(5);
			count += money;
			ArrayList<String> list = (ArrayList<String>)session.getAttribute("list");
			list.add(String.format("You entered a cave and earned %d gold. (%s)", money, time.format(current)) );
			session.setAttribute("list", list);
		}
		else if(form.equals("house")) {
			money= 2 + r.nextInt(3);
			count += money;
			ArrayList<String> list = (ArrayList<String>)session.getAttribute("list");
			list.add(String.format("You entered a house and earned %d gold. (%s)", money, time.format(current)) );
			session.setAttribute("list", list);
		}
		else if(form.equals("casino")) {
			money= r.nextInt(50);
			count += money;
			ArrayList<String> list = (ArrayList<String>)session.getAttribute("list");
			list.add(String.format("You entered a casino and earned %d gold. (%s)", money, time.format(current)) );
			session.setAttribute("list", list);
		}
		session.setAttribute("count", count);
		return "redirect:/gold";
	}
	
}
