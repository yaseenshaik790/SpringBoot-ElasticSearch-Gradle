package com.sky.elasticearch.controller;

import com.sky.elasticearch.model.Student;
import com.sky.elasticearch.search.StudentSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentSearch studentSearch;

    @PostMapping("/save")
    public String saveStudents(@RequestBody List<Student> students) {
        return studentSearch.saveStudents(students);
    }

    @GetMapping("/byName")
    public List<Student> getStudentsByName(@RequestParam String studentName) {
        return studentSearch.getStudentsByName(studentName);
    }

    @DeleteMapping("/delete")
    public String deleteStudent(@RequestBody Student studentId) {
        return studentSearch.deleteStudent(studentId);
    }
}
