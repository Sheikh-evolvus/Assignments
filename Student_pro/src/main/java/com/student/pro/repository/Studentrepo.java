package com.student.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.pro.Entity.Student;





public interface Studentrepo extends JpaRepository<Student, Integer>{

}
