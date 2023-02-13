package com.ex;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringDao {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void insert() {
		jdbcTemplate.execute("insert into college values('steve', 450, 'A','ECE',1299)");
	}
	public void delete() {
		jdbcTemplate.execute("delete from college where id=1299");
	}
	public void select() {
		List li = jdbcTemplate.queryForList("select * from college");
		Iterator i = li.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
