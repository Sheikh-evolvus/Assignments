package com.student.pro.repository;

import org.springframework.beans.factory.annotation.Autowired;

import com.student.pro.Entity.Student;



public class StudentService {

	
	@Autowired
	Studentrepo studentrepo;
	
	public void savestudent(Student student)
	{
		studentrepo.save(student);
	}
	
	
	public void update(Student student)
	{
	 studentrepo.save(student);
	}
	
	public Student getstudentbyid(int id)
	{
		return studentrepo.findById(id).get();
	}
	
	public void delete(int id)
	{
		studentrepo.deleteById(id);
	}
}
