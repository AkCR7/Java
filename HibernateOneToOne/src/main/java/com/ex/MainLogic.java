package com.ex;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf=new Configuration();
		cf.configure("hibernate.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx= se.beginTransaction();
		Student rahul=new Student();
		rahul.setSid(1023);
		rahul.setSmarks(421);
		rahul.setSname("rahul");
		Address a=new Address();
		a.setAid(101);
		a.setPlace("Delhi");
		a.setSt(rahul);
		
		se.save(a);
		tx.commit();
	}

}
