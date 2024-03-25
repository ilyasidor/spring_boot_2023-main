package ru.kors.springstudents.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.kors.springstudents.dto.MailDto;
import ru.kors.springstudents.dto.RegistrationDto;
import ru.kors.springstudents.dto.error.ErrorDto;
import ru.kors.springstudents.model.Student;
import ru.kors.springstudents.service.OptionalService;
import ru.kors.springstudents.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/optional")
@AllArgsConstructor
public class OptionalController {
    private final OptionalService service;
    @GetMapping("/mail_code_{email}")
    public String saveStudent(@PathVariable String email) {
        System.out.println(email);
        return service.getCode(email);
    }
}