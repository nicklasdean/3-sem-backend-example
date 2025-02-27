package com.example.projectexample.repositories;

import com.example.projectexample.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {}