package com.acika.PrviBoot.Kontroleri;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acika.PrviBoot.Dao.DAO;
import com.acika.PrviBoot.model.Employee;

@RestController
public class Kontroler {
	
	@Autowired
	private DAO dao;
	
	//vezba boota i web servisa
	@GetMapping(value="/lista")
	public ArrayList<Employee> poz() {
		ArrayList<Employee>al=(ArrayList<Employee>) dao.getAllDetails();
		return al;
	}
	
	@GetMapping(value="/pozz")
	public String vrati() {
		return "Pozdrav ovo je moja prva boot app i napravio sam je putem Spring Initilizer";
	}
}
