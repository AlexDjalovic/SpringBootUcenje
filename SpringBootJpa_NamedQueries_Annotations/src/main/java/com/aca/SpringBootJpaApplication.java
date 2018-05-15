package com.aca;

import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.aca.entities.Ticket;
import com.aca.service.ServiceKlasa;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringBootJpaApplication.class, args);
	
	ServiceKlasa service=context.getBean("serviceKlasa",ServiceKlasa.class);
	
	
	/*
	List<Ticket>al=service.getTicketByIme("acika");
	al.forEach(System.out::println);*/
	vratiImeIliDestinaciju(service);
	
	}

	public static void vratiImeIliDestinaciju(ServiceKlasa service) {
		List<Ticket>al2=service.vratiPoImenuIliDestinaciji("mira", "Moskva");
		al2.forEach(System.out::println);
	}

	
}
