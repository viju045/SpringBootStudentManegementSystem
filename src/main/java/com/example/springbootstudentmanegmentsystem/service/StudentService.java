/**
 * Created By Vijaykumar Mohite
 * Date : 13-06-2023
 * Time : 13:10
 * Project: springbootstudentmanegmentsystem
 **/
package com.example.springbootstudentmanegmentsystem.service;

import com.example.springbootstudentmanegmentsystem.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student);
    void deleteStudentById(Long id);

}
