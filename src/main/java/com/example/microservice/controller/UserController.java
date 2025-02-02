package com.example.microservice.controller;

import com.example.microservice.model.User;
import com.example.microservice.service.ErrorService;
import com.example.microservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.microservice.model.Error;

import java.util.List;

@RestController
@RequestMapping("/errors")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ErrorService errorService;

    @GetMapping
    public List<Error> getAllErrors() {
        return errorService.getAllErrors();
    }

    @PostMapping
    public Error addError(@RequestBody Error error) {
        return errorService.addError(error);
    }
}
