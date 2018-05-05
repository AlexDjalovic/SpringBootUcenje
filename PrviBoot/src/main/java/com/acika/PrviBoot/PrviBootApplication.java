package com.acika.PrviBoot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.acika.PrviBoot.Dao.DAO;
import com.acika.PrviBoot.model.Employee;

@SpringBootApplication
public class PrviBootApplication implements CommandLineRunner{

	@Autowired
	DAO dao;
	public static void main(String[] args) {
		SpringApplication.run(PrviBootApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		//upisi();
		vratiSve();
	}

	private void vratiSve() {
		// TODO Auto-generated method stub
		List<Employee>al=dao.getAllDetails();
		for(Employee e:al) {
			System.out.println(e);
		}
	}

	private void upisi() {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setEmpName("bota");
		emp.setEmail("jddkklldk");
		emp.setSalary(23456);
		dao.createEmp(emp);
	}
}
