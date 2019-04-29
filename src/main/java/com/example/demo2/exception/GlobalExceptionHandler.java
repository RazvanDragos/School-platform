package com.example.demo2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({RuntimeException.class})
    public final ResponseEntity handleException(RuntimeException exception) {
        if(exception instanceof CustomException) {
            return handleException(exception,((CustomException) exception).getStatus());
        }
        return handleException(exception, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private ResponseEntity handleException(RuntimeException runtimeException, HttpStatus status) {
        runtimeException.printStackTrace();
        return new ResponseEntity<>(new ApiError(runtimeException.getMessage()), status);
    }
}
