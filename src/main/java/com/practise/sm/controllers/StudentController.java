package com.practise.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.practise.sm.DAO.StudentDAO;
import com.practise.sm.DAO.StudentDAOImpl;
import com.practise.sm.api.Student;
import com.practise.sm.service.StudentService;

@Controller
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/showStudent")
	public String showStudentList(Model model)
	{
		//call service to get the data
		List<Student> studentsList = studentService.loadStudents();
//		
//		for(Student tem : studentsList)
//		{
//			System.out.println(tem);
//		}
		model.addAttribute("students", studentsList);
		
		
		
		return "studentList";
		
	}
	
	@GetMapping("/showAddStudent")
	public String addStudent(Model model)
	{
		Student student = new Student();
		model.addAttribute("student", student);
		
		
		return "add-student";
		
	}
	
	@PostMapping("/save-student")
	public String SaveStudent(Student student)
	{
		System.out.println(student);
		
		studentService.savaStudent(student);
		
		return "redirect:/showStudent";
		
	}
	
	
}
