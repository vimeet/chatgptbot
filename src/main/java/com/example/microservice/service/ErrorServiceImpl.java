package com.example.microservice.service;

import java.util.ArrayList;
import java.util.List;
import com.example.microservice.model.Error;
import org.springframework.stereotype.Service;

@Service
public class ErrorServiceImpl implements ErrorService {
    private final List<com.example.microservice.model.Error> errors = new ArrayList<>();

    @Override
    public List<Error> getAllErrors() {
        return errors;
    }

    @Override
    public Error addError(Error error) {
        errors.add(error);
        return error;
    }
}
