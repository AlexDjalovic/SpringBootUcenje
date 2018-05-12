package com.aca.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticket")
public class Ticket {

	@Id
	@GeneratedValue
	@Column(name="ticketId")
	private int ticketId;
	@Column(name="ime")
	private String ime;
	@Column(name="datum")
	private Date datum;
	@Column(name="polaziste")
	private String polaziste;
	@Column(name="destinacija")
	private String destinacija;
	@Column(name="email")
	private String email;
	
	
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public String getPolaziste() {
		return polaziste;
	}
	public void setPolaziste(String polaziste) {
		this.polaziste = polaziste;
	}
	public String getDestinacija() {
		return destinacija;
	}
	public void setDestinacija(String destinacija) {
		this.destinacija = destinacija;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Ticket(int ticketId, String ime, Date datum, String polaziste, String destinacija, String email) {
		super();
		this.ticketId = ticketId;
		this.ime = ime;
		this.datum = datum;
		this.polaziste = polaziste;
		this.destinacija = destinacija;
		this.email = email;
	}
	public Ticket() {
		super();
	}
	public String toString() {
		return ime+"*"+polaziste+"*"+destinacija;
	}
	
}
