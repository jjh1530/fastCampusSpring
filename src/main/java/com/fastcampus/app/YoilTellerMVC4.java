package com.fastcampus.app;

import java.io.IOException;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class YoilTellerMVC4 {

	@ExceptionHandler
	public String catcher(Exception ex) {
		return "yoilError";
	}
	
	//public static void main(String[] args) {
	@RequestMapping("/getYoilMVC4")
	//public void main(HttpServletRequest request, HttpServletResponse response) throws IOException {
	public String main(MyDate date,Model model) throws IOException {
		
		if (!isValid(date)) {
			return "yoilError";
		}
		
		char yoil = getYoil(date);
		
		model.addAttribute("yoil", yoil);
		model.addAttribute("myDate", date);
		
		return "yoil";
	}

	private boolean isValid(MyDate date) {
		return isValid(date.getYear(), date.getMonth(), date.getDay());
	}


	private char getYoil(MyDate date) {
		return getYoil(date.getYear(), date.getMonth(), date.getDay());
	}


	private boolean isValid(int year, int month, int day) {
		
		return true;
	}

	private char getYoil(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, day);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		return " 일월화수목금토".charAt(dayOfWeek);
	}

}
