package com.example.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookDaoImpl implements BookDao{

	// just like DI 677
	private JdbcTemplate jdbcTemplate;
	
	//inject jdbcTemplate into BookDaoImpl by using setter method 
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public boolean save() {
		
		String sql = "insert into employee1(id ,name ,age)values(1,'pratiksha',40)";
		jdbcTemplate.execute(sql);
		return true;	
		
	}
	
}
