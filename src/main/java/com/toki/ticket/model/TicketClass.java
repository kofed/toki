package com.toki.ticket.model;

public enum TicketClass {
	CHEAP,
	BUSYNESS;
	
	@Override
	public String toString() {
		return name().toLowerCase();
	}
}
