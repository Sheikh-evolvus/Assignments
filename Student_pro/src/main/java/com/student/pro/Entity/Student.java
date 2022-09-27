package com.student.pro.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_details")
public class Student {

	@Column(name = "Student_name",nullable = false)
	private String studentname;
	
	@Id
	@Column(name = "Student_id",nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentid;
	
	@Column(name = "College_name",nullable = false)
	private String collegename;
	
	
	
	
	public Student(String studentname, int studentid, String collegename) {
		super();
		this.studentname = studentname;
		this.studentid = studentid;
		this.collegename = collegename;
		
		
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", studentid=" + studentid + ", collegename=" + collegename
				+ "]";
	}
	
	
}
