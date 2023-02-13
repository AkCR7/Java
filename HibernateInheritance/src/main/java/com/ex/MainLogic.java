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
		CreditCard c =new CreditCard();
		c.setPid(101);
		c.setAmount(10000);
		c.setCctype("VISA");
		
		se.save(c);
		tx.commit();
	}

}
