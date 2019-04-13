package com.toki.ticket.service;

import java.time.ZonedDateTime;
import java.util.List;
import org.springframework.stereotype.Service;

import com.toki.ticket.client.ObscureCavernsClient;
import com.toki.ticket.model.Ticket;
import feign.Logger;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;

@Service
public class FindService {
	
	ObscureCavernsClient client = Feign.builder()
			  .client(new OkHttpClient())
			  .encoder(new GsonEncoder())
			  .decoder(new GsonDecoder())
			  .logger(new Slf4jLogger(ObscureCavernsClient.class))
			  .logLevel(Logger.Level.FULL)
			  .target(ObscureCavernsClient.class, "https://obscure-caverns-79008.herokuapp.com/");

	List<Ticket> find(String source, ZonedDateTime sourceTime,
			String dest, ZonedDateTime destTime){
				return null;
		
	}
}
