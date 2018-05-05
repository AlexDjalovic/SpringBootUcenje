package com.acika.PrviBoot.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.acika.PrviBoot.model.Employee;


//bilo je RowMapper<T> pa se T mora promeniti u Employee
public class EmpRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
	
		Employee emp=new Employee();
		emp.setEmpId(rs.getInt("EmpId"));
		emp.setEmpName(rs.getString("EmpName"));
		emp.setEmail(rs.getString("email"));
		emp.setSalary(rs.getDouble("salary"));
		return emp;
	}

	

}
