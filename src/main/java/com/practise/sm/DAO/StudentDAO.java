package com.practise.sm.DAO;

import java.util.List;

import com.practise.sm.api.Student;


public interface StudentDAO {

	List<Student> loadStudents();
	void savaStudent(Student student);
	Student getStudent(int id);
}
