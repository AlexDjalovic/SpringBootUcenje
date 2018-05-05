package com.acika.PrviBoot.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.acika.PrviBoot.model.Employee;


@Repository
public class DAO {

	@Autowired
	private JdbcTemplate template;
	
	public void createEmp(Employee emp) {
		String sSQL="INSERT INTO employee(EmpName,salary,email) VALUES(?,?,?)";
		int tt=template.update(sSQL, new Object[]{emp.getEmpName(),emp.getSalary(),emp.getEmail()});
		//OVO JE DRUGI NACIN ZA PISANJE DA NE BUDU U 2 REDA VEC SVE U JEDNOM ->->ISTI REZULTATI
		//template.update("INSERT INTO employee(EmpName,salary,email) VALUES(?,?,?)",emp.getEmpName(),emp.getSalary(),emp.getEmail());
		if(tt>0) {
			System.out.println("dodat je jos 1 zaposleni");
		}
	}
	public Employee getEmplById(int id) {
		String upit="SELECT * FROM employee WHERE EmpId=?";
		//zato sto imamo id mora da se traze parametri sql,rowmapper,args!!!!!!!!
		Employee emp=template.queryForObject(upit, new EmpRowMapper(), id);
		return emp;
	}
	public List<Employee> getAllDetails() {
		String upit="SELECT * FROM employee";
		List<Employee>lista=template.query(upit, new EmpRowMapper());
		return lista;
	}
	public void updateEmail(String newMail, int id) {
		String upit="UPDATE employee SET email=? WHERE EmpId=?";
		//biram update(sql,args) koji vraca int
		int tt=template.update(upit, newMail,id);
		if(tt>0) {
			System.out.println("promenjen je email zaposlenog");
		}
	}
	public void deleteEmp(int id) {
		String upit="DELETE FROM employee WHERE EmpId=?";
		//koristi se isto kao i kod updateEmail update(sql,args) ovde sql ima delete a kao args koristim id
		int tt=template.update(upit, id);
		if(tt>0) {
			System.out.println("zaposleni je obrisan");
		}

	}
}
