package com.example.demospring.service;

import com.example.demospring.dto.StudentDTO;

/**
 * @author Aventador
 * @create 2025-03-23-23:03
 */
public interface StudentService {
    StudentDTO getStudentDTOById(long id);
}
