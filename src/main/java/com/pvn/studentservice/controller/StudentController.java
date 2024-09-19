package com.pvn.studentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pvn.studentservice.db.Student;
import com.pvn.studentservice.dto.StudentDto;
import com.pvn.studentservice.exception.StudentServiceException;
import com.pvn.studentservice.service.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/getstudentlist")
	public String addStudent(@RequestBody Student request) {

		System.out.println("studentList called:::");
		return studentService.addStudent(request);

	}
	//dd
	@GetMapping("/getstudentlist")
	public List<Student> getStudentsList(){
		return studentService.getStudentList();
	}
	
	@GetMapping("/getstudentlist/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable int id) throws StudentServiceException{
		return studentService.getStudentById(id);
	}
	@PutMapping("/getstudentlists")
	public  ResponseEntity<Student>  updateStudent(@RequestBody StudentDto request) {

		return studentService.updateStudent(request);

	}
	@DeleteMapping("/deleteStudentDetails/{id}")
	public String deleteStudentDetails(@PathVariable int id) {
		return studentService.deleteStudentDetails(id);
	}

}
