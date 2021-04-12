package com.javapi.javaapi.service;

import com.javapi.javaapi.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javapi.javaapi.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> saveStudents(List<Student> student) {
        return repository.saveAll(student);
    }

    public List<Student> getStudents() {
        return repository.findAll();
    }

    public Student getStudentById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Student getStudentByName(String username) {
        return repository.findByUsername(username);
    }

    public String deleteStudent(int id) {
        repository.deleteById(id);
        return "Student Removed !!" + id;
    }

    public Student updateStudent(Student student) {
        Student students = repository.findById(student.getId()).orElse(null);
        students.setUsername(student.getUsername());
        students.setFullName(student.getFullName());
        students.setRole(student.getRole());
        students.setPassword(student.getPassword());

        return repository.save(students);
    }

}
