package com.practise.sm.service;

import java.util.List;

import com.practise.sm.api.Student;

public interface StudentService {

	List<Student> loadStudents();

	void savaStudent(Student student);
}
