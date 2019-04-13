package com.toki.ticket.model;

import java.time.ZonedDateTime;

import lombok.Data;

@Data
public class Ticket {

	String id;
	
	String departure;
	
	String arrival;
	
	ZonedDateTime departureTime;
	
	ZonedDateTime ariivalTime;
	
	TicketClass ticketClass;
}
