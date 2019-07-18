package com.claim.demo;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.Events;
import com.claim.entity.User;
import com.claim.service.EventsService;
import com.claim.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	UserService userService;
	

	@RequestMapping("/")
	public ModelAndView index()
	{
		return new ModelAndView("index", "user", new User());
	}
	
	
	
	@RequestMapping(value="/registerUser", method=RequestMethod.GET)
	public ModelAndView register()
	{
		//userService.saveUser(user);
		return new ModelAndView("registration", "user", new User());
}
	
	@RequestMapping(value="/registerUser", method=RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user")User user)
	{
		userService.saveUser(user);
		return new ModelAndView("index", "user", new User());
}
	
	@RequestMapping(value="/userLogin", method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("user")User user, HttpSession session) {
		System.out.println(user);
		User loggedInUser = userService.login(user.getEmail(), user.getPassword());
		
		if(loggedInUser != null)
		{
			session.setAttribute("loggedInUser", loggedInUser);
			return new ModelAndView("UserHome","user", loggedInUser);
		}
		
		return new ModelAndView("index","user", new User());
	
	}
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public ModelAndView findAll(HttpSession session) {
		ArrayList<User> users = userService.findAll();
		return new ModelAndView("userList", "users", users);
	}
	

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView login()
	{
		//userService.saveUser(user);
		return new ModelAndView("login", "user", new User());
}
	
@RequestMapping(value="/logout", method=RequestMethod.GET)
	public ModelAndView logout(@ModelAttribute("user")User user,HttpSession session)
	{
	session.setAttribute("user", null);
	return new ModelAndView("index", "user", new User());
	}
	
}