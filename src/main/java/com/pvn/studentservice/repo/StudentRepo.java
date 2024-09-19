package com.pvn.studentservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pvn.studentservice.db.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student , Integer>{
	

}
