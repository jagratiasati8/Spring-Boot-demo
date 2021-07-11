package com.example.mysql.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.mysql.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket,Integer> {
	

}
