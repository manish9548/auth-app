package com.auth.auth_app.Dto;

import org.springframework.http.HttpStatus;

public record ErrorResponse(
        String  message ,
        HttpStatus status

){

}
