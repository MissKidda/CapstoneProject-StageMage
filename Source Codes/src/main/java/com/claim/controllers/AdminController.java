package com.claim.demo;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.Admin;

import com.claim.entity.User;
import com.claim.service.AdminService;

public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	
	@RequestMapping(value="/registerAdmin", method=RequestMethod.GET)
	public ModelAndView register()
	{
	
		return new ModelAndView("adminRegistration", "admin", new Admin());
}
	@RequestMapping(value="/registerAdmin", method=RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("admin")Admin admin)
	{
		adminService.saveAdmin(admin);
		return new ModelAndView("adminLogin", "admin", new Admin());
}
	
	@RequestMapping(value="/userLogin", method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("admin")Admin admin, HttpSession session) {
		System.out.println(admin);
		Admin loggedInAdmin = adminService.login(admin.getEmail(), admin.getPassword());
		
		if(loggedInAdmin != null)
		{
			session.setAttribute("loggedInAdmin", loggedInAdmin);
			return new ModelAndView("AdminDashboard","admin", loggedInAdmin);
		}
		
		return new ModelAndView("index","admin", new Admin());
	
	
	}
	
	@RequestMapping(value="/subscribe", method=RequestMethod.GET)
	public ModelAndView subscribeToEvent(@RequestParam("id") int eventId,HttpSession session) {
		User loggedInUser = (User)session.getAttribute("loggedInUser");
		System.out.println("USER LOGGED IN"+loggedInUser);
		Admin subscribeTo =adminService.getAdminById(eventId);
		System.out.println("******************************"+subscribeTo);
		if(subscribeTo!=null)
		{
			loggedInUser.getSubscriptions().add(subscribeTo.getTheatreName());
		}
		return new ModelAndView("UserHome","user", loggedInUser);
	}
	
}
