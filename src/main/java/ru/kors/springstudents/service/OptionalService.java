package ru.kors.springstudents.service;

import ru.kors.springstudents.dto.MailDto;
import ru.kors.springstudents.dto.RegistrationDto;
import ru.kors.springstudents.model.Student;

import java.util.List;

public interface OptionalService {
    String getCode(String mail);
}
