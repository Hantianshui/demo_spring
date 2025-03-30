package com.example.demospring.service;

import com.example.demospring.dto.StudentDTO;

/**
 * @author Aventador
 * @create 2025-03-23-23:03
 */
public interface StudentService {
    StudentDTO getStudentDTOById(long id);

    StudentDTO getStudentDTOByName(String name);

    String addStudent(StudentDTO studentDTO);

    String deleteStudent(long id);

    String updateStudent(long id, String name, String email);
}
