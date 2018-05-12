package com.aca.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aca.entities.Ticket;

@Repository
public interface Dao extends CrudRepository<Ticket, Integer> {
//kao genreics stavljaju se entitet na koji se odnosi i vrsta id
}
