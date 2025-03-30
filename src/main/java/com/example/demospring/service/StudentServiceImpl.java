package com.example.demospring.service;

import com.example.demospring.convert.StudentConvertStudentDTO;
import com.example.demospring.convert.StudentDTOConvertStudent;
import com.example.demospring.dao.Student;
import com.example.demospring.dao.StudentRepository;
import com.example.demospring.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    public String deleteStudent(long id) {
        Student studentInDB = studentRepository.findById(id).orElseThrow(RuntimeException::new);
        if (studentInDB == null)
            return "fail";
        else
            studentRepository.deleteById(id);
        return "success";
    }

    @Override
    @Transactional
    public String updateStudent(long id, String name, String email) {
        System.out.println(id);
        System.out.println(name);
        System.out.println(email);

        Student studentInDB = studentRepository.findById(id).orElseThrow(RuntimeException::new);
        if (studentInDB == null)
            return "fail";
        if (studentInDB.getName() != null && !studentInDB.getName().equals(name))
            studentInDB.setName(name);
        if (studentInDB.getEmail() != null && !studentInDB.getEmail().equals(email))
            studentInDB.setEmail(email);
        studentRepository.save(studentInDB);
        return "success";
    }
}
