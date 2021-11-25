package com.sky.elasticearch.search;

import com.sky.elasticearch.model.Student;
import com.sky.elasticearch.model.StudentDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentSearch {

    private StudentDao studentDao;

    public String saveStudents(List<Student> students) {
        studentDao.saveAll(students);
        return "Student Saved Successfully";
    }

    public List<Student> getStudentsByName(String studentName) {
        return studentDao.findAllByStudentName(studentName);
    }

    public String deleteStudent(Student student) {
        studentDao.delete(student);
        return "Student Deleted Successfullu";
    }
}
