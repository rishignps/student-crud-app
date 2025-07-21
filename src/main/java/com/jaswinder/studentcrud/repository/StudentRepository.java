package com.jaswinder.studentcrud.repository;
import com.jaswinder.studentcrud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {


}
