package com.aca.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aca.entities.Ticket;

@Repository
public interface Dao extends CrudRepository<Ticket, Integer> {
//kao genreics stavljaju se entitet na koji se odnosi i vrsta id
	//ako hocu da koristim unapred definisane metode kao sto su save findone,findAll() onda koristim crudrepository interfejs 
//ako hocu sam da kreiram metode za
}
