package com.example.demospring.controller;

import com.example.demospring.dto.StudentDTO;
import com.example.demospring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aventador
 * @create 2025-03-23-23:21
 */
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{id}")
    public StudentDTO getStudentDTOById(@PathVariable long id) {
        return studentService.getStudentDTOById(id);
    }
}
