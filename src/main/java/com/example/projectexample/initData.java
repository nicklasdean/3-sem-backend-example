package com.example.projectexample;

import com.example.projectexample.models.Student;
import com.example.projectexample.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;

@Component
public class initData implements CommandLineRunner {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        ArrayList<Student> studentsList = new ArrayList<Student>();
        Collections.addAll(studentsList,
                new Student("Alice", 24, true),
                new Student("Bob", 26, false),
                new Student("Carl", 25, true),
                new Student("Benjamin", 34, true)
        );
        studentRepository.saveAll(studentsList);
    }
}
