package com.aca.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aca.entities.Ticket;

@Repository
public interface Dao extends org.springframework.data.repository.Repository<Ticket, Integer> {
//kao genreics stavljaju se entitet na koji se odnosi i vrsta id
	
	//ako hocu da koristim unapred definisane metode opsteg tipa kao sto su save findone,findAll() onda koristim crudrepository interfejs 
	//ako hocu sam da kreiram metode za query onda treba koristiti Repository interfejs jer on je marker interfejs
	List<Ticket>findByIme(String ime);
	List<Ticket>findByImeOrDestinacija(String ime,String destinacija);
	//napisem samo findBy i automatski se pronalazi odgovarajuce polje i ako stavim And ili Or to je kao da pisem upit where ime=?or destinacija=?
    //svakako se skracuje postupak, jer ovako nema jdbc
	
	
	//ALI MANA OVOGA JE STO SE MORA PRIDRZAVATI STANDARDA NAZIV METODA MORA POCETI SA FIND IMATI BY I NACI PO NEKOM POLJU
	//AKO HOCU DA MI SE METODI DRUGACIJE ZOVU NPR.VRATISVEPOIMENU ONDA MORAM DA KORISTIM @NAMEDQUERIES U ENTITY KLASI
	
}
