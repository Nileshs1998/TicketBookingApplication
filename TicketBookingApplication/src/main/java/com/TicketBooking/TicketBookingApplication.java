 package com.TicketBooking;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.TicketBooking.model.Ticket;
import com.TicketBooking.service.TicketService;

@SpringBootApplication
public class TicketBookingApplication implements CommandLineRunner {
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(TicketBookingApplication.class, args);
	}
	@Autowired
	private TicketService ticketService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Ticket ticketObj = new Ticket();
		ticketObj.setPassagerName("kalpi");
		ticketObj.setSourceStation("Nanded");
		ticketObj.setDestinationStation("Nash");
		ticketObj.setTravelDate(new Date());
		ticketObj.setEmail("kalpanams@gmail.com");
		
		ticketService.createTicket(ticketObj);
		
	}

}
