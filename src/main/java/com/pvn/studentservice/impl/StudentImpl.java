package com.pvn.studentservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pvn.studentservice.db.Student;
import com.pvn.studentservice.dto.StudentDto;
import com.pvn.studentservice.exception.ResourceNotFoundException;
import com.pvn.studentservice.exception.StudentServiceException;
import com.pvn.studentservice.repo.StudentRepo;
import com.pvn.studentservice.service.StudentService;

@Service
public class StudentImpl implements StudentService{
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public String addStudent(Student request) {

		String status = "Scucess";
		try {
			studentRepo.save(request);
		}catch (Exception e) {
			status="Failed";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Student> getStudentList() {
		
		return studentRepo.findAll();
	}

	@Override
	public ResponseEntity<Student> getStudentById(int id) throws StudentServiceException {
		Student student = studentRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Student Not Found with ID:"+id ));
		return ResponseEntity.ok(student);
	}

	@Override
	public  ResponseEntity<Student> updateStudent(StudentDto request) {
		Student studentDetails =  studentRepo.findById(request.getAkid()).orElseThrow(()-> new ResourceNotFoundException("Student Not Found with ID:"+request.getAkid() ));
		if(studentDetails!=null) {
			studentDetails.setAkid(request.getAkid());
			studentDetails.setName(request.getName());
			studentDetails.setBranch(request.getBranch());
			studentDetails.setEmail(request.getEmail());
			studentDetails.setMobileNumber(request.getMobileNumber());
			studentRepo.save(studentDetails);
		}
		
		
		return ResponseEntity.ok(studentDetails);
	}

	@Override
	public String deleteStudentDetails(int id) {
		String res = "Deleted";
		System.out.println("Delete called....");
		try {
			studentRepo.deleteById(id);
		}catch(Exception e) {
			e.printStackTrace();
			res=e.getMessage();
		}
		
		return res;
	}

	

}
