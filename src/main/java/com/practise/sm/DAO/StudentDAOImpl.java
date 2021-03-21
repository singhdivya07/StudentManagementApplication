package com.practise.sm.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.practise.sm.api.Student;
import com.practise.sm.rowMapper.rowMapper;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public List<Student> loadStudents() {
		
		//List<Student> studentlist = new ArrayList<Student>();
		String sql = "SELECT id, name, mobile, country\r\n"
				+ "	FROM public.\"Students\";";
		List<Student> theListOfStudent = jdbcTemplate.query(sql, new rowMapper());
		
		
		return theListOfStudent;
	}
	@Override
	public void savaStudent(Student student) {
		
		Object[] sqlParameters = {student.getName(), student.getMobile(), student.getCountry()};
		
		String sql = " INSERT INTO public.\"Students\"(\r\n"
				+ "	 name, mobile, country)\r\n"
				+ "	VALUES ( ?, ?, ?);"; 
		
		jdbcTemplate.update(sql, sqlParameters);
		
		System.out.println("1 record updated..");
		
	}
	

}
