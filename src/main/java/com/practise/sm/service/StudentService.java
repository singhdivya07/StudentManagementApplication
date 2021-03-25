package com.practise.sm.service;

import java.util.List;

import com.practise.sm.api.Student;

public interface StudentService {

	List<Student> loadStudents();

	void savaStudent(Student student);
	Student getStudent(int id);

	void update(Student student);

	void deleteStudent(int id);
}
