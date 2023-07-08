package com.TicketBooking.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.TicketBooking.Dao.TicketDao;
import com.TicketBooking.model.Ticket;

@Service
public class TicketService {



		
		
		@Autowired
		private TicketDao ticketDao;
		
		

		
		public Iterable<Ticket> getAllTickets(){
			
			return ticketDao.findAll();
		
			
		}
		
		
		
		
		public Ticket getTicket(Integer ticketId) {
			return ticketDao.findById(ticketId)
					.orElse(new Ticket());
					
			
		}
		
		public Ticket getticket(String passagerName) {
			return ticketDao.findByPassagerName(passagerName);
		}
		
		
	
		public Ticket createTicket(Ticket ticketObj) {
			return ticketDao.save(ticketObj);
		
			
		}
		
		
		
	
		public Ticket updateTicket(Integer ticketId,String  newEmail) {
			
			Ticket dbTicketObj=getTicket(ticketId);
			dbTicketObj.setEmail(newEmail);
			return ticketDao.save(dbTicketObj);
			
		
			
		}
		
		public void deleteTicket(Integer ticketId) {
			ticketDao.deleteById(ticketId);
			
			
		}


	}


