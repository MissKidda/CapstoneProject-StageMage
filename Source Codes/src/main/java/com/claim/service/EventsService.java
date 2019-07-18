package com.claim.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.Events;

import com.claim.repository.EventsRepo;

@Service
public class EventsService {
 @Autowired
 EventsRepo eventsRepo;
 
 public void saveEvent(Events newEvent) {
	 eventsRepo.save(newEvent);
 }
 
	public ArrayList<Events> findAll() {
		
	return (ArrayList<Events>) eventsRepo.findAll();
		
	}

	public Events getEventById(int eventId) {
		return eventsRepo.findById(eventId).orElse(null);
	}
}
