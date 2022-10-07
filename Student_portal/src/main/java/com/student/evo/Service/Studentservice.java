package com.student.evo.Service;

import java.util.List;

import com.student.evo.Entity.Student;

public interface Studentservice {

	List<Student> getallstudents();
	
	Student saveStudent(Student student);
	
	Student getstudentById(int id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(int id); 
	
}

