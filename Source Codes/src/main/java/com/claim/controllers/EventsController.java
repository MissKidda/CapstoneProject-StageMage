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

@Controller
public class EventsController {
	@Autowired
	EventsService eventsService;

	@RequestMapping(value="/addEvent", method=RequestMethod.GET)
	public ModelAndView addEvent() {
		return new ModelAndView("eventForm", "newEvent", new Events());
	}
	@RequestMapping(value="/addEvent", method=RequestMethod.POST)
	public ModelAndView addEvent(@ModelAttribute ("event") Events newEvent) {
	eventsService.saveEvent(newEvent);
	return new ModelAndView("eventsPage", "newEvent", new Events());
	}
	@RequestMapping(value="/eventsHome", method=RequestMethod.GET)
	public ModelAndView eventsHome(HttpSession session) {
		ArrayList<Events> events = eventsService.findAll();
		return new ModelAndView("eventsPage", "events", events);
	}
	
	@RequestMapping(value="/subscribe", method=RequestMethod.GET)
	public ModelAndView subscribeToEvent(@RequestParam("id") int eventId,HttpSession session) {
		User loggedInUser = (User)session.getAttribute("loggedInUser");
		System.out.println("USER LOGGED IN"+loggedInUser);
		Events subscribeTo = eventsService.getEventById(eventId);
		System.out.println("******************************"+subscribeTo);
		if(subscribeTo!=null)
		{
			loggedInUser.getSubscriptions().add(subscribeTo.getEventName());
		}
		return new ModelAndView("UserHome","user", loggedInUser);
	}
}
