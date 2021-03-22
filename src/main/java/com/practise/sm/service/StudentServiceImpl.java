package com.practise.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.sm.DAO.StudentDAO;
import com.practise.sm.api.Student;



@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;
	//@Override
	public List<Student> loadStudents() {
		List<Student> studentList = studentDAO.loadStudents();
		
		return studentList;
	}
	@Override
	public void savaStudent(Student student) {
		
		studentDAO.savaStudent(student);
		
	}
	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return studentDAO.getStudent(id);
	}
	

	
	
}
