package com.student.evo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.evo.Entity.Student;

public interface Studentrepository extends JpaRepository<Student, Integer>{

}
