package com.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext ca=SpringApplication.run(SpringBootEx.class, args);
		College c=new College();
//		c.setSname("Adi");
//		c.setSmarks(453);
//		c.setSection("F");
//		c.setBranch("MECH");
//		c.setId(1404);
		CollegeDao d=ca.getBean(CollegeDao.class);
		//d.insert(c);
		d.select();
		//System.out.println(x.getId()+"  "+x.getSname()+"  "+x.getSmarks()+"  "+x.getSection()+"  "+x.getBranch());
	}

}
