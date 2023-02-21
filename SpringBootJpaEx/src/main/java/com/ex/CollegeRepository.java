package com.ex;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends JpaRepository<College,Integer>{
	
	@Modifying
	@Transactional
	@Query("update College c set c.smarks=?1 where c.id=?2")
	int update(int smarks, int id);
}
