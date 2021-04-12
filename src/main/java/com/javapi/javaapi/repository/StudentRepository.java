package com.javapi.javaapi.repository;

import com.javapi.javaapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByUsername(String username);
}
