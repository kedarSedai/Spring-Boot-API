package com.javapi.javaapi.controller;

import com.javapi.javaapi.entity.Student;
import com.javapi.javaapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students) {
        return studentService.saveStudents(students);
    }

    @GetMapping("/students")
    public List<Student> findAllStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/studentId/{id}")
    public Student findStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/studentName/{name}")
    public Student findStudentByName(@PathVariable String name) {
        return studentService.getStudentByName(name);
    }

    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id) {
        return studentService.deleteStudent(id);
    }

}
