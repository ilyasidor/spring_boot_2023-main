package ru.kors.springstudents.service;

import ru.kors.springstudents.dto.RegistrationDto;
import ru.kors.springstudents.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudent();
    boolean saveStudent(RegistrationDto registrationDto);
    Student findByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);
}
