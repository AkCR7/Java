package com.ex;

import java.util.Iterator;
import java.util.List;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;

public class SpringORM {
	
	@Autowired
	private SessionFactory sf;
	private Session se;
	private Transaction tx;

	
	public void insert(College c) {
		se=sf.openSession();
		tx=se.beginTransaction();
		se.save(c);
		tx.commit();
		
	}
	
	public void select() {
		se=sf.openSession();
		Query qr=se.createQuery("from College c");
		List li=qr.list();
		Iterator i=li.iterator();
		while(i.hasNext()) {
			College c=(College)i.next();
			System.out.println(c.getId()+" "+c.getSname()+" "+c.getSmarks()+" "+c.getSection()+" "+c.getBranch());
		}
	}
}
