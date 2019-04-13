package com.toki.ticket.client;

import java.util.List;

import com.toki.ticket.model.Ticket;
import com.toki.ticket.model.TicketClass;

import feign.Param;
import feign.RequestLine;

public interface ObscureCavernsClient {
	
	@RequestLine("GET /{ticketClass}")
	List<Ticket> get(@Param("ticketClass") TicketClass ticketClass);

}
