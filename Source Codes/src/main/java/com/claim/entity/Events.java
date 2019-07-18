package com.claim.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="events")
public class Events {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column
private int eventID;
	@Column(name="eventname")
private String eventName;
	@Column(name="eventlocation")
private String eventLocation;
	@Column(name="startdate")
private String startDate;
	@Column(name="starttime")
private String startTime;
	@Column(name="enddate")
private String endDate;
	@Column(name="endtime")
private String endTime;
	@Column(name="eventdetails")
private String eventDetails;
	@Column(name="eventImages")
	private String eventImages;
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventLocation() {
		return eventLocation;
	}
	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getEventDetails() {
		return eventDetails;
	}
	public void setEventDetails(String eventDetails) {
		this.eventDetails = eventDetails;
	}
	
	public int getEventID() {
		return eventID;
	}
	public void setEventID(int eventID) {
		this.eventID = eventID;
	}
	public String getEventImages() {
		return eventImages;
	}
	public void setEventImages(String eventImages) {
		this.eventImages = eventImages;
	}
	@Override
	public String toString() {
		return "Events [eventName=" + eventName + ", eventLocation=" + eventLocation + ", startDate=" + startDate
				+ ", startTime=" + startTime + ", endDate=" + endDate + ", endTime=" + endTime + ", eventDetails="
				+ eventDetails + "]";
	}

	
}
