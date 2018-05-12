package com.aca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aca.dao.Dao;
import com.aca.entities.Ticket;

@Service
public class ServiceKlasa {

	@Autowired
	private Dao dao;
	public Ticket createTicket(Ticket t) {
		//dovuce sam metodu save jer je dao interfejs nasledio Crud interfejs
		return dao.save(t);
	}
	public Ticket vratiTiket(int id) {
		// TODO Auto-generated method stub
		return dao.findOne(id);
	}
	public Iterable<Ticket> vratiSve() {
		// uzeti findAll koji vraca iterable
		return dao.findAll();
	}
	public void obrisi(int id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}
	public Ticket promeni(int id, String destinacija) {
		// TODO Auto-generated method stub
		Ticket izabrani=dao.findOne(id);
		izabrani.setDestinacija(destinacija);
		Ticket updateovana=dao.save(izabrani);
		return updateovana;
	}

}
