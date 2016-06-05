package com.mtrigger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/***
 * 
 * @author Sanket Navale
 *
 * Manage all redirection to Link 
 *
 */


@Controller
public class HomeController {
	
	public static String message = null;

	@RequestMapping("/dashboard")
	public ModelAndView redirectDashboard(){
		message="Welcome to Mtrigger dashboard";
		System.out.println("redirectDashboard from controller");
		return new ModelAndView("dashboard","message",message);
		
	}
}
