package com.example.demospring.controller;

import com.example.demospring.dto.StudentDTO;
import com.example.demospring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Aventador
 * @create 2025-03-23-23:21
 */
@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{id}")
    public StudentDTO getStudentDTOById(@PathVariable long id) {
        return studentService.getStudentDTOById(id);
    }

    @GetMapping("/student/name/{name}")
    public StudentDTO getStudentDTOByName(@PathVariable String name) {
        return studentService.getStudentDTOByName(name);
    }

    @PostMapping("/student/add")
    public String addStudent(@RequestBody StudentDTO studentDTO) {
        return studentService.addStudent(studentDTO);
    }

    @DeleteMapping("/student/delete/{id}")
    public String deleteStudent(@PathVariable long id) {
        return studentService.deleteStudent(id);
    }

    @PutMapping("/student/update/{id}")
    public String updateStudent(@PathVariable long id, @RequestParam(required = false) String name,
                                @RequestParam(required = false) String email) {
        System.out.println(id);
        System.out.println(name);
        System.out.println(email);
        return studentService.updateStudent(id, name, email);
    }
}
