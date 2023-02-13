package com.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new AnnotationConfigApplicationContext(SpringUtil.class);
		SpringORM s=ac.getBean(SpringORM.class);
		//College c=new College();
		//c.setId(1301);
		//c.setSname("Sanket");
		//c.setSmarks(499);
		//c.setBranch("CS");
		//c.setSection("D");
		//s.insert(c);
		s.select();
	}

}
