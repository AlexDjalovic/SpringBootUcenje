package com.aca.kontroleri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aca.entities.Ticket;
import com.aca.service.ServiceKlasa;

@RestController
@RequestMapping(value="/")
public class Kontroler {

	@Autowired
	private ServiceKlasa service;
	//OVI METODI POD KOMENTAROM VAZE AKO SE U DAO KLASI NASLEDI CRUDRepository Interfejs
	/*
	@PostMapping(value="/create")
	public Ticket kreirajTiket(@RequestBody Ticket t) {
		return service.createTicket(t);
	}
	@GetMapping(value="/ticket/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId") int id) {
		return service.vratiTiket(id);
		
	}
	
	@GetMapping(value="/tickets")
	public Iterable<Ticket>getAll(){
		return service.vratiSve();
		
	}
	@DeleteMapping(value="/ticket/{ticketId}")
	public void delete(@PathVariable("ticketId") int id) {
		service.obrisi(id);
	}
	@PutMapping(value="/ticket/{ticketId}/{destinacija}")
	public Ticket update(@PathVariable("ticketId") int id, @PathVariable("destinacija") String destinacija) {
		return service.promeni(id,destinacija);
		
	}*/
}
