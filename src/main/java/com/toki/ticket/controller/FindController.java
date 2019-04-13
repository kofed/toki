package com.toki.ticket.controller;

import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.toki.ticket.model.SearchType;
import com.toki.ticket.model.Ticket;
import com.toki.ticket.model.TicketClass;

@RestController
public class FindController {

	@RequestMapping("/find")
	List<Ticket> find(@RequestParam(value="source") String source, 
			@RequestParam(value="sourceTime") ZonedDateTime sourceTime,
			@RequestParam(value="dest") String dest, 
			@RequestParam(value="destTime") ZonedDateTime destTime,
			@RequestParam(value="searchType") SearchType searchType ){
				return null;
		
	}
	
	
}
