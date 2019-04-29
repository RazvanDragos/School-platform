package com.example.demo2.exception;

import org.springframework.http.HttpStatus;

abstract class CustomException extends RuntimeException {
    CustomException(String message) {
        super(message);
    }

    abstract HttpStatus getStatus();
}
