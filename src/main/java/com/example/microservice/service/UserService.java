package com.example.microservice.service;

import com.example.microservice.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User addUser(User user);
}