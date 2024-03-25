package ru.kors.springstudents.service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.kors.springstudents.dto.MailDto;
import ru.kors.springstudents.service.OptionalService;

import java.util.Random;

import static ru.kors.springstudents.service.mailService.EmailSender.sendEmail;

@Service
@AllArgsConstructor
@Primary
public class OptionalServiceImp implements OptionalService {
    @Override
    public String getCode(String mail) {
        Random random = new Random();
        String code = String.valueOf(random.nextInt(900000) + 100000);
        sendEmail(mail, "Code from app", code);
        return code;
    }
}
