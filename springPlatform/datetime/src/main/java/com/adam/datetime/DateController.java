package com.adam.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {
	@RequestMapping("/")
	public String dashBoard(){
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model){
		Date current = new Date();
		SimpleDateFormat noTime = new SimpleDateFormat("EEEE, 'The' dd 'of' MMMM, YYYY");
		model.addAttribute("date", noTime.format(current));
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model){
		Date current = new Date();
		SimpleDateFormat noDate = new SimpleDateFormat("hh:mm aa");
		model.addAttribute("time", noDate.format(current));
		return "time.jsp";
		
	}
}
