package com.TicketBooking.Dao;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.TicketBooking.model.Ticket;

@Repository
public interface TicketDao extends CrudRepository<Ticket,Integer> {
	
	public Ticket findByPassagerName(String passagerName);

}
