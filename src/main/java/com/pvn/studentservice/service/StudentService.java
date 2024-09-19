package com.pvn.studentservice.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.pvn.studentservice.db.Student;
import com.pvn.studentservice.dto.StudentDto;
import com.pvn.studentservice.exception.StudentServiceException;

public interface StudentService {
	
	public String addStudent(@RequestBody Student request);

	public List<Student> getStudentList();
	public ResponseEntity<Student> getStudentById(int id) throws StudentServiceException;
	public  ResponseEntity<Student>  updateStudent( StudentDto request);
	public String deleteStudentDetails(int id);
}
