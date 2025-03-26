package com.example.demospring.convert;

import com.example.demospring.dao.Student;
import com.example.demospring.dto.StudentDTO;

/**
 * @author Aventador
 * @create 2025-03-23-23:10
 */
public class StudentConvertStudentDTO {
    public static StudentDTO studentToStudentDTO(Student student) {

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setId(student.getId());

        studentDTO.setName(student.getName());

        studentDTO.setEmail(student.getEmail());

        return studentDTO;
    }
}
