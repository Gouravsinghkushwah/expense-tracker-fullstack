package com.expense.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expense.entity.User;
import com.expense.repo.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    //Register User
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    // Get User by Email
    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
