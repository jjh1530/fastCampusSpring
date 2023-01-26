package com.fastcampus.app;

import java.io.IOException;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class YoilTellerMVC {

	
	
	//public static void main(String[] args) {
	@RequestMapping("/getYoilMVC")
	//public void main(HttpServletRequest request, HttpServletResponse response) throws IOException {
	public String main(int year,int month,int day,Model model) throws IOException {

		if (!isValid(year, month, day)) {
			return "yoilError";
		}
		
		char yoil = getYoil(year, month, day);
		
		model.addAttribute("yoil", yoil);
		model.addAttribute("year", year);
		model.addAttribute("month", month);
		model.addAttribute("day", day);
		return "yoil";
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
