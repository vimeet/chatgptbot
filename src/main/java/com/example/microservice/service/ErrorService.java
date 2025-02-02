package com.example.microservice.service;

import com.example.microservice.model.Error;
import java.util.List;

public interface ErrorService {
    List<Error> getAllErrors();
    Error addError(Error error);
}
