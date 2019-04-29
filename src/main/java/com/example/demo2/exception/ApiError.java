package com.example.demo2.exception;

import java.util.Arrays;
import java.util.List;

public class ApiError {
    private final List<String> errors;

    ApiError(String errorMessage) {
        List<String> formattedErrors = Arrays.asList(errorMessage.split("\n"));
        if (formattedErrors.get(0).isEmpty()) {
            formattedErrors = formattedErrors.subList(1, formattedErrors.size());
        }
        this.errors = formattedErrors;
    }

    public List<String> getErrors() {
        return errors;
    }
}

