package com.TicketBooking.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ticket {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer ticketId;

	private String passagerName;
	
	private String sourceStation;  
	 private String destinationStation;
	 private Date travelDate;
	 private String email;
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	public String getPassagerName() {
		return passagerName;
	}
	public void setPassagerName(String passagerName) {
		this.passagerName = passagerName;
	}
	public String getSourceStation() {
		return sourceStation;
	}
	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}
	public String getDestinationStation() {
		return destinationStation;
	}
	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Ticket(String passagerName, String sourceStation, String destinationStation, Date travelDate, String email) {
		super();
		this.passagerName = passagerName;
		this.sourceStation = sourceStation;
		this.destinationStation = destinationStation;
		this.travelDate = travelDate;
		this.email = email;
	}
	public Ticket() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", passagerName=" + passagerName + ", sourceStation=" + sourceStation
				+ ", destinationStation=" + destinationStation + ", travelDate=" + travelDate + ", email=" + email
				+ "]";
	}
	 
	
}
