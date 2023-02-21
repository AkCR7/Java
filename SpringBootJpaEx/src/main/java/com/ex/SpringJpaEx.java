package com.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJpaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext ca=SpringApplication.run(SpringJpaEx.class, args);
		CollegeService collegeService=ca.getBean(CollegeService.class);
//		College c=new College();	
//		c.setSname("Rocky");
//		c.setSmarks(532);
//		c.setSection("A");
//		c.setBranch("CSE");
//		c.setId(1405);
		
		//collegeService.insert(c);
		
		collegeService.delete(1401);
		collegeService.update(650, 1401);
		collegeService.select();
	}

}
