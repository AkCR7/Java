package com.ex;

import java.util.List;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeService {

	@Autowired
	CollegeRepository collegeRepository;
	
	public void insert(College c) {
		collegeRepository.save(c);
	}
	public void select() {
		List<College> li=collegeRepository.findAll();
		Iterator<College> i=li.iterator();
		while(i.hasNext()) {
			College c=i.next();
			System.out.println(c.getId()+" "+c.getSname()+" "+c.getSmarks()+" "+c.getSection()+" "+c.getBranch());
		}
	}
	
	public void delete(int id) {
		collegeRepository.deleteById(id);
	}
	
	public void update(int smarks, int id) {
		collegeRepository.update(smarks, id);
	}
}
