package com.aca;

import java.util.Date;

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
	
	//upisi(service);
	//Ticket t=vratikonkretnog( service,2);
	//System.out.println(t);
	}

	private static Ticket vratikonkretnog(ServiceKlasa service, int i) {
		return service.vratiTiket(2);
		// TODO Auto-generated method stub
		
	}

	private static void upisi(ServiceKlasa service) {
		Ticket t=new Ticket();
		t.setDatum(new Date());
		t.setDestinacija("NS");
		t.setPolaziste("BG");
		t.setIme("pecika");
		t.setEmail("adadl");
		service.createTicket(t);
	}
}
