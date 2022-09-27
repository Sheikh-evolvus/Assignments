package com.student.pro.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.student.pro.Entity.Student;
import com.student.pro.repository.StudentService;




@Controller
public class studentController {

	
	StudentService studentService;
	
	@PostMapping("/SaveStudent")
	private String savestudent(@RequestBody Student student)
	{
		studentService.savestudent(student);
		return "Student saved successfully" + student.getStudentid(); 
	}
	
	@PutMapping("/UpdateStudent")
	private String updatestudent(@RequestBody Student student)
	{
		studentService.update(student);
		return "";
	}
	
	@GetMapping("/GetstudentById/{id}")
	private Student getstudentbyid(@PathVariable("id") int studentid)
	{
		return studentService.getstudentbyid(studentid);
	}
	
	
	@DeleteMapping("/Deletestudent/{id}")
	private String deletestudent(@PathVariable ("id") int studentid)
	{
		studentService.delete(studentid);
		return "Student deleted successfully!!!";
	}
	
	
	
}
