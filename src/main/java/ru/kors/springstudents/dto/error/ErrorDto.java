package ru.kors.springstudents.dto.error;

import lombok.Data;

@Data
public class ErrorDto {
    private String status;
    private String message;

    public ErrorDto(String status, String message) {
        this.status = status;
        this.message = message;
    }
}
