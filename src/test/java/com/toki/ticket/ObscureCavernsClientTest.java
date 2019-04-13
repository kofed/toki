package com.toki.ticket;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.toki.ticket.client.ObscureCavernsClient;
import com.toki.ticket.model.Ticket;

import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import feign.Logger;
import static com.toki.ticket.model.TicketClass.*;


public class ObscureCavernsClientTest {

	ObscureCavernsClient client = Feign.builder()
			  .client(new OkHttpClient())
			  .encoder(new GsonEncoder())
			  .decoder(new GsonDecoder())
			  .logger(new Slf4jLogger(ObscureCavernsClient.class))
			  .logLevel(Logger.Level.FULL)
			  .target(ObscureCavernsClient.class, "https://obscure-caverns-79008.herokuapp.com/");
	
	@Test
	public void get_successfull() {
		List<Ticket> tickets = client.get(CHEAP);
		
		assertTrue(tickets.size() > 0);
	}
}
