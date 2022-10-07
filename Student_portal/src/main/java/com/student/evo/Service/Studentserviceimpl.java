package com.student.evo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.evo.Entity.Student;
import com.student.evo.Repository.Studentrepository;

@Service
public class Studentserviceimpl implements Studentservice{


	private Studentrepository studentrepository;	       //when spring bean have one constructor we can avoid using @autowire annotation
	
	public Studentserviceimpl(Studentrepository studentrepository) {
		super();
		this.studentrepository = studentrepository;
	}


	@Override
	public List<Student> getallstudents() {
		
		return studentrepository.findAll();  //studentrepository has all provides all crud methods. and findall() method returns list of all students
	}


	@Override
	public Student saveStudent(Student student) {
	
		return studentrepository.save(student);
	}


	@Override
	public Student getstudentById(int id) {
		
		
		return studentrepository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student)
	{
	
		return studentrepository.save(student);
	}


	@Override
	public void deleteStudentById(int id) {
	studentrepository.deleteById(id);		
	}


}
