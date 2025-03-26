package com.example.demospring.service;

import com.example.demospring.convert.StudentConvertStudentDTO;
import com.example.demospring.convert.StudentDTOConvertStudent;
import com.example.demospring.dao.Student;
import com.example.demospring.dao.StudentRepository;
import com.example.demospring.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Aventador
 * @create 2025-03-23-23:03
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentDTO getStudentDTOById(long id) {
        Student studentInDB = studentRepository.findById(id).orElseThrow(RuntimeException::new);
        return StudentConvertStudentDTO.studentToStudentDTO(studentInDB);
    }

    @Override
    public StudentDTO getStudentDTOByName(String name) {
        Student studentInDB = studentRepository.findByName(name);
        return StudentConvertStudentDTO.studentToStudentDTO(studentInDB);
    }

    @Override
    public String addStudent(StudentDTO studentDTO) {
        Student student = StudentDTOConvertStudent.studentDTOTOStudent(studentDTO);
        Student save = studentRepository.save(student);
        if (save.getId() == 0)
            return "fail";
        else
            return "success";
    }
}
