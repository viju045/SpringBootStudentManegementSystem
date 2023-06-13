/**
 * Created By Vijaykumar Mohite
 * Date : 13-06-2023
 * Time : 12:00
 * Project: springbootstudentmanegmentsystem
 **/
package com.example.springbootstudentmanegmentsystem.repository;

import com.example.springbootstudentmanegmentsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
