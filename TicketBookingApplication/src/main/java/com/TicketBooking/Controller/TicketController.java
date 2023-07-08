package com.TicketBooking.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TicketBooking.model.Ticket;
import com.TicketBooking.service.TicketService;



@RestController
@RequestMapping(value="/ticket")
public class TicketController {
	

		@Autowired
		private TicketService ticketService;
		
		@PostMapping(value="/create")
		public Ticket createTicket(@RequestBody Ticket inputObj) {
			return ticketService.createTicket(inputObj);
		}
		
		@GetMapping (value="/all")
		public Iterable<Ticket> getAllTicket(){
			
			return ticketService.getAllTickets();
		}
		
//		@GetMapping(value="/{ticketId}")
//		public Ticket retriveTicket(@PathVariable("ticketId")Integer ticketId) {
//			return ticketService.getTicket(ticketId);
//		}
		@GetMapping(value="/{passagerName}")
		public Ticket retriveTicket(@PathVariable("passagerName")String passagerName) {
			return ticketService.getticket(passagerName);
		}
		
		@PutMapping(value="/{ticketId}/{newEmail}")
		public Ticket updateTicket(@PathVariable("ticketId")Integer ticketId, @PathVariable("newEmail") String newEmail) {
			return ticketService.updateTicket(ticketId, newEmail);
		}
		
		@DeleteMapping(value="/{ticketId}")
		public void deleteTicket(@PathVariable("ticketId") Integer ticketId) {
			 ticketService.deleteTicket(ticketId);
		}
		
		
	}



