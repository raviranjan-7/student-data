package com.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
