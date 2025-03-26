package com.example.demospring.convert;

import com.example.demospring.dao.Student;
import com.example.demospring.dto.StudentDTO;

/**
 * @author Aventador
 * @since 2025-03-26-22:34
 */
public class StudentDTOConvertStudent {
    public static Student studentDTOTOStudent(StudentDTO studentDTO) {

        Student student = new Student();

        student.setAge(studentDTO.getAge());

        student.setName(studentDTO.getName());

        student.setEmail(studentDTO.getEmail());

        return student;
    }
}
