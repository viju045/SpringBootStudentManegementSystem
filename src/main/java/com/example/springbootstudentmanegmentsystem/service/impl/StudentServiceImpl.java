/**
 * Created By Vijaykumar Mohite
 * Date : 13-06-2023
 * Time : 13:30
 * Project: springbootstudentmanegmentsystem
 **/
package com.example.springbootstudentmanegmentsystem.service.impl;

import com.example.springbootstudentmanegmentsystem.entity.Student;
import com.example.springbootstudentmanegmentsystem.repository.StudentRepository;
import com.example.springbootstudentmanegmentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);

    }
}
